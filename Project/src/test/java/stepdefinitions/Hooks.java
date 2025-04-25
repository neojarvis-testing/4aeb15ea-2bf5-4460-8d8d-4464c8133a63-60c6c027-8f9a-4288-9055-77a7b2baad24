package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base{
    static ExtentReports report;
    @BeforeAll
    public static void generate(){
        report =Reporter.createReport("Mayors_Report");

    }

    @Before
    public void launch(){
        openBrowser();
    }

    @After
    public void close(){
        driver.quit();
    }

    @AfterAll
    public static void flush(){
        report.flush();
    }

}
