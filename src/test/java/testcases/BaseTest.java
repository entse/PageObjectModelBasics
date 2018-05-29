package testcases;

import base.Page;
import org.testng.annotations.AfterSuite;

public class BaseTest {


    @AfterSuite
    private void tearDown(){

        Page.quit();

    }

}
