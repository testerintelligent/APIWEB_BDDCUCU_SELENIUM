package com.stepdefinit;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class ReactAppSteps {

    private String endpoint;
    private Response response;

    @Given("the training API endpoint is {string}")
    public void the_training_api_endpoint_is(String endpoint) {
        this.endpoint = endpoint;
    }

    @When("I send a GET request to the training API")
    public void i_send_a_get_request_to_the_training_api() {
        response = given()
                      .when()
                      .get("http://10.192.190.130:5000/api/trainings")
                      .then()
                      .extract()
                      .response();

        System.out.println("API Response:\n" + response.prettyPrint());
    }

    @Then("the training API should return status code {int}")
    public void the_training_api_should_return_status_code(Integer expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @Then("the response should contain a list of trainings")
    public void the_response_should_contain_a_list_of_trainings() {
        response.then().body("$", is(not(empty())));
    }

    @Given("the API endpoint is {string}")
    public void the_api_endpoint_is(String endpoint) {
        this.endpoint = endpoint;
    }

    @Given("API endpoint is {string}")
    public void api_endpoint_is(String endpoint) {
        this.endpoint = endpoint;
    }

    @When("I send a POST request with valid training data for employee {string}")
    public void i_send_a_post_request_with_valid_training_data_for_employee(String employeeName) {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("employeeName", employeeName);
        requestBody.put("course", "Java");
        requestBody.put("startDate", "2025-07-24");
        requestBody.put("endDate", "2025-07-24");
        requestBody.put("status", "Completed");
        requestBody.put("trainerName", "string");
        requestBody.put("trainingType", "Udemy");
        requestBody.put("percentCompleted", 100);
        requestBody.put("projectName", "ABC");

        response = given()
                      .header("Content-Type", "application/json")
                      .body(requestBody)
                   .when()
                      .post(endpoint + "/api/trainings")
                   .then()
                      .extract()
                      .response();

        System.out.println("POST Response:\n" + response.prettyPrint());
    }

    @Then("code should be {int}")
    public void code_should_be(Integer expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @Then("the response should contain employeeName as {string}")
    public void the_response_should_contain_employeeName_as(String expectedName) {
        response.then().body("employeeName", equalTo(expectedName));
    }
    
}



