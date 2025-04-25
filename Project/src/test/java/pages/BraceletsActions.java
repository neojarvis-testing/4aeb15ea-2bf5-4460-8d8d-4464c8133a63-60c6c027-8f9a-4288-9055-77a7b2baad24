package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BraceletsLocators;
import uistore.SearchLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BraceletsActions {

     WebDriver driver;
    WebDriverHelper helper;
    Assertion assertion;
    ExtentTest test;
    LoggerHandler logs;

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: BraceletsActions (Constructor)
     * Description: This constructor initializes WebDriver, WebDriverHelper,
     * ExtentTest, and Assertion objects for Bracelets actions.
     * Parameters: WebDriver driver, ExtentTest test
     * Return Type: None (Constructor)
     */

    public BraceletsActions(WebDriver driver, ExtentTest test, LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        assertion = new Assertion(driver, logs);
        this.logs = logs;
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnAccept
     * Description: This method is for clicking the "Accept and Cookies" button in
     * the bracelets module.
     * Parameters: None
     * Return Type: void
     */

     public void clickOnAccept(){
        try{
        helper.clickOnElement(BraceletsLocators.acceptAndCookies);
         logs.logInfo("Clicked On Accept and Cookies");
         test.log(Status.INFO, "Clicked On Accept and Cookies");
        test.log(Status.PASS, "Clicked On Accept and Cookies");
        }catch(Exception e){
            System.out.println(e.getMessage());
            logs.logError("Clicked On Accept and Cookies");
            test.log(Status.FAIL, "Clicked On Accept and Cookies");
            Reporter.attachScreenshotToReport("Clicked cookies",test,"Accept and Cookies");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: hoverOnWedding
     * Description: This method is for hovering over the "Wedding" element in the
     * bracelets module.
     * Parameters: None
     * Return Type: void
     */


    public void hoverOnWedding(){
        try {
            helper.hoverOverElement(BraceletsLocators.wedding);
            logs.logInfo("Hovered over wedding");
            test.log(Status.INFO, "Hovered over wedding");
            test.log(Status.PASS, "Hovered over wedding");
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Hovered over wedding");
            test.log(Status.FAIL, "Hovered over wedding");
            Reporter.attachScreenshotToReport("Hovered over wedding",test,"Hovered over wedding");
        }

    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: verifyWebsite
     * Description: Verifies if the page title matches "Mayors" and logs the
     * results. Errors are managed with logging and screenshots for traceability.
     * Parameters: None
     * Return Type: void
     */


    public void verifyWebsite(){
        try {
            assertion.verifyTitleOfPage("Mayors");
            test.log(Status.INFO, "Verified the page loaded with Bracelets");
            logs.logInfo("Verified the text Bracelets");
            test.log(Status.PASS, "Verified the text Bracelets");
            
        }catch (Exception e) {
            logs.logError("Verified the page loaded with Bracelets");
            test.log(Status.FAIL, "Verified the page loaded with Bracelets");
            Reporter.attachScreenshotToReport("verifyBracelets",test,"Verified the page loaded with Bracelets");
            
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnBracelets
     * Description: This method is for clicking the "Bracelets" element in the
     * bracelets module.
     * Parameters: None
     * Return Type: void
     */
    


    public void clickOnBracelets(){
        try{
            helper.clickOnElement(BraceletsLocators.bracelets);
            logs.logInfo("Clicked On Bracelets");
            test.log(Status.INFO, "Clicked On Bracelets");
            logs.logInfo("Clicked On Bracelets");
            test.log(Status.PASS, "Clicked On Bracelets");
        }catch(Exception e){
            logs.logError("Clicked On Bracelets");
            test.log(Status.INFO, "Clicked On Bracelets");
            System.out.println(e.getMessage());
            logs.logError("Clicked On Bracelets");
            test.log(Status.FAIL,"Clicked On Bracelets");
            Reporter.attachScreenshotToReport("Clicked On Bracelets",test,"Clicked Bracelets");
        }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: verifyJew
     * Description: This method is for verifying the presence of the text "Jewelry"
     * on the page.
     * Parameters: None
     * Return Type: void
     */

    public void verifyJew(String value){
        try {
            assertion.verifyTextInPage(BraceletsLocators.verJewelry,value);
            test.log(Status.INFO, "Verified the text Jewelry");
            logs.logInfo("Verified the text Jewelry");
            test.log(Status.PASS, "Verified the text Jewelry");
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Verified the text Jewelry");
            test.log(Status.FAIL, "Verified the text Jewelry");
            Reporter.attachScreenshotToReport("Verified the text Jewelr",test,"Jewelry");
            
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnDismiss
     * Description: This method is for clicking the "Dismiss" button in the search
     * module.
     * Parameters: None
     * Return Type: void
     */

    public void clickOnDismiss(){
        try{
        helper.clickOnElement(SearchLocators.dismiss);
        logs.logInfo("Clicked On Dismiss");
        test.log(Status.INFO, "Clicked On Dismiss");
        test.log(Status.PASS, "Clicked On Dismiss");
    }catch(Exception e){
        System.out.println(e.getMessage());
        logs.logError("Clicked On Dismis");
        test.log(Status.FAIL, "Clicked On Dismiss");
        Reporter.attachScreenshotToReport("Clicked On Dismiss",test,"Dismiss");
    }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnYellowGold
     * Description: This method is for selecting the "Yellow Gold" option under the
     * metal type category in the bracelets module.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnYellowGold(){
        try{
            helper.hoverOverElement(BraceletsLocators.metalType);
            helper.clickOnElement(BraceletsLocators.metalType);
            helper.clickOnElement(BraceletsLocators.yellowGold);
            test.log(Status.INFO, "Clicked On Yellow Gold");
            logs.logInfo("Clicked On Yellow Gold");
        test.log(Status.PASS, "Clicked On Yellow Gold");

        }
        catch (Exception e) {
            System .out.println(e.getMessage());
            logs.logError("Clicked On Yellow Gold");
            test.log(Status.FAIL, "Clicked On Yellow Gold");
            Reporter.attachScreenshotToReport("Clicked On Yellow Gold",test,"Yellow Gold");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: verifyYellowGold
     * Description: This method validates that the page has successfully loaded with the specified "Yellow Gold" element, verifying the text "jewelry." It utilizes assertions for validation and includes detailed logging to track success and failure. Screenshots are attached to the report in case of errors to enhance traceability.
     * Parameters: None
     * Return Type: void
     */

    public void verifyYellowGold(String value){
        try {
            assertion.verifyTextInPage(BraceletsLocators.verYellowGold,value);
            test.log(Status.INFO, "Verified the page loaded with yellowGold");
            logs.logInfo("Verified the text Jewelry");
            test.log(Status.PASS, "Verified the text Jewelry");
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Verified the page loaded with yellowGold");
            test.log(Status.FAIL, "Verified the page loaded with yellowGold");
            Reporter.attachScreenshotToReport("Yellow_Gold",test,"Verified the page loaded with yellowGold");
            
        }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnDiamond
     * Description: This method is for selecting the "Diamond" option under the
     * gemstone category in the bracelets module.
     * Parameters: None
     * Return Type: void
     */

    public void clickOnDiamond(){
        try{
            helper.hoverOverElement(BraceletsLocators.gemstone);
            helper.clickOnElement(BraceletsLocators.gemstone);
            helper.hoverOverElement(BraceletsLocators.diamond);
            helper.clickOnElement(BraceletsLocators.diamond);
            test.log(Status.INFO, "Clicked On Diamond");
            logs.logInfo("Clicked On Diamond");
            logs.logInfo("Clicked On Diamond");
        test.log(Status.PASS, "Clicked On Diamond");

            
        }catch (Exception e) {
            test.log(Status.INFO, "Clicked On Diamond");
            logs.logError("Clicked On Diamond");
            Reporter.attachScreenshotToReport("Clicked On Diamond",test,"Diamond");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: verifyDiamond
     * Description: Verifies if the "Diamond" text is present on the page and
     * handles errors with logging and screenshots.
     * Parameters: None
     * Return Type: void
     */

    public void verifyDiamond(String value){
        try {
            assertion.verifyTextInPage(BraceletsLocators.verDiamond,value);
            test.log(Status.INFO, "Verified the page loaded with Diamond");
            logs.logInfo("Verified the text Diamond");
            test.log(Status.PASS, "Verified the text Diamond");
            
        }catch (Exception e) {
            logs.logError("Verified the page loaded with Diamond");
            test.log(Status.FAIL, "Verified the page loaded with Diamond");
            Reporter.attachScreenshotToReport("verifyDiamond",test,"Verified the page loaded with Diamond");
            
        }
    }
    

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnBraceletInStyle
     * Description: This method executes actions to click on elements related to
       "Bracelet Styles" under the Bracelets module. It includes robust logging for
       successful and failed executions while providing detailed error management
       and capturing screenshots for traceability.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnBraceletInStyle(){
        try {
            helper.clickOnElement(BraceletsLocators.braceletStyle);
            helper.clickOnElement(BraceletsLocators.brace);
            test.log(Status.INFO, "Clicked On Bracelets Under BraceletStyles");
            logs.logInfo("Clicked On Bracelets Under BraceletStyles");
            logs.logInfo("Clicked On Bracelets Under BraceletStyles");
        test.log(Status.PASS, "Clicked On Bracelets Under BraceletStyles");

            
        } catch (Exception e) {
            test.log(Status.INFO, "Clicked On Bracelets Under BraceletStyles");
            logs.logError("Clicked On Bracelets Under BraceletStyles");
            System .out.println(e.getMessage());
            logs.logError("Clicked On Bracelets Under BraceletStyles");
        test.log(Status.FAIL, "Clicked On Bracelets Under BraceletStyles");
        Reporter.attachScreenshotToReport("Clicked On Bracelets Under BraceletStyles",test,"BraceletsStyle");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: verifyBracelets
     * Description: Verifies if the text "Bracelets" is present on the page and logs
     * the results. Errors are managed with robust logging and screenshot capture.
     * Parameters: None
     * Return Type: void
     */


    public void verifyBracelets(String value){
        try {
            assertion.verifyTextInPage(BraceletsLocators.verBracelets,value);
            test.log(Status.INFO, "Verified the page loaded with Bracelets");
            logs.logInfo("Verified the text Bracelets");
            test.log(Status.PASS, "Verified the text Bracelets");
            
        }catch (Exception e) {
            logs.logError("Verified the page loaded with Bracelets");
            test.log(Status.FAIL, "Verified the page loaded with Bracelets");
            Reporter.attachScreenshotToReport("verifyBracelets",test,"Verified the page loaded with Bracelets");
            
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnfirstPro
     * Description: This method handles the process of clicking on the first product
     * element in the bracelets module.
     * Parameters: None
     * Return Type: void
     */

    public void clickOnfirstPro(){
        try{
            helper.clickOnElement(BraceletsLocators.firstPro);

            logs.logInfo("Clicked On First Product");
            test.log(Status.INFO, "Clicked On First Product");
        test.log(Status.PASS, "Clicked On First Product");

        }catch(Exception e){
            System.out.println(e.getMessage());
            logs.logError("Clicked On First Product");
        test.log(Status.FAIL, "Clicked On First Product");
        Reporter.attachScreenshotToReport("Clicked On First Product",test,"Product");
        }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnAddToShopping
     * Description: This method is for clicking the "Add to Shopping" button in the
     * bracelets module.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnAddToShopping(){
        try {
            helper.clickOnElement(BraceletsLocators.addToShopping);
            test.log(Status.INFO, "Clicked On AddToShopping");
            logs.logInfo("Clicked On AddToShopping");
        test.log(Status.PASS, "Clicked On AddToShopping");

        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On AddToShopping");
        test.log(Status.FAIL, "Clicked On AddToShopping");
        Reporter.attachScreenshotToReport("Clicked On AddToShopping",test,"AddToShopping");
        }

    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: getScreenshot
     * Description: This method captures a screenshot labeled "Bracelets" for
     * logging purposes.
     * Parameters: None.
     * Return Type: void
     */

    public void getScreenshot() {
        try{
        Screenshot.takeScreenshot("Bracelets");
        logs.logInfo("Captured Bracelets Screenshot");
        test.log(Status.INFO, "Clicked On Bracelets Screenshot");
        test.log(Status.PASS, "Clicked On Bracelets Screenshot");
    }catch(Exception e){
        System.out.println(e.getMessage());
        logs.logError("Captured Bracelets Screenshot");
        test.log(Status.FAIL, "Clicked On Bracelets Screenshot");
        Reporter.attachScreenshotToReport("Clicked On Bracelets Screenshot",test,"Bracelets Screenshot");
    }
    }


}