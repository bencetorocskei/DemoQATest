package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SamplePage extends BasePage{

    public SamplePage() {
        super();

    }

    @FindBy (id = "sampleHeading")
    WebElement heading;

    public String getSampleText() {
        wait.until(ExpectedConditions.urlContains("sample"));
        wait.until(ExpectedConditions.visibilityOf(heading));
        return heading.getText();
    }

    public boolean loadPage() {
        return driver.getCurrentUrl().contains("sample");
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}

