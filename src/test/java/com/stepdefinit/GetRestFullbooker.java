package com.stepdefinit;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class GetRestFullbooker {

    private Response response;

@Given("check the API is available")
public void check_the_api_is_available() {
    baseURI = "https://reqres.in";
  
}

@When("I send GET request to {string}")
public void i_send_get_request_to(String enpoint) {
    response = given().when().get(enpoint);
    
}

@Then("the response of status code should be {int}")
public void the_response_of_status_code_should_be(Integer int2) {
    response.then().statusCode(int2);
    
}

@Then("the response should be contain user detail")
public void the_response_should_be_contain_user_detail() {
    response.prettyPrint();

}



}
