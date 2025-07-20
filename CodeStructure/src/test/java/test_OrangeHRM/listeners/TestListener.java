package test_OrangeHRM.listeners;



import com.aventstack.extentreports.Status;

import OrangeHRM.helpers.CaptureHelper;
import OrangeHRM.helpers.RecordVideo;
import OrangeHRM.reports.AllureReportManager;
import OrangeHRM.reports.ExtentReportManager;
import OrangeHRM.reports.ExtentReportTestManager;
import OrangeHRM.utils.Log;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    public String getTestName(ITestResult result) {
        return result.getTestName() != null ? result.getTestName()
                : result.getMethod().getConstructorOrMethod().getName();
    }

    public String getTestDescription(ITestResult result) {
        return result.getMethod().getDescription() != null ? result.getMethod().getDescription() : getTestName(result);
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Log.info("Start Suite: " + iTestContext.getStartDate());
//        RecordVideo.startRecord(iTestContext.getName());
    }
    @Override
    public void onFinish(ITestContext result) {
        Log.info("Finish Suite: " + result.getEndDate());
//        RecordVideo.stopRecord();
        ExtentReportManager.getExtentReports().flush();
        //RunCMD.Allure("allure serve target/allure-results");
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
    @Override
    public void onTestStart(ITestResult result) {
        ExtentReportTestManager.saveToReport(getTestName(result),getTestDescription(result));
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        //Ghi log binh thuong
        Log.info(result.getName() + " is passed.");

        //Extent Report
        ExtentReportTestManager.logMessage(Status.PASS, getTestName(result) + " is passed.");

        //Allure Report
        AllureReportManager.saveTextLog(getTestName(result) + " is passed.");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        //Ghi log binh thuong
        Log.error(result.getName() + " is failed.");
        CaptureHelper.captureScreenshot(result);

        //Extent Report
//        ExtentReportTestManager.addScreenShot(result.getName());
//        ExtentReportTestManager.logMessage(Status.FAIL, result.getName() + " is failed.");
//
//        //Allure Report
//        AllureReportManager.saveScreenshotPNG();
//        AllureReportManager.saveTextLog(getTestName(result) + " is failed ");
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        //Ghi log binh thuong
        Log.info(result.getName() + " is skipped.");

        //Extent Report
        ExtentReportTestManager.addScreenShot(result.getName());
        ExtentReportTestManager.logMessage(Status.SKIP, getTestName(result));

        //Allure Report
        AllureReportManager.saveScreenshotPNG();
        AllureReportManager.saveTextLog(getTestName(result) + " is skipped.");
    }
}
