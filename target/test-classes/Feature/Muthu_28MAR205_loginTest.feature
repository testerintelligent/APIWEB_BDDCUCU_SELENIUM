Feature: Muthu_28MAR205_Web_loginTest
 
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

    
 

    