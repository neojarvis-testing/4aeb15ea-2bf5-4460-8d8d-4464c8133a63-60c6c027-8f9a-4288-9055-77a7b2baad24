package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AboutMayors;
import utils.LoggerHandler;

public class AboutUsDefinitions {
  LoggerHandler log = new LoggerHandler();
  ExtentTest test = Hooks.reports.createTest("Test Case 10");
  AboutMayors abtm = new AboutMayors(test, log);

  @When("I click on About Mayors in footer section")
  public void i_click_on_about_mayors_in_footer_section() {
    abtm.clickOnAboutM();
  }

  @When("I verify title for Mayors page {string}")
  public void i_verify_title_for_mayors_page(String string) {
    abtm.titleVer(string);
  }

  @When("I verify the url for mayors page {string}")
  public void i_verify_the_url_for_mayors_page(String string) {
    abtm.urlVer(string);
  }

  @When("I click on Press Room link in the footer section")
  public void i_click_on_press_room_link_in_the_footer_section() {
    abtm.clickOnPress();
  }

  @When("I verify title for press room page {string}")
  public void i_verify_title_for_press_room_page(String string) {
    abtm.titleVer(string);
  }

  @When("I verify url for press room page {string}")
  public void i_verify_url_for_press_room_page(String string) {
    abtm.urlVer(string);
  }

  @When("I click on careers link in the footer section")
  public void i_click_on_careers_link_in_the_footer_section() {
    abtm.clickOnCareer();
  }

  @When("I verify title for careers page {string}")
  public void i_verify_title_for_careers_page(String string) {
    abtm.titleVer(string);
  }

  @When("I verify url for careers page {string}")
  public void i_verify_url_for_careers_page(String string) {
    abtm.urlVer(string);
  }

  @When("I click on sustainability in footer section")
  public void i_click_on_sustainability_in_footer_section() {
    abtm.clickOnSus();
  }

  @When("I verify title for sustainability page {string}")
  public void i_verify_title_for_sustainability_page(String string) {
    abtm.titleVer(string);
  }

  @When("I verify url for sustainability page {string}")
  public void i_verify_url_for_sustainability_page(String string) {
    abtm.urlVer(string);
  }

  @When("I click on wedding in the footer section")
  public void i_click_on_wedding_in_the_footer_section() {
    abtm.clickOnWedd();
  }

  @When("I verify title for wedding page {string}")
  public void i_verify_title_for_wedding_page(String string) {
    abtm.titleVer(string);
  }

  @When("I verify url for wedding page {string}")
  public void i_verify_url_for_wedding_page(String string) {
    abtm.urlVer(string);
  }

  @When("I click on rolex in the footer section")
  public void i_click_on_rolex_in_the_footer_section() {
    abtm.clickOnRolexxx();
  }

  @When("I verify title for rolex page {string}")
  public void i_verify_title_for_rolex_page(String string) {
    abtm.titleVer(string);
  }

  @When("I verify url for rolex page {string}")
  public void i_verify_url_for_rolex_page(String string) {
    abtm.urlVer(string);
  }

  @When("I click on newsletter in the footer section")
  public void i_click_on_newsletter_in_the_footer_section() {
    abtm.clickOnNewsL();
  }

  @When("I verify title for newsletter page {string}")
  public void i_verify_title_for_newsletter_page(String string) {
    abtm.titleVer(string);
  }

  @When("I verify url for newsletter page {string}")
  public void i_verify_url_for_newsletter_page(String string) {
    abtm.urlVer(string);
  }

  @When("I click on brands in the footer section")
  public void i_click_on_brands_in_the_footer_section() {
    abtm.clickOnBrandss();
  }

  @When("I verify title for brand page {string}")
  public void i_verify_title_for_brand_page(String string) {
    abtm.titleVer(string);
  }

  @Then("I verify url for brand page {string}")
  public void i_verify_url_for_brand_page(String string) {
    abtm.urlVer(string);
  }

  @Given("I am on the home page {string}")
  public void i_am_on_the_home_page(String string) {
    abtm.titleVer(string);
  }

}
