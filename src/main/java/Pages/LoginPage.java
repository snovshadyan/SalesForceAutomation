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

@FindBy(xpath = "//a[@href='/platform/appexchange']")
    WebElement Appexchange;

@FindBy(xpath = "//a[@href='/force-com']")
    WebElement LightningPlatform;

@FindBy(xpath = "//a[@href='/product-mulesoft']")
    WebElement Mulesoft;

@FindBy(xpath = "//a[@href='/product-heroku']")
    WebElement Heroku;

@FindBy(xpath = "//a[@href='/mobile']")
    WebElement Mobile;

@FindBy(xpath = "//a[@href='/lightning']")
    WebElement Lightning;

@FindBy(xpath = "//a[@href='/einstein']")
    WebElement Einstein;

@FindBy(xpath = "//a[@href='/platform/dx']")
    WebElement SalesforceDX;

@FindBy(xpath = "//a[@href='/einstein-analytics']")
    WebElement EinsteinAnalytics;

@FindBy(xpath = "//a[@href='/commercecloud']")
    WebElement CommerceCloud;

@FindBy(xpath = "//a[text()='Community Cloud']")
    WebElement CommunityCloud;

@FindBy(xpath = "//a[text()='Marketing Cloud']")
    WebElement MarketingCloud;

@FindBy(xpath = "//a[text()='Pardot']")
    WebElement Pardot;

@FindBy(xpath = "//a[text()='Quip']")
    WebElement Quip;

@FindBy(xpath = "//a[@href='/resources']")
    WebElement Resources;

@FindBy(xpath = "//a[@href='/gettingstarted']")
    WebElement GettingStarted;

@FindBy(xpath = "//a[@href='/docs']")
    WebElement Documentation;

@FindBy(xpath = "//a[@href='https://trailhead.salesforce.com']")
    WebElement Tutorials;

@FindBy(xpath = "//a[@href='https://developer.salesforce.com/devcenter']")
    WebElement DeveloperCenters;

@FindBy(xpath = "//a[@href='https://developer.salesforce.com/docs/component-library']")
    WebElement ComponentLibrary;

@FindBy(xpath = "//a[@href='https://developer.salesforce.com/tv/']")
    WebElement VideoGallery;

@FindBy(xpath = "//a[@href='https://developer.salesforce.com/tv/lwc-video-gallery']")
    WebElement ComponentsVideos;

@FindBy(xpath = "//a[@href='https://www.lightningdesignsystem.com/']")
    WebElement DesignSystem;

@FindBy(xpath = "//a[@href='https://trailhead.salesforce.com/sample-gallery']")
    WebElement SampleGallery;

@FindBy(xpath = "//a[@href='/page/Developer_Library']")
    WebElement CheatSheets;

@FindBy(xpath = "//a[@href='/content/type/Webinar']")
    WebElement Webinars;

@FindBy(xpath = "//a[@href='http://certification.salesforce.com/platform-developers']")
    WebElement Certification;

@FindBy(xpath = "//a[@href='https://developer.salesforce.com/docs/api-explorer']")
    WebElement APIExplorer;

@FindBy(xpath = "//a[@href='/tools/sfdxcli']")
    WebElement CLI;

@FindBy(xpath = "//a[@href='/tools/extension_vscode']")
    WebElement VSCode;

@FindBy(xpath = "//a[@href='https://workbench.developerforce.com/login.php']")
    WebElement Workbench;

@FindBy(xpath = "//a[@href='https://developer.salesforce.com/docs/metadata-coverage']")
    WebElement Metadata;

@FindBy(xpath = "//a[@href='/tools']")
    WebElement Toolkits;

@FindBy(xpath = "//a[@href='/platform/appexchange']")
    WebElement AppDistribution;

@FindBy(xpath = "//a[@href='/developer-centers/architecture']")
    WebElement Architect;

@FindBy(xpath = "//a[@href='/developer-centers/community-cloud/']")
    WebElement CommunityCloud2;

@FindBy(xpath = "//a[@href='/developer-centers/einstein-analytics']")
    WebElement EinsteinAnalytics2;

@FindBy(xpath = "//a[@href='/developer-centers/ein-platform']")
    WebElement EinsteinPlatform;

@FindBy(xpath = "//a[@href='/developer-centers/identity']")
    WebElement Identity;

@FindBy(xpath = "//a[@href='/developer-centers/lightning-apps']")
    WebElement LightningFramework;

@FindBy(xpath = "//a[@href='/developer-centers/lightning-flow']")
    WebElement LightningFlow;

