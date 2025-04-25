package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.LoggerHandler;

public class HomeStepDefinition {
    LoggerHandler logs;
    ExtentTest test;
    HomePage rolex;

    /*
     * Method Name : i_hover_on_rolex
     * Author Name : Praneeth
     * Description : This method clicks on cookies on the home page
     * Parameters : N/A
     * Return Type : void
     */
    @Given("I hover on Rolex")
    public void i_hover_on_rolex() {
        logs = new LoggerHandler();
        test = Hooks.reports.createTest("TestCase2");
        rolex = new HomePage(test, logs);
        rolex.clickOnCookies();
        rolex.clickOnRolex();
    }

    /*
     * Method Name : i_click_on_deepsea
     * Author Name : Praneeth
     * Description : This method clicks on deepsea on the home page
     * Parameters : N/A
     * Return Type : void
     */
    @When("I click on deepsea")
    public void i_click_on_deepsea() {
        rolex.deepSea();
    }

    /*
     * Method Name : i_verify_the_page_title
     * Author Name : Praneeth
     * Description : This method is used to verify the tilte of deepsea page
     * Parameters : string
     * Return Type : void
     */
    @When("I verify the page title {string}")
    public void i_verify_the_page_title(String string) {
        rolex.verifyDeepSea(string);
    }

    /*
     * Method Name : i_click_on_rolex_watches
     * Author Name : Praneeth
     * Description : This method clicks on reloex watches
     * Parameters : N/A
     * Return Type : void
     */
    @When("I click on rolex watches")
    public void i_click_on_rolex_watches() {
        rolex.clickOnRolexWatches();
    }

    /*
     * Method Name : i_verify_the_text
     * Author Name : Praneeth
     * Description : This method is used to verify the text in the rolex watch page
     * Parameters : string
     * Return Type : void
     */
    @When("I verify the text {string}")
    public void i_verify_the_text(String string) {
        rolex.verifyRolexWatch(string);
    }

    /*
     * Method Name : i_click_on_discover_watches
     * Author Name : Praneeth
     * Description : This method clicks on discover watches
     * Parameters : N/A
     * Return Type : void
     */
    @When("I click on discover watches")
    public void i_click_on_discover_watches() {
        rolex.clickOnDiscoverWatches();
    }

    /*
     * Method Name : i_click_on_new_watches
     * Author Name : Praneeth
     * Description : This method clicks on new watches
     * Parameters : N/A
     * Return Type : void
     */
    @When("I click on New watches")
    public void i_click_on_new_watches() {
        rolex.clickNewWatches();
    }

    /*
     * Method Name : i_click_on_watchmaking
     * Author Name : Praneeth
     * Description : This method is used to click on watch making
     * Parameters : N/A
     * Return Type : void
     */
    @When("I click on watchmaking")
    public void i_click_on_watchmaking() {
        rolex.clickWatchMaking();
    }

    /*
     * Method Name : i_verify_the_keyword
     * Author Name : Praneeth
     * Description : This method is used to verify the text in the watch making page
     * Parameters : string
     * Return Type : void
     */
    @Then("I verify the keyword {string}")
    public void i_verify_the_keyword(String string) {
        rolex.veirfyWatchMaking(string);
    }
}
