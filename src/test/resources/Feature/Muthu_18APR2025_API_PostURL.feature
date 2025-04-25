@MuthuAPI
Feature: Muthu_17APR2025_API_PostURL

  Scenario: Create a new user using POST
    Given the base URI is "https://reqres.in"
    When I send a POST request to "/api/users" with body:
      """
      {
        "name1": "AAAAA",
        "job1": "BBBBBB"
      }
      """
    Then the response code should be 201
    