package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Reporter;

public class HomePage extends Base{
    public WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;
    LoggerHandler logs;
    /*
     * Constructor name: HomePage
     * Author: Praneeth Kumar
     * Description: this contrustor creates a reference for WebDriverHelper variable, Assertion variable and initializes ExtentTest variable
     * Return type: none
     * Parameters: ExtentTest instance
     */
    public HomePage(ExtentTest test,LoggerHandler logs){
        helper = new WebDriverHelper(Base.driver,logs);
        this.test = test;
        asserts = new Assertion(driver,test, logs);
        this.logs=logs;
    }
    /*
     * Method Name : clickOnCookies
     * Author Name : Praneeth
     * Description : This method clicks on cookies on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnCookies(){
        try {
            helper.clickOnElement(HomePageLocators.cookies);
            logs.logInfo("Clicked on Cookies");
            test.log(Status.INFO,"Click on cookies");
            test.log(Status.PASS, "Cookies clicked");
            Screenshot.takeScreenshot("mayors");
            Reporter.attachScreenshotToReport("mayors", test, "mayors");
        } catch (Exception e) {
            logs.logError("Clicked on Cookies");
            test.log(Status.INFO,"Click on cookies");
            test.log(Status.FAIL,"Not clicked on Cookies");
            Screenshot.takeScreenshot("Cookies");
            Reporter.attachScreenshotToReport("Brands", test, "Cookies attached");
        }
    }
    /*
     * Method Name : clickOnRolex
     * Author Name : Praneeth
     * Description : This method hovers on rolex on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnRolex(){
        try {
            helper.hoverOverElement(HomePageLocators.rolex);
            logs.logInfo("Clicked on Rolex");
            test.log(Status.INFO,"Click on Rolex");
            test.log(Status.PASS,"Clicked on Rolex");
        } catch (Exception e) {
            logs.logError("Clicked on Rolex");
            test.log(Status.INFO,"Click on Rolex");
            test.log(Status.FAIL,"Clicked on Rolex");
            Screenshot.takeScreenshot("Clicked on Rolex");
            Reporter.attachScreenshotToReport("Brands", test, "Clicked on Rolex");
        }
    }
    /*
     * Method Name : clickOnCookies
     * Author Name : Praneeth
     * Description : This method clicks on deepsea on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void deepSea(){
        try {
            helper.hoverOverElement(HomePageLocators.deepSea);
            helper.clickOnElement(HomePageLocators.deepSea);
            logs.logInfo("Clicked on DeepSea");
            test.log(Status.INFO,"Click on DeepSea");
            test.log(Status.PASS,"Clicked on DeepSea");
        } catch (Exception e) {
            logs.logError("Clicked on DeepSea");
            test.log(Status.INFO,"Click on DeepSea");
            test.log(Status.FAIL,"Clicked on DeepSea");
            Screenshot.takeScreenshot("Clicked on DeepSea");
            Reporter.attachScreenshotToReport("Brands", test, "Clicked on DeepSea");
        }
    }
    /*
     * Method Name : verifyDeepSea
     * Author Name : Praneeth
     * Description : This method verify the title of the deepsea page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyDeepSea(String value){
        try{
            asserts.verifyTitleOfPage(value);
        }catch(Exception e){
            logs.logError(e.getMessage());
            Screenshot.takeScreenshot("Clicked on DeepSea");
            Reporter.attachScreenshotToReport("Brands", test, "Clicked on DeepSea");
        }
    }
    /*
     * Method Name : clickOnRolexWatches
     * Author Name : Praneeth
     * Description : This method clicks on rolex watches
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnRolexWatches(){
        try {
            helper.clickOnElement(HomePageLocators.rolexWatches);
            logs.logInfo("Clicked on Rolex Watches");
            test.log(Status.INFO,"Click on Rolex watches");
            test.log(Status.PASS,"Clicked on Rolex Watches");
            logs.logInfo("scroll down to footer");
            test.log(Status.PASS,"navigate back to home page");
        } catch (Exception e) {
            logs.logError("Clicked on Rolex Watches");
            test.log(Status.INFO,"Click on Rolex watches");
            test.log(Status.FAIL,"Clicked on Rolex Watches");
            Screenshot.takeScreenshot("RolexWatches");
            Reporter.attachScreenshotToReport("RolexWatches", test, "Cookies attached");
        }
    }
    /*
     * Method Name : verifyRolexWatch
     * Author Name : Praneeth
     * Description : This method used to verify the tilte of rolex watch page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyRolexWatch(String value){
        try {
            asserts.verifyTextInPage(HomePageLocators.title, value);
            logs.logInfo("title is: " + value);
        } catch (Exception e) {
            logs.logError(e.getMessage());
            Screenshot.takeScreenshot("Cookies");
            Reporter.attachScreenshotToReport("Brands", test, "Cookies attached");
        }
    }
    /*
     * Method Name : clickOnDiscoverWatches
     * Author Name : Praneeth
     * Description : This method clicks on discover watches
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnDiscoverWatches(){
        try {
            
            helper.hoverOverElement(HomePageLocators.discoverWatches);
            helper.clickOnElement(HomePageLocators.discoverWatches);
            logs.logInfo("Clicked on Discover Watches");
            test.log(Status.INFO,"Click on discover watches");
            test.log(Status.PASS,"Clicked on Discover Watches");
        } catch (Exception e) {
            logs.logError("Clicked on Discover Watches");
            test.log(Status.INFO,"Click on discover watches");
            test.log(Status.FAIL,"Clicked on Discover Watches");
            Screenshot.takeScreenshot("Discover watches");
            Reporter.attachScreenshotToReport("Brands", test, "Discover watches");
        }
    }
    /*
     * Method Name : verifyDiscover
     * Author Name : Praneeth
     * Description : This method verify the title of Discover page
     * Parameters : N/A
     * Return Type : void
     */
    public void veirfyDiscover(String value){
        try {
            asserts.verifyTitleOfPage(value);
        } catch (Exception e) {
            logs.logError(e.getMessage());
            Screenshot.takeScreenshot("Discover watches");
            Reporter.attachScreenshotToReport("Brands", test, "Discover watches");
        }
    }
    /*
     * Method Name : clickNewWatches
     * Author Name : Praneeth
     * Description : This method is used to click on new watches
     * Parameters : N/A
     * Return Type : void
     */
    public void clickNewWatches(){
        try {
            helper.clickOnElement(HomePageLocators.newWatches);
            logs.logInfo("Clicked on New Watches");
            test.log(Status.INFO,"Click New making watches");
            test.log(Status.PASS,"Clicked New making Watches");
        } catch (Exception e) {
            logs.logError("Clicked on New Watches");
            test.log(Status.FAIL,"Clicked on New Watches");
            Screenshot.takeScreenshot("NewWatches");
            Reporter.attachScreenshotToReport("Brands", test, "makingWatches");
        }
    }
    /*
     * Method Name : verifyNewWatches
     * Author Name : Praneeth
     * Description : This method verify the title of the new watch page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyNewWatches(String value){
        try {
            asserts.verifyTitleOfPage(value);
        } catch (Exception e) {
            logs.logError(e.getMessage());
        }
    }
    /*
     * Method Name : clickWatchMaking
     * Author Name : Praneeth
     * Description : This method clicks on watch making
     * Parameters : N/A
     * Return Type : void
     */
    public void clickWatchMaking(){
        try {
            helper.clickOnElement(HomePageLocators.watchMaking);
            logs.logInfo("Clicked on making Watches");
            test.log(Status.INFO,"Click on making watches");
            test.log(Status.PASS,"Clicked on making Watches");
        } catch (Exception e) {
            logs.logError("Clicked on making Watches");
            test.log(Status.FAIL,"Clicked on making Watches");
            Screenshot.takeScreenshot("makingWatches");
            Reporter.attachScreenshotToReport("Brands", test, "makingWatches");
        }
    }
    /*
     * Method Name : verifyWatchMaking
     * Author Name : Praneeth
     * Description : This method verify the title of the watch making page
     * Parameters : N/A
     * Return Type : void
     */
    public void veirfyWatchMaking(String value){
        try {
            asserts.verifyTitleOfPage(value);
            Screenshot.takeScreenshot("Watch making");
            Reporter.attachScreenshotToReport("Watch making", test, "Watch making");
        } catch (Exception e) {
            logs.logError(e.getMessage());
            Screenshot.takeScreenshot("Watch making");
            Reporter.attachScreenshotToReport("Watch making", test, "Watch making");
        }
    }

}
