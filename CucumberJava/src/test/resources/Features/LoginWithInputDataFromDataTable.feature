Feature: Test Login Functionality

  Scenario Outline: Check Login is Successful with Valid Credentials
    Given browser is open
    And user is on Login page
    When user enters <username> and <password>
    And user clicks on Login
    Then user is navigated to TestForm page
    When user enter the form details <Country> <address> <email> and <phone>
    And clicks on SaveButton
    Then validate Form is saved

    Examples: 
      | username | password | Country | address   | email         | phone      |
      | dodo     |    12345 | IN      | Faridabad | xyz@gmail.com | 5678738922 |
      | dolly    |    12345 | IN      | Faridabad | xyz@gmail.com | 5678738922 |
