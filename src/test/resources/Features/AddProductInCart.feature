Feature: Add Products in the cart

  Scenario: Add Products in the cart
    Given the user navigate to the website
    And the user verify that the home page is visible successfully
    When he user click the Products link
    Then the user verify that the Products page is visible successfully
    When The user select a first product and click Add to cart
    And the user Click Continue Shopping button
    Then The user select a second product and click Add to cart
    When the user Click View Cart button
    Then the user Verify both products are added to Cart
    And the user Verify their prices, quantity and total price
