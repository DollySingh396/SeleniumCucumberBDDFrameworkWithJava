Feature: Test Login Functionality

  Scenario: Check Login is Successful with Valid Credentials
    Given browser is open
    And user is on Login page
    When user enters username and password
    And user clicks on Login
    Then user is navigated to TestForm page
    When user enters the form details
    And clicks on Save Button
    Then validate Form is saved
