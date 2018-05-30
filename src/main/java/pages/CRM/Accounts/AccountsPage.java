package pages.CRM.Accounts;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;

public class AccountsPage extends Page {



    public CreateAccountPage gotoCreateAccounts(){

        click("createaccountbtn_XPATH");
        return new CreateAccountPage();


    }
}
