Feature: Login with valid email and password

  Scenario: Login User with correct email and password
    Given the user navigate to the website
    Then the user verify that the home page is visible successfully
    When the user click on the Signup Login button
    Then the user verify that Signup Login page is visible successfully
    When the user enters a correct email address and password
    And the user clicks on the 'login' button
    Then the user verify that Logged in as username is visible
    When the user click the Delete Account button
    Then the user verify that ACCOUNT DELETED is visible