Feature: Feature to test Google Search Functionality

  Scenario: Validate Google Search is working
    Given browser is open
    And user is on Google Search page
    When user enters a text in Search Box
    And hits enter
    Then user is navigated to search results
