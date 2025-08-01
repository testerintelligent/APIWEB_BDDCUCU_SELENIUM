Feature: Get training data from local API

  @reactApp
  Scenario: Verify GET /api/trainings returns 200 status
    Given the training API endpoint is "http://localhost:5000"
    When I send a GET request to the training API
    Then the training API should return status code 200
    And the response should contain a list of trainings

    Scenario: Verify POST /api/trainings creates a new training
    Given API endpoint is "http://10.192.190.130:5000"
    When I send a POST request with valid training data for employee "Rajasekar"
    Then code should be 201
    And the response should contain employeeName as "Rajasekar"

    Scenario: Successfully update a training record by ID
    When I send a PUT request to the API with endpoint "http://10.192.190.130:5000/api/trainings/688baa23f91ef3e7e477cc85"
    Then I should receive the response
    And the status code contains "200"

