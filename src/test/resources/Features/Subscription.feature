Feature: Subscription

  Scenario: Subscription
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When the user click the Cart link
    Then the user verify that the Subscription input is visible successfully
    When The user Enter email adresse in search input and click OK button
    Then The user Verify that the success message 'You have been successfully subscribed!' is visible