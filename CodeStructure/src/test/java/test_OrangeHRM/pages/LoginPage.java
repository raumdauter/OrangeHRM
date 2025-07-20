package test_OrangeHRM.pages;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;

import OrangeHRM.helpers.PropertiesHelper;
import OrangeHRM.utils.KeyWork;

public class LoginPage extends CommonPage {

    private By inputUserNameTextbox = By.xpath("//input[@placeholder='Username']");
    private By inputPasswordTextbox = By.xpath("//input[@placeholder='Password']");
    private By clickOnLoginButton = By.xpath("//button[normalize-space()='Login']");
    private By getTextDashboard = By.xpath("//h6[normalize-space()='Dashboard']");

    public void loginAdmin(String Username, String Password){
        KeyWork.openURL(PropertiesHelper.getValue("URL"));
        KeyWork.setText(inputUserNameTextbox,Username);
        KeyWork.setText(inputPasswordTextbox,Password);
        KeyWork.clickElement(clickOnLoginButton);
        KeyWork.verifyElementText(getTextDashboard,"Dashboard","Đăng nhập không thành công");
    }
}
