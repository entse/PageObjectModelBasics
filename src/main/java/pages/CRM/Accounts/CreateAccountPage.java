package pages.CRM.Accounts;

import base.Page;
import base.TopMenu;
import org.openqa.selenium.By;

public class CreateAccountPage extends Page{




    public void createAccount(String accountName){

        type("accountnamefield_XPATH", accountName);


    }
}
