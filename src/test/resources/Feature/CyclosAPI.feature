Feature: To create the address in cyclos using API
@cyclos
  Scenario Outline: Create the address in cyclos
    Given User should load the url username
    When User should create the address
    Then User should validate the status codes

@cyclos_01
  Scenario Outline: Get the address in cyclos
    Given User should load the url username,password "<username>" and "<password>"
    When User should get the address
    Then User should validate the status code in reponce
    And User should get the name
    And User should get the addressLine1
    And User should get the city
    And User should get the region

    Examples: 
      | username | password  |
      | Krhithya | Divya@123 |
      
        Scenario Outline: Verify the cyclos site address
    Given User should load the url cyclos
    When User should enter the username and password "<username>" and "<password>"
    And User should navigate to profile
    Then User should validate the name
    And User should validate the city
    And User should validate the state
    Examples:
    |username|password|
    |Krhithya|Divya@123|

