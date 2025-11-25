Feature: Search Product

  Scenario: Search Product
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When he user click the Products link
    Then the user verify that the Products page is visible successfully
    When The user Enter product name "blue top" in search input and click search button
    Then The user Verify all the products related to search are visible
