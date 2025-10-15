@all
@regression
Feature: API_Web_React_CRUD_Scenarios
@demo
Scenario: Get method using react app all training records
Given url and getting all training records
Then verify response code should be 200
Then verify response has list of trainings
Then print first training record

@demo
Scenario: Crud react app training flow
Given url and getting all training records
Then verify response code should be 200
Then verify response has list of trainings
Then print first training record
When I create a new training record
Then the response code should be 201
And I store the training ID from response
When I update the training record using stored ID
Then the response code should be 200
When I delete the training record using stored ID
Then the response code should be 204

@demo
Scenario: Crud flow in Api and UI
Given url and getting all training records
Then verify response code should be 200
Then verify response has list of trainings
Then print first training record

When I create a new training record
Then the response code should be 201
And I store the training ID from response
Then I verify the new training record is visible on the web UI

When I update the training record using stored ID
Then the response code should be 200
Then I verify the updated training record is reflected on the web UI

When I delete the training record using stored ID
Then the response code should be 204
Then I verify the training record is no longer visible on the web UI