@FindBy(xpath = "//a[@href='/developer-centers/marketing-cloud']")
    WebElement MarketingCloud2;

@FindBy(xpath = "//a[@href='/developer-centers/mobile']")
    WebElement Mobile2;

@FindBy(xpath = "//a[@href='/developer-centers/integration-apis']")
    WebElement IntegrationAPIs;

@FindBy(xpath = "//a[@href='/developer-centers/developer-experience']")
    WebElement SalesforceDX2;

@FindBy(xpath = "//a[@href='/developer-centers/service-cloud']")
    WebElement ServiceCloud;

@FindBy(xpath = "//a[@href='/developer-centers/service-cloud/sdk/']")
    WebElement SDK;

@FindBy(xpath = "//a[@href='/developer-centers/security']")
    WebElement Security;

@FindBy(xpath = "//a[@href='//events.developerforce.com/signup?d=70130000000tgM8']")
    WebElement Community;

@FindBy(xpath = "//a[@href='/forums']")
    WebElement DeveloperForums;

@FindBy(xpath = "//a[@href='/calendar']")
    WebElement Calendar;

@FindBy(xpath = "//a[@href='/mvp']")
    WebElement MVP;

@FindBy(xpath = "//a[@href='https://trailblazercommunitygroups.com/?&amp;utm_source=developer&amp;utm_medium=web-banner&amp;utm_campaign=community_groups&amp;utm_content=devs&amp;_ga=2.253170121.1534932913.1570039001-389397659.1570039001']")
    WebElement DeveloperGroups;

@FindBy(xpath = "//a[@href='https://trailhead.salesforce.com/trailblazers?#role-dev']")
    WebElement DeveloperSuccessStories;

@FindBy(xpath = "//a[@href='/blogs/']")
    WebElement Blog;

@FindBy(xpath = "//a[@href='https://trailhead.salesforce.com']")
    WebElement Trailhead;

@FindBy(xpath = "//a[@href='https://trailhead.salesforce.com/trails']")
    WebElement Trails;


@FindBy(xpath = "//a[@href='https://trailhead.salesforce.com/modules']")
private WebElement Modules;

@FindBy(xpath = "//a[@href='https://trailhead.salesforce.com/projects']")
    WebElement Projects;

@FindBy(xpath = "//a[@href='https://trailhead.salesforce.com/super_badges']")
    WebElement Superbadges;

@FindBy(xpath = "//a[@href='https://trailhead.salesforce.com/trailblazers']")
    WebElement Trailblazers;

@FindBy(xpath = "//a[@href='https://developer.salesforce.com/forums?communityId=09aF00000004HMGIA2#!/feedtype=RECENT&amp;dc=Trailhead&amp;criteria=ALLQUESTIONS']")
    WebElement GetHelp;

@FindBy(xpath = "//a[@href='https://success.salesforce.com/_ui/core/chatter/groups/GroupProfilePage?g=0F9300000009Nek']")
    WebElement JointheCommunity;

@FindBy(xpath="//input[@id='st-search-input']")
WebElement SearchBox;

@FindBy(xpath="//button[@id='login-button']")
WebElement LoginBtn;

@FindBy(xpath="/html/body/div[4]/div/div/header/div[3]/div/div/div[1]/div[1]/div[1]/a")
WebElement SignUp;

