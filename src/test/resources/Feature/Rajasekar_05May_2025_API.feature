Feature: Rajasekar_05May_2025_API

Scenario: Fetch Product by ID 
Given The Fake store API is available
When I fetch the Product with ID 20
Then The response should be 200
And the Product tittle should be "DANVOUY Women's T Shirt Casual Cotton Short"

