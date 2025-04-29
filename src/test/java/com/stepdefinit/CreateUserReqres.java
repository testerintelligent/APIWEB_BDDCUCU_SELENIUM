package com.stepdefinit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CreateUserReqres {

    private static final String BASE_URL = "https://reqres.in/api";
    private static String userName;
    private static String userJob;
    private static Response response;

    @Given("I have the user name {string} and job {string}")
    public void i_have_the_user_name_and_job(String name, String job) {
        userName = name;
        userJob = job;
    }

    @When("I send a POST request to create the user")
    public void i_send_a_post_request_to_create_the_user() {
        String newUserData = "{\n" +
                "  \"name\": \"" + userName + "\",\n" +
                "  \"job\": \"" + userJob + "\"\n" +
                "}";

        response = given()
                .header("Content-Type", "application/json")
                .body(newUserData)
                .when()
                .post(BASE_URL + "/users");
    }

    @Then("I should receive a status code of {int}")
    public void i_should_receive_a_status_code_of(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the response should contain the user with name {string} and job {string}")
    public void the_response_should_contain_the_user_with_name_and_job(String name, String job) {
        response.then().body("name", equalTo(name));
        response.then().body("job", equalTo(job));
    }
}
