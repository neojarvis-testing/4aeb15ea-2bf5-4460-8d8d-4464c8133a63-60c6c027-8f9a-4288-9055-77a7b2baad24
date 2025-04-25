package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccessibilityActions;
import utils.LoggerHandler;


/*
     * Class Name : AccessibilityStepDefinition
     * Author Name: Muskan Jha
     * Description : This class is used to map descriptions in feature file and converts the each description to java commands
     * Parameters : N/A
     * Return Type : none
     */
public class AccessibilityStepDefinition {

    WebDriver driver = Hooks.driver;
    LoggerHandler logs = new LoggerHandler();

    AccessibilityActions accessy = new AccessibilityActions(driver, Hooks.test, logs);

    @Given("user is on mayors website")
    public void user_is_on_mayors_website() {

        accessy.verifyHomepage();
    }

    @When("user clicks on your security in footer")
    public void user_clicks_on_your_security_in_footer() {

        accessy.clickOnYourSecurity();
    }

    @When("user verifies the page title {string}")
    public void user_verifies_the_page_title(String string) {

        accessy.verifyTitle(string);
    }

    @When("user clicks on terms and conditions in footer")
    public void user_clicks_on_terms_and_conditions_in_footer() {

        accessy.clickOnTermsCondition();
    }

    @When("user clicks on privacy policy in footer")
    public void user_clicks_on_privacy_policy_in_footer() {

        accessy.privacyPolicy();
    }

    @When("user clicks on cookie policy in footer")
    public void user_clicks_on_cookie_policy_in_footer() {

        accessy.clickOnCookiePolicy();
    }

    @When("user clicks on accessibility in footer")
    public void user_clicks_on_accessibility_in_footer() {

        accessy.clickOnAccessibility();
    }

    @When("user clicks on paybylink in footer")
    public void user_clicks_on_paybylink_in_footer() {

        accessy.clickOnPayByLink();
    }

    @When("user clicks on watches in footer")
    public void user_clicks_on_watches_in_footer() {

        accessy.clickOnWatches();
    }

    @When("user clicks on jewellery in footer")
    public void user_clicks_on_jewellery_in_footer() {

        accessy.clickOnJewelry();
    }

    @When("user verifies the categories keyword")
    public void user_verifies_the_categories_keyword() {

        accessy.verifyKeyword();
    }

    @Then("user captures the screenshot of the result page")
    public void user_captures_the_screenshot_of_the_result_page() {

        accessy.takeScreenshot();
    }

}
