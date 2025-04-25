package pages;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ContactPageLocators;
import uistore.RingsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ContactPageActions extends Base {

    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    LoggerHandler logs;
    /*
     * Constructor Name : RingsPageActions
     * Author Name : Krishna Reddy
     * Description : This constructor creates the instances of the WebDriverHelper and Assertion.
     * Parameters : N/A
     * Return Type : void
     */
    public ContactPageActions(ExtentTest test,LoggerHandler logs) {
        helper = new WebDriverHelper(driver, logs);
        this.test=test;
        asserts = new Assertion(driver,test,logs);
        this.logs=logs;
    }
   /*
     * Method Name : clickOnAccept
     * Author Name : Krishna Reddy
     * Description : This method clicks on Accept cookies on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnAccept(){
        try{
        helper.clickOnElement(RingsPageLocators.accept);
        logs.logInfo("Clicked on accept cookies");
        test.log(Status.PASS,"Clicked on accept cookies");
        }
        catch(Exception e){
            logs.logError("Clicked Accept");
            test.log(Status.FAIL, "Clicked Accept");

        }
    }
     /*
     * Method Name : clickOnContact
     * Author Name : Krishna Reddy
     * Description : This method clicks on Contact us on the home page
     * Parameters : N/A
     * Return Type : void
     */
    
    public void clickOnContact(){
        try{
        helper.clickOnElement(ContactPageLocators.contact);
   
        logs.logInfo("Clicked on Contact");
        test.log(Status.PASS,"Clicked on Contact");
        
        }
        catch(Exception e){
            logs.logError("Clicked Contact");
            test.log(Status.FAIL, "Clicked Contact");
            Screenshot.takeScreenshot("src3");
            Reporter.attachScreenshotToReport("Brands", test, "src3");

        }
    }
    public void verifyContactUs(String str1,String str2){
        try{
            asserts.verifyTitleOfPage(str1);
            asserts.verifyURLOfPage(str2);

        }
        catch(Exception e){

        }
    }
    
     /*
     * Method Name : clickOnContact
     * Author Name : Krishna Reddy
     * Description : This method clicks on Luxury on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnLuxury(){
        try{
            driver.navigate().back();
       helper.waitForElementToBeVisible(ContactPageLocators.luxury, 5);
        helper.clickOnElement(ContactPageLocators.luxury);
        logs.logInfo("Clicked on Luxury");
        test.log(Status.PASS,"Clicked on Luxury");
 
    }catch(Exception e){
        logs.logError("Clicked Store");
        test.log(Status.FAIL, "Clicked Store");
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("src5", test, "src5");

    }
}
public void verifyLuxuryServices(String str3,String str4){
    try{
        asserts.verifyTitleOfPage(str3);
        asserts.verifyURLOfPage(str4);

    }
    catch(Exception e){

    }
}
    
    /*
     * Method Name : clickOnStore
     * Author Name : Krishna Reddy
     * Description : This method clicks on Store on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnStore(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.store, 5);
         helper.clickOnElement(ContactPageLocators.store);
         logs.logInfo("Clicked on Store");
        test.log(Status.PASS,"Clicked on Store");
        Screenshot.takeScreenshot("src6");
        Reporter.attachScreenshotToReport("src6", test, "src5");

       }
       catch(Exception e){
        logs.logError("Clicked Store");
        test.log(Status.FAIL, "Clicked Store");
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("Brands", test, "src5");

    }
}
public void verifyStore(String str5,String str6){
    try{
        asserts.verifyTitleOfPage(str5);
        asserts.verifyURLOfPage(str6);
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("src5", test, "src5");

    }
    catch(Exception e){
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("src5", test, "src5");

    }
}
    
     /*
     * Method Name : clickOnDelivery
     * Author Name : Krishna Reddy
     * Description : This method clicks on Delivery on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnDelivery(){
        try{
            driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.delivery, 5);
         helper.clickOnElement(ContactPageLocators.delivery);
         logs.logInfo("Clicked on Delivery");
        test.log(Status.PASS,"Clicked on Delivery");
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("src5", test, "src5");
 
        }
        catch(Exception e){
            logs.logError("Clicked Delivery");
            test.log(Status.FAIL, "Clicked Delivery");
            Screenshot.takeScreenshot("src2");
            Reporter.attachScreenshotToReport("Brands", test, "src2");

           

        }
        
     }
     public void verifyDelivery(String str7,String str8){
        try{
            asserts.verifyTitleOfPage(str7);
            asserts.verifyURLOfPage(str8);
  
    
        }
        catch(Exception e){
    
        }
    }
      /*
     * Method Name : clickOnclick
     * Author Name : Krishna Reddy
     * Description : This method clicks on click and collect on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnclick(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.click, 5);
         helper.clickOnElement(ContactPageLocators.click);
         logs.logInfo("Clicked on Click and collect");
        test.log(Status.PASS,"Clicked on Click and collect");
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("src5", test, "src5");

       }
       catch(Exception e){
        logs.logError("Clicked Click and collect");
        test.log(Status.FAIL, "Clicked Click and collect");
        Screenshot.takeScreenshot("src99");
        Reporter.attachScreenshotToReport("Brands", test, "src99");

    }
}
public void verifyClick(String str9,String str10){
    try{
        asserts.verifyTitleOfPage(str9);
        asserts.verifyURLOfPage(str10);

    }
    catch(Exception e){

    }
}
      /*
     * Method Name : clickOnReturn
     * Author Name : Krishna Reddy
     * Description : This method clicks on Return Policy on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnReturn(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.retpolicy, 5);
         helper.clickOnElement(ContactPageLocators.retpolicy);
         logs.logInfo("Clicked on Return");
        test.log(Status.PASS,"Clicked on Return");
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("src5", test, "src5");
     
       }
       catch(Exception e){
        logs.logError("Clicked Return");
        test.log(Status.FAIL, "Clicked Return");
        Screenshot.takeScreenshot("src11");
        Reporter.attachScreenshotToReport("Brands", test, "src11");

    }
}
public void verifyReturn(String str11,String str12){
    try{
        asserts.verifyTitleOfPage(str11);
        asserts.verifyURLOfPage(str12);

    }
    catch(Exception e){

    }
}

     /*
     * Method Name : clickOnAffrim
     * Author Name : Krishna Reddy
     * Description : This method clicks on Affrim on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnAffrim(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.affrim, 5);
         helper.clickOnElement(ContactPageLocators.affrim);
         logs.logInfo("Clicked on Affrim");
        test.log(Status.PASS,"Clicked on Affrim");
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("src5", test, "src5");
        
       }
       catch(Exception e){
        logs.logError("Clicked Affrim");
        test.log(Status.FAIL, "Clicked Affrim");
        Screenshot.takeScreenshot("src12");
        Reporter.attachScreenshotToReport("Brands", test, "src12");

    }
}
public void verifyAffrim(String str13,String str14){
    try{
        asserts.verifyTitleOfPage(str13);
        asserts.verifyURLOfPage(str14);

    }
    catch(Exception e){

    }
}
      /*
     * Method Name : clickOnFeedback
     * Author Name : Krishna Reddy
     * Description : This method clicks on Feedback on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnFeedback(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.feedback, 5);
         helper.clickOnElement(ContactPageLocators.feedback);
         logs.logInfo("Clicked on Feedback");
        test.log(Status.PASS,"Clicked on Feedback");
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("src5", test, "src5");
        
       }
       catch(Exception e){
        logs.logError("Clicked Feedback");
        test.log(Status.FAIL, "Clicked Feedback");
        Screenshot.takeScreenshot("src13");
        Reporter.attachScreenshotToReport("Brands", test, "src13");

    }
      
     }
     
     public void verifyFeedback(String str15,String str16){
        try{
            asserts.verifyTitleOfPage(str15);
            asserts.verifyURLOfPage(str16);
    
        }
        catch(Exception e){
            test.log(Status.FAIL, "Verified failed");
            Screenshot.takeScreenshot("src13");
            Reporter.attachScreenshotToReport("Brands", test, "src13");
    
        }
    }

     /*
    * Method Name : runContact
    * Author Name : Krishna Reddy
    * Description : This method is a cluster of all the methods which needs to be executed
    * Parameters : N/A
    * Return Type : void
    */
    // public void runContact(){
    //     clickOnAccept();
    //      clickOnContact();
    //     verifyContactUs();
    //     clickOnLuxury();
    //     verifyLuxuryServices();
    //     clickOnStore();
    //     verifyStore();
    //     clickOnDelivery();
    //     verifyDelivery();
    //     clickOnclick();
    //     verifyClick();
    //     clickOnReturn();
    //     verifyReturn();
    //     clickOnAffrim();
    //     verifyAffrim();
    //     clickOnFeedback();
    //     verifyFeedback();
        
       
        
    // }
    
}