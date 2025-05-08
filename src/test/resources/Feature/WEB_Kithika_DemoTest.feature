Feature: WEB_Kithika_DemoTest

  Scenario: Handle confirmation popup
  Given I enter the URL of the practice page for alert
    When I enter "Krithika" in the text
    And I click on the confirm button
    Then I handle the confirmation popup
	
  Scenario: Test the window button operations in practice page
    Given I enter the url of practice page
    When I click  open window button popup
    Then I can see open window page successfully

  Scenario: Krithika_04APR_2025_Tabpopup
    Given I enter the URL of the practice page
    When I click the open tab button
    Then I should see the new tab opened successfully
	
  Scenario: Handle Alert popup
    Given I enter the URL of the practice page for confirmation
    When I enter "Krishna" in the textbox
    And I click on the alert button
    Then I handle the alert popup
	
  Scenario: User votes in the community poll
    Given I logged into the applications
    When I have chosen the option for community polls
    Then I can submit the voting buttons
	
  Scenario: Drag box A and drop onto box B
    Given I am on the Drag and Drop page
    When I drag element "A" and drop it onto element "B"
    Then element "A" should be in position of "B"
  
  Scenario: Drag box B and drop onto box A
    Given I am on the Drag and Drop page
    When I drag element "B" and drop it onto element "A"
    Then element "B" should be in position of "A"
	
  Scenario: Verify slider updates the displayed value correctly
    Given I open the slider webpage
    When I move the slider to "0.5"
    Then I should see the displayed value as "0.5"
    When I move the slider to "2.5"
    Then I should see the displayed value as "2.5"
    When I move the slider to "5"
    Then I should see the displayed value as "5"
	
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
	  
	 
	
  Scenario: Test the filter  operations in automation bookstore
    Given I enter the url of bookstore
    When I search books
    Then I can retrive books successfully
	
 Scenario: Successfully book a room
    Given Open the booking application
    When select the room
    And select the date
    And Enter the details
    Then Book the ticket
    And Confirm the booking
	
 
 Scenario Outline: Verify text box functionality
   Given I navigate to the website
   When I enter "<name>" in the name text box  
   And I enter "<email>" in the email text box
   Then The text boxes should contain the entered values "<name>" and "<email>"

  Examples:
      | name      | email                 |
      | John Doe  | john.doe@example.com  |
      | Alice Ray | alice.ray@gmail.com   |


Scenario Outline: Select a checkbox
   When I select the "<checkboxName>" checkbox

Examples:
   | checkboxName |
   | Home        |
   


Scenario Outline: Verify radio button selection
    When I select the "<radioButtonLabel>" radio button
    Then The "<radioButtonLabel>" radio button should be selected

Examples:
      | radioButtonLabel |
      | Yes             |
      | Impressive      |
	  
	Scenario: Test the banking operations in customers login
    Given I enter the url of domains
    When I enter customers credentials
    Then I can login domains successfully
	
	Scenario: Test the login operations in customer login
    Given I enter the shops login url of domain
    When I enter customer login credential
    Then I can login shops successfully
	
	Scenario: Test the login operations in customer login
    Given I enter the shop login url of domain
    When I enter customer login credentials
    Then I can login shop successfully
	
	Scenario: Test the banking operations in customer login
    Given I enter the url of banking domains
    When I enter customer banking credentials
    Then I can login banking domain successfully
	
	Scenario: Test the web shop operations in customer login
    Given I enter the registration url of domain
    When I enter new customer credentials
    Then I can register domain successfully
	
	Scenario: Adding an item to the cart
    Given I navigate to the shopping page
    When I select a product
    And I choose the size, color, and quantity
    And I add the product to the cart
    Then I should be redirected to the shopping cart page
	
	Scenario: Verify the context menu alert
    Given I open the context menu webpage
    When I right-click on the context menu box
    Then I should see an alert with text "You selected a context menu"
    And I accept the alert
    And I close the browser