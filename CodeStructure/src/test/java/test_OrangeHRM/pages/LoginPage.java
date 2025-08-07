package test_OrangeHRM.pages;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;

import OrangeHRM.helpers.PropertiesHelper;
import OrangeHRM.utils.KeyWork;

public class LoginPage extends CommonPage {

    private By inputUserNameTextbox = By.xpath("//form/div/div[2]/div[1]/input");
    private By inputPasswordTextbox = By.xpath("//form//div[2]/div[2]/div/input");
    private By clickOnLoginButton = By.xpath("//button[contains(text(),'Đăng nhập')]");
    private By getTextDashboard = By.xpath("//span[.='Danh sách người dùng']");

    public void loginAdmin(String Username, String Password){
        KeyWork.openURL(PropertiesHelper.getValue("URL"));
        KeyWork.setText(inputUserNameTextbox,Username);
        KeyWork.setText(inputPasswordTextbox,Password);
        KeyWork.clickElement(clickOnLoginButton);
        KeyWork.verifyElementText(getTextDashboard,"Danh sách người dùng","Đăng nhập không thành công");
    }
}
