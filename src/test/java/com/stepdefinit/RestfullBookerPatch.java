package com.stepdefinit;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class RestfullBookerPatch {
    private static Response response;
    

    @Given("the user exists with ID {string}")
public void the_user_exists_with_id(String id) {
   
    
}
@When("I send a PATCH request to update the user's name to {string} and job to {string}")
public void i_send_a_patch_request_to_update_the_user_s_name_to_and_job_to(String name, String job) {
    
    

    response = given()
    .header("Content-Type", "application/json")
    .header("Accept", "application/json")
    .body("{\"name\": \"" + name + "\", \"job\": \"" + job + "\"}")
    .when()
    .patch("https://reqres.in/api/users/");
   
}

@Then("the response status should be {int}")
public void the_response_status_should_be(int statusCode) {
   assertEquals(statusCode, response.getStatusCode());
}

@Then("the response body should contain the updated name and job")
public void the_response_body_should_contain_the_updated_name_and_job() {
        assertTrue(response.getBody().asString().contains("Morpheus"));
        assertTrue(response.getBody().asString().contains("Zion Resident"));
    
}

}
