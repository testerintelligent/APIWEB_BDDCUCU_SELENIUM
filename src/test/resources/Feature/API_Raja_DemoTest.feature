@Smoke
Feature: API_Raja_DemoTest

Background:
Given The Base URI is "https://reqres.in"

@Sanity
Scenario: Fetch Product by ID 
Given The Fake store API is available
When I fetch the Product
Then The response should be 200
And the Product tittle should be "DANVOUY Women's T Shirt Casual Cotton Short"

@Sanity
Scenario: Update the product with put request
When I send a put request to update product 18
Then the status code should be 200
And the response should contain desription "changed string"

@Smoke
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

   @Sanity
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

    @Sanity
Scenario Outline: Get List Users of ReqRes Api
  Given Give the domain name of reqres
  When send the get request with the resource url of reqres
  Then validate the response code of reqres
  Examples:
    | dummy |
    | test  |

@Smoke
Scenario Outline: Get single User of ReqRes Api
  Given Give the domain name of reqres
  When send the get request with the single resource url of reqres
  Then validate the response code get of reqres
  Examples:
    | dummy |
    | test  |

