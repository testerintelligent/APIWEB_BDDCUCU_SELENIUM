package com.stepdefinit;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

public class RestfullBookerPatch {
    private Response response;
    private String userId;
    private String updatedName;


@Given("I have the user ID and the new user name")
public void i_have_the_user_id_and_the_new_user_name() {
    userId = "2"; // Example user ID
    updatedName = "John Updated";
    
}

@When("I send a Patch request to update the user")
public void i_send_a_patch_request_to_update_the_user() {

    String requestBody = "{ \"name\": \"" + updatedName + "\" }";

        response = given()
                        .baseUri("https://reqres.in")
                        .basePath("/api/users/" + userId)
                        .header("Content-Type", "application/json")
                        .body(requestBody)
                   .when()
                        .patch()
                   .then()
                        .extract()
                        .response();
   
}

// @Then("the response status code should be {int}")
// public void the_response_status_code_should_be(Integer int1) {

//     response.then().statusCode(200);

   
// }
@Then("the response should contain the updated name")
public void the_response_should_contain_the_updated_name() {

    response.then().body("name", equalTo(updatedName));
    
}

 

}
