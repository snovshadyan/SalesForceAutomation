package Pages;
import Base.TestBase;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.rmi.CORBA.Util;


public class LoginPage extends TestBase{

@FindBy(xpath="//img[@src='/resources2/images/salesforce-header-logo.png']")
    WebElement Login_Logo;

@FindBy(xpath="//a[@href='/platform/overview']")
    WebElement ProductsTab;

@FindBy(xpath = "//a[@href='/platform']")
    WebElement Platform;








































    public LoginPage(){
        PageFactory.initElements(driver, this);
    }


    public boolean verify_Logo() throws Exception{
        Utils.HEY(Login_Logo);
        return Login_Logo.isDisplayed();
    }

    public boolean verify_ProductsTab() throws Exception{
        Utils.HEY(ProductsTab);
        return ProductsTab.isDisplayed();
    }


    public boolean verify_ProductsItems1() throws Exception{

        Utils.HoverOver(ProductsTab);
        Utils.HEY(Platform);
        return Platform.isDisplayed();

    }





}
