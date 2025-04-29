Feature: Yugi_28APR2025_API_DeleteUserReqres

  Scenario: Delete a user by ID
    Given I have the user ID 2
    When I send a DELETE request to delete the user
    Then I should receive a status code of 204
