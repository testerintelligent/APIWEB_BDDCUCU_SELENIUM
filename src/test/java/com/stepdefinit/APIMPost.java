package com.stepdefinit;

import static org.hamcrest.Matchers.equalTo;
import com.common.BaseClass1;
import com.example.resources.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIMPost extends BaseClass1 {

    private String baseUri;
    private Response response;
    private String requestBody;
    private String responseBody;
    private String trainingId;

    @Given("the base URI is {string}")
    public void setBaseUri(String uri) {
        baseUri = uri;
    }

    @When("I send POST request with endpoint {string}")
    public void i_send_post_request_with_endpoint(String endpointA) {
        response = given().log().all().header("Content-Type", "application/json").header("x-api-key", "reqres-free-v1")
                .body("{\r\n" + //
                        "        \"name\": \"AA\",\r\n" + //
                        "        \"job\": \"BBB\"\r\n" + //
                        "      }")
                .when().post(endpointA);

        responseBody = response.then().log().all().assertThat().statusCode(201).extract().asString();
        trainingId = response.jsonPath().getString("id");
        BaseClass1.userID = trainingId;
    }

    // @When("I send a POST request to {string} with body:")
    // public void sendPostRequest(String endpoint, String body) {
    // requestBody = body;
    // response = given()
    // .baseUri(baseUri)
    // .header("Content-Type", "application/json")
    // .body(requestBody)
    // .when()
    // .post(endpoint);
    // }

    // @When("I send a PUT request to {string} with body:")
    // public void sendPutRequest(String endpoint, String body) {
    // requestBody = body;
    // response = given()
    // .baseUri(baseUri)
    // .header("Content-Type", "application/json")
    // .body(requestBody)
    // .when()
    // .put(endpoint);
    // }

    @Then("the response code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        int expected = expectedStatusCode;
        int actual = response.getStatusCode();

        if (expected == actual) {
            System.out.println("Post request is successful in API and new user created");
        } else {
            System.out.println("Error code received!");
        }
    }

    @When("I send PUT request with endpoint {string}")
    public void i_send_put_request_with_endpoint(String endpointB) {
        String randStr = BaseClass.randomString(4);
        response = given().log().all().header("Content-Type", "application/json").header("x-api-key", "reqres-free-v1")
                .body("{\r\n" + //
                        "        \"name\": \"" + randStr + "\",\r\n" + //
                        "        \"job\": \"BBB\"\r\n" + //
                        "      }")
                .when().put(endpointB + BaseClass1.userID);

        responseBody = response.then().log().all().assertThat().statusCode(200).extract().asString();

    }

    @Then("the putResponse status code should be {int}")
    public void the_put_response_status_code_should_be(Integer code) {
        int expected = code;
        int actual = response.getStatusCode();

        if (expected == actual) {
            System.out.println("Put request is successful and user detail updated");
        } else {
            System.out.println("Error code received!");
        }
    }

    // @Then("the response should contain {string} as {string}")
    // public void verifyResponseField(String key, String value) {
    // response.then().body(key, equalTo(value));
    // }

    private String baseUrl;
    private RequestSpecification request;
    private Response postresponse;
    private String userName;
    private String userJob;
    // private int userId;

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