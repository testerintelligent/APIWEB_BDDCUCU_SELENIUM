Feature: Rajasekar_05May_2025_API

Scenario: Fetch Product by ID 
Given The Fake store API is available
When I fetch the Product with ID 20
Then The response should be 200
And the Product tittle should be "DANVOUY Women's T Shirt Casual Cotton Short"

Scenario: Create a new product in fake store
When I send a post request to create a Product
Then Respose code should be 200
And The response should containe the tittle "string"

Scenario: Update the product with put request
When I send a put request to update product 18
Then the status code should be 200
And the response should contain desription "changed string"


Scenario: Delete product with ID 18
When I send a DELETE request for product ID 18
Then the response status should be 200
And the deleted product ID should be 18

