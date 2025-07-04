Feature: WEB_DemoTest

Background: Check Automation Tester Website
Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully

 @Smoke
  Scenario: Test the Navvigation and Back operations in Academic Domain
    Given I enter into the Academy Domain
    When I click the OpenWindow Element    
    And I navigated to another site
    Then again Back to the Main URL
 
 @Smoke
  Scenario: Test the Navvigation and Back operations in Academic Domain
    Given I enter into the Academy Domain
    When I click the OpenWindow Element    
    And I navigated to another site
    Then again Back to the Main URL
 
 @Regression
    Scenario: Test the automation operations in RahulShettyAcademy
    Given I enter into the Academy Domain of Rahul
    When I click the OpenWindow button
    Then I navigated to that window
 
 @Sanity
Scenario: Test the banking operations in customer Registration
    Given I enter the url of Registration of domain
    When I enter the customer Registration Details
    Then I can able to Register successfully
 
 @Smoke
Scenario: Test the banking operations in customer CompDBlogin
    Given I enter the url of domain CompDB1login
    When I enter customer credentials of CompDB1login
    Then I can login domain of CompDB1login successfully
 
 @Smoke
Scenario: Test the functionality of Search ComputerDatabase
    Given I enter the url for search the Computer Database
    When I enter the ComputerDB name one by one
    Then I can able to Search ComputerDb
 
 @Sanity
Scenario: Test the cancel of ComputerDatabase
    Given I enter the cancel url of ComputerDatabase
    When I enter the ComputerDatabase Info
    Then I can able to cancel ComputerDatabase
 
 @Regression
 Scenario: Test the banking operations in customer CompDBlogin
    Given I enter the url of domain CompDBlogin
    When I enter customer credentials of CompDBlogin
    Then I can login domain of CompDBlogin successfully
 
 @Smoke
    Scenario: Test the banking operations in customer Registration
    Given I enter the url of Registraion domain
    When I enter customer Registration Details
    Then I can able to Registration successfully
 
 @Regression
Scenario: Test the banking operations in customer CompDBlogin
    Given I enter the url of domain CompDBlogin
    When I enter customer credentials of CompDBlogin
    Then I can login domain of CompDBlogin successfully
 
 @Sanity
Scenario: Test the Search  ComputerDatabase
    Given I enter the url for search the Computer Database
    When I enter the ComputerDB name one by one
    Then I can able to Search ComputerDb
 
 @Regression
Scenario: Test the cancel of ComputerDatabase
    Given I enter the cancel url of ComputerDatabase
    When I enter the ComputerDatabase Info
    Then I can able to cancel ComputerDatabase
 
 @Smoke
    Scenario: Test the banking operations in customer login
    Given I enter the url of domain
    When I enter customer credentials
    Then I can login domain successfully
 
 @Integration
  Scenario: Test the banking operations for Community Poll
   Given I logged into the application
    When I have choosen the option for community poll
    Then I can submit the vote button
 
 @Smoke
     Scenario: Test the banking operations for Add Cart
   Given Product should be visible to choose
    When I have choosen the option to add cart
    Then I can press the add cart button
 
Scenario: To view all the front end back end apps
    Given The app url should be loaded properly
    When I navigated the hover
    Then I can able to see all the apps
 

 @Regression
  Scenario Outline: Login with valid credentials
  Given I navigate to the login page
    When I enter username "<Username>" and password "<Password>"
    And I click the login button
    Then I can able to login
 
    Examples:
      | Username   | Password   |
      | muthu123   | muthu123   |
      | muthu456   | muthu456   |
 
 @Smoke
      Scenario: Choosing and adding the item into the cart
    Given Should be logged in into the system
    When I select the item from list
    And I have to add to the cart
    And I have to pay the amount for the item
    Then I can able to buy the product
   
   @Regression
 Scenario: Test the banking operations for Dropdown Notebook
   Given Notebook elements should be loaded properly
    When I have to select the Sort by dropdown
    And I have to select the Display
    And I have to select the view as
    Then I can able to select the dropdown menu
 
 @Sanity
    Scenario: Test the banking operations for Hover the menu
   Given Menu items should be loaded properly
    When I have to hover the menu
    Then I can able to select the submenu
 
 @Smoke
    Scenario: Choosing and adding the item into the cart
    Given The url should be loaded properly
    When I enter the book name in the search box
    Then I can able to see the book
 
   @Smoke
  Scenario: Handle confirmation popup
  Given I enter the URL of the practice page for alert
    When I enter "Krithika" in the text
    And I click on the confirm button
    Then I handle the confirmation popup
	
   @Sanity
  Scenario: Test the window button operations in practice page
    Given I enter the url of practice page
    When I click  open window button popup
    Then I can see open window page successfully

