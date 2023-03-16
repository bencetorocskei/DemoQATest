package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pagefactory.AlertsPage;
import pagefactory.BrowserWindowsPage;
import pagefactory.SamplePage;

import static pagefactory.WebDriverFactory.shutDown;

public class AlertSteps {

    AlertsPage alertsPage;
    BrowserWindowsPage browserWindowsPage;

    @Before
    public void setUp() {
        alertsPage = new AlertsPage();
        browserWindowsPage =  new BrowserWindowsPage();
    }

    @Given("I am on the demoQA alert page")
    public void i_am_on_the_demo_qa_alert_page() {
        alertsPage.navigate();
    }
    @When("I click the Button to see alert")
    public void i_click_the_button_to_see_alert() {
        alertsPage.clickOnAlertBtn();
    }
    @Then("I see an alert window")
    public void i_see_an_alert_window() {
        String expected = "You clicked a button";
        Assertions.assertEquals(expected, alertsPage.getAlertText());
    }
    @When("I click the timer alert Button to see alert")
    public void i_click_the_timer_alert_button_to_see_alert() {
        alertsPage.clickOnTimerButton();
    }
    @Then("I see an alert after {int} sec")
    public void i_see_an_alert_after_sec(Integer int1) {
        String expected = "This alert appeared after 5 seconds";
        Assertions.assertEquals(expected, alertsPage.getAlertText());
    }
    @When("I click the confirm box button")
    public void i_click_the_confirm_box_button() {
        alertsPage.clickOnConfirmBtn();
    }
    @When("I accept the confirmation")
    public void i_accept_the_confirmation() {
        alertsPage.switchToAlertAndConfirm();
    }
    @Then("I see a confirmation text appears next to the button")
    public void i_see_a_confirmation_text_appears_next_to_the_button() {
        Assertions.assertTrue(alertsPage.confirm());
    }
    @When("I click on the prompt box button")
    public void i_click_on_the_prompt_box_button() {
        alertsPage.clickOnPromBtn();
    }
    @When("I enter my name and accept")
    public void i_enter_my_name_and_accept() {
        alertsPage.fillThePromptForm();
    }
    @Then("I see a result text next to the button")
    public void i_see_a_result_text_next_to_the_button() {
        Assertions.assertTrue(alertsPage.confirmPrompt());
    }


}
