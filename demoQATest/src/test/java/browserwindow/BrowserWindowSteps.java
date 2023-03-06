package browserwindow;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pagefactory.BrowserWindowsPage;
import pagefactory.SamplePage;

public class BrowserWindowSteps {
    BrowserWindowsPage browserWindow;
    SamplePage samplePage = new SamplePage();

    @Given("I am on the demoQA Browser Window page")
    public void i_am_on_the_demo_qa_browser_window_page() {
        browserWindow = new BrowserWindowsPage();
    }

    @When("I click on the New Tab button")
    public void i_click_on_the_new_tab_button() {
        browserWindow.clickOnTheNewTabButton();

    }

    @Then("I see This is a sample page")
    public void i_see_this_is_a_sample_page() {
        browserWindow.switchToNewWindow();
        String expected = "This is a sample page";
        String current = samplePage.getSampleText();
        Assertions.assertEquals(expected, current);

    }

    @When("I click on the New Window button")
    public void i_click_on_the_new_window_button() {
        browserWindow.clickOnTheNewWindowButton();
    }

    @Then("I see a new sample page window")
    public void i_see_a_new_sample_page_window() {
        browserWindow.switchToNewWindow();
        String expected = "This is a sample page";
        String current = samplePage.getSampleText();
        Assertions.assertEquals(expected, current);

    }


    @After
    public void quit() {
        browserWindow.shutDown();
    }
}
