package features.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.wikipedia.WikipediaResult;

public class WikipediaSteps {

    private final WikipediaResult wikipediaResult;

    public WikipediaSteps(WikipediaResult wikipediaResult) {
        this.wikipediaResult = wikipediaResult;
    }

    @Then("I go to the Wikipedia {string} page")
    public void i_go_to_the_wikipedia_page(String string) {
        Assert.assertEquals(string, wikipediaResult.getTitle());
    }
}
