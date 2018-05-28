package pages.CRM.Accounts;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;

public class CreateAccountPage extends Page{




    public void createAccount(String accountName){

        driver.findElement(By.xpath("//input[@data-colname='ACCOUNTNAME']")).sendKeys(accountName);

    }
}
