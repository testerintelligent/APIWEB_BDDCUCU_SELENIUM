package com.stepdefinit;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PS02_PostApiStepDef {

    RequestSpecification reqspec;
    Response response;

    @Given("The API is working")
    public void the_api_is_running() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    @When("I send POST request to endpoint {string} with body")
    public void i_send_post_request_to_endpoint_with_body(String endpoint, String body) {
        reqspec = RestAssured
                .given()
                .header("x-api-key", "reqres-free-v1")
                .header("Content-Type", "application/json")
                .body(body);

        response = reqspec.when().post(endpoint);

    }

    @Then("The response code should be {int}")
    public void the_response_code_should_be(Integer statusCode) {
        int expected = statusCode;
        int actual = response.getStatusCode();
        Assert.assertEquals(expected, actual);

        System.out.println("The response code is : " + actual);
    }
}
