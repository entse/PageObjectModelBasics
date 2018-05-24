package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {


    public void goToCustomers(){
        driver.findElement(By.xpath("//a[@class ='header-customers']")).click();

    }

    public void goToSupport(){
        driver.findElement(By.xpath("//a[@class ='header-customers']/../a[2]")).click();
    }

    public void goToSignup(){
        driver.findElement(By.xpath("//a[@class ='signup']")).click();
    }

    public void goToLogin(){
        driver.findElement(By.xpath("//a[@class ='signin']")).click();
    }


    public void validateFooterLinks(){

    }

}