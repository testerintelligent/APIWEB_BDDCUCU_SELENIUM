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
	protected String trainingId;

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
    public void i_send_a_post_request_with_valid_training_data(String employeeName) {
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

        System.out.println("Response: " + response.prettyPrint());
    }

    @Then("code should be {int}")
    public void code_should_be(Integer expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @Then("the response should contain employeeName as {string}")
    public void the_response_should_contain_employeeName_as(String expectedName) {
        response.then().body("employeeName", equalTo(expectedName));
    }

    @When("I send a PUT request to the API with endpoint {string}")
public void i_send_a_put_request_to_the_api_with_endpoint(String endpointB) {

    response = given().log().all()
            .header("Content-Type", "application/json")
            .body("{\n" +
                    "  \"_id\": \"688baa23f91ef3e7e477cc85\",\n" +
                    "  \"employeeName\": \"Rajasekar.I\",\n" +
                    "  \"course\": \"Java\",\n" +
                    "  \"startDate\": \"2025-07-24T00:00:00.000Z\",\n" +
                    "  \"endDate\": \"2025-07-24T00:00:00.000Z\",\n" +
                    "  \"status\": \"Completed\",\n" +
                    "  \"trainerName\": \"string\",\n" +
                    "  \"trainingType\": \"Udemy\",\n" +
                    "  \"percentCompleted\": 100,\n" +
                    "  \"projectName\": \"ABC\",\n" +
                    "  \"__v\": 0\n" +
                    "}")
            .when()
            .put(endpointB)
            .then().log().all()
            .extract().response();
}

@Then("I should receive the response")
public void i_should_receive_the_response3() {
    System.out.println("Response Body:\n" + response.asString());
}

@Then("the status code contains {string}")
public void the_status_code_contains(String code3) {
    String responseBody = response.asString();
    boolean contains = responseBody.contains(code3);
    if (contains) {
        System.out.println("✅ Response body contains: " + code3);
    } else {
        System.out.println("❌ Response does not contain expected code.");
    }

    


    }

}