@Sanity
  Scenario: Krithika_04APR_2025_Tabpopup
    Given I enter the URL of the practice page
    When I click the open tab button
    Then I should see the new tab opened successfully
	
   @Smoke
  Scenario: Handle Alert popup
    Given I enter the URL of the practice page for confirmation
    When I enter "Krishna" in the textbox
    And I click on the alert button
    Then I handle the alert popup
	
   @Smoke
  Scenario: User votes in the community poll
    Given I logged into the applications
    When I have chosen the option for community polls
    Then I can submit the voting buttons
	
   @Smoke
  Scenario: Drag box A and drop onto box B
    Given I am on the Drag and Drop page
    When I drag element "A" and drop it onto element "B"
    Then element "A" should be in position of "B"
  
  @Smoke
  Scenario: Drag box B and drop onto box A
    Given I am on the Drag and Drop page
    When I drag element "B" and drop it onto element "A"
    Then element "B" should be in position of "A"
	
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
	  
	 
	@Regression
  Scenario: Test the filter  operations in automation bookstore
    Given I enter the url of bookstore
    When I search books
    Then I can retrive books successfully
	
   @Regression
 Scenario: Successfully book a room
    Given Open the booking application
    When select the room
    And select the date
    And Enter the details
    Then Book the ticket
    And Confirm the booking
	
 @Sanity
 Scenario Outline: Verify text box functionality
   Given I navigate to the website
   When I enter "<name>" in the name text box  
   And I enter "<email>" in the email text box
   Then The text boxes should contain the entered values "<name>" and "<email>"

  Examples:
      | name      | email                 |
      | John Doe  | john.doe@example.com  |
      | Alice Ray | alice.ray@gmail.com   |

@Smoke
Scenario Outline: Select a checkbox
   When I select the "<checkboxName>" checkbox

Examples:
   | checkboxName |
   | Home        |
   

@Smoke
Scenario Outline: Verify radio button selection
    When I select the "<radioButtonLabel>" radio button
    Then The "<radioButtonLabel>" radio button should be selected

Examples:
      | radioButtonLabel |
      | Yes             |
      | Impressive      |
	  
     @Smoke
	Scenario: Test the banking operations in customers login
    Given I enter the url of domains
    When I enter customers credentials
    Then I can login domains successfully
	
   @Regression
	Scenario: Test the login operations in customer login
    Given I enter the shops login url of domain
    When I enter customer login credential
    Then I can login shops successfully
	
   @Sanity
	Scenario: Test the login operations in customer login
    Given I enter the shop login url of domain
    When I enter customer login credentials
    Then I can login shop successfully
	
   @Smoke
	Scenario: Test the banking operations in customer login
    Given I enter the url of banking domains
    When I enter customer banking credentials
    Then I can login banking domain successfully
	
   @Regression
	Scenario: Test the web shop operations in customer login
    Given I enter the registration url of domain
    When I enter new customer credentials
    Then I can register domain successfully
	
   @Sanity
	Scenario: Adding an item to the cart
    Given I navigate to the shopping page
    When I select a product
    And I choose the size, color, and quantity
    And I add the product to the cart
    Then I should be redirected to the shopping cart page
	
   @Smoke
	Scenario: Verify the context menu alert
    Given I open the context menu webpage
    When I right-click on the context menu box
    Then I should see an alert with text "You selected a context menu"
    And I accept the alert
    And I close the browser
 

 


@Sanity
Scenario: Login user with incorrect email and password
    When Click on Signup button
    Then Verify 'Login to your account' is visible
    And Enter correct email address and password
    And Clicks 'login' button
    And Finally i close the browserrr

@Sanity
    Scenario: Logout user successfully
    When Click on Signup button
   Then Verify 'Login to your account' is visible
    And Enter correct email address and password
    And Clicks 'login' button
    Then Verify that 'Logged in as username' is visible
    When Click the 'Logout' button
    Then Verify that user is navigated to login page

@Sanity
    Scenario: Signup with an already registered email address
    When Click on Signup button
    And Enter name and already registered email address
    And Click the 'Signup' button
    Then Verify error 'Email Address already exist!' is visible
    And Finally i close the browserrr

@Sanity
    Scenario: User should be able to sign up 
    When Click on Signup button
    Then Verify new sign up is visible
    And Enter name and email address
    And Click 'Signup' button
    And Finally i close the browserrr

@Sanity
     Scenario: Verify user can navigate to the Test Cases page successfully
    When Click on 'Test Cases' button
    Then Verify user is navigated to test cases page successfully
    And Finally i close the browserrr

@Sanity
    Scenario: Verify Subscription section functionality
    When Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    When Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible
    And Finally i close the browserrr

@Smoke
    Scenario: Submit contact form with message and file upload
    When Click on 'Contact Us' button
    Then Verify 'GET IN TOUCH' is visible
    And Enter name, email, subject and message
    And Finally i close the browserrr

@Sanity
    Scenario: Submit contact form with message and file upload
    When Click on 'Contact Us' button
    Then Verify 'GET IN TOUCH' is visible
    And Enter name, email, subject and message
    And Click the 'Submit' button
    And Click OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click 'Home' button and verify that landed to home page successfully
        And Finally i close the browserrr
@Sanity
        Scenario: Verify search functionality for products
    When Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When Enter product name in search input and click search button
    Then Verify 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible

@Sanity
     Scenario: Verify all products and product detail page functionality
    When Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then The products list is visible
    When Click on 'View Product' of first product
    Then User is landed to product detail page
    Then Verify that product detail is visible: product name, category, price, availability, condition, brand
    And Finally i close the browserrr

@Sanity
    Scenario: User should be able to sign up 
    When Click on Signup button
    Then Verify new sign up is visible
    And Enter name and email address
    And Click 'Signup' button
    And Finally i close the browserrr

@Sanity
    Scenario: Add Products to Cart
    When Click the on 'Products' button
    And Hover over first product and click 'Add to cart'
    And Click the 'Continue Shopping' button
    And Hover over second product and click 'Add to cart'
    And Click the 'View Cart' button
    Then Verify both products are added to Cart
    And Verify their prices, quantity and total price
    Then Finally i close the browserrr

@Sanity
    Scenario:Verify Subscription in Cart page
    When Click on the 'Cart' button
    And Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    When Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible
    Then Finally i close the browserrr


    @Smoke
    Scenario Outline: Verify login functionality with valid Credentials
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should logoff
 
Examples:
|username|password|
|standard_user|secret_sauce|
 
@Smoke
Scenario Outline: Verify User is able Select Product
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click the product
 
Examples:
|username|password|
|standard_user|secret_sauce|

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
    

@Smoke
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

  @Regression
  Scenario Outline: Register and delete a user account
    Given I want to launch the browser and navigate to the Automation Exercise website
    Given I verify that the home page is visible successfully
    When I click on the Signup/Login button
    When I verify that the New User Signup option is available
    When I enter the name and email address
    When I click the Signup button
    Then I verify that 'ENTER ACCOUNT INFORMATION' section is displayed
    Then I fill in all the required details
    Then I click the Create Account button
    Then I verify that the account creation confirmation message is displayed
    Then I click the Continue button
    Then I verify that I am logged in as the registered username
    Examples:
      | dummy |
      | test  |

  @Smoke
  Scenario Outline: Register and login to ParaBank
    Given I launch the ParaBank website
    When I register a new user
    When I log in with the registered credentials
    Then I should be successfully logged in
    Examples:
      | dummy |
      | test  |

  @Sanity
  Scenario Outline: SignUp to the website
    Given I launch the website
    Then Click the signup button
    When Fill the signup details
    And handle the alert
    Examples:
      | dummy |
      | test  |

  @Regression
  Scenario Outline: Sign up with existing email
    Given I want to launch the Automation Exercise website
    And I verify I landed on the home page
    And I want to click on signup button
    When I enter the already existing email and name
    And click on signup button
    Then I should see error popup stating Email already exists
    Examples:
      | dummy |
      | test  |

  @Smoke
  Scenario Outline: Testcases page verify
    Given I want to launch the automation website
    And i want to check the home page
    When I click on the testcases page
    And verify if we are on the testcases page
    Then I validate if the testcases are present
    And check more outcomes
    Examples:
      | dummy |
      | test  |

  @Sanity
  Scenario Outline: Logout feature
    Given I want to launch the website
    And verfiy if the home page is visible
    When I click on login button
    And Enter the correct credentials
    And Now I have clicked the log button
    Then I will check if the login is done successfully
    And i will now check if the logout button is available
    And I will click the logout button
    And I will check if the logout is correctly happened
    Examples:
      | dummy |
      | test  |

  @Smoke
  Scenario Outline: LoginWithIncorrectCredentials
    Given I want to launch the Automation Website
    And Verfiy if the home page is available
    When I try to enter incorrect credentials
    And click on login button
    Then Error message should popup
    Examples:
      | dummy |
      | test  |

  @Sanity
  Scenario Outline: To fill up the contact us form in the website
    Given I want to launch the website to check the contact form
    And I want to verify if we are on the home page
    When I click on contact us form
    And Enter the relevant contents
    And click on the submit button
    Then I have to handle the alert
    And check the success message
    Examples:
      | dummy |
      | test  |

  @Sanity @sauce_Login_logout
  Scenario Outline: Verify the Login and Logout Funtionality
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should logoff

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Regression @sauce_Product_Select
  Scenario Outline: Verify User is able Select Product after Login
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should click the product

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Smoke @sauce_Product_selectFilter
  Scenario Outline: Verify User is able Select fitler button
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should click the filter button

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Smoke @sauce_Product_LoginSuccessful
  Scenario Outline: Verify User is able to see success message after login
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should use dynamic path

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Regression @sauce_Product_addAllProducttoCart
  Scenario Outline: Verify User is able to add all product to the cart
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should all Add to Cart

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Sanity @cyclos_login_test
  Scenario Outline: Verify the cyclos site address
    Given User should load the url cyclos
    When User should enter the username and password "<username>" and "<password>"
    And User should navigate to profile
    # Then User should validate the name
    # And User should validate the city
    # And User should validate the state

    Examples:
      |username |password   |
      |Krhithya |Divya@123  |


