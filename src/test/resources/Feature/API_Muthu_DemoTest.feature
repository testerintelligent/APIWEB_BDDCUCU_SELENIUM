@MuthuAPI
Feature: API_Muthu_DemoTest

  Background:
    Given The Base URL is set to "https://jsonplaceholder.typicode.com"

 @Smoke
  Scenario: Create a new user with name and job
    Given I have the username "morpheus" and job "leader"
    When I post a POST request to register the user
    Then I should receive status code as 201
    And the response should contain name "morpheus" and job "leader"

@Sanity
  Scenario: Get single User of ReqRes Api
    Given Give the domain name of reqres
    When send the get request with the single resource url of reqres
    Then validate the response code get of reqres

@Smoke
  Scenario: delete a User of ReqRes Api
    Given Give the domain name of reqres
    When delete user in server of reqres
    Then validate the delete response code of reqres

@Regression
  Scenario: Get user detail
    Given the API's availability check
    When I sends a GET request to "/api/users/2"
    Then the response's status code is 200
    And validate the response should contain user detail

@Smoke
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

@Sanity
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

@Smoke
  Scenario: Update user name successfully
    Given I have the user ID and new user name
    When I send a Patch request to update user details
    Then The response should contain the updated name

@Sanity
  Scenario: Checking All HTTP Methods
    Given Navigate to the URL
    When I check all methods and assestion
    Then I should get all responses
@Smoke	
	Scenario: Retrieve user by ID
    Given I set the GET endpoint for user with ID "2"
    When I send the GET HTTP request
    Then I should receive a 200 status codes
    And I should see user details in the response


  @Regression
  Scenario: Successfully create a user
    Given I set the POST endpoint for creating user
    And I prepare request body with name "morpheus" and job "leader"
    When I send a POST HTTP request
    Then the response status codes should be 201
    And the response should contain the user ID and creation timestamp


@Smoke   
  Scenario: Put request to update user details
    Given the API is up and running
    When I send a PUT request to update the user with ID 2
    Then I should receive a success response

@Sanity
  Scenario: Patch request to partially update user details
    Given the API is up and running
    When I send a PATCH request to update the user with ID 2
    Then I should receive a success response

@Regression
  Scenario: Delete request to remove user
    Given the API is up and running
    When I send a DELETE request to remove the user with ID 2
    Then I should receive a success response
	
  @Smoke
  Scenario: Get user details 
    Given the API is available 
    When I send a GET request to "/api/users/2" 
    Then the response status code should be 200 
    And the response should contain user detail