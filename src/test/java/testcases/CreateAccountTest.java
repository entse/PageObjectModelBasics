package testcases;

import base.Page;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CRM.Accounts.AccountsPage;
import pages.CRM.Accounts.CreateAccountPage;
import pages.ZohoAppPage;
import utilities.Utilities;

import java.util.Hashtable;

public class CreateAccountTest {


    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void createAccountTest(Hashtable<String, String> data){

        ZohoAppPage zp = new ZohoAppPage();
        zp.goToCRM();
        AccountsPage account = Page.menu.gotoAccounts();
        CreateAccountPage cap = account.gotoCreateAccounts();
        cap.createAccount(data.get("accountname"));
        Assert.fail("Create account test failed");
    }
}
