package com.stepdefinit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUserSteps {

    private static final String BASE_URL = "https://reqres.in/api";
    private static String userId;
    private static String userName;
    private static String userJob;
    private static Response response;

    @Given("I have the user ID {int}")
    public void i_have_the_user_id(int id) {
        userId = String.valueOf(id);
    }

    @Given("I have the updated name {string} and job {string}")
    public void i_have_the_updated_name_and_job(String name, String job) {
        userName = name;
        userJob = job;
    }

    @When("I send a PATCH request to update the user")
    public void i_send_a_patch_request_to_update_the_user() {
        String updatedUserData = "{\n" +
                "  \"name\": \"" + userName + "\",\n" +
                "  \"job\": \"" + userJob + "\"\n" +
                "}";

        response = given()
                .header("Content-Type", "application/json")
                .body(updatedUserData)
                .pathParam("id", userId)
                .when()
                .patch(BASE_URL + "/users/{id}");
    }

    //@Then("I should receive a status code of {int}")
   // public void i_should_receive_a_status_code_of() {
        
    //}

    @Then("the response should contain the updated name {string} and job {string}")
    public void the_response_should_contain_the_updated_name_and_job(int statusCode, String name, String job) {
    	response.then().statusCode(statusCode);
        response.then().body("name", equalTo(name));
        response.then().body("job", equalTo(job));
    }
}
