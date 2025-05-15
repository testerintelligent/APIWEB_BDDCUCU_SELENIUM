package com.stepdefinit;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APIMPost {

    private String baseUri;
    private Response response;
    private String requestBody;

    @Given("the base URI is {string}")
    public void setBaseUri(String uri) {
        baseUri = uri;
    }

    @When("I send a POST request to {string} with body:")
    public void sendPostRequest(String endpoint, String body) {
        requestBody = body;
        response = given()
                        .baseUri(baseUri)
                        .header("Content-Type", "application/json")
                        .body(requestBody)
                   .when()
                        .post(endpoint);
    }

    // @When("I send a PUT request to {string} with body:")
    // public void sendPutRequest(String endpoint, String body) {
    //     requestBody = body;
    //     response = given()
    //                     .baseUri(baseUri)
    //                     .header("Content-Type", "application/json")
    //                     .body(requestBody)
    //                .when()
    //                     .put(endpoint);
    // }

    @Then("the response code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    // @Then("the response should contain {string} as {string}")
    // public void verifyResponseField(String key, String value) {
    //     response.then().body(key, equalTo(value));
    // }
    
    private String baseUrl;
    private RequestSpecification request;
    private Response postresponse;
    private String userName;
    private String userJob;
    //private int userId;

    @Given("The Base URL is set to {string}")
    public void base_url_is_set_to(String url) {
        baseUrl = url;
        request = given().baseUri(baseUrl).header("Content-Type", "application/json");
    }

    @Given("I have the username {string} and job {string}")
    public void i_have_the_username_and_job(String name, String job) {
        userName = name;
        userJob = job;
    }

    @When("I post a POST request to register the user")
    public void i_post_a_post_request_to_register_the_user() {
        String payload = "{ \"name\": \"" + userName + "\", \"job\": \"" + userJob + "\" }";
        postresponse = request.body(payload).post("/users");
    }

    @Then("I should receive status code as {int}")
    public void i_should_receive_status_code_as(Integer expectedStatus) {
        postresponse.then().statusCode(expectedStatus);
    }

    @Then("the response should contain name {string} and job {string}")
    public void the_response_should_contain_name_and_job(String name, String job) {
        postresponse.then().body("name", equalTo(name)).body("job", equalTo(job));
    }
}