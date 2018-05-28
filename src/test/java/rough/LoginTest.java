package rough;

import base.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.CRM.Accounts.AccountsPage;
import pages.CRM.Accounts.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main(String[] args) {


        HomePage home = new HomePage();
        LoginPage lp = home.goToLogin();
        ZohoAppPage zp = lp.doLogin("trainer@way2automation.com", "Selenium@123");
        zp.goToCRM();
        AccountsPage account = Page.menu.gotoAccounts();
        CreateAccountPage cap = account.gotoCreateAccounts();
        cap.createAccount("Alex");
    }
}
