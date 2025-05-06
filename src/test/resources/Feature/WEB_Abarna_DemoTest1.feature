@Smoke

Feature: WEB_Abarna_DemoTest1

Scenario: Login user with incorrect email and password
 Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on Signup button
    Then Verify 'Login to your account' is visible
    And Enter correct email address and password
    And Clicks 'login' button
    And Finally i close the browserrr

    Scenario: Logout user successfully
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on Signup button
   Then Verify 'Login to your account' is visible
    And Enter correct email address and password
    And Clicks 'login' button
    Then Verify that 'Logged in as username' is visible
    When Click the 'Logout' button
    Then Verify that user is navigated to login page

    Scenario: Signup with an already registered email address
   Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on Signup button
    And Enter name and already registered email address
    And Click the 'Signup' button
    Then Verify error 'Email Address already exist!' is visible
    And Finally i close the browserrr

    Scenario: User should be able to sign up 
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on Signup button
    Then Verify new sign up is visible
    And Enter name and email address
    And Click 'Signup' button
    And Finally i close the browserrr

     Scenario: Verify user can navigate to the Test Cases page successfully
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on 'Test Cases' button
    Then Verify user is navigated to test cases page successfully
    And Finally i close the browserrr

    Scenario: Verify Subscription section functionality
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    When Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible
    And Finally i close the browserrr

    Scenario: Submit contact form with message and file upload
    Given Launch browser and navigate to AutomationTester url
   Then Verify that home page is visible successfully
    When Click on 'Contact Us' button
    Then Verify 'GET IN TOUCH' is visible
    And Enter name, email, subject and message
    And Finally i close the browserrr

    Scenario: Submit contact form with message and file upload
    Given Launch browser and navigate to AutomationTester url
   Then Verify that home page is visible successfully
    When Click on 'Contact Us' button
    Then Verify 'GET IN TOUCH' is visible
    And Enter name, email, subject and message
    And Click the 'Submit' button
    And Click OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click 'Home' button and verify that landed to home page successfully
        And Finally i close the browserrr

        Scenario: Verify search functionality for products
   Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When Enter product name in search input and click search button
    Then Verify 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible

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

    Scenario: User should be able to sign up 
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on Signup button
    Then Verify new sign up is visible
    And Enter name and email address
    And Click 'Signup' button
    And Finally i close the browserrr

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

    Scenario:Verify Subscription in Cart page
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on the 'Cart' button
    And Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    When Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible
    Then Finally i close the browserrr
