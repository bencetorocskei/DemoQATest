package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class BrowserWindowsPage extends BasePage {

    public BrowserWindowsPage() {
        super();
    }

    @FindBy(id = "tabButton")
    WebElement newTabBtn;

    @FindBy(id = "windowButton")
    WebElement newWindowBtn;

    @FindBy(id = "messageWindowButton")
    WebElement newWindowMessageBtn;

    @FindBy (id = "sampleHeading")
    WebElement heading;


    @FindBy (tagName = "body")
    WebElement body;

    @FindBy (id = "text")
    WebElement text;

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

    public void navigate() {
        driver.get("https://demoqa.com/browser-windows");
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }


    public String getBodyText() {
        wait.until(ExpectedConditions.visibilityOf(body));
        return body.getText();
    }

    public int getSize() {
        return driver.getWindowHandles().size();
    }

    public void switchTo() {
        driver.switchTo().window(driver.getWindowHandle());
    }
}
