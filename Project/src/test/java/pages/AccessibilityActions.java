package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AccessibilityLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class AccessibilityActions {


    WebDriver driver;
    WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;
    LoggerHandler logs;
 
    /*
     * Method Name : AccessibilityActions
     * Author Name: Muskan Jha
     * Description : This method is a constructor of class AccessibilityActions
     * Parameters : driver,test,logs
     * Return Type : none
     */
    public AccessibilityActions(WebDriver driver, ExtentTest test, LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver, logs);
        this.test = test;
        this.logs = logs;
        asserts = new Assertion(driver, test, logs);
 
    }


    public void verifyHomepage() {
        try {
            helper.waitForElementToBeVisible(AccessibilityLocators.acceptCookies, 3);
            helper.clickOnElement(AccessibilityLocators.acceptCookies);
            logs.logInfo("clicked on cookies");
            test.log(Status.INFO, "cookies to be clicked");
            test.log(Status.PASS, "click on cookies performed successfully");
        } catch (Exception e) {
            Screenshot.takeScreenshot("AcceptCookies");
            Reporter.attachScreenshotToReport("AcceptCookies.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "cookies to be clicked");
            test.log(Status.FAIL, "click on cookies failed");
        }
    }

    public void clickOnYourSecurity() {
        try {
            helper.javascriptScroll(AccessibilityLocators.yourSecurity);
            helper.waitForElementToBeVisible(AccessibilityLocators.yourSecurity, 3);
            helper.clickOnElement(AccessibilityLocators.yourSecurity);
            // verifyHomepage();
            logs.logInfo("clicked on Your Security");
            test.log(Status.INFO, "Your Security link to be clicked");
            test.log(Status.PASS, "click on Your Security performed successfully");
            driver.navigate().to(Base.prop.getProperty("url"));
        } catch (Exception e) {
            Screenshot.takeScreenshot("YourSecurityShot");
            Reporter.attachScreenshotToReport("YourSecurityShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "Your Security link to be clicked");
            test.log(Status.FAIL, "click on Your Security failed");
        }

    }

    public void verifyTitle(String string) {
        try {
            asserts.verifyTitleOfPage(string);
            logs.logInfo("Title of the page verified");
        } catch (Exception e) {
            Screenshot.takeScreenshot("verifiedShot");
            Reporter.attachScreenshotToReport("verifiedShot.png", test, "");
        }
    }

    public void clickOnTermsCondition() {
        try {
            helper.javascriptScroll(AccessibilityLocators.termsConditions);
            helper.waitForElementToBeVisible(AccessibilityLocators.termsConditions, 3);
            helper.clickOnElement(AccessibilityLocators.termsConditions);
            // verifyHomepage();
            logs.logInfo("clicked on terms and conditions");
            test.log(Status.INFO, "click on terms and conditions to be performed");
            test.log(Status.PASS, "clicked on terms and conditions successfully");
            driver.navigate().to(Base.prop.getProperty("url"));
        } catch (Exception e) {
            Screenshot.takeScreenshot("TermsAndConditionShot");
            Reporter.attachScreenshotToReport("TermsAndConditionShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "click on terms and conditions to be performed");
            test.log(Status.FAIL, "Did not click terms and conditions");
        }

    }

    public void privacyPolicy() {
        try {
            helper.javascriptScroll(AccessibilityLocators.privacyPolicy);
            helper.waitForElementToBeVisible(AccessibilityLocators.privacyPolicy, 3);
            helper.clickOnElement(AccessibilityLocators.privacyPolicy);
            driver.navigate().to(Base.prop.getProperty("url"));
            logs.logInfo("clicked on Privacy Policy");
            test.log(Status.INFO, "click on Privacy Policy to be performed");
            test.log(Status.PASS, "clicked on Privacy Policy successfully");
        } catch (Exception e) {
            Screenshot.takeScreenshot("PrivacyShot");
            Reporter.attachScreenshotToReport("PrivacyShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "click on Privacy Policy to be performed");
            test.log(Status.FAIL, "Did not click Privacy Policy");
        }

    }

    public void clickOnCookiePolicy() {
        try {
            helper.javascriptScroll(AccessibilityLocators.cookiePolicy);
            helper.waitForElementToBeVisible(AccessibilityLocators.cookiePolicy, 3);
            helper.clickOnElement(AccessibilityLocators.cookiePolicy);
            driver.navigate().to(Base.prop.getProperty("url"));
            logs.logInfo("clicked on Cookie Policy");
            test.log(Status.INFO, "click on Cookie Policy to be performed");
            test.log(Status.PASS, "clicked on Cookie Policy successfully");
        } catch (Exception e) {
            Screenshot.takeScreenshot("CookieShot");
            Reporter.attachScreenshotToReport("CookieShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "click on Cookie Policy to be performed");
            test.log(Status.FAIL, "Did not click Cookie Policy");
        }
    }

    public void clickOnAccessibility() {
        try {
            helper.javascriptScroll(AccessibilityLocators.accessibility);
            helper.waitForElementToBeVisible(AccessibilityLocators.accessibility, 3);
            helper.clickOnElement(AccessibilityLocators.accessibility);
            driver.navigate().to(Base.prop.getProperty("url"));
            logs.logInfo("clicked on Accessibility link");
            test.log(Status.INFO, "click on Accessibility to be performed");
            test.log(Status.PASS, "clicked onn Pay By Liy successfully");
        } catch (Exception e) {
            Screenshot.takeScreenshot("AccessibilityShot");
            Reporter.attachScreenshotToReport("AccessibilityShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "click on Accessibility to be performed");
            test.log(Status.FAIL, "Did not click Accessibility");
        }

    }

    public void clickOnPayByLink() {
        try {
            helper.javascriptScroll(AccessibilityLocators.payByLinkTerms);
            helper.waitForElementToBeVisible(AccessibilityLocators.payByLinkTerms, 3);
            helper.clickOnElement(AccessibilityLocators.payByLinkTerms);
            driver.navigate().to(Base.prop.getProperty("url"));
            logs.logInfo("clicked on Pay By Link Terms link");
            test.log(Status.INFO, "click on Pay By Link Terms to be performed");
            test.log(Status.PASS, "clicked on Pay By Link Terms successfully");
        } catch (Exception e) {
            Screenshot.takeScreenshot("PayByLinkShot");
            Reporter.attachScreenshotToReport("PayByLinkShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "click on PayByLink Terms to be performed");
            test.log(Status.FAIL, "Did not click PayByLink Terms");
        }

    }

    public void clickOnWatches() {
        try {
            helper.javascriptScroll(AccessibilityLocators.watches);
            helper.waitForElementToBeVisible(AccessibilityLocators.watches, 3);
            helper.clickOnElement(AccessibilityLocators.watches);
            driver.navigate().to(Base.prop.getProperty("url"));
            logs.logInfo("clicked on Watches link");
            test.log(Status.INFO, "click on Watches to be performed");
            test.log(Status.PASS, "clicked on Watches successfully");
        } catch (Exception e) {
            Screenshot.takeScreenshot("WatchClickShot");
            Reporter.attachScreenshotToReport("WatchClickShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "click on Watches to be performed");
            test.log(Status.FAIL, "Did not click Watches");
        }

    }

    public void clickOnJewelry() {
        try {
            helper.javascriptScroll(AccessibilityLocators.jewellery);
            helper.waitForElementToBeVisible(AccessibilityLocators.jewellery, 3);
            helper.clickOnElement(AccessibilityLocators.jewellery);
            driver.navigate().to(Base.prop.getProperty("url"));
            logs.logInfo("clicked on Jewellery link");
            test.log(Status.INFO, "click on Jewellery to be performed");
            test.log(Status.PASS, "clicked on Jewellery successfully");
        } catch (Exception e) {
            Screenshot.takeScreenshot("jewelleryClickShot");
            Reporter.attachScreenshotToReport("jewelleryClickShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "click on Jewellery to be performed");
            test.log(Status.FAIL, "Did not click Jewellery");
        }

    }

    public void verifyKeyword() {
        try {
            asserts.verifyTextInPage(AccessibilityLocators.categoryKeyword, "Category");
        } catch (Exception e) {
            Screenshot.takeScreenshot("keywordShot");
            Reporter.attachScreenshotToReport("keywordShot.png", test, "");
        }

    }

    public void takeScreenshot() {
        try {
            Screenshot.takeScreenshot("AccessibilityShot");
            Reporter.attachScreenshotToReport("AccessibilityShot.png", test, "");
            logs.logInfo("Screenshot captured");
            test.log(Status.INFO, "Screenshot to be captured");
            test.log(Status.PASS, "Screenshot captured successfully");
        } catch (Exception e) {
            Screenshot.takeScreenshot("AccessibilityfailedShot");
            Reporter.attachScreenshotToReport("AccessibilityfailedShot.png", test, "");
            logs.logError(e.getMessage());
            test.log(Status.INFO, "Screenshot to be captured");
            test.log(Status.FAIL, "Did not capture Screenshot");
        }

    }

}
