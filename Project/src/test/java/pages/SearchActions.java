package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SearchLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SearchActions {

    WebDriver driver;
    WebDriverHelper helper;
    Assertion assertion;
    ExtentTest test;
    LoggerHandler logs;

    /*Author: Kotha Sai Ragunath
     * Method Name: SearchActions
     * Description: This is a constructor that initializes the driver, helper, test and assertion objects.
     * Parameters: WebDriver driver, ExtentTest test
     * Return Type:NA
    */
    public SearchActions(WebDriver driver, ExtentTest test,LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        this.logs=logs;
        assertion = new Assertion(driver,logs,test);
        
    }
     /*Author: Kotha Sai Ragunath
     * Method Name: clickOnAccept
     * Description: This method is used to click On Accept and Cookies.
     * Parameters: WebDriver driver, ExtentTest test
     * Return Type:NA
    */

    public void clickOnAccept() {
        try {
            helper.clickOnElement(SearchLocators.acceptAndCookies);
            test.log(Status.INFO, "Clicked On Accept and Cookies");
            logs.logInfo("Clicked On Accept and Cookies");
            test.log(Status.PASS, "Clicked On Accept and Cookies");

        } catch (Exception e) {
            logs.logError("Clicked On Accept and Cookies");
            test.log(Status.INFO, "Clicked On Accept and Cookies");
            test.log(Status.FAIL, "Clicked On Accept and Cookies");
            Reporter.attachScreenshotToReport("Clicked cookies",test,"Accept and Cookies");
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
            test.log(Status.INFO, "Verified the page loaded with Bracelets");
            logs.logError("Verified the page loaded with Bracelets");
            test.log(Status.FAIL, "Verified the page loaded with Bracelets");
            Reporter.attachScreenshotToReport("verifyBracelets",test,"Verified the page loaded with Bracelets");
            
        }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: searchOperation
     * Description: This method is for performing a search operation using the
       search bar.
     * Parameters: None
     * Return Type: void
     */



    public void searchOperation(String value) {
        try {
            helper.clickOnElement(SearchLocators.searchBar);
            helper.typeInElement(SearchLocators.searchBar, value);
            helper.enterAction(SearchLocators.searchBar);
            test.log(Status.INFO, "Searched For Earings");
            logs.logInfo("Searched For Earings");
            test.log(Status.PASS, "Searched For Earings");
            Screenshot.takeScreenshot("SearchForEarrings");
        }catch (Exception e) {
            logs.logError("Searched For Earings");
            test.log(Status.INFO, "Searched For Earings");
            test.log(Status.FAIL, "Searched For Earings");
            Reporter.attachScreenshotToReport("EARRINGS",test,"Searched For Earings");
        }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: verifyEarrings
     * Description: This method is for verifying the text "Earrings" on the page.
     * Parameters: None
     * Return Type: void
     */

    public void verifyEarrings(String value) {
        try {
            assertion.verifyTextInPage(SearchLocators.earRings, value);
            test.log(Status.INFO, "Verified the text Earings");
            logs.logInfo("Verified the text Earings");
            test.log(Status.PASS, "Verified the text Earings");
        } catch (Exception e) {
            logs.logError("Verified the text Earings");
            test.log(Status.INFO, "Verified the text Earings");
            test.log(Status.FAIL, "Verified the text Earings");
            Reporter.attachScreenshotToReport("VERIFYEARRINGS",test,"Verified the text Earings");

        }

    }
        /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnDismiss
     * Description: This method is for clicking the "Dismiss" button.
     * Parameters: None
     * Return Type: void
     */

    public void clickOnDismiss() {
        try {
            helper.clickOnElement(SearchLocators.dismiss);
            logs.logInfo("Clicked On Dismiss");
            test.log(Status.INFO, "Clicked On Dismiss");
            test.log(Status.PASS, "Clicked On Dismiss");
        } catch (Exception e) {
            test.log(Status.INFO, "Clicked On Dismiss");
            logs.logError("Clicked On Dismiss");
            test.log(Status.FAIL, "Clicked On Dismiss");
            Reporter.attachScreenshotToReport("Dismiss",test,"Clicked On Dismiss");
            

        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnBrand
     * Description: This method is for clicking the "Brand" button.
     * Parameters: None
     * Return Type: void
     */

    public void clickOnBrand() {
        try {
            helper.clickOnElement(SearchLocators.brand);
            test.log(Status.INFO, "Clicked On Brand");
            logs.logInfo("Clicked On Brand");
            test.log(Status.PASS, "Clicked On Brand");

        }catch (Exception e) {
            test.log(Status.INFO, "Clicked On Brand");
            logs.logError("Clicked On Brand");
            test.log(Status.FAIL, "Clicked On Brand");
            Reporter.attachScreenshotToReport("Brand",test,"Clicked On Brand");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnGucci
     * Description: This method is for clicking the "Gucci" element and setting a
     * page load timeout.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnGucci() {
        try {
            helper.clickOnElement(SearchLocators.gucci);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            test.log(Status.INFO, "Clicked On Gucci");
            logs.logInfo("Clicked On Gucci");
            test.log(Status.PASS, "Clicked On Gucci");

        } catch (Exception e) {
            test.log(Status.INFO, "Clicked On Gucci");
            logs.logError("Clicked On Gucci");
            test.log(Status.FAIL, "Clicked On Gucci");
            Reporter.attachScreenshotToReport("Gucci",test,"Failed to click On Gucci");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: verifyGucci
     * Description: Verifies if the text "Gucci" is present on the page and logs the
     * results. Errors are managed with logging and screenshots for enhanced
     * traceability.
     * Parameters: None
     * Return Type: void
     */



    public void verifyGucci(String gucci) {
        try {
            assertion.verifyTextInPage(SearchLocators.verGucci, gucci);
            test.log(Status.INFO, "Verified the Gucci");
            logs.logInfo("Verified the text Gucci");
            test.log(Status.PASS, "Verified the text Gucci");
            Screenshot.takeScreenshot("gucci");
        } catch (Exception e) {
            test.log(Status.INFO, "Verified the Gucci");
            logs.logError("Verified the text Gucci");
            test.log(Status.FAIL, "Verified the text Gucci");
            Reporter.attachScreenshotToReport("VERIFYGUCCI",test,"Verified the text Gucci");

        }

    }


    

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnMetalType
     * Description: This method is for selecting the "Rose Gold" option under the
     * metal type category.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnMetalType() {
        try {
            helper.javascriptScroll(SearchLocators.metalType);
            helper.hoverOverElement(SearchLocators.metalType);
            helper.clickOnElement(SearchLocators.metalType); 
            helper.clickOnElement(SearchLocators.roseGold);
            test.log(Status.INFO, "Clicked On RoseGold");
            logs.logInfo("Clicked On RoseGold");
            test.log(Status.PASS, "Clicked On RoseGold");

        }catch (Exception e) {
            logs.logError("Clicked On RoseGold");
            test.log(Status.INFO, "Clicked On RoseGold");
            test.log(Status.FAIL, "Clicked On RoseGold");
            Reporter.attachScreenshotToReport("RoseGold",test,"Failed to click On RoseGold");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnEarRingsStyle
     * Description: This method is for selecting the "Drop Earring" style from the
     * earrings category.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnEarRingsStyle() {
        try {
            helper.hoverOverElement(SearchLocators.earRingStyle);
            helper.clickOnElement(SearchLocators.earRingStyle);
            helper.clickOnElement(SearchLocators.dropEarring);
            helper.clickOnElement(SearchLocators.dropEarring);
            test.log(Status.INFO, "Clicked On DropEarring");
            logs.logInfo("Clicked On DropEarring");
            test.log(Status.PASS, "Clicked On DropEarring");

        }catch (Exception e) {
            test.log(Status.INFO, "Clicked On DropEarring");
            logs.logError("Clicked On DropEarring");
            test.log(Status.FAIL, "Clicked On DropEarring");
            Reporter.attachScreenshotToReport("Earring",test,"Failed to click On DropEarring");
        }

    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: verifyDropEarrings
     * Description: Verifies if the text "DropEarrings" is present on the page and
     * logs the results. Errors are managed with logging and screenshots for
     * traceability.
     * Parameters: None
     * Return Type: void
     */



    public void verifyDropEarrings() {
        try {
            assertion.verifyTextInPage(SearchLocators.verDropEarrings, "DropEarrings");
            test.log(Status.INFO, "Verified the Gucci");
            logs.logInfo("Verified the text Gucci");
            test.log(Status.PASS, "Verified the text Gucci");
        } catch (Exception e) {
            logs.logError("Verified the text Gucci");
            test.log(Status.INFO, "Verified the Gucci");
            test.log(Status.FAIL, "Verified the text Gucci");
            Reporter.attachScreenshotToReport("VERIFYGUCCI",test,"Verified the text Gucci");

        }

    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnfirstProduct
     * Description: This method is for clicking on the first product displayed on
     * the page.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnfirstProduct() {
        try {
            helper.clickOnElement(SearchLocators.firstProduct);
           test.log(Status.INFO, "Clicked On FirstProduct");
            logs.logInfo("Clicked On FirstProduct");
            test.log(Status.PASS, "Clicked On FirstProduct");

        }catch (Exception e) {
            logs.logError("Clicked On FirstProduct");
            test.log(Status.INFO, "Clicked On FirstProduct");
            test.log(Status.FAIL, "Clicked On FirstProduct");
            Reporter.attachScreenshotToReport("First_Product",test,"Failed to click On the Product");

        }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnGet
     * Description: This method is for clicking the "getLiveExpert" button.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnGet() {
        try {
            helper.clickOnElement(SearchLocators.getLiveExpert);
            test.log(Status.INFO, "Clicked On getLiveExpert");
            logs.logInfo("Clicked On getLiveExpert");
            test.log(Status.PASS, "Clicked On getLiveExpert");
            Screenshot.takeScreenshot("GetLiveExpert");
        } catch (Exception e) {
            test.log(Status.INFO, "Clicked On getLiveExpert");
            logs.logError("Clicked On getLiveExpert");
            test.log(Status.FAIL, "Clicked On getLiveExpert");
            Reporter.attachScreenshotToReport("getLiveExpert",test,"Failed to click On getLiveExpert");
        }

    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: getScreenshot
     * Description: This method is for capturing a screenshot labeled "Earrings."
     * Parameters: None
     * Return Type: void
     */


    public void getScreenshot() {
        try {
            Screenshot.takeScreenshot("Earrings");
            test.log(Status.INFO, "Captured Screenshot for Earrings");
            logs.logInfo("Captured Screenshot for Earrings");
            test.log(Status.PASS, "Captured Screenshot for Earrings");
        }catch (Exception e) {
            test.log(Status.INFO, "Captured Screenshot for Earrings");
            logs.logError("Captured Screenshot for Earrings");
            test.log(Status.FAIL, "Captured Screenshot for Earrings");
            Reporter.attachScreenshotToReport("EarringsScreenshot",test,"Failed to capture Earrings Screenshot");
        }
    }

  
}