@FindBy(xpath="/html/body/div[6]/div[1]/div/div/div/div[2]/ul/li[1]/div/div[2]/a[2]")
    WebElement RegisterNow;













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

    public boolean verify_ProductsItems2() throws Exception{
        Utils.HEY(Platform);
        return Platform.isDisplayed();

    }

    public boolean verify_ProductsItems3() throws Exception{
        Utils.HEY(Appexchange);
        return Appexchange.isDisplayed();
    }

    public boolean verify_ProductsItems4() throws Exception{
        Utils.HEY(LightningPlatform);
        return LightningPlatform.isDisplayed();
    }

    public boolean verify_ProductsItems5() throws Exception{
        Utils.HEY(Mulesoft);
        return Mulesoft.isDisplayed();
    }

    public boolean verify_ProductsItems6() throws Exception{
        Utils.HEY(Heroku);
        return Heroku.isDisplayed();
    }

    public boolean verify_ProductsItems7() throws Exception{
        Utils.HEY(Mobile);
        return Mobile.isDisplayed();
    }

    public boolean verify_ProductsItems8() throws Exception{
        Utils.HEY(Lightning);
        return Lightning.isDisplayed();
    }

    public boolean verify_ProductsItems9() throws Exception{
        Utils.HEY(Einstein);
        return Einstein.isDisplayed();
    }

    public boolean verify_ProductsItems10() throws Exception{
        Utils.HEY(SalesforceDX);
        return SalesforceDX.isDisplayed();
    }

    public boolean verify_ProductsItems11() throws Exception{
        Utils.HEY(EinsteinAnalytics);
        return EinsteinAnalytics.isDisplayed();
    }

    public boolean verify_ProductsItems12() throws Exception{
        Utils.HEY(CommerceCloud);
        return CommerceCloud.isDisplayed();
    }

    public boolean verify_ProductsItems13() throws Exception{
        Utils.HEY(CommunityCloud);
        return CommunityCloud.isDisplayed();
    }

    public boolean verify_ProductsItems14() throws Exception{
        Utils.HEY(MarketingCloud);
        return MarketingCloud.isDisplayed();
    }

    public boolean verify_ProductsItems15() throws Exception{
        Utils.HEY(Pardot);
        return Pardot.isDisplayed();
    }

    public boolean verify_ProductsItems16() throws Exception{
        Utils.HEY(Quip);
        return Quip.isDisplayed();
    }

    public boolean verify_Resources() throws Exception{
        Utils.HoverOver(Resources);
        Utils.HEY(Resources);
        return Resources.isDisplayed();
    }

    public boolean verify_ResourcesItems1() throws Exception{
        Utils.HEY(GettingStarted);
        return GettingStarted.isDisplayed();
    }

    public boolean verify_ResourcesItems2() throws Exception{
        Utils.HEY(Documentation);
        return Documentation.isDisplayed();
    }

    public boolean verify_ResourcesItems3() throws Exception{
        Utils.HEY(Tutorials);
        return Tutorials.isDisplayed();
    }

    public boolean verify_ResourcesItems4() throws Exception{
        Utils.HEY(DeveloperCenters);
        return DeveloperCenters.isDisplayed();
    }

    public boolean verify_ResourcesItems5() throws Exception{
        Utils.HEY(ComponentLibrary);
        return ComponentLibrary.isDisplayed();
    }

    public boolean verify_ResourcesItems6() throws Exception{
        Utils.HEY(VideoGallery);
        return VideoGallery.isDisplayed();
    }

    public boolean verify_ResourcesItems7() throws Exception{
        Utils.HEY(ComponentsVideos);
        return ComponentsVideos.isDisplayed();
    }

    public boolean verify_ResourcesItems8() throws Exception{
        Utils.HEY(DesignSystem);
        return DesignSystem.isDisplayed();
    }

    public boolean verify_ResourcesItems9() throws Exception{
        Utils.HEY(SampleGallery);
        return SampleGallery.isDisplayed();
    }

    public boolean verify_ResourcesItems10() throws Exception{
        Utils.HEY(CheatSheets);
        return CheatSheets.isDisplayed();
    }

    public boolean verify_ResourcesItems11() throws Exception{
        Utils.HEY(Webinars);
        return Webinars.isDisplayed();
    }

    public boolean verify_ResourcesItems12() throws Exception{
        Utils.HEY(Certification);
        return Certification.isDisplayed();
    }

    public boolean verify_ResourcesItems13() throws Exception{
        Utils.HEY(APIExplorer);
        return APIExplorer.isDisplayed();
    }

    public boolean verify_ResourcesItems14() throws Exception{
        Utils.HEY(CLI);
        return CLI.isDisplayed();
    }

    public boolean verify_ResourcesItems15() throws Exception{
        Utils.HEY(VSCode);
        return VSCode.isDisplayed();
    }

    public boolean verify_ResourcesItems16() throws Exception{
        Utils.HEY(Workbench);
        return Workbench.isDisplayed();
    }

    public boolean verify_ResourcesItems17() throws Exception{
        Utils.HEY(Metadata);
        return Metadata.isDisplayed();
    }

    public boolean verify_ResourcesItems18() throws Exception{
        Utils.HEY(Toolkits);
        return Toolkits.isDisplayed();
    }

    public boolean verify_ResourcesItems19() throws Exception{
        Utils.HEY(AppDistribution);
        return AppDistribution.isDisplayed();
    }

    public boolean verify_ResourcesItems20() throws Exception{
        Utils.HEY(Architect);
        return Architect.isDisplayed();
    }

    public boolean verify_ResourcesItems21() throws Exception{
        Utils.HEY(CommunityCloud2);
        return CommunityCloud2.isDisplayed();
    }

    public boolean verify_ResourcesItems22() throws Exception{
        Utils.HEY(EinsteinAnalytics2);
        return EinsteinAnalytics2.isDisplayed();
    }

    public boolean verify_ResourcesItems23() throws Exception{
        Utils.HEY(EinsteinPlatform);
        return EinsteinPlatform.isDisplayed();
    }

    public boolean verify_ResourcesItems24() throws Exception{
        Utils.HEY(Identity);
        return Identity.isDisplayed();
    }

    public boolean verify_ResourcesItems25() throws Exception{
        Utils.HEY(LightningFramework);
        return LightningFramework.isDisplayed();
    }

    public boolean verify_ResourcesItems26() throws Exception{
        Utils.HEY(LightningFlow);
        return LightningFlow.isDisplayed();
    }

    public boolean verify_ResourcesItems27() throws Exception{
        Utils.HEY(MarketingCloud2);
        return MarketingCloud2.isDisplayed();
    }

    public boolean verify_ResourcesItems28() throws Exception{
        Utils.HEY(Mobile2);
        return Mobile2.isDisplayed();
    }

    public boolean verify_ResourcesItems29() throws Exception{
        Utils.HEY(IntegrationAPIs);
        return IntegrationAPIs.isDisplayed();
    }

    public boolean verify_ResourcesItems30() throws Exception{
        Utils.HEY(SalesforceDX2);
        return SalesforceDX2.isDisplayed();
    }

    public boolean verify_ResourcesItems31() throws Exception{
        Utils.HEY(ServiceCloud);
        return ServiceCloud.isDisplayed();
    }

    public boolean verify_ResourcesItems32() throws Exception{
        Utils.HEY(SDK);
        return SDK.isDisplayed();
    }

    public boolean verify_ResourcesItems33() throws Exception{
        Utils.HEY(Security);
        return Security.isDisplayed();
    }

    public boolean verify_Community() throws Exception{
        Utils.HoverOver(Community);
        Utils.HEY(Community);
        return Community.isDisplayed();
    }

    public boolean verify_CommunityItems1() throws Exception{
        Utils.HEY(DeveloperForums);
        return DeveloperForums.isDisplayed();
    }

    public boolean verify_CommunityItems2() throws Exception {
        Utils.HEY(Calendar);
        return Calendar.isDisplayed();
    }

    public boolean verify_CommunityItems3() throws Exception {
        Utils.HEY(MVP);
        return MVP.isDisplayed();
    }

    public boolean verify_CommunityItems4() throws Exception {
        Utils.HEY(DeveloperGroups);
        return DeveloperGroups.isDisplayed();
    }

    public boolean verify_CommunityItems5() throws Exception {
        Utils.HEY(DeveloperSuccessStories);
        return DeveloperSuccessStories.isDisplayed();
    }

    public boolean verify_CommunityItems6() throws Exception {
        Utils.HEY(Blog);
        return Blog.isDisplayed();
    }

    public boolean verify_Trailhead() throws Exception{
        Utils.HoverOver(Trailhead);
        Utils.HEY(Trailhead);
        return Trailhead.isDisplayed();
    }

    public boolean verify_TrailheadItems1() throws Exception {
        Utils.HEY(Trails);
        return Trails.isDisplayed();
    }

    public boolean verify_TrailheadItems2() throws Exception {
        Utils.HEY(Modules);
        return Modules.isDisplayed();
    }

    public boolean verify_TrailheadItems3() throws Exception {
        Utils.HEY(Projects);
        return Projects.isDisplayed();
    }

    public boolean verify_TrailheadItems4() throws Exception {
        Utils.HEY(Superbadges);
        return Superbadges.isDisplayed();
    }

    public boolean verify_TrailheadItems5() throws Exception {
        Utils.HEY(Trailblazers);
        return Trailblazers.isDisplayed();
    }

    public boolean verify_TrailheadItems6() throws Exception {
        Utils.HEY(GetHelp);
        return GetHelp.isDisplayed();
    }

    public boolean verify_TrailheadItems7() throws Exception {
        Utils.HEY(JointheCommunity);
        return JointheCommunity.isDisplayed();
    }

    public boolean verify_SearchBox() throws Exception {
        Utils.HoverOver(SearchBox);
        Utils.HEY(SearchBox);
        return SearchBox.isDisplayed();
    }

    public boolean verify_LoginBtn() throws Exception {
        Utils.HEY(LoginBtn);
        return LoginBtn.isDisplayed();
    }

    public boolean verify_SignUpBtn() throws Exception {
        Utils.HEY(SignUp);
        return SignUp.isDisplayed();
    }

    public boolean verify_RegisterNowBtn() throws Exception {
        Utils.HEY(RegisterNow);
        return RegisterNow.isDisplayed();
    }







































}
