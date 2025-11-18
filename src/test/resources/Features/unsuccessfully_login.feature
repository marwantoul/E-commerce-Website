Feature: Login with invalid credentials
  Scenario: Login with invalid credentials
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When the user click on the Signup Login button
    Then the user verify that Signup Login page is visible successfully
    When the user enter a email "email" and password "password" invalids
    And the user click the login button
    Then the user verify that the error message is visible
