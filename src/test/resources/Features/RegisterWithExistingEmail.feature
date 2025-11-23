Feature: User Registration with a existing email

  Scenario: User Registration with a existing email
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When the user click on the Signup Login button
    Then the user verify that Signup Login page is visible successfully
    When the user enter a name and existing email address
    And the user click the Signup button
    Then the user verify that the error message email is existing is visible