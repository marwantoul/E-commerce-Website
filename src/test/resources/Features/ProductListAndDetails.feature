Feature: Search Product

  Scenario: Test Case page
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When he user click the Products link
    Then the user verify that the Products page is visible successfully
    And the product list product is display
    When The user selects a product by clicking the View Product link
    Then User is landed to product detail page
