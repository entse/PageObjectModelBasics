package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import utilities.Utilities;

import java.util.Hashtable;

public class LoginTest extends BaseTest{


    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void loginTest(Hashtable<String, String> data){


        HomePage home = new HomePage();
        LoginPage lp = home.goToLogin();
        lp.doLogin(data.get("username"), data.get("password"));
        Assert.fail("Login test failed");
    }
}
