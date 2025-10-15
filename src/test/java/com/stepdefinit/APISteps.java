package com.stepdefinit;
import static io.restassured.RestAssured.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class APISteps {
    public Response response;

    @Given("the API is available")
    public void the_api_is_available() {
      baseURI = "https://reqres.in";
}
@When("I send a GET request to {string}")
public void i_send_a_get_request_to(String endpoint) {
    response = given().given().log().all()
                    .when()
                    .get(endpoint)
                    .then().log().all().extract()
                    .response();
}
@Then("the response status code should be {int}")
public void the_response_status_code_should_be(Integer expectedstatusCode) {
    int actualStatusCode = response.getStatusCode();
    System.out.println("Actual status code : "+ actualStatusCode);
    System.out.println("Expected status code : "+ expectedstatusCode);

   // response.then().statusCode(expectedstatusCode);
   if (response.getStatusCode() == expectedstatusCode) {
    System.out.println("Test Passed: Status code is " + expectedstatusCode);
} else {
    System.out.println("Test Failed: Expected status code " + expectedstatusCode + " but got " + response.getStatusCode());
}

}
@Then("the response should contain user detail")
public void the_response_should_contain_user_detail() {
    response.prettyPrint();    
}
}
