package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WatchesPage;
import utils.LoggerHandler;

public class WatchesStepDefinition {
    LoggerHandler logs;
    ExtentTest test;
    WatchesPage selectingWatch;

    @Given("I click on accept cookies")
    public void i_click_on_accept_cookies() {
        logs = new LoggerHandler();
        test = Hooks.reports.createTest("testcase1");
        selectingWatch = new WatchesPage(test, logs);
        selectingWatch.acceptOnCookies();
    }

    @When("I Hover on watches")
    public void i_hover_on_watches() {
        selectingWatch.hoverOnWatches();
    }

    @When("I click on Best sellers")
    public void i_click_on_best_sellers() {
        selectingWatch.clickOnBestSellers();
    }

    @When("I click verify page title {string}")
    public void i_click_verify_page_title(String string) {
        selectingWatch.verifyTitle(string);
    }

    @When("I click on close pop-up")
    public void i_click_on_close_pop_up() {
        selectingWatch.clickOnClosePopUp();
    }

    @When("I click on For Him.")
    public void i_click_on_for_him() {
        selectingWatch.clickOnForHim();
    }

    @When("I verify page loaded with relevent content {string}")
    public void i_verify_page_loaded_with_relevent_content(String string) {
        selectingWatch.verifyPageContent(string);
    }

    @When("I click on cartier")
    public void i_click_on_cartier() {
        selectingWatch.clickOnCartier();
    }

    @When("I verify loaded page content {string}")
    public void i_verify_loaded_page_content(String string) {
        selectingWatch.verifyCartierPageContent(string);
    }

    @When("I click on Dial color")
    public void i_click_on_dial_color() {
        selectingWatch.clickOnDialColor();
    }

    @When("I click on Black")
    public void i_click_on_black() {
        selectingWatch.clickOnBlack();
    }

    @When("I verify page content {string}")
    public void i_verify_page_content(String string) {
        selectingWatch.verifyPageLoadContent(string);
    }

    @When("I click on First product")
    public void i_click_on_first_product() {
        selectingWatch.clickOnFirstProduct();
    }

    @Then("I click on Add to Bag")
    public void i_click_on_add_to_bag() {
        selectingWatch.clickOnAdd();
    }

}
