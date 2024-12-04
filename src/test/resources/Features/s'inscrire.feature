Feature: User Registration

  Scenario: User registers successfully
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When the user click on the Signup Login button
    Then the user verify that Signup Login page is visible successfully
    When the user enter a name and email address
    And the user click the Signup button
    Then the user verify that the ENTER ACCOUNT INFORMATION is visible
    When the user fill in account details like Title, Name, Email, Password, Date of Birth
    And the user select the checkboxes for Sign up for our newsletter and Receive special offers from our partners
    And the user fill in details for First name, Last name, Company, Address, etc
    And the user click the Create Account button
    Then the user verify that ACCOUNT CREATED is visible
    When the user click the CONTINUE button
    Then the user verify that Logged in as username is visible
    When the user click the Delete Account button
    Then the user verify that ACCOUNT DELETED is visible
    And the user click the Continue button