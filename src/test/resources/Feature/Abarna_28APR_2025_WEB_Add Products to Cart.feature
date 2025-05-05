@Sanity
Feature: Abarna_28APR_2025_WEB_Add Products to Cart

  Scenario: Add Products to Cart
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click the on 'Products' button
    And Hover over first product and click 'Add to cart'
    And Click the 'Continue Shopping' button
    And Hover over second product and click 'Add to cart'
    And Click the 'View Cart' button
    Then Verify both products are added to Cart
    And Verify their prices, quantity and total price
    Then Finally i close the browserrr