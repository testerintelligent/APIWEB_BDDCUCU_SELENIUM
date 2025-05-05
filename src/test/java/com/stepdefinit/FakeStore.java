package com.stepdefinit;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

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

@When("I fetch the Product with ID {int}")
public void i_fetch_the_product_with_id(Integer id) {
    response =  given()
    .when()
    .get("/Product/" + id);
    
}

@Then("The response should be {int}")
public void the_response_should_be(Integer statuscode) {

    assertThat(response.statusCode(), is(statuscode));


   
}

@Then("the Product tittle should be {string}")
public void the_product_tittle_should_be(String expectedTitle) {

    String actualTitle = response.jsonPath().getString("title");
    assertThat(actualTitle, equalTo(expectedTitle));
   
}

}
