package com.stepdefinit;

import io.restassured.response.Response;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

import java.util.List;

import org.junit.Assert;

public class projectRestAssured {
    Response response;
    Response response2;
    @Given("Navigate to the URL")
public void navigate_to_the_url() {
    //get url
   response = RestAssured.get("https://restful-booker.herokuapp.com/booking");
   response.print();
   response2 = RestAssured.get("https://restful-booker.herokuapp.com/booking/1");
   response2.print();
   
  
}
@When("I check all methods and assestion")
public void i_check_all_methods_and_assestion() {
    //verify reponse assertions
    Assert.assertEquals("error: status code wrong", 200,response.getStatusCode());
    Assert.assertEquals("error:Name should be same", 200,response2.getStatusCode());
}
@Then("I should get all responses")
public void i_should_get_all_responses() {

    //get list, get by id
    List<Integer> bookingIds = response.jsonPath().getList("bookingid");
    Assert.assertFalse("List is empty,i should be empty",bookingIds.isEmpty());

    String firstName = response2.jsonPath().getString("firstname");
    Assert.assertEquals("Expected firstname to be 'Sally' but found: " + firstName, "Sally", firstName);
    
    

   
}
}
