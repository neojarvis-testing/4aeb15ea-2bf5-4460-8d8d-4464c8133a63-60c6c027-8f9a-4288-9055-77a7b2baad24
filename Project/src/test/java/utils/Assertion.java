package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Assertion {
	private WebDriver driver;
	ExtentTest test;
	LoggerHandler logs;
	public Assertion(WebDriver driver, ExtentTest test, LoggerHandler logs) {
		this.driver = driver;
		this.test = test;
		this.logs = logs;
		this.test = test;
	}
    /*
     * Method Name : verifyTextInPage
     * Author Name : Praneeth
     * Description : This method used to verify the text of a element
     * Parameters : locator , value
     * Return Type : void
     */
	public void verifyTextInPage(By locator, String value) {
		try {
			WebElement element = driver.findElement(locator);
			logs.logInfo(element.getText());
			Assert.assertTrue(element.getText().contains(value));
			logs.logInfo("Text verified");
			test.log(Status.PASS,"Text verified");
		} catch (AssertionError e) {
			logs.logError("Text Invalid");
			test.log(Status.FAIL, "Text Invalid");
			Screenshot.takeScreenshot("Text");
            Reporter.attachScreenshotToReport("Text", test, "Invalid Text");
		}
	}
    /*
     * Method Name : verifyURLOfPage
     * Author Name : Praneeth
     * Description : This method is used to verify the url of the website
     * Parameters : value
     * Return Type : void
     */
	public void verifyURLOfPage(String value) {
		try {
			String text = driver.getCurrentUrl();
			logs.logInfo(text);
			Assert.assertTrue(text.contains(value));
			logs.logInfo(text + " verified");
			test.log(Status.PASS, text + " verified");
		} catch (AssertionError e) {
			logs.logError(value + " incorrect");
			test.log(Status.FAIL, value + "incorrect");
			Screenshot.takeScreenshot("URL");
            Reporter.attachScreenshotToReport("URL", test, "URL incorrect");
		}

	}
    /*
     * Method Name : verifyTitleOfPage
     * Author Name : Praneeth
     * Description : This method is used to get the title of the page
     * Parameters : value
     * Return Type : void
     */
	public void verifyTitleOfPage(String value) {
		try {
			String text = driver.getTitle();
			logs.logInfo(text);
			Assert.assertTrue(text.contains(value));
			logs.logInfo("Title verified");
			test.log(Status.PASS,"Title verified");
		} catch (AssertionError e) {
			logs.logError("Title of page is invalid");
			test.log(Status.FAIL, "Title of page is invalid");
			Screenshot.takeScreenshot("Title");
            Reporter.attachScreenshotToReport("Title", test, "Title Invalid");
		}

	}

}