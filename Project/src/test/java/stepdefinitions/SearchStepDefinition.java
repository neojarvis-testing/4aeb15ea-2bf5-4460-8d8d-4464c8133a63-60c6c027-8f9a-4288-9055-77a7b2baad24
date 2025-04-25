package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchActions;
import utils.Base;
import utils.LoggerHandler;

public class SearchStepDefinition {

    LoggerHandler logs = new LoggerHandler();
    ExtentTest test = Hooks.report.createTest("TestOnBracelets");
    SearchActions searchactions  = new SearchActions(Base.driver, test, logs);

    @Given("I am on the website")
public void i_am_on_the_website() {
    searchactions.verifyWebsite();
   
}
@When("I click on the search Bar")
public void i_click_on_the_search_bar() {
    searchactions.clickOnAccept();
}
@When("I search for {string}")
public void i_search_for(String string) {
    searchactions.searchOperation(string);
    searchactions.clickOnDismiss();
}
@When("I  verify the search results with {string}")
public void i_verify_the_search_results_with(String string) {
    searchactions.verifyEarrings(string);
}
@When("I click on brand")
public void i_click_on_brand() {
    searchactions.clickOnBrand();
}
@When("I click on Gucci")
public void i_click_on_gucci() {
    searchactions.clickOnGucci();
}
@When("I verify the page whether it has {string}")
public void i_verify_the_page_whether_it_has(String string) {
    searchactions.verifyGucci(string);
}
@When("I click on Rose Gold")
public void i_click_on_rose_gold() {
    searchactions.clickOnMetalType();
    
}
@When("I click on Drop Earrings")
public void i_click_on_drop_earrings() {
    searchactions.clickOnEarRingsStyle();
}
@When("I verify the page Drop Earrings")
public void i_verify_the_page_drop_earrings() {
    searchactions.verifyDropEarrings();
}

@When("I click on the first product appered after the filters")
public void i_click_on_the_first_product_appered_after_the_filters() {
   searchactions.clickOnfirstProduct();
}
@When("I click on get live expert advice")
public void i_click_on_get_live_expert_advice() {
    searchactions.clickOnGet();
    
}

@Then("I take the screenshot of the page")
public void i_take_the_screenshot_of_the_page() {
    searchactions.getScreenshot();
}










}
