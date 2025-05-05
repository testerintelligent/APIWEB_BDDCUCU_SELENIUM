
@Sanity
Feature: Abarna_5May_2025_API_Functionality

  Scenario: Update user name successfully
    Given I have the user ID and new user name
    When I send a Patch request to update user details
    Then The response should contain the updated name
 
 
 Scenario: verified with valid credentials
    Given I set base URI
    When I send POST request to /auth with valid credential
    Then I should get the 200 OK response
    And I should receives a token in response