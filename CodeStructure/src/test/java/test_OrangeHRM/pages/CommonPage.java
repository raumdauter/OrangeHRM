package test_OrangeHRM.pages;


import java.security.Key;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import OrangeHRM.utils.KeyWork;
import OrangeHRM.helpers.ExcelHelper;

public class CommonPage {
    public LoginPage loginPage;
    public ExcelHelper excel;
    public RecruimentPage recruimentPage;

    //Object dùng chung
    public By displayNameArea = By.xpath("//div[@class='text-sm']");
    public By btnLogout = By.xpath("//div[@role='menuitem']");

    @AfterSuite
    public LoginPage dangXuat() {
       KeyWork.clickElement(displayNameArea);
       KeyWork.clickElement(btnLogout);
       return getLoginPage();
    }

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

    public RecruimentPage getRecruimentPage() {
        if (recruimentPage == null) {
            recruimentPage = new RecruimentPage();
        }
        return recruimentPage;
    }

}
