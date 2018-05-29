package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;

public class LoginTest extends BaseTest{


    @Test
    public void loginTest(){


        HomePage home = new HomePage();
        LoginPage lp = home.goToLogin();
        ZohoAppPage zp = lp.doLogin("trainer@way2automation.com", "Selenium@123");
    }
}
