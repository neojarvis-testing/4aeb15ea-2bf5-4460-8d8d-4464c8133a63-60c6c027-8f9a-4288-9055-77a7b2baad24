package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.JewelryPage;
import utils.LoggerHandler;
public class JewelryDefinitions{
    LoggerHandler logs = new LoggerHandler();
    ExtentTest test = Hooks.reports.createTest("Test case 4");
    JewelryPage je  = new JewelryPage(test, logs);
    @Given("I am on home page {string}")
public void i_am_on_home_page(String string) {
    je.mayorsHome(string);
    }
@When("I hover over jewelry and click on chanel")
public void i_hover_over_jewelry_and_click_on_chanel() {
    je.jewelryHoverAndChanelClick();
}
@Then("the result page for {string} is displayed")
public void the_result_page_for_is_displayed(String string) {
    je.verifyChanel(string);
}
@Then("I click on rings")
public void i_click_on_rings() {
    je.clickOnRings();
}
@Then("I verify page for {string}")
public void i_verify_page_for(String string) {
    je.verifySearch(string);
}
@Then("I click on cococrush under brand type")
public void i_click_on_cococrush_under_brand_type() {
    je.clickOnBrandAndCoco();
}
@Then("I click on white gold under metal type")
public void i_click_on_white_gold_under_metal_type() {
    je.clickOnMetalType();
}
@Then("I click on first product from available products")
public void i_click_on_first_product_from_available_products() {
    je.clickOnFirst();
}

}
