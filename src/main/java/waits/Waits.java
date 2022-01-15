package waits;

import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    private static final int TIME = 10;

    public static WebElement visibilityOfElementLocated(By locator) {
        return new WebDriverWait(Driver.getDriver(), TIME).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement visibilityOfElementLocated(By locator, int time) {
        return new WebDriverWait(Driver.getDriver(), time).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement elementToBeClickable(By locator) {
        return new WebDriverWait(Driver.getDriver(), TIME).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement elementToBeClickable(By locator, int time) {
        return new WebDriverWait(Driver.getDriver(), time).until(ExpectedConditions.elementToBeClickable(locator));
    }
}
