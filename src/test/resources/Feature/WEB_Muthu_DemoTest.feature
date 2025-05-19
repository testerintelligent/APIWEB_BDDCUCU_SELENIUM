
@Muthu
Feature: WEB_Muthu_DemoTest
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
 

 @Smoke
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
 