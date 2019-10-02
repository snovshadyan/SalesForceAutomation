package TestCases;

import Base.TestBase;
import Pages.LoginPage;
import Utilities.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase{


    LoginPage loginpage;
    private static Logger log = LogManager.getLogger(LoginPageTest.class);

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void  setup(ITestResult result){
        loginpage = new LoginPage();
        log.info("Testing " + result.getMethod().getMethodName());
    }


    @Test(priority = 1)
    public void Test_Title() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Salesforce Developers | API Documentation, Developer Forums & More");
    }


    @Test(priority=2)
    public void Test_Logo() throws Exception{

        Assert.assertTrue(loginpage.verify_Logo());
    }

    @Test(priority=3)
    public void Test_ProductsTab() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsTab());
    }

    @Test(priority=3)
    public void Test_ProductsItem1() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems1());
    }









    @AfterMethod
    public void getResults(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            Utils.captureScreenshot(driver, result.getMethod().getMethodName() );
            log.info("Test: " + result.getMethod().getMethodName() + " == Failed");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            log.info("Test: " + result.getMethod().getMethodName() + " == Passed");
        } else if (result.getStatus() == ITestResult.SKIP){
            log.info("Test: " + result.getMethod().getMethodName() + " == Skipped");

        }
    }



}
