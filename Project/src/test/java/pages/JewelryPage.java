package pages;

import java.time.Duration;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.JewelryLocators;
import utils.*;

public class JewelryPage extends Base{
    public WebDriverHelper helper;
    public Assertion asserts;
    public ExtentTest test;
    LoggerHandler logs;
    /*
     * Constructor name: JewelryPage
     * Author: Pavan Kumar
     * Description: this contrustor creates a reference for WebDriverHelper variable, Assertion variable and initializes ExtentTest variable
     * Return type: none
     * Parameters: ExtentTest instance
     */

    public JewelryPage(ExtentTest test,LoggerHandler logs)
    {
        helper = new WebDriverHelper(Base.driver, logs);
        this.test=test;
        asserts = new Assertion(Base.driver,test, logs);
        this.logs = logs;
    }

    /*
     * Method name: jewelryHoverAndChanelClick
     * Author: Pavan Kumar
     * Description: This method hovers over the jewelry option and click on chanel under jewelry
     * Return type: void
     * Parameters: NA
     */

    public void jewelryHoverAndChanelClick()
    {
        try{
        helper.hoverOverElement(JewelryLocators.acceptCook);
        helper.clickOnElement(JewelryLocators.acceptCook);
        helper.hoverOverElement(JewelryLocators.jewelry);
        helper.hoverOverElement(JewelryLocators.chanel);
        helper.clickOnElement(JewelryLocators.chanel);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        test.log(Status.INFO,"Hovered over Jewelry and clicked on Chanel");
        test.log(Status.PASS,"Successfully clicked on chanel under Jewelry");
        logs.logInfo("Successfully clicked on chanel under Jewelry");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Failed to hover over jewelry and click on chanel");
            test.log(Status.FAIL,"Hovering over Jewelry and clicking on chanel is a failure");
            logs.logError("Hovering over Jewelry and clicking on chanel is a failure");
            Reporter.attachScreenshotToReport("Failed to hover over jewelry and click on chanel",test,"");
        }

    }

    /*
     * Method name: verifyChanel
     * Author: Pavan Kumar
     * Description: This method is used to veriy the title of Chanel page
     * Return type: void
     * Parameters: NA
     */
    public void verifyChanel(String str)
    {
        try{
        asserts.verifyTitleOfPage(str);
        }
        catch(Exception e)
        {
            Reporter.attachScreenshotToReport("Failed to verify Chanel page title",test,"");
        }
    }

    /*
     * Method name: clickOnRings
     * Author: Pavan Kumar
     * Description: This method is used to click on rings option under category
     * Return type: void
     * Parameters: NA
     */

    public void clickOnRings()
    {
        try{
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        helper.clickOnElement(JewelryLocators.closePop);
        helper.hoverOverElement(JewelryLocators.rings);
        helper.clickOnElement(JewelryLocators.rings);
        Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        test.log(Status.INFO,"Applied filter for rings");
        test.log(Status.PASS,"Filtering based on rings is successful");
        logs.logInfo("Filtering based on rings is successful");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Failed to filter based on rings");
           test.log(Status.FAIL,"Filtering based on rings is a failure");
            logs.logError("Filtering based on rings is a failure");
            Reporter.attachScreenshotToReport("Failed to click on rings",test,"");
        }
    }

    /*
     * Method name: clickOnBrandAndCoco
     * Author: Pavan Kumar
     * Description: This method is used to click on brand type column and to click on coco brush option under Brandtype
     * Return type: void
     * Parameters: NA
     */

    public void clickOnBrandAndCoco()
    {
        try{
        helper.hoverOverElement(JewelryLocators.brandType);
        helper.clickOnElement(JewelryLocators.brandType);
        helper.hoverOverElement(JewelryLocators.cocoRush);
        helper.clickOnElement(JewelryLocators.cocoRush);
        Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        test.log(Status.INFO,"Applied filter for Brand type as coco brush");
        test.log(Status.PASS,"Filtering for coco brush for brand type is a success");
        logs.logInfo("Filtering for coco brush for brand type is a success");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Failed to apply filter based on coco brush brand");
            test.log(Status.FAIL,"Filtering for coco brush for brand type is a failure");
            logs.logError("Filtering for coco brush for brand type is a failure");
            Reporter.attachScreenshotToReport("Failed to click on coco brush",test,"");
        }

    }

