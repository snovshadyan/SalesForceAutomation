package Pages;
import Base.TestBase;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage extends TestBase{

@FindBy(xpath="//img[@src='/resources2/images/salesforce-header-logo.png']")
    WebElement Login_Logo;



    public LoginPage(){
        PageFactory.initElements(driver, this);
    }


    public boolean verify_Logo() throws Exception{
        Utils.HEY(Login_Logo);
        return Login_Logo.isDisplayed();
    }








}
