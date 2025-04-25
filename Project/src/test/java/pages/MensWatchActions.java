package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MensWatchLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MensWatchActions {

    WebDriver driver;
    WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;
    LoggerHandler logs;

    /*
     * Method Name: MensWatchActions
     * Author Name: Muskan Jha
     * Description : This method is a constructor of class MensWatchActions
     * which initialises the instance variables of the class
     * Parameters : driver, test, logs
     * Return Type : none
     */
    public MensWatchActions(WebDriver driver, ExtentTest test, LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver, logs);
        this.test = test;
        asserts = new Assertion(driver, test, logs);
        this.logs = logs;
    }

    /*
     * Method Name: verifyHomepage
     * Author Name: Muskan Jha
     * Description : This method accepts the cookies on the website
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyHomepage() {
        try {
            helper.clickOnElement(MensWatchLocators.acceptCookies);
            logs.logInfo("clicked cookies");
            test.log(Status.INFO, "Cookies to be clicked");
            test.log(Status.PASS, "clicked cookies");
        } catch (Exception e) {
            Screenshot.takeScreenshot("AcceptCookiesShot");
            Reporter.attachScreenshotToReport("AcceptCookiesShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "cookies to be clicked");
            test.log(Status.FAIL, "click on cookies failed");

        }
    }

    public void hoverOverBrands() {
        try {
            helper.waitForElementToBeVisible(MensWatchLocators.brands, 3);
            helper.hoverOverElement(MensWatchLocators.brands);
            logs.logInfo("hovered over brands");
            test.log(Status.INFO, "brands to be hovered on");
            test.log(Status.PASS, "hovered over brands");
        } catch (Exception e) {
            Screenshot.takeScreenshot("BrandsShot");
            Reporter.attachScreenshotToReport("BrandsShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "brands to be hovered on");
            test.log(Status.FAIL, "hovered over brands failed");
        }
    }

    /*
     * Method Name: clickOnOmega()
     * Author Name: Muskan Jha
     * Description : This method clicks on Omega
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnOmega() {
        try {
            helper.clickOnElement(MensWatchLocators.omega);
        } catch (Exception e) {

        }
    }

    /*
     * Method Name : verifyTitle
     * Author Name : Muskan Jha
     * Description : This method verifies the title of the Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyTitle(String string) {
        try {
            asserts.verifyTitleOfPage(string);
        } catch (Exception e) {

        }
    }

     /*
     * Method Name : clickOnMensWatches
     * Author Name : Muskan Jha
     * Description : This method clicks on Mens Watches on the result page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnMensWatches() {
        try {
            helper.clickOnElement(MensWatchLocators.mensWatches);
            logs.logInfo("clicked on mens watches");
            test.log(Status.INFO, "click on mens watches to be performed");
            test.log(Status.PASS, "clicked on mens watches successfully");
        } catch (Exception e) {
            Screenshot.takeScreenshot("MensWatchesShot");
            Reporter.attachScreenshotToReport("MensWatchesShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "click on mens watches");
            test.log(Status.FAIL, "failed to click on mens watches");
        }
    }

     /*
     * Method Name : clickOnSeaMaster
     * Author Name : Muskan Jha
     * Description : This method clicks Sea Master in the Brands Collection Filter
     * Category
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnSeaMaster() {
        try {
            helper.clickOnElement(MensWatchLocators.seaMasterFilter);
            logs.logInfo("clicked on sea master");
            test.log(Status.INFO, "click on sea master to performed");
            test.log(Status.PASS, "clicked on sea master");
        } catch (Exception e) {
            Screenshot.takeScreenshot("SeaMasterShot");
            Reporter.attachScreenshotToReport("SeaMasterShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "click on sea master to be performed");
            test.log(Status.FAIL, "failed to click on sea master");
        }
    }

    /*
     * Method Name : clickOnBlue
     * Author Name: Muskan Jha
     * Description : This method clicks Blue in the Dial Color Filter Category
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnBlue() {
        try {
            helper.clickOnElement(MensWatchLocators.blueFilter);
            logs.logInfo("clicked on blue filter");
            test.log(Status.INFO, "blue under dial filter to be clicked");
            test.log(Status.PASS, "clicked on blue filter");
        } catch (Exception e) {
            Screenshot.takeScreenshot("BlueShot");
            Reporter.attachScreenshotToReport("BlueShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "blue under dial filter to be clicked");
            test.log(Status.FAIL, "click on blue filter failed");
        }
    }

    /*
     * Method Name : clickOnFirstProduct
     * Author Name: Muskan Jha
     * Description : This method clicks on the label
     * of the first product on the result page after applying filters
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnFirstProduct() {
        try {
            helper.clickOnElement(MensWatchLocators.firstProduct);
            logs.logInfo("clicked on first product");
            test.log(Status.INFO, "first product on the result page to be clicked");
            test.log(Status.PASS, "clicked on first product");
        } catch (Exception e) {
            Screenshot.takeScreenshot("FirstProductShot");
            Reporter.attachScreenshotToReport("FirstProductShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "first product on the result page to be clicked");
            test.log(Status.FAIL, "clicked on first product");
        }

    }

    /*
     * Method Name : clickOnAddToShoppingBag
     * Author Name: Muskan Jha
     * Description : This method clicks on the Add To Shopping Bag on the product
     * result page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnAddToShopping() {
        try {
            helper.clickOnElement(MensWatchLocators.addToCart);
            logs.logInfo("click on Add To Shopping Bag");
            test.log(Status.INFO, "Add To Shopping Bag button to be clicked");
            test.log(Status.PASS, "click on Add To Shopping Bag");
        } catch (Exception e) {
            Screenshot.takeScreenshot("AddToShoppingBagShot");
            Reporter.attachScreenshotToReport("AddToShoppingBagShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "Add To Shopping Bag button to be clicked");
            test.log(Status.FAIL, "click on Add To Shopping Bag failed");

        }

    }


    /*
     * Method Name : verifyKeyword
     * Author Name: Muskan Jha
     * Description : This method verifies the Keyword "stores" on Add To Shopping
     * Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyKeyword(String string) {
        try {
            asserts.verifyTextInPage(MensWatchLocators.textVerify, string);
            logs.logInfo("stores keyword verified");
            test.log(Status.INFO, "stores keyword verification to be performed");
            test.log(Status.PASS, "stores keyword verified");
        } catch (Exception e) {
            logs.logError(e.getMessage());
            test.log(Status.INFO, "stores keyword verification to be performed");
            test.log(Status.FAIL, "stores keyword verification failed");
        }
    }

    /*
     * Method Name : takeScreenshot
     * Author Name: Muskan Jha
     * Description : This method captures the screenshot and attach it to the report
     * Parameters : N/A
     * Return Type : void
     */
    public void takeTheScreenshot() {
        try {
            Screenshot.takeScreenshot("AddToCart_Screenshot");
            Reporter.attachScreenshotToReport("AddToCart.png", test, "");
            logs.logInfo("screenshot captured");
            test.log(Status.INFO, "Screenshot to be captured");
            test.log(Status.PASS, "screenshot captured successfully");
        } catch (Exception e) {
            logs.logError(e.getMessage());
            test.log(Status.INFO, "Screenshot to be captured");
            test.log(Status.FAIL, "screenshot capture failed");
        }
    }

}
