package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPageActions;
import pages.RingsPageActions;
import utils.Base;
import utils.LoggerHandler;

public class RingsStepDefinition {
    LoggerHandler logs = new LoggerHandler();
    ExtentTest test = Hooks.reports.createTest("TestOnBracelets");
    RingsPageActions contactActions = new RingsPageActions(test, logs);

    @Given("I am on the Mayors website.")
    public void i_am_on_the_mayors_website() {
        contactActions.clickOnAccept();
    }

    @When("I click on search.")
    public void i_click_on_search() {
        contactActions.clickOnSearch();
    }

    @When("I enter {string} in the search box.")
    public void i_enter_in_the_search_box(String string) {
        contactActions.inputOnSearchBar(string);
    }

    @When("I verify the title contains {string}")
    public void i_verify_the_title_contains(String string) {
        contactActions.verifyRings(string);
    }

    @When("I press enter to search.")
    public void i_press_enter_to_search() {
        contactActions.enterOnSearchbar();
    }

    @When("I click on Rings.")
    public void i_click_on_rings() {
        contactActions.clickOnClose();
        contactActions.clickOnRings();
    }

    @When("I click on For Her.")
    public void i_click_on_for_her() {
        contactActions.clickOnForher();
    }

    @When("I click on Brand.")
    public void i_click_on_brand() {
        contactActions.clickOnBrand();

    }

    @When("I select Carlex.")
    public void i_select_carlex() {
        contactActions.clickOnCarlex();

    }

    @When("I click on the first product.")
    public void i_click_on_the_first_product() {
        contactActions.clickOnFirst();
    }

    @When("I click on Get Live Expert Advice.")
    public void i_click_on_get_live_expert_advice() {
        contactActions.clickOnLive();

    }

    @Then("I verify the Buy Now option and capture a screenshot.")
    public void i_verify_the_buy_now_option_and_capture_a_screenshot() {

    }

}
