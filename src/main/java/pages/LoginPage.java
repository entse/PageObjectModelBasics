package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {



    public ZohoAppPage doLogin(String username, String password){

        type("email_XPATH", username);
        type("password_XPATH", password);
        click("signinBtn_XPATH");

        return new ZohoAppPage();

    }

}
