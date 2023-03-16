package pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertsPage extends BasePage{



    public AlertsPage() {
        super();
    }

    private Alert alert;
    @FindBy(id = "alertButton")
    WebElement alertBtn;

    @FindBy(id = "timerAlertButton")
    WebElement timerAlertBtn;

    @FindBy(id = "confirmButton")
    WebElement confirmBtn;

    @FindBy(id = "promtButton")
    WebElement promButton;

    @FindBy(id = "confirmResult")
    WebElement confirm;

    @FindBy(id = "promptResult")
    WebElement confirmPrompt;

    public void clickOnAlertBtn() {
        alertBtn.click();
    }

    public void clickOnTimerButton() {
        timerAlertBtn.click();
    }

    public void clickOnConfirmBtn() {
        confirmBtn.click();
    }

    public void clickOnPromBtn() {
        promButton.click();
    }

    public void switchToAlert() {
       driver.switchTo().alert();

    }

    public void switchToAlertAndConfirm() {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public String getAlertText() {
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void fillThePromptForm() {
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.sendKeys("bence");
        alert.accept();
    }


    public void navigate() {
        driver.get("https://demoqa.com/alerts");
    }

    public boolean confirm() {
        wait.until(ExpectedConditions.visibilityOf(confirm));
        return confirm.isDisplayed();
    }

    public boolean confirmPrompt() {
        wait.until(ExpectedConditions.visibilityOf(confirmPrompt));
        return confirmPrompt.isDisplayed();
    }

}

