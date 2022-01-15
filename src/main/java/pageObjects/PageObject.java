package pageObjects;

import drivers.Driver;
import org.openqa.selenium.By;
import static waits.Waits.elementToBeClickable;
import static waits.Waits.visibilityOfElementLocated;


public class PageObject {
    public void sendKeys(String value, By locator) {
        visibilityOfElementLocated(locator).sendKeys(value);
    }

    protected void sendKeys(String value, By locator, int time) {
        visibilityOfElementLocated(locator, time).sendKeys(value);
    }

    protected void click(By locator) {
        elementToBeClickable(locator).click();
    }

    protected void click(By locator, int time) {
        elementToBeClickable(locator, time).click();
    }

    protected String getText(By locator) {
        return visibilityOfElementLocated(locator).getText();
    }

    protected boolean isDisplayed(By locator) {
        try {
            return Driver.getDriver().findElement(locator).isDisplayed();
        }
        catch (Exception e) {
            return false;
        }
    }
    protected boolean isDisplayed(By locator, int time) {
        try {
            return visibilityOfElementLocated(locator, time).isDisplayed();
        }
        catch (Exception e) {
            return false;
        }
    }
}
