@all
@smoke
Feature: Web_AutomationExercise_Add_To_Cart_Scenario


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



    Scenario: Validating the brand page of products
        Given launching the url "https://www.automationexercise.com/"
        When clicking product button
        And Verify user entered the all products page
        And click on any brand1
        And verify if the user is navigated to the particular brand page "Brand - Mast & Harbour Products"
        And click on any other brand
        And verify if the user is navigated to the coresponding brand page "Brand - Madame Products"
        Then navigate back to the home page




    Scenario: View products based on category
        Given launching the url "https://www.automationexercise.com/"
        When click product button
        And Verify user entered the all products page
        And click on Category Women
        And click on a sub category
        And Verify that category page is displayed and confirm text "WOMEN - TOPS PRODUCTS"
        And click on Category Men
        And Verify that the category page is displayed and confirm text "Men - Tshirts Products"





