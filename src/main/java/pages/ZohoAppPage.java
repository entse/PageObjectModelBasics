package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZohoAppPage extends Page {


    public void goToCliq(){

        driver.findElement(By.xpath("//div[text() = 'Cliq']")).click();
    }


    public void goToCRM(){

        driver.findElement(By.xpath("//div[text() = 'CRM']")).click();

    }

    private void goToPageSense(){

        driver.findElement(By.xpath("//div[text() = 'PageSense']")).click();
    }

    public void goToSalesIQ(){

        driver.findElement(By.xpath("//div[text() = 'SalesIQ']")).click();

    }
}
