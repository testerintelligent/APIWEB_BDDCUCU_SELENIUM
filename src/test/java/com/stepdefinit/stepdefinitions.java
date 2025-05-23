package com.stepdefinit;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class stepdefinitions {

    private String baseUrl;
    private RequestSpecification request;
    private Response response;
    private String userName;
    private String userJob;
    private int userId;

    @Given("Base URL is set to {string}")
    public void base_url_is_set_to(String url) {
        baseUrl = url;
        request = given().baseUri(baseUrl).header("Content-Type", "application/json");
    }

    @Given("I have the user name {string} and job {string}")
    public void i_have_the_user_name_and_job(String name, String job) {
        userName = name;
        userJob = job;
    }

    @When("I send a POST request to create the user")
    public void i_send_a_post_request_to_create_the_user() {
        String payload = "{ \"name\": \"" + userName + "\", \"job\": \"" + userJob + "\" }";
        response = request.body(payload).post("/users");
    }

    @Then("I should receive a status code of {int}")
    public void i_should_receive_a_status_code_of(Integer expectedStatus) {
        response.then().statusCode(expectedStatus);
    }

    @Then("the response should contain the user with name {string} and job {string}")
    public void the_response_should_contain_the_user_with_name_and_job(String name, String job) {
        response.then().body("name", equalTo(name)).body("job", equalTo(job));
    }

    @Given("I have the user ID {int}")
    public void i_have_the_user_id(Integer id) {
        userId = id;
    }

    @When("I send a DELETE request to delete the user")
    public void i_send_a_delete_request_to_delete_the_user() {
        response = request.delete("/users/" + userId);
    }

    @When("I send a GET request to fetch user")
    public void i_send_a_get_request_to_fetch_user() {
        response = request.get("/users/" + userId);
    }

    @Then("the response should contain the user with ID {int}")
    public void the_response_should_contain_the_user_with_id(Integer id) {
        response.then().body("data.id", equalTo(id));
    }

    @And("I have the updated name {string} and job {string}")
    public void i_have_the_updated_name_and_job(String name, String job) {
        userName = name;
        userJob = job;
    }

    @When("I send a PATCH request to update the user")
    public void i_send_a_patch_request_to_update_the_user() {
        String payload = "{ \"name\": \"" + userName + "\", \"job\": \"" + userJob + "\" }";
        response = request.body(payload).patch("/users/" + userId);
    }

    @Then("the response should contain the updated name {string} and job {string}")
    public void the_response_should_contain_the_updated_name_and_job(String name, String job) {
        response.then().body("name", equalTo(name)).body("job", equalTo(job));
    }

    @When("I send an GET request to {string}")
    public void i_send_an_get_request_to(String endpoint) {
        response = request.get(endpoint);
    }

    @Then("the response should contain more than {int} posts")
    public void the_response_should_contain_more_than_posts(Integer count) {
        response.then().body("size()", greaterThan(count));
    }

    @Then("the title of the post should be {string}")
    public void the_title_of_the_post_should_be(String expectedTitle) {
        response.then().body("title", equalTo(expectedTitle));
    }

    @When("I send an POST request to {string} with body:")
    public void i_send_an_post_request_to_with_body(String endpoint, String body) {
        response = request.body(body).post(endpoint);
    }

    @Then("the response body should contain userId {int}")
    public void the_response_body_should_contain_user_id(Integer userId) {
        response.then().body("userId", equalTo(userId));
    }

    @When("I send a PATCH request to {string} with body:")
    public void i_send_a_patch_request_to_with_body(String endpoint, String body) {
        response = request.body(body).patch(endpoint);
    }

    @Then("the response body should contain the title {string}")
    public void the_response_body_should_contain_the_title(String title) {
        response.then().body("title", equalTo(title));
    }

    @When("I send a DELETE request to {string}")
    public void i_send_a_delete_request_to(String endpoint) {
        response = request.delete(endpoint);
    }
}
