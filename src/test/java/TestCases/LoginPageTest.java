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

    @Test(priority=4)
    public void Test_ProductsItem1() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems1());
    }


    @Test(priority=5)
    public void Test_ProductsItem2() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems2());
    }


    @Test(priority=6)
    public void Test_ProductsItem3() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems3());
    }

    @Test(priority=7)
    public void Test_ProductsItem4() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems4());
    }

    @Test(priority=8)
    public void Test_ProductsItem5() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems5());
    }

    @Test(priority=9)
    public void Test_ProductsItem6() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems6());
    }

    @Test(priority=10)
    public void Test_ProductsItem7() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems7());
    }

    @Test(priority=11)
    public void Test_ProductsItem8() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems8());
    }

    @Test(priority=12)
    public void Test_ProductsItem9() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems9());
    }

    @Test(priority=13)
    public void Test_ProductsItem10() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems10());
    }

    @Test(priority=14)
    public void Test_ProductsItem11() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems11());
    }

    @Test(priority=15)
    public void Test_ProductsItem12() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems12());
    }

    @Test(priority=16)
    public void Test_ProductsItem13() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems13());
    }

    @Test(priority=17)
    public void Test_ProductsItem14() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems14());
    }

    @Test(priority=18)
    public void Test_ProductsItem15() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems15());
    }

    @Test(priority=19)
    public void Test_ProductsItem16() throws Exception{

        Assert.assertTrue(loginpage.verify_ProductsItems16());
    }


    @Test(priority=20)
    public void Test_ResourcesTab() throws Exception{

        Assert.assertTrue(loginpage.verify_Resources());
    }

    @Test(priority=21)
    public void Test_ResourcesItem1() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems1());
    }

    @Test(priority=22)
    public void Test_ResourcesItem2() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems2());
    }

    @Test(priority=23)
    public void Test_ResourcesItem3() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems3());
    }

    @Test(priority=24)
    public void Test_ResourcesItem4() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems4());
    }

    @Test(priority=25)
    public void Test_ResourcesItem5() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems5());
    }

    @Test(priority=26)
    public void Test_ResourcesItem6() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems6());
    }

    @Test(priority=27)
    public void Test_ResourcesItem7() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems7());
    }

    @Test(priority=28)
    public void Test_ResourcesItem8() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems8());
    }

    @Test(priority=29)
    public void Test_ResourcesItem9() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems9());
    }

    @Test(priority=30)
    public void Test_ResourcesItem10() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems10());
    }

    @Test(priority=31)
    public void Test_ResourcesItem11() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems11());
    }

    @Test(priority=32)
    public void Test_ResourcesItem12() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems12());
    }

    @Test(priority=33)
    public void Test_ResourcesItem13() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems13());
    }

    @Test(priority=34)
    public void Test_ResourcesItem14() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems14());
    }

    @Test(priority=35)
    public void Test_ResourcesItem15() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems15());
    }

    @Test(priority=36)
    public void Test_ResourcesItem16() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems16());
    }

    @Test(priority=37)
    public void Test_ResourcesItem17() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems17());
    }

    @Test(priority=38)
    public void Test_ResourcesItem18() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems18());
    }

//    @Test(priority=39)
//    public void Test_ResourcesItem19() throws Exception{
//
//        Assert.assertTrue(loginpage.verify_ResourcesItems19());
//    }

    @Test(priority=40)
    public void Test_ResourcesItem20() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems20());
    }

    @Test(priority=41)
    public void Test_ResourcesItem21() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems21());
    }

    @Test(priority=42)
    public void Test_ResourcesItem22() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems22());
    }

    @Test(priority=43)
    public void Test_ResourcesItem23() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems23());
    }

    @Test(priority=44)
    public void Test_ResourcesItem24() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems24());
    }

    @Test(priority=45)
    public void Test_ResourcesItem25() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems25());
    }

    @Test(priority=46)
    public void Test_ResourcesItem26() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems26());
    }

    @Test(priority=47)
    public void Test_ResourcesItem27() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems27());
    }

    @Test(priority=48)
    public void Test_ResourcesItem28() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems28());
    }

    @Test(priority=49)
    public void Test_ResourcesItem29() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems29());
    }

    @Test(priority=50)
    public void Test_ResourcesItem30() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems30());
    }

    @Test(priority=51)
    public void Test_ResourcesItem31() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems31());
    }

    @Test(priority=52)
    public void Test_ResourcesItem32() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems32());
    }

    @Test(priority=53)
    public void Test_ResourcesItem33() throws Exception{

        Assert.assertTrue(loginpage.verify_ResourcesItems33());
    }


    @Test(priority=54)
    public void Test_Community() throws Exception{

        Assert.assertTrue(loginpage.verify_Community());
    }

    @Test(priority=55)
    public void Test_CommunityItem1() throws Exception{

        Assert.assertTrue(loginpage.verify_CommunityItems1());
    }

    @Test(priority=56)
    public void Test_CommunityItem2() throws Exception{

        Assert.assertTrue(loginpage.verify_CommunityItems2());
    }

    @Test(priority=57)
    public void Test_CommunityItem3() throws Exception{

        Assert.assertTrue(loginpage.verify_CommunityItems3());
    }

//    @Test(priority=58)
//    public void Test_CommunityItem4() throws Exception{
//
//        Assert.assertTrue(loginpage.verify_CommunityItems4());
//    }

    @Test(priority=59)
    public void Test_CommunityItem5() throws Exception{

        Assert.assertTrue(loginpage.verify_CommunityItems5());
    }

    @Test(priority=60)
    public void Test_CommunityItem6() throws Exception{

        Assert.assertTrue(loginpage.verify_CommunityItems6());
    }

    @Test(priority=61)
    public void Test_SearchBox() throws Exception{

        Assert.assertTrue(loginpage.verify_SearchBox());
    }

    @Test(priority=62)
    public void Test_LoginBtn() throws Exception{

        Assert.assertTrue(loginpage.verify_LoginBtn());
    }

    @Test(priority=63)
    public void Test_SignUpBtn() throws Exception{

        Assert.assertTrue(loginpage.verify_SignUpBtn());
    }

    @Test(priority=64)
    public void Test_RegisterNowBtn() throws Exception{

        Assert.assertTrue(loginpage.verify_RegisterNowBtn());
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
