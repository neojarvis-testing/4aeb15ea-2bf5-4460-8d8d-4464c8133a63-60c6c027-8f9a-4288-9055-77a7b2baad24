package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MensWatchActions;
import utils.LoggerHandler;

public class MensWatchStepDefinition {

    WebDriver driver=Hooks.driver;

    ExtentTest test;

    LoggerHandler logs = new LoggerHandler();

    MensWatchActions mensWatch = new MensWatchActions(driver,Hooks.test,logs);


    @Given("user is on homepage of Mayors")
    public void user_is_on_homepage_of_mayors() {

        mensWatch.verifyHomepage();
    }

    @When("user hovers over brands")
    public void user_hovers_over_brands() {

        mensWatch.hoverOverBrands();
    }

    @When("user clicks on omega")
    public void user_clicks_on_omega() {

        mensWatch.clickOnOmega();
    }

    @When("user verifies the title of the page {string}")
    public void user_verifies_the_title_of_the_page(String string) {

        mensWatch.verifyTitle(string);
    }

    @When("user clicks on Mens Watches")
    public void user_clicks_on_mens_watches() {

        mensWatch.clickOnMensWatches();
    }

    @When("user clicks on seamaster")
    public void user_clicks_on_seamaster() {

        mensWatch.clickOnSeaMaster();
    }

    @When("user clicks on blue")
    public void user_clicks_on_blue() {

        mensWatch.clickOnBlue();
    }

    @When("user clicks on first product")
    public void user_clicks_on_first_product() {

        mensWatch.clickOnFirstProduct();
    }

    @When("user click on add to shopping")
    public void user_click_on_add_to_shopping() {

        mensWatch.clickOnAddToShopping();
    }

    @When("user verifies the {string}")
    public void user_verifies_the(String string) {

        mensWatch.verifyKeyword(string);
        
    }

    @Then("user captures the screenshot")
    public void user_captures_the_screenshot() {

        mensWatch.takeTheScreenshot();
    }
}

