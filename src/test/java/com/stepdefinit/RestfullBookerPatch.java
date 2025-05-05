package com.stepdefinit;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.equalTo;

public class RestfullBookerPatch {
//     private RequestSpecification request;
//     private Response response;
//     private String baseUrl = "https://reqres.in/api/users"; // Example API
//     private int userId = 2;
//     private String newName = "Rajasekar Updated";


// @Given("I have the user ID and the new user name")
// public void i_have_the_user_id_and_the_new_user_name() {
//     request = given()
//                     .header("Content-Type", "application/json")
//                     .header("x-api-key", "reqres-free-v1")
//                     .body("{\"name\": \"" + newName + "\"}");

    
// }

// @When("I send a Patch request to update the user")
// public void i_send_a_patch_request_to_update_the_user() {

//     response = request.patch(baseUrl + "/" + userId);
   
// }

// @Then("the response should contain the updated name")
// public void the_response_should_contain_the_updated_name() {
//     response.then().statusCode(200)
//     .body("name", equalTo(newName));
    
// }

 

}
