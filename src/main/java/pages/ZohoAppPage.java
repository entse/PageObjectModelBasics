package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CRM.CRMHomePage;

public class ZohoAppPage extends Page {


    public void goToCliq(){

        driver.findElement(By.xpath("//div[text() = 'Cliq']")).click();
    }


    public CRMHomePage goToCRM(){

        click("CRMlink");
        return new CRMHomePage();

    }

    private void goToPageSense(){

        driver.findElement(By.xpath("//div[text() = 'PageSense']")).click();
    }

    public void goToSalesIQ(){

        driver.findElement(By.xpath("//div[text() = 'SalesIQ']")).click();

    }
}
