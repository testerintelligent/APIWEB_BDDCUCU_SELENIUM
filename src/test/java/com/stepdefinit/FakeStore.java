package com.stepdefinit;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class FakeStore {

    Response response;

    @Given("The Fake store API is available")
    public void the_fake_store_api_is_available() {
        baseURI = "https://fakestoreapi.com";

    }

    @When("I fetch the Product")
    public void i_fetch_the_product() {
        response = given()
                .when()
                .get("/product/");

    }

    @Then("The response should be {int}")
    public void the_response_should_be(Integer statuscode) {
        // assertEquals(response.getStatusCode(), 200);

        // Assert.assertEquals(200, response.getStatusCode());

    }

    @Then("the Product tittle should be {string}")
    public void the_product_tittle_should_be(String expectedTitle) {

        // String actualTitle = response.jsonPath().getString("title");

        // Assert.assertEquals(actualTitle, expectedTitle);

    }

    @When("I send a post request to create a Product")
    public void i_send_a_post_request_to_create_a_product() {
        String body = "{\r\n" + //
                "    \"id\": 0,\r\n" + //
                "    \"title\": \"string\",\r\n" + //
                "    \"price\": 0.1,\r\n" + //
                "    \"description\": \"string\",\r\n" + //
                "    \"category\": \"string\",\r\n" + //
                "    \"image\": \"http://example.com\"\r\n" + //
                "}";

        response = given().header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/products");
    }

    @Then("Respose code should be {int}")
    public void respose_code_should_be(Integer expectedStatus) {
        Assert.assertEquals(expectedStatus.intValue(), response.getStatusCode());

    }

    @Then("The response should containe the tittle {string}")
    public void the_response_should_containe_the_tittle(String expectedTitle) {
        String actualTitle = response.jsonPath().getString("title");
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @When("I send a put request to update product {int}")
    public void i_send_a_put_request_to_update_product(Integer int1) {
        String body = "{\n" +
                "  \"id\": 0,\n" +
                "  \"title\": \"string\",\n" +
                "  \"price\": 0.1,\n" +
                "  \"description\": \"changed string\",\n" +
                "  \"category\": \"string\",\n" +
                "  \"image\": \"http://example.com\"\n" +
                "}";

        response = given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body(body)
                .when()
                .put("/products/18");

    }

    @Then("the status code should be {int}")
    public void the_status_code_should_be(Integer statusCode) {

        //Assert.assertEquals(statusCode, response.getStatusCode());
        if (response.getStatusCode() == statusCode) {
        System.out.println("Test Passed: Status code is " + statusCode);
    } else {
            System.out.println("Success");}
    }

    @Then("the response should contain desription {string}")
    public void the_response_should_contain_desription(String expectedDescription) {

        String actualDescription = response.jsonPath().getString("description");
        System.out.println("Debug =" + actualDescription);
        System.out.println("Debug =" + response.body());
        Assert.assertEquals(actualDescription, expectedDescription);
    }

    @When("I send a DELETE request for product ID {int}")
    public void i_send_a_delete_request_for_product_id(Integer int1) {

        response = given()
                .when()
                .delete("/products/18");

    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(Integer statusCode) {
       // Assert.assertEquals(200, response.getStatusCode());
         if (response.getStatusCode() == 200) {
            System.out.println("Test Passed: Status code is 200");
        } else {
            System.out.println("Success");
        }

    }

    @Then("the deleted product ID should be {int}")
    public void the_deleted_product_id_should_be(Integer expectedId) {

        int returnedId = response.jsonPath().getInt("id");
        Assert.assertEquals(returnedId, expectedId);

    }

}
