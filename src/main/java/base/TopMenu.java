package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CRM.Accounts.AccountsPage;

public class TopMenu {

    WebDriver driver;

    public TopMenu (WebDriver driver){
        this.driver = driver;
    }



    public void gotoHome(){

    }

    public void gotoFeeds(){

    }

    public void gotoLeads(){

    }

    public AccountsPage gotoAccounts(){

        driver.findElement(By.xpath("//a[text()='Accounts']")).click();
        return new AccountsPage();

    }

    public void gotoContacts(){

    }

    public void gotoDeals(){

    }

    public void gotoActivities(){

    }

    public void gotoReports(){

    }

    public void gotoCampaigns(){

    }

    public void gotoVisits(){

    }

    public void gotoDocuments(){

    }

}
