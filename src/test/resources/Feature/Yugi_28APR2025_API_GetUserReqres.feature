Feature: Yugi_28APR_API_GetUserReqres

  Scenario: Fetch user details by ID
    Given I have the user ID 2
    When I send a GET request to fetch user
    Then I should receive a status code of 200
    And the response should contain the user with ID 2
