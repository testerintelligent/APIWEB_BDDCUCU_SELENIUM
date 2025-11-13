@FeaturesFiles
Feature: Web_AutomationExercise_Forms_Validation
   
    Scenario: Verify Test Case Page
        Given launching the url "https://www.automationexercise.com/"
        When verify that the home page is visible successfully
        And Click on Test Cases button
        Then Verify that the user is navigated to test cases page successfully

    Scenario: Verify Product Detail page
        Given launching the url "https://www.automationexercise.com/"
        When verify that the home page is visible successfully
        And Click on Products button
        And Verify that the user is navigated to the ALL PRODUCTS page successfully
        And click on view product of first product
        And user is landed to product detail page
        Then Verify that detail is visible: product name, category, price, availability, condition, brand

   
    Scenario: Add Products in cart
        Given launching the url "https://www.automationexercise.com/"
        When verify that the home page is visible successfully
        And Click on Products button
        And click on view product of first product
        And click on Add to cart button
        Then verify if the product is added to cart successfully

  
    Scenario: Contact us form
        Given launching the url "https://www.automationexercise.com/"
        When verify that the home page is visible successfully
        And Click on Contact us button
        And fill the details in the form
            | Mary Margaret                       |
            | marymargaret.albert@expleogroup.com |
            | sample                              |
            | message                             |

        And click the submit button
        And click on ok button
        Then Verify success message "Success! Your details have been submitted successfully." is visible
        And Click Home button and verify that landed to home page successfully "home"

   
    Scenario: Signup page
        Given launching the url "https://www.automationexercise.com/"
        When verify that the home page is visible successfully
        And Click Signup / Login button
        And Fill all details in Signup and the create account
            | Name  | Margaret                  |
            | email | marymargaret.ap@gmail.com |



            








