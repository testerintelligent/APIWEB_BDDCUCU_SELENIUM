@Smoke1

Feature: API_Raja_DemoTest
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
