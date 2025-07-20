package test_OrangeHRM.testcases;

import OrangeHRM.helpers.ExcelHelper;
import org.testng.annotations.Test;
import test_OrangeHRM.base.BaseTest;

public class TheContractTest extends BaseTest {
    @Test
    public void TC_addNewContractPopup(){
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                excelHelper.getCellData("Username",1),
                excelHelper.getCellData("Password",1)
        );
        getTheContractPage().popupAddNewContract();
}
    @Test
    public void TC_addNewHSStep1(){
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                excelHelper.getCellData("Username",1),
                excelHelper.getCellData("Password",1)
        );

        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/AddContract.xlsx","addContract");
        getTheContractPage().inputInforContract(
                excelHelper.getCellData("Mahs",1),
                excelHelper.getCellData("TimeStart",1),
                excelHelper.getCellData("TimeEnd",1),
                excelHelper.getCellData("TimeBCGD",1),
                excelHelper.getCellData("TimeGD",1),
                excelHelper.getCellData("TimeBCNT",1),
                excelHelper.getCellData("TimeNT",1),
                excelHelper.getCellData("TimeBCTD",1)

        );


    }
    @Test
    public void TC_addNewHSStep2(){
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                excelHelper.getCellData("Username",1),
                excelHelper.getCellData("Password",1)
        );
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/AddContract.xlsx","addContract");
        getTheContractPage().inputInforContract(
                excelHelper.getCellData("Mahs",1),
                excelHelper.getCellData("TimeStart",1),
                excelHelper.getCellData("TimeEnd",1),
                excelHelper.getCellData("TimeBCGD",1),
                excelHelper.getCellData("TimeGD",1),
                excelHelper.getCellData("TimeBCNT",1),
                excelHelper.getCellData("TimeNT",1),
                excelHelper.getCellData("TimeBCTD",1)

        );
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/AddContract.xlsx","If2");
        getTheContractPage().inputIfThuchien(
                excelHelper.getCellData("Role",1)
        );
    }
    @Test
    public void TC_checkBackButton1(){
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                excelHelper.getCellData("Username",1),
                excelHelper.getCellData("Password",1)
        );
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/AddContract.xlsx","addContract");
        getTheContractPage().inputInforContract(
                excelHelper.getCellData("Mahs",1),
                excelHelper.getCellData("TimeStart",1),
                excelHelper.getCellData("TimeEnd",1),
                excelHelper.getCellData("TimeBCGD",1),
                excelHelper.getCellData("TimeGD",1),
                excelHelper.getCellData("TimeBCNT",1),
                excelHelper.getCellData("TimeNT",1),
                excelHelper.getCellData("TimeBCTD",1)

        );
        getTheContractPage().checkBackStep1();

    }
    @Test
    public void TC_checkBackbutton2(){
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                excelHelper.getCellData("Username",1),
                excelHelper.getCellData("Password",1)
        );
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/AddContract.xlsx","addContract");
        getTheContractPage().inputInforContract(
                excelHelper.getCellData("Mahs",1),
                excelHelper.getCellData("TimeStart",1),
                excelHelper.getCellData("TimeEnd",1),
                excelHelper.getCellData("TimeBCGD",1),
                excelHelper.getCellData("TimeGD",1),
                excelHelper.getCellData("TimeBCNT",1),
                excelHelper.getCellData("TimeNT",1),
                excelHelper.getCellData("TimeBCTD",1)

        );
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/AddContract.xlsx","If2");
        getTheContractPage().inputIfThuchien(
                excelHelper.getCellData("Role",1)
        );
        getTheContractPage().checkBackStep2();
    }
    @Test
    public void TC_checkAddHDsucess(){
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/LoginPage.xlsx","loginAdmin");
        getLoginPage().loginAdmin(
                excelHelper.getCellData("Username",1),
                excelHelper.getCellData("Password",1)
        );
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/AddContract.xlsx","addContract");
        getTheContractPage().inputInforContract(
                excelHelper.getCellData("Mahs",1),
                excelHelper.getCellData("TimeStart",1),
                excelHelper.getCellData("TimeEnd",1),
                excelHelper.getCellData("TimeBCGD",1),
                excelHelper.getCellData("TimeGD",1),
                excelHelper.getCellData("TimeBCNT",1),
                excelHelper.getCellData("TimeNT",1),
                excelHelper.getCellData("TimeBCTD",1)

        );
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/AddContract.xlsx","If2");
        getTheContractPage().inputIfThuchien(
                excelHelper.getCellData("Role",1)
        );
        excelHelper.setExcelFile("src/main/java/main_HRM_anhtester/datatest/excel/AddContract.xlsx","Ifkinhphi");
        getTheContractPage().inputIfKinhphi(
                excelHelper.getCellData("KinhPhi",1),
                excelHelper.getCellData("KPNS",1),
                excelHelper.getCellData("Dot1",1),
                excelHelper.getCellData("Dot2",1)
        );
    }




}