   /*
     * Method name: clickOnMetalType
     * Author: Pavan Kumar
     * Description: This method is used to click on metal type and white gold option under metal type 
     * Return type: void 
     * Parameters: NA
     */

    public void clickOnMetalType()
    {
        try{
        helper.hoverOverElement(JewelryLocators.dial);
        helper.clickOnElement(JewelryLocators.dial);
        helper.hoverOverElement(JewelryLocators.whiteGold);
        helper.clickOnElement(JewelryLocators.whiteGold);
        Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        test.log(Status.INFO,"Filter applied as white gold for metal type");
        test.log(Status.PASS,"Successfully applied filter as white gold for metal type");
        logs.logInfo("Successfully applied filter as white gold for metal type");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Failed to filter based on metal type");
            test.log(Status.FAIL,"Filtering for metal type is a failure");
            logs.logError("Filtering for metal type is a failure");
            Reporter.attachScreenshotToReport("Failed to click on white gold",test,"");
        }

    }

    /*
     * Method name: clickOnFirst
     * Author: Pavan Kumar
     * Description: This method is used to click on first product available after applying appropriate filters
     * Return type: void
     * Parameters: NA
     */

    public void clickOnFirst()
    {
        try{
        helper.hoverOverElement(JewelryLocators.firstPro);
        helper.clickOnElement(JewelryLocators.firstPro);
        test.log(Status.INFO,"Clicked on first product after applying appropriate filters");
        test.log(Status.PASS,"Successfully clicked on first product after applying appropriate filters");
        logs.logInfo("Successfully clicked on first product after applying appropriate filters");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Could not click on first product");
            test.log(Status.FAIL,"Failed to apply appropriate filters and to click on first product");
            logs.logError("Failed to apply appropriate filters and to click on first product");
            Reporter.attachScreenshotToReport("Failed to click on frist product",test,"");
        }

    }



    // public void verifyRing(String ringValue)
    // {
    //     try{
    //         asserts.verifyTextInPage(JewelryLocators.ringVer,ringValue);
    //     }
    //     catch(Exception e)
    //     {
    //         Reporter.attachScreenshotToReport("ring",test,"");
    //     }
    // }

    // public void verifyCoco(String cocoValue)
    // {
    //     try{
    //         asserts.verifyTextInPage(JewelryLocators.cocoVer,cocoValue);
    //     }
    //     catch(Exception e)
    //     {
    //         Reporter.attachScreenshotToReport("coco",test,"");
    //     }
    // }

    // public void verifyWhiteGold(String whiteValue)
    // {
    //     try{
    //         asserts.verifyTextInPage(JewelryLocators.whiteGoldVer,whiteValue);
    //     }
    //     catch(Exception e)
    //     {
    //         Reporter.attachScreenshotToReport("white gold",test,"");
    //     }
    // }

    public void mayorsHome(String title)
    {
        try{
            asserts.verifyTitleOfPage(title);
           }
        catch(Exception e)
        {
            Reporter.attachScreenshotToReport("mayors",test,"");
        }
    }

    public void verifySearch(String str)
    {
        switch(str)
        {
            case "Rings":
                try{
                       asserts.verifyTextInPage(JewelryLocators.ringVer, str);
                   }
                catch(Exception e)
                  {
                    Reporter.attachScreenshotToReport("rings failed",test,"");
                  }
                  break;
             case "Coco Crush":
               try{
                    asserts.verifyTextInPage(JewelryLocators.cocoVer,str);
                }
              catch(Exception e)
               {
                  Reporter.attachScreenshotToReport("coco crush fail",test,"");
               }
               break;
            case "White Gold":
               try{
                asserts.verifyTextInPage(JewelryLocators.whiteGoldVer,str);
               }
               catch(Exception e)
               {
                Reporter.attachScreenshotToReport("white gold fail",test,"");
               }
               break;
            default:
            return;
        }

    }

    
}