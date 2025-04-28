Feature: Yugi_28APR2025_API_CreateUSerReqres

  Scenario: Create a new user with name and job
    Given I have the user name "morpheus" and job "leader"
    When I send a POST request to create the user
    Then I should receive a status code of 201
    And the response should contain the user with name "morpheus" and job "leader"
