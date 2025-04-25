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
@Given("I hover on Rolex")
public void i_hover_on_rolex() {
    logs = new LoggerHandler();
    test = Hooks.reports.createTest("TestCase2");
    rolex = new HomePage(test, logs);
    rolex.clickOnCookies();
    rolex.clickOnRolex();
}
@When("I click on deepsea")
public void i_click_on_deepsea() {
    rolex.deepSea();
}
@When("I verify the page title {string}")
public void i_verify_the_page_title(String string) {
    rolex.verifyDeepSea(string);
}
@When("I click on rolex watches")
public void i_click_on_rolex_watches() {
    rolex.clickOnRolexWatches();
}
@When("I verify the text {string}")
public void i_verify_the_text(String string) {
    rolex.verifyRolexWatch(string);
}
@When("I click on discover watches")
public void i_click_on_discover_watches() {
    rolex.clickOnDiscoverWatches();
}
@When("I click on New watches")
public void i_click_on_new_watches() {
    rolex.clickNewWatches();
}
@When("I click on watchmaking")
public void i_click_on_watchmaking() {
    rolex.clickWatchMaking();
}
@Then("I verify the keyword {string}")
public void i_verify_the_keyword(String string) {
    rolex.veirfyWatchMaking(string);
}
}
