package com.stepdefinit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class DeleteUser {

    private static final String BASE_URL = "https://reqres.in/api";
    private static String userId;
    private static Response response;

   // @Given("I have the user ID {int}")
   // public void i_have_the_user_id() {
        
   //}

    @When("I send a DELETE request to delete the user")
    public void i_send_a_delete_request_to_delete_the_user(int id, int statusCode) {
    	userId = String.valueOf(id);
        response = given()
                .pathParam("id", userId)
                .when()
                .delete(BASE_URL + "/users/{id}");
        response.then().statusCode(statusCode);
    }

    //@Then("I should receive a status code of {int}")
   // public void i_should_receive_a_status_code_of(int statusCode) {
       
   // }
}
