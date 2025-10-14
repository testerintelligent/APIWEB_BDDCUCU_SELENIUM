@Felix
Feature: API_jsonplaceholder_DemoTest

  Background:
    Given Base URL is set to "https://jsonplaceholder.typicode.com"



  Scenario: Add numbers
    When I add 2 and 3
    Then the result should be 5

 @Smoke
  Scenario: Create a new user with name and job
    Given I have the user name "Guru" and job "leader"
    When I send a POST request to create the user
    Then I should receive a status code of 201
    And the response should contain the user with name "Guru" and job "leader"
@Smoke
  Scenario: Delete a user by ID
    When I send a DELETE request to delete the user
    Then I should receive a status code of 200
    
@Regression
  Scenario: Fetch user details by ID
    Given I have the user ID 2
    When I send a GET request to fetch user
    Then I should receive a status code of 200
    And the response should contain the user with ID 2
@Regression
  Scenario: Update the job of a user
    Given I have the user ID 2
    And I have the updated name "morpheus" and job "zion resident"
    When I send a PATCH request to update the user
    Then I should receive a status code of 200
    And the response should contain the updated name "morpheus" and job "zion resident"
@Sanity
  Scenario: Retrieve all posts
    When I send a GET request to fetch users "/posts"
    Then I should receive a status code of 200
    And the response should contain more than 50 posts
@Sanity
  Scenario: Retrieve a specific post by ID
    When I send a GET request to fetch users "/posts/10"
    Then I should receive a status code of 200
    And the title of the post should be "optio molestias id quia eum"
@Smoke
  Scenario: Create a new post
    When I send an POST request to "/posts" with body:
    """
    {
      "title": "Automation in API",
      "body": "REST Assured with Cucumber",
      "userId": 99
    }
    """
    Then I should receive a status code of 201
    And the response body should contain userId 99
@Regression
  Scenario: Update the title of an existing post
    When I send a PATCH request to "/posts/5" with body:
    """
    {
      "title": "Patched title for testing"
    }
    """
    Then I should receive a status code of 200
    And the response body should contain the title "Patched title for testing"
@Sanity
  Scenario: Delete a post by ID
    When I send a DELETE request to "/posts/10"
    Then I should receive a status code of 200

    
@Smoke
  Scenario: Create the address in cyclos
    Given User should load the url username
    When User should create the address
    Then User should validate the status codes

  @Regression
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


  @Sanity
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

     @Regression
  Scenario Outline: Delete the address in cyclos
    Given User should load the url username and password "<username>" and "<password>"
    When User should delete the address
    Then User should validate the status code in reponces

    Examples: 
      | username | password  |
      | Krhithya | Divya@123 |



