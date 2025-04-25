package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.*;

public class Hooks extends Base{
    public static ExtentReports report;

    @BeforeAll
    public static void iniReport()
    {
        report = Reporter.createReport("Mayors_Report");
    }
 
    @Before
    public void launch(){
        openBrowser();
    }

    @After
    public void closeBrowser()
    {
        if(driver!=null)
        {
            driver.quit();
        }
    }

    @AfterAll
    public static void flush(){
        report.flush();
    }
 
}

