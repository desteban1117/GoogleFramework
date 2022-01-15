package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String option = (System.getProperty("BROWSER") == null) ? "chrome" : System.getProperty("BROWSER");
            driver = Browsers.getBrowser(option);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
