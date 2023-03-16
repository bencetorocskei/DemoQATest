package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

   private static WebDriver driver = null;
/*
    public static WebDriver createWebDriver(String browserType) {
        if(driver == null) {
            switch(browserType){
                case "chrome":
                    return driver = new ChromeDriver();
                case "firefox":
                    return driver = new FirefoxDriver();
            }

        }
        return driver;
    }*/

    public static WebDriver createWebDriver() {
        if (driver == null) {
            driver = new ChromeDriver();

        }
        return driver;
    }

    public static void shutDown() {
        driver.quit();
        driver = null;
    }

}


