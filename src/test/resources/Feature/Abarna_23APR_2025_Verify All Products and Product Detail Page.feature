@Abar
Feature: Abarna_23APR_2025__WEB_Verify All Products and Product Detail Page

  Scenario: Verify all products and product detail page functionality
   Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then The products list is visible
    When Click on 'View Product' of first product
    Then User is landed to product detail page
    Then Verify that product detail is visible: product name, category, price, availability, condition, brand
    And Finally i close the browserrr