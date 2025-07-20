package test_OrangeHRM.pages;


import OrangeHRM.helpers.ExcelHelper;

public class CommonPage {
    public LoginPage loginPage;
    public ExcelHelper excel;
    public TheContractPage theContractPage;
    public TheCouncilPage theCouncilPage;
    public NguonTaiTroKinhPhiPage nguonTaiTroKinhPhiPage;

    public ExcelHelper getExcel() {
        if (excel == null) {
            excel = new ExcelHelper();
        }
        return excel;
    }
    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public TheCouncilPage getTheCouncilPage(){
        if (theCouncilPage== null) {
            theCouncilPage = new TheCouncilPage();
        }
        return theCouncilPage;
    }

    public  TheContractPage getTheContractPage(){
        if (theContractPage == null) {
            theContractPage = new TheContractPage();
        }
        return theContractPage;
    }

    public  NguonTaiTroKinhPhiPage getNguonTaiTroKinhPhiPage() {
        if (nguonTaiTroKinhPhiPage == null) {
            nguonTaiTroKinhPhiPage = new NguonTaiTroKinhPhiPage();
        }
        return nguonTaiTroKinhPhiPage;
    }
}
