@FeaturesFileAddtoCart
Feature: Web_AutomationExercise_Add_To_Cart_Scenario

    @MaryScenario
    Scenario Outline: Adding review for product and validating response
        Given launching the url1 "https://www.automationexercise.com/"
        When click the product button
        And Verify user entered the all products page
        And click on view product
        And verify Write your Review element is visible
        And enter your name "<name>"
        And enter the email address "<email>"
        And write your review "<review>"
        And clicking the submit button
        Then validate the response message

        Examples:
            | name | email         | review       |
            | Mary | a.b@gmail.com | good quality |
    #|Muthu|b.c@gmail.com|nice product|

    Scenario: Add to cart from recommended items
        Given Launch the given URL "https://www.automationexercise.com/"
        When Scroll to bottom of home page
        And verify Recommended items are visible
        And click on add to cart
        And click on cart button
        And verify if the products are displayed
    @validating
    Scenario: Validating the brand page of products
        Given launching the Automation website url "https://www.automationexercise.com/"
        When clicking product button
        And Verifying user entered the all products page
        And click on any brand1
        And verify if the user is navigated to the particular brand page "Brand - Mast & Harbour Products"
        And click on any other brand
        And verify if the user is navigated to the coresponding brand page "Brand - Madame Products"
        Then navigate back to the home page
@TestingScenario
    Scenario: View products based on category
        Given launching the website url "https://www.automationexercise.com/"
        When clicking the product hyperlink text
        And Verify users entered the all products page
        And click on Category Womenpage
        And click on a subcategory
        And Verify that categorypage is displayed and confirm text "WOMEN - TOPS PRODUCTS"
        And click on Category type Men
        And Verify that the category page text is displayed and confirm text "Men - Tshirts Products"





