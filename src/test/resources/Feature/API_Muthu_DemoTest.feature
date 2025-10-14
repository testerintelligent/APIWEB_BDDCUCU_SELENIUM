
@checks
Feature: API_reqres_DemoTest

Background:
Given The Base URI is "https://reqres.in"
And The Base URL is set to "https://jsonplaceholder.typicode.com"

 @Smoke @SmokeTest
  Scenario: Create a new user with name and job
    Given I have the username "morpheus" and job "leader"
    When I post a POST request to register the user
    Then I should receive status code as 201
    And the response should contain name "morpheus" and job "leader"

@SmokingTest
  Scenario: Get single User of ReqRes Api
    Given Give the domain name of reqres
    When send the get request with the single resource url of reqres
    Then validate the response code get of reqres

@Smoke @SmokeTest
  Scenario: delete a User of ReqRes Api
    Given Give the domain name of reqres
    When delete user in server of reqres
    Then validate the delete response code of reqres

@Sanitingtest 
  Scenario: Get user detail
    Given the API's availability check
    When I sends a GET request to "/api/users/2"
    Then the response's status code is 200
    And validate the response should contain user detail

@Sanity  
  Scenario: Create a new user using POST
    Given the base URI is "https://reqres.in"
    When I send POST request with endpoint "/api/users" 
    Then the response code should be 201


@Sanity 
  Scenario: Update a user using PUT
    Given the base URI is "https://reqres.in"
    When I send PUT request with endpoint "/api/users/" 
    Then the putResponse status code should be 200


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

@Smoke @SmokeTest_N
Scenario Outline: Verify the cyclos site address
    Given User should load the url cyclos
    When User should enter the username and password "<username>" and "<password>"
    And User should navigate to profile
    # Then User should validate the name
    # And User should validate the city
    # And User should validate the state

    Examples:
    |username|password|
    |Krhithya|Divya@123|

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
    Then I should receive a success delete response
	
@Sanitingtest
  Scenario: Get user details 
    Given the API is available 
    When I send a GET request to "/api/users/2" 
    Then the response status code should be 200 
    And the response should contain user detail

@Sanitingtest
Scenario: Get List Users of ReqRes Api
Given Give the domain name of reqres
When send the get request with the resource url of reqres
Then validate the response code of reqres


@SmokingTest 
Scenario: Get single User of ReqRes Api
Given Give the domain name of reqres
When send the get request with the single resource url of reqres
Then validate the response code get of reqres


@Smoke 
Scenario: Get single user not found of ReqRes Api
Given Give the domain name of reqres
When send get request in server of reqres
Then validate the negative response code of reqres


@Smoke 
Scenario: Get delayed response of ReqRes Api
Given Give the domain name of reqres
When Get delayed response in server of reqres
Then validate the response code of reqres

@Smoke 
Scenario: delete a User of ReqRes Api
Given Give the domain name of reqres
When delete user in server of reqres
Then validate the delete response code of reqres

@Smoke 
Scenario: Update user name successfully
Given I have the user ID and new user name
When I send a Patch request to update user details
Then The response should contain the updated name 
 
@Smoke 
Scenario: verified with valid credentials
Given I set base URI
When I send POST request to /auth with valid credential
Then I should get the 200 OK response
And I should receives a token in response

@Sanity 
Scenario: Fetch Product by ID 
Given The Fake store API is available
When I fetch the Product
Then The response should be 200
And the Product tittle should be "DANVOUY Women's T Shirt Casual Cotton Short"

@Sanity @SmokeTest_N
Scenario: Update the product with put request
When I send a put request to update product 18
Then the status code should be 200
And the response should contain desription "changed string"

@Smoke @SmokeTest_N
Scenario: Delete product with ID 18
When I send a DELETE request for product ID 18
Then the response status should be 200
And the deleted product ID should be 18



@Sanity
Scenario: fetch users from page 1

When I send GET request to "api/users" with query parameter "page=1"
Then The Respose Code Should be 200
And  The ID of the First User Name Should Be 1


@Sanity
    Scenario: Verify token is generated with valid credentials
    Given I set the base URI
    When I send POST request to /auth with valid credentials
    Then I should get 200 OK response
    And I should receive a token in response

@Sanitingtest
    Scenario: Get user details 
    Given check the API is available 
    When I send GET request to "/api/users/2" 
    Then the response of status code should be 200
    And the response should be contain user detail

@Smoke
    Scenario: Update user name successfully
    Given I have the user ID and the new user name
    When I send a Patch request to update the user
    Then the response should contain the updated name

@Smoke
    Scenario: Validate GET API using RESTASSURED with path parameter
    Given The API is up
    When I send GET request to "/api/users" with path parameter id as 2
    Then The response status code should will be 200

@Smoke
  Scenario Outline: Verify the cyclos site address
    Given User should load the url cyclos
    When User should enter the username and password "<username>" and "<password>"
    And User should navigate to profile
    # Then User should validate the name
    # And User should validate the city
    # And User should validate the state

    Examples:
    |username|password|
    |demo|1234|

@Sanitingtest
Scenario Outline: Get List Users of ReqRes Api
  Given Give the domain name of reqres
  When send the get request with the resource url of reqres
  Then validate the response code of reqres
  Examples:
    | dummy |
    | test  |

@@SmokingTest
Scenario Outline: Get single User of ReqRes Api
  Given Give the domain name of reqres
  When send the get request with the single resource url of reqres
  Then validate the response code get of reqres
  Examples:
    | dummy |
    | test  |

