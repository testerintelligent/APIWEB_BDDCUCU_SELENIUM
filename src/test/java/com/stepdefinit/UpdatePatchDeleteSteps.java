package com.stepdefinit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;

import io.restassured.response.Response;

public class UpdatePatchDeleteSteps {

    private String response;

    Response resp;

    @Given("the API is up and running")
    public void theApiIsUpAndRunning() {
        System.out.println("The Api is up and running.");
    }

    @When("I send a PUT request to update the user with ID 2")
    public void iSendAPutRequestToUpdateTheUserWithId() {
        response = given()
                .body("{ \"name\": \"Updated Name\" }")
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .when()
                .put("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .extract().asString();
    }

    @When("I send a PATCH request to update the user with ID 2")
    public void iSendAPatchRequestToUpdateTheUserWithId() {
        response = given()
                .body("{ \"name\": \"Patched Name\" }")
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .when()
                .patch("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .extract().asString();
    }

    // @When("I send a DELETE request to remove the user with ID 2")
    // public void iSendADeleteRequestToRemoveTheUserWithId() {
    // response = given()
    // .header("Content-Type", "application/json")
    // .header("x-api-key", "reqres-free-v1")
    // .when()
    // .delete("https://reqres.in/api/users/2")
    // .then().assertThat().statusCode(204)

    // .extract().asString();
    // }

    @Then("I should receive a success response")
    public void iShouldReceiveASuccessResponse() {
        if (response == null || response.isEmpty()) {
            // For DELETE request, check the status code 204 (No Content)
            assertEquals(204, given()
                    .when()
                    .delete("https://reqres.in/api/users/2")
                    .then()
                    .extract().statusCode());
        } else {
            // For PUT and PATCH requests, check that the response is not empty
            assertEquals(true, response != null && !response.isEmpty());
        }
    }

    @When("I send a DELETE request to remove the user with ID 2")
    public void iSendADeleteRequestToRemoveTheUserWithId() {
        resp = given()
                .body("{ \"name\": \"Patched Name\" }")
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .when()
                .delete("https://reqres.in/api/users/2");

        response = resp.then().assertThat().statusCode(204)
                .extract().asString();
    }

    @Then("I should receive a success delete response")
    public void iShouldReceiveASuccessDeleteResponse() {
        int expected2 = 204;
        int actual2 = resp.getStatusCode();

        if (expected2 == actual2) {
            System.out.println("Delete request is successful and Status code is 204.");
        } else {
            System.out.println("Error code received!");
        }

    }
}
