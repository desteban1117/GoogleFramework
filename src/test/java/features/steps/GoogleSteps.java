package features.steps;

import drivers.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.google.GoogleResult;
import pageObjects.google.GoogleSearch;

public class GoogleSteps {

    private final GoogleSearch googleSearch;
    private final GoogleResult googleResult;

    public GoogleSteps(GoogleSearch googleSearch, GoogleResult googleResult) {
        this.googleSearch = googleSearch;
        this.googleResult = googleResult;
    }

    @Given("I am on Google homepage")
    public void i_am_on_google_homepage() {
        googleSearch.isGoogleSearchPage();
    }

    @When("I type {string} into the search field")
    public void i_type_into_the_search_field(String string) {
        googleSearch.search(string);
    }

    @When("I click the Google Search button")
    public void i_click_the_google_search_button() {
        googleSearch.clickGoogleSearch();
    }

    @Then("I am on Google result page")
    public void i_go_to_the_search_result_page() {
        Assert.assertTrue(googleResult.isGoogleResultPage());
    }

    @Then("The first result is {string}")
    public void the_first_result_is(String string) {
        Assert.assertEquals(string, googleResult.getFirstResult());
    }

    @When("I click on the first result link")
    public void i_click_on_the_first_result_link() {
        googleResult.clickFirstResult();
    }

    @When("The suggestion list is displayed")
    public void the_suggestion_list_is_displayed() {
        Assert.assertTrue(googleSearch.isSuggestionListDisplayed());
    }

    @When("I click on the first suggestion in the list")
    public void i_click_on_the_first_suggestion_in_the_list() {
        googleSearch.clickFirstSuggestion();
    }
}
