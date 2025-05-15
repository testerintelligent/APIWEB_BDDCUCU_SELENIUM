
@Muthu
Feature: WEB_Muthu_DemoTest
 
  Scenario: Test the Navvigation and Back operations in Academic Domain
    Given I enter into the Academy Domain
    When I click the OpenWindow Element    
    And I navigated to another site
    Then again Back to the Main URL
 
 
  Scenario: Test the Navvigation and Back operations in Academic Domain
    Given I enter into the Academy Domain
    When I click the OpenWindow Element    
    And I navigated to another site
    Then again Back to the Main URL
 
 
    Scenario: Test the automation operations in RahulShettyAcademy
    Given I enter into the Academy Domain of Rahul
    When I click the OpenWindow button
    Then I navigated to that window
 
Scenario: Test the banking operations in customer Registration
    Given I enter the url of Registration of domain
    When I enter the customer Registration Details
    Then I can able to Register successfully
 
Scenario: Test the banking operations in customer CompDBlogin
    Given I enter the url of domain CompDB1login
    When I enter customer credentials of CompDB1login
    Then I can login domain of CompDB1login successfully
 
Scenario: Test the functionality of Search ComputerDatabase
    Given I enter the url for search the Computer Database
    When I enter the ComputerDB name one by one
    Then I can able to Search ComputerDb
 
Scenario: Test the cancel of ComputerDatabase
    Given I enter the cancel url of ComputerDatabase
    When I enter the ComputerDatabase Info
    Then I can able to cancel ComputerDatabase
 
 Scenario: Test the banking operations in customer CompDBlogin
    Given I enter the url of domain CompDBlogin
    When I enter customer credentials of CompDBlogin
    Then I can login domain of CompDBlogin successfully
 
    Scenario: Test the banking operations in customer Registration
    Given I enter the url of Registraion domain
    When I enter customer Registration Details
    Then I can able to Registration successfully
 
Scenario: Test the banking operations in customer CompDBlogin
    Given I enter the url of domain CompDBlogin
    When I enter customer credentials of CompDBlogin
    Then I can login domain of CompDBlogin successfully
 
Scenario: Test the Search  ComputerDatabase
    Given I enter the url for search the Computer Database
    When I enter the ComputerDB name one by one
    Then I can able to Search ComputerDb
 
Scenario: Test the cancel of ComputerDatabase
    Given I enter the cancel url of ComputerDatabase
    When I enter the ComputerDatabase Info
    Then I can able to cancel ComputerDatabase
 
 
    Scenario: Test the banking operations in customer login
    Given I enter the url of domain
    When I enter customer credentials
    Then I can login domain successfully
 
  Scenario: Test the banking operations for Community Poll
   Given I logged into the application
    When I have choosen the option for community poll
    Then I can submit the vote button
 
     Scenario: Test the banking operations for Add Cart
   Given Product should be visible to choose
    When I have choosen the option to add cart
    Then I can press the add cart button
 
Scenario: To view all the front end back end apps
    Given The app url should be loaded properly
    When I navigated the hover
    Then I can able to see all the apps
 

 
  Scenario Outline: Login with valid credentials
  Given I navigate to the login page
    When I enter username "<Username>" and password "<Password>"
    And I click the login button
    Then I can able to login
 
    Examples:
      | Username   | Password   |
      | muthu123   | muthu123   |
      | muthu456   | muthu456   |
 
 
      Scenario: Choosing and adding the item into the cart
    Given Should be logged in into the system
    When I select the item from list
    And I have to add to the cart
    And I have to pay the amount for the item
    Then I can able to buy the product
   
 Scenario: Test the banking operations for Dropdown Notebook
   Given Notebook elements should be loaded properly
    When I have to select the Sort by dropdown
    And I have to select the Display
    And I have to select the view as
    Then I can able to select the dropdown menu
 
    Scenario: Test the banking operations for Hover the menu
   Given Menu items should be loaded properly
    When I have to hover the menu
    Then I can able to select the submenu
 
 
    Scenario: Choosing and adding the item into the cart
    Given The url should be loaded properly
    When I enter the book name in the search box
    Then I can able to see the book
 
   
 