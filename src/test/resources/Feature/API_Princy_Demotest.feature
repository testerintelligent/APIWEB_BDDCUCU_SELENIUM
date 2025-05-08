@PrincyAll

<<<<<<< HEAD
Feature: API_Princy_DemoTest
=======
Feature: Princy_API_Testcases

>>>>>>> b70a329 (changes)

  Scenario: Get all activities and validate the first one
    Given The API is up and running
    When I send a GET requests to "/api/v1/Activities"
    Then The responses status code should be 200
    And The first activity should have id 1 and title "Activity 1"

    Scenario: Validate GET api using RESTASSURED
    Given The API is running
    When I send GET request with end ponit "api/users?page=2"
    Then The response status code should be 200

    Scenario: Validate POST API using RESTASSURED
    Given The API is working
    When I send POST request to endpoint "api/users" with body
      """
      {
        "name": "morpheus",
        "job": "leader"
      }
      """
    Then The response code should be 201

     Scenario: Validate PUT API using RESTASSURED
    Given The API is works
    When I send PUT request to endpoint "api/users/2" with body
      """
      {
        "name": "morpheus",
        "job": "zion resident"
      }
      """
    Then The response with status code should be 200 seen

    Scenario: Validate GET API using RESTASSURED with path parameter
    Given The API is up
    When I send GET request to "/api/users" with path parameter id as 2
    Then The response status code should will be 200


Scenario: Validate GET API to fetch user details using path parameter
    Given The User API is available
    When I send GET requests "/api/users" with path parameter 7
    Then The API response status code will be 200
    And The response should contain user data


