package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base {

    public static ExtentReports reports;
    public static ExtentTest test;


    @BeforeAll
    public static void configReports(){
        reports = Reporter.createReport("Mayors_Reports");
    }

    
    @Before
    public void configBrowser(Scenario sc){
        openBrowser();
        test = reports.createTest(sc.getName());


    }

    @After
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }
    }


    @AfterAll
    public static void flushReport(){
        reports.flush();
    }
   

}

