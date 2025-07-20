package test_OrangeHRM.testcases;

import org.testng.annotations.Test;

import test_OrangeHRM.base.BaseTest;

public class LoginTest extends BaseTest {
    @Test
    public void TC_loginAdmin(){
        getLoginPage().loginAdmin("admin","admin123");
    }
}
