Feature: Login with valid email and password

  Scenario: Login User with correct email and password
    Given the user launches the browser
    When the user navigates to the URL 'http://automationexercise.com'
    Then the user verifies that the home page is visible successfully
    When the user clicks on the 'Signup / Login' button
    Then the user verifies that 'Login to your account' is visible
    When the user enters a correct email address and password
    And the user clicks on the 'login' button
    Then the user verifies that 'Logged in as username' is visible
    When the user clicks on the 'Delete Account' button
    Then the user verifies that 'ACCOUNT DELETED!' is visible