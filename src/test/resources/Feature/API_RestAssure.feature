@Smoke1

Feature: API_RestAssure_Funtionality

@Abarna
Scenario: Get List Users of ReqRes Api
Given Give the domain name of reqres
When send the get request with the resource url of reqres
Then validate the response code of reqres


@Abarna
Scenario: Get single User of ReqRes Api
Given Give the domain name of reqres
When send the get request with the single resource url of reqres
Then validate the response code get of reqres


@Abarna
Scenario: Get single user not found of ReqRes Api
Given Give the domain name of reqres
When send get request in server of reqres
Then validate the negative response code of reqres


@Abarna
Scenario: Get delayed response of ReqRes Api
Given Give the domain name of reqres
When Get delayed response in server of reqres
Then validate the response code of reqres

@Abarna
Scenario: delete a User of ReqRes Api
Given Give the domain name of reqres
When delete user in server of reqres
Then validate the delete response code of reqres


@Abarna
Scenario: Update user name successfully
Given I have the user ID and new user name
When I send a Patch request to update user details
Then The response should contain the updated name
 
 
@Abarna
Scenario: verified with valid credentials
Given I set base URI
When I send POST request to /auth with valid credential
Then I should get the 200 OK response
And I should receives a token in response


@Vinay
  Scenario: Create the address in cyclos
    Given User should load the url username
    When User should create the address
    Then User should validate the status codes

  @Vinay
  Scenario Outline: Get the address in cyclos
    Given User should load the url username,password "<username>" and "<password>"
    When User should get the address
    Then User should validate the status code in reponce
    And User should get the name
    And User should get the addressLine1
    And User should get the city
    And User should get the region

    Examples: 
      | username | password  |
      | Krhithya | Divya@123 |


  @Vinay
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



Scenario: Retrieve user by ID
    Given I set the GET endpoint for user with ID "2"
    When I send the GET HTTP request
    Then I should receive a 200 status codes
    And I should see user details in the response


  
  Scenario: Successfully create a user
    Given I set the POST endpoint for creating user
    And I prepare request body with name "morpheus" and job "leader"
    When I send a POST HTTP request
    Then the response status codes should be 201
    And the response should contain the user ID and creation timestamp


   
  Scenario: Put request to update user details
    Given the API is up and running
    When I send a PUT request to update the user with ID 2
    Then I should receive a success response

  Scenario: Patch request to partially update user details
    Given the API is up and running
    When I send a PATCH request to update the user with ID 2
    Then I should receive a success response

  Scenario: Delete request to remove user
    Given the API is up and running
    When I send a DELETE request to remove the user with ID 2
    Then I should receive a success response


Scenario: Get user details 
    Given the API is available 
    When I send a GET request to "/api/users/2" 
    Then the response status code should be 200 
    And the response should contain user detail

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


    Scenario: Get all activities and validate the first one
    Given The API is up and running
    When I send a GET requests to "/api/v1/Activities"
    Then The responses status code should be 200
    And The first activity should have id 1 and title "Activity 1"


    Scenario: Validate GET API using RESTASSURED with path parameter
    Given The API is up
    When I send GET request to "/api/users" with path parameter id as 2
    Then The response status code should will be 200


    Scenario: Validate GET API to fetch user details using path parameter
    Given The User API is available
    When I send GET requests "/api/users" with path parameter 7
    Then The API response status code will be 200
    And The response should contain user data


@Raja
  Scenario: Fetch Product by ID 
Given The Fake store API is available
When I fetch the Product
Then The response should be 200
And the Product tittle should be "DANVOUY Women's T Shirt Casual Cotton Short"

@Raja
Scenario: Create a new product in fake store
When I send a post request to create a Product
Then Respose code should be 200
And The response should containe the tittle "string"

@Raja
Scenario: Update the product with put request
When I send a put request to update product 18
Then the status code should be 200
And the response should contain desription "changed string"

@Raja
Scenario: Delete product with ID 18
When I send a DELETE request for product ID 18
Then the response status should be 200
And the deleted product ID should be 18


 @Raja
Scenario: fetch users from page 1
Given The Base URI is "https://reqres.in"
When I send GET request to "api/users" with query parameter "page=1"
Then The Respose Code Should be 200
And  The ID of the First User Name Should Be 1


   @Raja
    Scenario: Verify token is generated with valid credentials
    Given I set the base URI
    When I send POST request to /auth with valid credentials
    Then I should get 200 OK response
    And I should receive a token in response

   @Raja
    Scenario: Get user details 
    Given check the API is available 
    When I send GET request to "/api/users/2" 
    Then the response of status code should be 200
    And the response should be contain user detail

   @Raja
    Scenario: Update user name successfully
    Given I have the user ID and the new user name
    When I send a Patch request to update the user
    Then the response should contain the updated name

  @Yugi
   Scenario: Create a new user with name and job
    Given I have the user name "morpheus" and job "leader"
    When I send a POST request to create the user
    Then I should receive a status code of 201
    And the response should contain the user with name "morpheus" and job "leader"
    
    @Yugi
    Scenario: Delete a user by ID
    Given I have the user ID 2
    When I send a DELETE request to delete the user
    Then I should receive a status code of 204
    
    @Yugi
    Scenario: Fetch user details by ID
    Given I have the user ID 2
    When I send a GET request to fetch user
    Then I should receive a status code of 200
    And the response should contain the user with ID 2

    @Yugi
    Scenario: Update the job of a user
    Given I have the user ID 2
    And I have the updated name "morpheus" and job "zion resident"
    When I send a PATCH request to update the user
    Then I should receive a status code of 200
    And the response should contain the updated name "morpheus" and job "zion resident"