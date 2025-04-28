Feature: Yugi_28APR2025_API_UserReqres

  Scenario: Update the job of a user
    Given I have the user ID 2
    And I have the updated name "morpheus" and job "zion resident"
    When I send a PATCH request to update the user
    Then I should receive a status code of 200
    And the response should contain the updated name "morpheus" and job "zion resident"
