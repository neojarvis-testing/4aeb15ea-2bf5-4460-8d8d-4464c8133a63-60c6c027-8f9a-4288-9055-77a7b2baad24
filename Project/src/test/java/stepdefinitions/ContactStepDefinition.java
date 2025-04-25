package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPageActions;
import pages.RingsPageActions;
import utils.Base;
import utils.LoggerHandler;

public class ContactStepDefinition {

    
    

  
  
   
  
  
   
   




    LoggerHandler logs = new LoggerHandler();
    ExtentTest test = Hooks.report.createTest("TestOnBracelets");
    ContactPageActions contactActions  = new ContactPageActions( test, logs);


    @Given("I am on the homepage.")
public void i_am_on_the_homepage() {
    contactActions.clickOnAccept();
}
@When("I scroll down to the footer.")
public void i_scroll_down_to_the_footer() {
    
}
@When("I click on Contact Us.")
public void i_click_on_contact_us() {
    contactActions.clickOnContact();
    
}

@When("I verify the {string} and {string} of Contact Us.")
public void i_verify_the_and_of_contact_us(String string, String string2) {
    contactActions.verifyContactUs(string,string2);
}
@When("I click on Luxury Services.")
public void i_click_on_luxury_services() {
    contactActions.clickOnLuxury();
   
}

@When("I verify the {string} and {string} of Luxury Services.")
public void i_verify_the_and_of_luxury_services(String string, String string2) {
    contactActions.verifyLuxuryServices(string,string2);
}
@When("I click on Store Finder.")
public void i_click_on_store_finder() {
    contactActions.clickOnStore();
    
}

@When("I verify the {string} and {string} of Store Finder.")
public void i_verify_the_and_of_store_finder(String string, String string2) {
    contactActions.verifyStore(string,string2);
}
@When("I click on Delivery Information.")
public void i_click_on_delivery_information() {
    contactActions.clickOnDelivery();
    
}

@When("I verify the {string} and {string} of Delivery Information.")
public void i_verify_the_and_of_delivery_information(String string, String string2) {
    contactActions.verifyDelivery(string,string2);
}
@When("I click on Click and Collect.")
public void i_click_on_click_and_collect() {
    contactActions.clickOnclick();
    
}

@When("I verify the {string} and {string} of Click and Collect.")
public void i_verify_the_and_of_click_and_collect(String string, String string2) {
    contactActions.verifyClick(string,string2);
}
@When("I click on Return Policy.")
public void i_click_on_return_policy() {
    contactActions.clickOnReturn();
  
}

@When("I verify the {string} and {string} of Return Policy.")
public void i_verify_the_and_of_return_policy(String string, String string2) {
    contactActions.verifyReturn(string,string2);
}
@When("I click on Affirm Finance.")
public void i_click_on_affirm_finance() {
    contactActions.clickOnAffrim();
    
}

@When("I verify the {string} and {string} of Affirm Finance.")
public void i_verify_the_and_of_affirm_finance(String string, String string2) {
    contactActions.verifyAffrim(string,string2);
}
@When("I click on Your Feedback.")
public void i_click_on_your_feedback() {
    contactActions.clickOnFeedback();
   
}

@When("I verify the {string} and {string} of Your Feedback.")
public void i_verify_the_and_of_your_feedback(String string, String string2) {
    contactActions.verifyFeedback(string,string2);
}
@Then("I capture a screenshot.")
public void i_capture_a_screenshot() {
    
}




  

}















