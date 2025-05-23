@Smoke
Feature: WEB_Rajasekar_DemoTest

@Sanity
Scenario: Automation Practice Form Interaction
  Given user lauch the automation practice  
  When User select radio button
  And User send the country details
  And User select the drop down box
  And User navigate to the child window
  And User navigate to the default window
  Then user send the input value

@Sanity
Scenario: Checkout Process
  Given User launch Application  
  When User input the first name
  And User input the last name
  And User input the Zipcode
  And User Click the continue button
  

@Regression
Scenario: Add to Cart
  Given user launch the application with credentilas
  When user click add to cart button for sauce labs BackPack
  Then user click the cart icon and navigates to Swag labs

@Sanity
Scenario: HerokuApp - Add Remove Elements
  Given user lauch the herokuapp automation page  
  When User click the add remove elements
  Then verify stale element execption

@Sanity
Scenario: LetCode - Dropdown Interaction
  Given user lauch the letcode dropdown button automation page  
  When User get the dropdown button
  Then User get multiselect

@Sanity
Scenario: LetCode - Alert Interaction
  Given user lauch the letcode automation page  
  When User click the simple alert
  When User click confirm alert
  Then A confirmation popup should appear

@Sanity
Scenario: LetCode - Button Properties
  Given user lauch the letcode button automation page  
  When User get the location of the button
  When User get the colour of the button
  When User get the size of the button
  Then A confirmation on disable button

@Sanity
Scenario: End-to-End Hotel Booking on Demo Application
  Given user launch The Application  
  When user Enter The Username In Username Filed
  And User Enter The Password In Password Field
  Then User Click On The Login Button And It Navigates To Search Hotel Page
  When user Select The Location
  And user Select The Hotel
  And user Select The RoomType
  And user Select The NumberofRooms
  And user Enters The CheckinDate
  And user Enters The CheckOutDate
  And user Select The AdultPerRoom
  And user Select The ChildrenPerRoom
  Then User Click on the Search Button And It Navigates To Select Hotel page
  When user Select The RadioButton
  And user Select The ContinueButton
  When user Enters The FirstName
  And user Enters The LastName
  And user Enters The Address
  And user Enters The CCN Number
  And user Enters The CC TYpe
  And user Enters The CC Expiry Month
  And user Enters The CC Expiry Year
  And user Enters The CC CVV 
  Then User Click on the BookNow Button It Navigates To Booking Cofirmation Page
  When user Click My Itineary Button
  Then user Click Logout Button

@Sanity
Scenario Outline: Validation of login using valid credentials
  Given the user should be in login page
  When the user enter the username "<username>" and password "<password>"
  And the user press the login button
  Then it should be redirected to homepage with title "<title>"

  Examples:
    | username                    | password    | title       |
    | princyprabha2609@gmail.com | Princy@119  | My Account  |

@Sanity
Scenario Outline: Validation of login using invalid credentials
  Given the user should be in login page
  When the user enters the invalid username "<username>" and password "<password>"
  And the user clicks on login button
  Then the user should get error message "<errorMessage>"

  Examples: 
    | username                   | password   | errorMessage                                          |
    | princyprabha2609@gmail.com | Chinnu@211 | Warning: No match for E-Mail Address and/or Password. |
    | princyp6@gmail.com         | Princy@211 | Warning: No match for E-Mail Address and/or Password. |

@Regression
Scenario Outline: Validate the monitors page
  Given the user is on the homepage
  When the user navigates to Components -> Monitors
  Then the Monitors page should be displayed with title "<title>"

  Examples:
    | title    |
    | Monitors |

@Regression
Scenario: Adding a new valid shipping address
  Given I am logged in to my account
  And I navigate to the Address Book section
    | First Name | Princy         |
    | Last Name  | PS             |
    | Company    | Exp Inc        |
    | Address 1  | 123 Main St    |
    | Address 2  | Apt 4B         |
    | City       | Chennai        |
    | Post Code  | 12345          |
  And I select country and region from dropdown
  And I choose  Default Address
  And I click the Continue button to proceed
  Then the new shipping address should be successfully added to my address book

@Regression
Scenario: Add a single product to the cart 
  Given I am on the Swag Labs inventory page
  When I click the Add to cart button for Sauce Labs Backpack
    

@Princy
Scenario: Verify product is added to the cart page
  Given I have added "Sauce Labs Backpack" to the cart
  When I click the cart icon
  Then I should be on the cart page
  And I should see "Sauce Labs Backpack" listed in the cart

@Sanity
Scenario: Proceed to login
  Given The user should be login page
  When The user enter username "Admin" and password "admin123"
  And click on the "Login" button
  Then user should be directed to Dashboard page with title "OrangeHRM"

    @Sanity
  Scenario: Verify slider updates the displayed value correctly
    Given I open the slider webpage
    When I move the slider to "0.5"
    Then I should see the displayed value as "0.5"
    When I move the slider to "2.5"
    Then I should see the displayed value as "2.5"
    When I move the slider to "5"
    Then I should see the displayed value as "5"

     @Smoke
  Scenario Outline: Verify key press events
    Given I am on the Key Press page
    When I press the "<key>" key
    Then I should see the message "You Entered: <key>"

    Examples:
      | key     |
      | TAB     |
      | ENTER   |
      | ESCAPE  |
      | ALT     |
      | SHIFT   |

@Sanity
Scenario: Login as Admin with credentials 
  Given The user should be login page
  When The user enter username "Admin" and password "admin123"
  And click on the "Login" button
  Then user should be directed to Dashboard page with title "OrangeHRM"

@Sanity
Scenario: Search for a module using sidebar search
  Given The user should be logged in
  When I enter "Recruitment" in the sidebar search field
  Then I should see the "Recruitment" module visible in the sidebar

@Sanity
Scenario Outline: Validation of Login Credentials AHB
  Given User is on the Adactin Login page
  When User enters the valid "<Username>" and "<Password>" for the Adactin site
  And User clicks the login button

  Examples:
    | Username       | Password   |
    | adactin_user   | adac1234   |

@Sanity
Scenario Outline: Login with different credentials
  Given User should Enters Login page
  When User should enter "<Username>" and "<Password>"
  And User clicks the login buttons
  

  Examples:
    | Username   | Password | message                 |
    | user001    | pass001  | Welcome to your account |

@Sanity
Scenario Outline: Toggle checkbox selection
  Given I open the checkbox page
  When I set checkbox <index> to "<state>"
  Then checkbox <index> should be "<expectedState>"

  Examples:
    | index | state  | expectedState |
    | 1     | check  | checked       |
    | 2     | uncheck| unchecked     |

    @Sanity
	Scenario: Adding an item to the cart
    Given I navigate to the shopping page
    When I select a product
    And I choose the size, color, and quantity
    And I add the product to the cart
    Then I should be redirected to the shopping cart page
