package pageObjects.wikipedia;

import org.openqa.selenium.By;
import pageObjects.PageObject;

public class WikipediaResult extends PageObject {

    By titleLabel = By.id("firstHeading");

    public String getTitle() {
        return getText(titleLabel);
    }
}
