Feature: Google Homepage Search

  Scenario: User can search with "Google Search"
    Given I am on Google homepage
    When I type "The name of the wind" into the search field
    And I click the Google Search button
    Then I am on Google result page
    And The first result is "El nombre del viento - Wikipedia, la enciclopedia libr"
    When I click on the first result link
    Then I go to the Wikipedia "El nombre del viento" page

  Scenario: User can search by using the suggestions
    Given I am on Google homepage
    When I type "The name of the wind" into the search field
    And The suggestion list is displayed
    And I click on the first suggestion in the list
    Then I am on Google result page
    And The first result is "El nombre del viento - Wikipedia, la enciclopedia libre"
    When I click on the first result link
    Then I go to the Wikipedia "El nombre del viento" page
