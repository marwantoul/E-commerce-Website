Feature: Logout User
  Scenario: Logout User
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When the user click on the Signup Login button
    Then the user verify that Signup Login page is visible successfully
    When the user enter a email "email" and password "password" valids
    And the user click the login button
    And the user click logout link
    Then the user verify that Signup and Login page is visible
