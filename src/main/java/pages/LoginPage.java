package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {



    public ZohoAppPage doLogin(String username, String password){

        driver.findElement(By.xpath("//input[@name = 'lid']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name = 'pwd']")).sendKeys(password);
        driver.findElement(By.xpath("//div[@id = 'signin_submit']")).click();
        return new ZohoAppPage();

    }

}
