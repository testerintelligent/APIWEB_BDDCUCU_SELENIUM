Feature: Get training data from local API

  Scenario: Verify GET /api/trainings returns 200 status
    Given the training API endpoint is "http://localhost:5000"
    When I send a GET request to the training API
    Then the training API should return status code 200
    And the response should contain a list of trainings

    Scenario: Verify POST /api/trainings creates a new training
    Given API endpoint is "http://10.192.190.130:5000/api/trainings"
    When I send a POST request with valid training data for employee "Rajasekar"
    Then code should be 201
    And the response should contain employeeName as "Rajasekar"