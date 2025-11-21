Feature: Contact Us Form

  Scenario: Contact Us Form
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When he user click the Contact us link
    Then the user verify that the contact us page is visible successfully
    When he user click the Contact us link
    Then the user verify that the contact us page is visible successfully
    When the user enter a name and email address and subject and message and file
    And the user click the Submit button
    Then the user verify that a confirmation popup is visible successfully
    When the user click on OK bouton
    Then the user verify that the successfully submit is visible