package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class BrowserWindowsPage extends BasePage {

    public BrowserWindowsPage() {
        super();
        String url = "https://demoqa.com/browser-windows";
        driver.get(url);
    }

    @FindBy(id = "tabButton")
    WebElement newTabBtn;

    @FindBy(id = "windowButton")
    WebElement newWindowBtn;

    @FindBy(id = "messageWindowButton")
    WebElement newWindowMessageBtn;

    @FindBy (id = "sampleHeading")
    WebElement heading;

    private String originalWindow = driver.getWindowHandle();

    public void clickOnTheNewTabButton() {
        assert driver.getWindowHandles().size() == 1;
        newTabBtn.click();
    }

    public void clickOnTheNewWindowButton() {
        assert driver.getWindowHandles().size() == 1;
        newWindowBtn.click();
    }

    public void clickOnTheNewWindowMessageButton() {
        assert driver.getWindowHandles().size() == 1;
        newWindowMessageBtn.click();

    }

    public void switchToNewWindow() {
        wait.until(numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public String getText() {
        wait.until(ExpectedConditions.urlContains("sample"));
        wait.until(ExpectedConditions.visibilityOf(heading));
        return heading.getText();
    }

    public String getUrl() {
        //wait.until(ExpectedConditions.urlContains("sample"));
        return driver.getCurrentUrl();
    }

    public boolean isPageReady() {
        return driver.getCurrentUrl().contains("sample");
    }




}
