@MuthuAPI
Feature: API_Muthu_DemoTest

  Background:
    Given Base URL is set to "https://jsonplaceholder.typicode.com"

 
  Scenario: Create a new user with name and job
    Given I have the username "morpheus" and job "leader"
    When I send a POST request to create the user
    Then I should receive a status code of 201
    And the response should contain the user with name "morpheus" and job "leader"

  Scenario: Get single User of ReqRes Api
    Given Give the domain name of reqres
    When send the get request with the single resource url of reqres
    Then validate the response code get of reqres

  Scenario: delete a User of ReqRes Api
    Given Give the domain name of reqres
    When delete user in server of reqres
    Then validate the delete response code of reqres

  Scenario: Get user detail
    Given the API's availability check
    When I sends a GET request to "/api/users/2"
    Then the response's status code is 200
    And validate the response should contain user detail

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

  Scenario: Update a user using PUT
    Given the base URI is "https://reqres.in"
    When I send a PUT request to "/api/users/2" with body:
      """
      {
        "name": "CCCCC",
        "job": "DDDDD"
      }
      """
    Then the response status code should be 200
    And the response should contain "job" as "CCCCC"

  Scenario: Update user name successfully
    Given I have the user ID and new user name
    When I send a Patch request to update user details
    Then The response should contain the updated name
