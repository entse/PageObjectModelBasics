package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main(String[] args) {


        HomePage home = new HomePage();
        home.goToLogin();

        LoginPage login = new LoginPage();
        login.doLogin("trainer@way2automation.com", "Selenium@123");

        ZohoAppPage zp = new ZohoAppPage();
        zp.goToCRM();
    }
}
