Feature: Rajasekar_28APR2025_PatchAPI
  Scenario: Successfully update a user's name and job
    Given the user exists with ID "2"
    When I send a PATCH request to update the user's name to "Morpheus" and job to "Zion Resident"
    Then the response status should be 200
    And the response body should contain the updated name and job