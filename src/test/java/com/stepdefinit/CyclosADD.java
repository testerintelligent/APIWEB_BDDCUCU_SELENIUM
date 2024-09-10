package com.stepdefinit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.Pom.Cyclos;
import com.resources.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CyclosADD extends BaseClass {
	RequestSpecification reqspec;
	Response res;
	Cyclos login;
	String string;
	String repon;

	@Given("User should load the url username")
	public void user_should_load_the_url_username() throws FileNotFoundException, IOException {
		String requestBody = "{\r\n" + "    \"name\": \"Member account33\",\r\n"
				+ "    \"addressLine1\": \"Park Avenue\",\r\n" + "    \"addressLine2\": \"Address Downtown\",\r\n"
				+ "    \"street\": \"Apple St\",\r\n" + "    \"buildingNumber\": \"14\",\r\n"
				+ "    \"complement\": \"tets\",\r\n" + "    \"zip\": \"23456\",\r\n" + "    \"poBox\": \"54356\",\r\n"
				+ "    \"neighborhood\": \"Oslo\",\r\n" + "    \"city\": \"NJ\",\r\n" + "    \"region\": \"South\",\r\n"
				+ "    \"country\": \"US\",\r\n" + "    \"location\": {\r\n" + "        \"latitude\": 0,\r\n"
				+ "        \"longitude\": 0\r\n" + "    }\r\n" + "}";
		RestAssured.baseURI = "https://demo.cyclos.org/api/Krhithya/addresses";
		reqspec = RestAssured.given().header("Authorization", " Basic S3JoaXRoeWE6RGl2eWFAMTIz")
				.header("Content-Type", "application/json")
				// .accept(ContentType.TEXT)
				// .contentType(ContentType.JSON)
				.body(requestBody);
	}

	@When("User should create the address")
	public void user_should_create_the_address() {
		res = reqspec.post();
		res.prettyPrint();
	}

	@Then("User should validate the status codes")
	public void user_should_validate_the_status_codes() {
		// repon = res.jsonPath().getString("name");
		int statusCode = res.statusCode();
		System.out.println(statusCode);
		Assert.assertEquals(201, statusCode);
	}

	@Given("User should load the url username,password {string} and {string}")
	public void user_should_load_the_url_username_password_and(String string, String string2)
			throws FileNotFoundException, IOException {
		RestAssured.baseURI = "https://demo.cyclos.org/api/Krhithya/addresses/primary";
		reqspec = RestAssured.given().header("Authorization", " Basic S3JoaXRoeWE6RGl2eWFAMTIz");
	}

	@When("User should get the address")
	public void user_should_get_the_address() {
		res = reqspec.get();
		res.prettyPrint();
	}

	@Then("User should validate the status code in reponce")
	public void user_should_validate_the_status_code_in_reponce() {
		// repon = res.jsonPath().getString("name");
		int statusCode = res.statusCode();
		System.out.println(statusCode);
		Assert.assertEquals(200, statusCode);
		ID = res.jsonPath().getString("id");
		System.out.println(ID);

	}

	@Then("User should get the name")
	public void user_should_get_the_name() {
		name = res.jsonPath().getString("name");
		System.out.println(name);
	}

	@Then("User should get the addressLine1")
	public void user_should_get_the_address_line1() {
		addressLine1 = res.jsonPath().getString("addressLine1");
		System.out.println(addressLine1);
	}

	@Then("User should get the city")
	public void user_should_get_the_city() {
		city = res.jsonPath().getString("city");
		System.out.println(city);
	}

	@Then("User should get the region")
	public void user_should_get_the_region() {
		region = res.jsonPath().getString("region");
		System.out.println(region);
		;
	}

	@Given("User should load the url username and password {string} and {string}")
	public void user_should_load_the_url_username_and_password_and(String string, String string2)
			throws FileNotFoundException, IOException {
		System.out.println(ID);
		RestAssured.baseURI = "https://demo.cyclos.org/api/addresses/" + ID + "";
		reqspec = RestAssured.given().header("Authorization", " Basic S3JoaXRoeWE6RGl2eWFAMTIz");
	}

	@When("User should delete the address")
	public void user_should_delete_the_address() {
		res = reqspec.delete();
	}

	@Then("User should validate the status code in reponces")
	public void user_should_validate_the_status_code_in_reponces() {
		int delete = res.statusCode();
		System.out.println(delete);
		Assert.assertEquals(delete, 204);
	}

	@Given("User should load the url cyclos")
	public void user_should_load_the_url_cyclos() {
		LaunchBrowser();
		LaunchURL("https://demo.cyclos.org/ui/home");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("User should enter the username and password {string} and {string}")
	public void user_should_enter_the_username_and_password_and(String username, String password) {
		login = new Cyclos();
		Click(login.getLogin());
		EnterValue(login.getUsername(), username);
		EnterValue(login.getPassword(), password);
	}

	@When("User should navigate to profile")
	public void user_should_navigate_to_profile() {
		Click(login.getSubmit());
		Click(login.getUser());
	}

	@Then("User should validate the name")
	public void user_should_validate_the_name() {
		WebElement name = login.getName();
		String text = name.getText();
		System.out.println(text);
		assertEquals(text, addressLine1);
	}

	@Then("User should validate the city")
	public void user_should_validate_the_city() {
		WebElement city2 = login.getCity();
		String city1 = city2.getText();
		System.out.println(city1);
		assertTrue(city1.contains(city));

	}

	@Then("User should validate the state")
	public void user_should_validate_the_state() {
		WebElement state = login.getState();
		String st = state.getText();
		System.out.println(st);
		assertTrue(st.contains(region));
		driver.close();
	}

}
