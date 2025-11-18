Feature: Login with valid credentials
  Scenario: Login with valid credentials
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When the user click on the Signup Login button
    Then the user verify that Signup Login page is visible successfully
    When the user enter a email "email" and password "password" valids
    And the user click the login button
    Then the user verify that "Logged in as username" is visible
