package pages.CRM.Accounts;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;

public class AccountsPage extends Page {



    public CreateAccountPage gotoCreateAccounts(){

        driver.findElement(By.xpath("//button[text() = 'Create Account']")).click();
        return new CreateAccountPage();


    }
}
