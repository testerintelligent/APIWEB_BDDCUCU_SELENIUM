Feature: API_Yugi_DemoTest

  Background:
    Given Base URL is set to "https://jsonplaceholder.typicode.com"

 @Smoke
  Scenario: Create a new user with name and job
    Given I have the user name "morpheus" and job "leader"
    When I send a POST request to create the user
    Then I should receive a status code of 201
    And the response should contain the user with name "morpheus" and job "leader"
@Smoke
  Scenario: Delete a user by ID
    Given I have the user ID 2
    When I send a DELETE request to delete the user
    Then I should receive a status code of 204
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
    When I send a GET request to "/posts"
    Then I should receive a status code of 200
    And the response should contain more than 50 posts
@Sanity
  Scenario: Retrieve a specific post by ID
    When I send an GET request to "/posts/10"
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
