package com.stepdefinit;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import io.cucumber.java.en.*;
import static org.hamcrest.Matchers.*;

public class GetStepsRestAssured {
    Response response;

    @Given("I set the GET endpoint for user with ID {string}")
    public void setGetEndpoint(String id) {
        baseURI = "https://reqres.in"; // your base URL
        basePath = "/api/users/" + id;
    }

    @When("I send the GET HTTP request")
    public void sendGetRequest() {
<<<<<<< HEAD
        response = given().header("x-api-key", "reqres-free-v1").when().get();
=======
        response = given().when().get();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    }

    @Then("I should receive a {int} status codes")
    public void verifyStatusCode(int statusCodes) {
        response.then().statusCode(statusCodes);
    }

    @Then("I should see user details in the response")
    public void verifyUserDetails() {
        response.then().body("data.id", equalTo(2));
    }
}
