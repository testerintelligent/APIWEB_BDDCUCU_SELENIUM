package com.stepdefinit;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.testng.Assert;

import com.google.gson.JsonObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class reqResTest {
	String baseUrl="https://reqres.in/";
	private RequestSpecification reqspec;
	private Response response;
    private String baseUrL = "https://reqres.in/api/users"; // Example API
    private int userId = 2;
    private String newName = "Abarna Updated";
	

	@Given("Give the domain name of reqres")
	public void give_the_domain_name_of_reqres() {	
		RestAssured.baseURI=baseUrl+"api/users";
		reqspec=RestAssured.given();
	}
	
	@When("send the get request with the resource url of reqres")
	public void send_the_get_request_with_the_resource_url_of_reqres() {
		reqspec.header("x-api-key","reqres-free-v1");		

		response =reqspec.get("?page=1");
	}
	
	@Then("validate the response code of reqres")
	public void validate_the_response_code_of_reqres() {
		Assert.assertEquals(200, response.getStatusCode());
		//Assert.assertEquals(response.getBody().jsonPath().get("data[0].id"),1);
	}

	@Then("validate the response code get of reqres")
	public void validate_the_response_code_get_of_reqres() {
		Assert.assertEquals(200, response.getStatusCode());
		//Assert.assertEquals(response.getBody().jsonPath().get("data.id"),2);
	}
	
	@When("send the get request with the single resource url of reqres")
	public void send_the_get_request_with_the_single_resource_url_of_reqres() {
		reqspec.header("x-api-key","reqres-free-v1");		

		response =reqspec.get("/2");		
	}
	
	@When("send get request in server of reqres")
	public void send_get_request_in_server_of_reqres() {
        reqspec.header("x-api-key","reqres-free-v1");		
		response =reqspec.get("/23");
	}
	
	@Then("validate the negative response code of reqres")
	public void validate_the_negative_response_code_of_reqres() {
		Assert.assertEquals(404, response.getStatusCode());
	}

	@When("delete user in server of reqres")
	public void delete_user_in_server_of_reqres() {
        reqspec.header("x-api-key","reqres-free-v1");		

		response =reqspec.delete("/2");
	}
	
	@When("Get delayed response in server of reqres")
	public void get_delayed_response_in_server_of_reqres() {
        reqspec.header("x-api-key","reqres-free-v1");		

		response =reqspec.get("?delay=3");
	}


	@Then("validate the delete response code of reqres")
	public void validate_the_delete_response_code_of_reqres() {
		Assert.assertEquals(204, response.getStatusCode());
	}


@Given("I have the user ID and new user name")
public void i_have_the_user_id_and_new_user_name() {
    reqspec = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .header("x-api-key", "reqres-free-v1")
                    .body("{\"name\": \"" + newName + "\"}");

    
}

@When("I send a Patch request to update user details")
public void i_send_a_patch_request_to_update_user_details() {

    response = reqspec.patch(baseUrL + "/" + userId);
   
}

@Then("The response should contain the updated name")
public void the_response_should_contain_the_updated_name() {
    response.then().statusCode(200)
    .body("name", equalTo(newName));
    
}

    private Object given() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  @Given("I set base URI")
    public void i_set_base_uri() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }

    @When("I send POST request to \\/auth with valid credential")
    public void i_send_post_request_to_auth() {
        JsonObject payload = new JsonObject();
        payload.addProperty("username", "admin");
        payload.addProperty("password", "password123");

        reqspec = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(payload.toString());

        response = reqspec.post("/auth");
        response.then().log().all();
    }

    @Then("I should get the 200  OK response")
    public void i_should_get_200_ok_response() {
        assertEquals(200, response.getStatusCode());
    }

    @And("I should receives a token  in response")
    public void i_should_receives_token() {
        String token = response.jsonPath().getString("token");
        assertNotNull("Token should not be null", token);
        System.out.println("Generated Token: " + token);
    }

}