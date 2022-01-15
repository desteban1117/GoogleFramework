package pageObjects.google;

import org.openqa.selenium.By;
import pageObjects.PageObject;
import pageObjects.wikipedia.WikipediaResult;

public class GoogleResult extends PageObject {

    By firstResult = By.cssSelector(".g .LC20lb");
    By googleLogo = By.className("logo");

    public String getFirstResult() {
        return getText(firstResult);
    }

    public void clickFirstResult() {
        click(firstResult);
    }

    public boolean isGoogleResultPage() {
        return isDisplayed(googleLogo);
    }
}
