package com.stepdefinit;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.Matchers.equalTo;

import com.google.gson.JsonObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRestFullbooker {

    private Response response;
    RequestSpecification request;
    // Response response;
    // private RequestSpecification request;
    // private Response response;
    private String baseUrl = "https://reqres.in/api/users"; // Example API
    private int userId = 2;
    private String newName = "Rajasekar Updated";

@Given("check the API is available")
public void check_the_api_is_available() {
    baseURI = "https://reqres.in";
  
}

@When("I send GET request to {string}")
public void i_send_get_request_to(String enpoint) {
    response = given().when().get(enpoint);
    
}

@Then("the response of status code should be {int}")
public void the_response_of_status_code_should_be(Integer int2) {
    response.then().statusCode(int2);
    
}

@Then("the response should be contain user detail")
public void the_response_should_be_contain_user_detail() {
    response.prettyPrint();
    RestAssured.baseURI = "https://restful-booker.herokuapp.com";

}

//@Given("I set the base URI")
  //  public void i_set_base_uri() {
        
  //  }

//     @When("I send POST request to \\/auth with valid credentials")
//     public void i_send_post_request_to_auth() {
//         JsonObject payload = new JsonObject();
//         payload.addProperty("username", "admin");
//         payload.addProperty("password", "password123");

//         request = given()
//                     .header("Content-Type", "application/json")
//                     .body(payload.toString());

//         response = request.post("/auth");
//         response.then().log().all();
//     }

//     @Then("I should get 200 OK response")
//     public void i_should_get_200_ok_response() {
//         assertEquals(200, response.getStatusCode());
//     }

//     @And("I should receive a token in response")
//     public void i_should_receive_token() {
//         String token = response.jsonPath().getString("token");
//         assertNotNull("Token should not be null", token);
//         System.out.println("Generated Token: " + token);
//     }

//     @Given("I have the user ID and the new user name")
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
