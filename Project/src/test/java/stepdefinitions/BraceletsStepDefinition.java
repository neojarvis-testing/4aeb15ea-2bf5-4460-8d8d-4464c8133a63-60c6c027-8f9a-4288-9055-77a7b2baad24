package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BraceletsActions;
import utils.LoggerHandler;
import utils.Base;

public class BraceletsStepDefinition {
    LoggerHandler logs = new LoggerHandler();
    ExtentTest test = Hooks.reports.createTest("TestOnBracelets");
    BraceletsActions braceletactions = new BraceletsActions(Base.driver, test, logs);

    @Given("I am on the Website")
    public void i_am_on_the_website() {
        braceletactions.verifyWebsite();
        braceletactions.clickOnAccept();
    }

    @When("I hover over Wedding")
    public void i_hover_over_wedding() {
        braceletactions.hoverOnWedding();
    }

    @When("I click on Bracelets")
    public void i_click_on_bracelets() {
        braceletactions.clickOnBracelets();
    }

    @When("I verify the word {string}")
    public void i_verify_the_word(String string) {
        braceletactions.verifyJew(string);
        braceletactions.clickOnDismiss();
    }

    @When("I click on Yellow Gold")
    public void i_click_on_yellow_gold() {
        braceletactions.clickOnYellowGold();
    }

    @When("I verify the page that loads the relevant content {string}")
    public void i_verify_the_page_that_loads_the_relevant_content(String string) {
        braceletactions.verifyYellowGold(string);
    }

    @When("I click on Diamond")
    public void i_click_on_diamond() {
        braceletactions.clickOnDiamond();
    }

    @When("I verify the page that loads with relevant content {string}")
    public void i_verify_the_page_that_loads_with_relevant_content(String string) {
        braceletactions.verifyDiamond(string);
    }

    @When("I  verify the page {string}")
    public void i_verify_the_page(String string) {
        braceletactions.verifyBracelets(string);
    }

    @When("I click on the first product")
    public void i_click_on_the_first_product() {
        braceletactions.clickOnfirstPro();
    }

    @When("I click on Add to Shopping Bag")
    public void i_click_on_add_to_shopping_bag() {
        braceletactions.clickOnAddToShopping();
    }

    @Then("I capture the screenshot")
    public void i_capture_the_screenshot() {
        braceletactions.getScreenshot();
    }
}
