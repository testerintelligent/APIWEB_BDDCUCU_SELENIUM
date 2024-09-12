Feature: Validating the Content in Cyclos Website

 @cyclos_login_test
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
    

  @cyclos_delete_User
  Scenario Outline: Delete the address in cyclos
    Given User should load the url username and password "<username>" and "<password>"
    When User should delete the address
    Then User should validate the status code in reponces

    Examples: 
      | username | password  |
      | Krhithya | Divya@123 |