@Regression
Feature: WEB_Rajasekar_DemoTest


Scenario: 


Given user lauch the automation practice  
When User select radio button
And  User send the country details
And  User select the drop down box
And  User navigate to the child window
And  User navigate to the default window
Then user send the input value

@Smoke
Scenario: checkout


Given User launch Application  
When  User input the first name
When  User input the last name
When  User input the Zipcode
And   User Click the continue button
Then  User Click finish button.

@Sanity
Scenario: Add to cart

Given user launch the application with credentilas
When  user click add to cart button for sauce labs BackPack
Then user click the cart icon and navigates to Swag labs

@Smoke
Scenario:

Given user lauch the herokuapp automation page  
When User click the add remove elements
Then  verify stale element execption

@Smoke
Scenario:

Given user lauch the letcode dropdown button automation page  
When User get the dropdown button
Then User get multiselect

@Sanity
Scenario:
Given user lauch the letcode automation page  
When User click the simple alert
When User click confirm alert
Then A confirmation popup should appear

@Sanity
Scenario:

Given user lauch the letcode button automation page  
When User get the location of the button
When User get the colour of the button
When User get the size of the button
Then A confirmation on disable button

@Regression
Scenario:

Given user launch The Application  
When  user Enter The Username In Username Filed
And : User Enter The Password In Password Field
Then : User Click On The Login Button And It Navigates To Search Hotel Page

When : user Select The Location
When : user Select The Hotel
When : user Select The RoomType
When : user Select The NumberofRooms
When : user Enters The CheckinDate
When : user Enters The CheckOutDate
When : user Select The AdultPerRoom
When : user Select The ChildrenPerRoom
Then : User Click on the Search Button And It Navigates To Select Hotel page

When : user Select The RadioButton
When : user Select The ContinueButton

When : user Enters The FirstName
When : user Enters The LastName
When : user Enters The Address
When : user Enters The CCN Number
When : user Enters The CC TYpe
When : user Enters The CC Expiry Month
When : user Enters The CC Expiry Year
When : user Enters The CC CVV 
Then : User Click on the BookNow Button It Navigates To Booking Cofirmation Page


When : user Click My Itineary Button

Then : user Click Logout Button

Scenario: Validation of login using valid credentials
    Given the user should be in login page
    When the user enter the username "princyprabha2609@gmail.com" and password "Princy@119"
    And the user press the login button
    Then it should be redirected to homepage with title "My Account"

  Scenario Outline: Validation of login using invaild credentials
    Given the user should be in login page
    When the user enters the invalid username "<username>" and password "<password>"
    And the user clicks on login button
    Then the user should get error message "<errorMessage>"

    Examples: 
      | username                   | password   | errorMessage                                          |
      | princyprabha2609@gmail.com | Chinnu@211 | Warning: No match for E-Mail Address and/or Password. |
      | princyp6@gmail.com         | Princy@211 | Warning: No match for E-Mail Address and/or Password. |
      | princyprabha2609@gmail.com | Chinnu@211 | Warning: No match for E-Mail Address and/or Password. |


  Scenario: Validate the mointors page
    Given the user is on the homepage
    When the user navigates to Components -> Monitors
    Then the Monitors page should be displayed with title "Monitors"

  Scenario: Change view to List
    When the user selects List view
    Then the products should be displayed in list format

  Scenario: Change view to Grid
    When the user selects Grid view
    Then the products should be displayed in grid format

    Scenario: Adding a new valid shipping address
    Given I am logged in to my account
    And I navigate to the Address Book section
    When I click on the Add Address button
    And I enter the following shipping address details:
      | First Name | Princy         |
      | Last Name  | PS             |
      | Company    | Exp Inc        |
      | Address 1  | 123 Main St    |
      | Address 2  | Apt 4B         |
      | City       | Chennai        |
      | Post Code  |          12345 |
    And I select country and region from dropdown
    And I choose  Default Address
    And I click the Continue button to proceed
    Then the new shipping address should be successfully added to my address book
    And I should see a success message indicating the address has been added
    And the newly added address should be marked as the default address in my address book

 Scenario: Add a single product to the cart 
    Given I am on the Swag Labs inventory page
    When I click the Add to cart button for Sauce Labs Backpack
    Then the cart badge should display 1  

    Scenario: Verify product is added to the cart page
    Given I have added "Sauce Labs Backpack" to the cart
    When I click the cart icon
    Then I should be on the cart page
    And I should see "Sauce Labs Backpack" listed in the cart

    Scenario: Proceed to checkout with an item in the cart
    Given the user is logged in and has "Sauce Labs Bike Light" in the cart
    When the user navigates to the cart page
    And proceeds to the checkout
    Then the checkout information form should be displayed

    Scenario: Proceed to login
    Given The user should be login page
    When The user enter username "Admin" and password "admin123"
    And click on the "Login" button
    Then user should be directed to Dashboard page with title "OrangeHRM"

  Scenario: Add a new employee with login credentials
    When I navigate to the "Add Employee" page
    And I enter employee full name with first name "Princy", middle name "P", and last name "Prabha"
    And I enter employee ID as "0388"
    And I enable "Create Login Details"
    And I enter login username as "Pri.P123"
    And I enter password as "Password@123" and confirm password as "Password@123"
    And I select status as "Enabled"
    And I click on the "Save" button
    Then the employee should be added successfully

     Scenario: Login as Admin with credentials 
    Given The user should be login page
    When The user enter username "Admin" and password "admin123"
    And click on the "Login" button
    Then user should be directed to Dashboard page with title "OrangeHRM"

    Scenario: Search for a module using sidebar search
    Given The user should be logged in
    When I enter "Recruitment" in the sidebar search field
    Then I should see the "Recruitment" module visible in the sidebar

    Scenario Outline: Validation of Login Credentials AHB
    Given User is on the Adactin Login page
    When User enters the valid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then User should be redirected to Adactin Homepage

    Examples: 
      | Username      | Password |
      | PrincyPrabha | Princy@119 |

      Feature: Login Functionality on Demo Website

      Scenario Outline: Login with different credentials
    Given I open the login page
    When I enter username "<username>" and password "<password>"
    And I click the login button
    Then I should see "<message>"

        Examples:
      | username       | password         | message                                 |
      | tomsmith       | SuperSecretPassword! | You logged into a secure area!       |
      | wronguser      | SuperSecretPassword! | Your username is invalid!            |
      | tomsmith       | wrongpassword        | Your password is invalid!            |