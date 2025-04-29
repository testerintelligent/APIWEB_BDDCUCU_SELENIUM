Feature: Rajasekar_28APR2025_API_PatchAPI

  Scenario: Update user name successfully
    Given I have the user ID and the new user name
    When I send a Patch request to update the user
    Then the response should contain the updated name