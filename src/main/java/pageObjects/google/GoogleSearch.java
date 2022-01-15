package pageObjects.google;

import org.openqa.selenium.By;
import pageObjects.PageObject;

public class GoogleSearch extends PageObject {

    By searchTextBox = By.name("q");
    By searchButton = By.name("btnK");
    By suggestionList = By.cssSelector(".OBMEnb .G43f7e");
    By firstSuggestion = By.cssSelector(".OBMEnb .G43f7e li");

    public GoogleSearch search(String value) {
        sendKeys(value, searchTextBox);
        return this;
    }

    public GoogleResult clickGoogleSearch() {
        click(searchButton);
        return new GoogleResult();
    }

    public GoogleResult clickFirstSuggestion() {
        click(firstSuggestion);
        return new GoogleResult();
    }

    public boolean isSuggestionListDisplayed() {
        return isDisplayed(suggestionList, 2);
    }

    public boolean isGoogleSearchPage() {
        return isDisplayed(searchButton);
    }

}
