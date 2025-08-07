package test_OrangeHRM.pages;

import org.openqa.selenium.By;

import OrangeHRM.helpers.PropertiesHelper;
import OrangeHRM.utils.KeyWork;
import org.openqa.selenium.WebElement;

import java.util.List;

import static OrangeHRM.driver.DriverManager.driver;

public class RecruimentPage extends CommonPage {

    private By QLLDTab = By.xpath("//button[@id='radix-«r26»-trigger-/foreign-labor-regulation']");

    private By btnAddNew = By.xpath("//a[@type='button']");
    //form add new recruitment
    private By dropdownUnitName = By.xpath("//button[@id='«rp»-form-item']");
    private By searchboxUnitName = By.xpath("//input[@id='radix-«r1m»']");
    private By allItemsInList = By.xpath("//div[@role='group']");
    private By disableAddreasUnit = By.xpath("//form/div[1]/div[2]//input");
    private By inputPosition = By.xpath("//input[@id='«r13»-form-item']");
    private By inputNumberApplicants = By.xpath("//input[@id='«r14»-form-item']");
    private By inputSalary = By.xpath("//input[@id='«r15»-form-item']");
    private By inputWorkPlace = By.xpath("//input[@id='«r16»-form-item']");
    private By inputStartworkTime = By.xpath("//div[7]//div[1]//div[1]");
    private By btnCalendarStartworkTime = By.xpath("//button[@aria-expanded='true']");
    private By inputExpireTimeRecruiment = By.xpath("//form/div[1]/div[8]/div");
    private By btnCalendarExpireTimeRecruiment = By.xpath("//form/div[1]/div[8]/div/button");
    private By inputDescriptionJob = By.xpath("//div[@class='tiptap ProseMirror']");
    private By inputNote = By.xpath("//textarea[@id='«r62»-form-item']");

    private By btnCancel = By.xpath("//button[contains(text(),'Hủy')]");
    private By btnSendApproval = By.xpath("//button[contains(text(),'Gửi duyệt')]");

    public void createRecruitment(String recruitmentName, String positionName) {
        KeyWork.openURL(PropertiesHelper.getValue("URL"));
        //Vào page >> Nhấn nút thêm mới
        KeyWork.hoverElement(QLLDTab);
        KeyWork.clickElement(btnAddNew);
        // Mở screen thêm mới >> thao tác nhập data
        KeyWork.clickElement(dropdownUnitName);
        KeyWork.setText(searchboxUnitName,"BUSS1");
        // chọn đơn vị
        List<WebElement> getAllItemsDrpList = driver.get().findElements(allItemsInList);
        System.out.println("In ra all đơn vị: "+ getAllItemsDrpList.size());
        for (WebElement ai:getAllItemsDrpList) {
            String aidrp = ai.getText();
            if(aidrp.equals("BUSS1")) {
                ai.click(); }
        }
        KeyWork.setText(inputPosition, "Test tạo tin tuyển dụng");
        KeyWork.setText(inputNumberApplicants, "10");
        KeyWork.setText(inputSalary,"10000000");
        KeyWork.setText(inputWorkPlace, "03 Sông Thao");

        KeyWork.clickElement(inputStartworkTime);



    }
}