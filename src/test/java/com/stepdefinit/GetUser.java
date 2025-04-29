package com.stepdefinit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetUser {

    private static final String BASE_URL = "https://reqres.in/api";
    private static String userId;
    private static Response response;

   // @Given("I have the user ID {int}")
    //public void i_have_the_user_id() {
        
   // }

    @When("I send a GET request to fetch user")
    public void i_send_a_get_request_to_fetch_user(int id) {
    	userId = String.valueOf(id);
        response = given()
                .pathParam("id", userId)
                .when()
                .get(BASE_URL + "/users/{id}");
    }

   // @Then("I should receive a status code of {int}")
 //   public void i_should_receive_a_status_code_of() {
       
  //  }

    @Then("the response should contain the user with ID {int}")
    public void the_response_should_contain_the_user_with_ID(int statusCode, int id) {
    	 response.then().statusCode(statusCode);
        response.then().body("data.id", equalTo(id));
    }
}
