package com.stepdefinit;

import io.restassured.response.Response;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.List;

import org.json.JSONObject;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

public class projectRestAssured {
    Response response;
    Response response2;
    int bookingId;

    @Given("Navigate to the URL")
    public void navigate_to_the_url() {
        // GET all bookings
        response = RestAssured.get("https://restful-booker.herokuapp.com/booking");
        response.prettyPrint();

        // GET booking by ID
        response2 = RestAssured.get("https://restful-booker.herokuapp.com/booking/2337");
        response2.prettyPrint();
    }

    @When("I check all methods and assestion")
    public void i_check_all_methods_and_assestion() {
        Assert.assertEquals("error: status code wrong", 200, response.getStatusCode());
        // Assert.assertEquals("error: Name should be same", 200,
        // response2.getStatusCode());
    }

    @Then("I should get all responses")
    public void i_should_get_all_responses() {
        // === GET LIST & GET BY ID VALIDATION ===
        List<Integer> bookingIds = response.jsonPath().getList("bookingid");
        Assert.assertFalse("Booking ID list is empty", bookingIds.isEmpty());
        System.out.println(bookingIds);

        String firstName = response2.jsonPath().getString("firstname");
        // Assert.assertEquals("firstName not matching", "John", firstName);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response2.jsonPath().getString("lastname"), "kookie", "Lastname mismatch");
        softAssert.assertEquals(response2.jsonPath().getInt("totalprice"), 111, "Price mismatch");
        softAssert.assertTrue(response2.jsonPath().getBoolean("depositpaid"), "Deposit should be true");
        softAssert.assertEquals(response2.jsonPath().getString("bookingdates.checkin"), "2025-02-05",
                "Check-in mismatch");
        softAssert.assertEquals(response2.jsonPath().getString("bookingdates.checkout"), "2025-10-06",
                "Checkout mismatch");

        System.out.println("GET list test passed successfully.");

        // === POST ===
        JSONObject body = new JSONObject();
        body.put("firstname", "krithi");
        body.put("lastname", "kookie");
        body.put("totalprice", 111);
        body.put("depositpaid", true);

        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2025-02-05");
        bookingDates.put("checkout", "2025-10-06");
        body.put("bookingdates", bookingDates);

        Response postResponse = RestAssured
                .given().contentType(ContentType.JSON)
                .body(body.toString())
                .post("https://restful-booker.herokuapp.com/booking");

        postResponse.prettyPrint();
        Assert.assertEquals(200, postResponse.getStatusCode());
        bookingId = postResponse.jsonPath().getInt("bookingid");
        System.out.println("POST test successful. Booking ID: " + bookingId);

        // === PUT ===
        Response responseUpdate = RestAssured
                .given().auth().preemptive().basic("admin", "password123")
                .contentType(ContentType.JSON)
                .body(body.toString())
                .put("https://restful-booker.herokuapp.com/booking/" + bookingId);

        responseUpdate.prettyPrint();
        Assert.assertEquals(200, responseUpdate.getStatusCode());
        Assert.assertEquals("krithi", responseUpdate.jsonPath().getString("firstname"));

        SoftAssert softAssert2 = new SoftAssert();
        softAssert2.assertEquals(responseUpdate.jsonPath().getString("lastname"), "kookie", "Lastname mismatch");
        softAssert2.assertEquals(responseUpdate.jsonPath().getInt("totalprice"), 111, "Price mismatch");
        softAssert2.assertTrue(responseUpdate.jsonPath().getBoolean("depositpaid"), "Deposit should be true");
        softAssert2.assertEquals(responseUpdate.jsonPath().getString("bookingdates.checkin"), "2025-02-05",
                "Check-in mismatch");
        softAssert2.assertEquals(responseUpdate.jsonPath().getString("bookingdates.checkout"), "2025-10-06",
                "Checkout mismatch");

        System.out.println("PUT test successful.");

        // === PATCH ===
        JSONObject bodyPatch = new JSONObject();
        bodyPatch.put("firstname", "krithi");

        Response patchResponse = RestAssured
                .given().auth().preemptive().basic("admin", "password123")
                .contentType(ContentType.JSON)
                .body(bodyPatch.toString())
                .patch("https://restful-booker.herokuapp.com/booking/" + bookingId);

        patchResponse.prettyPrint();
        Assert.assertEquals(200, patchResponse.getStatusCode());
        Assert.assertEquals("krithi", patchResponse.jsonPath().getString("firstname"));
        System.out.println("PATCH test successful.");

        // === DELETE ===
        Response responseDelete = RestAssured
                .given().auth().preemptive().basic("admin", "password123")
                .delete("https://restful-booker.herokuapp.com/booking/" + bookingId);
        Assert.assertEquals(201, responseDelete.getStatusCode());
        System.out.println("DELETE test successful.");

        // Response responseGet =
        // RestAssured.get("https://restful-booker.herokuapp.com/booking/" + bookingId);
        // Assert.assertEquals("not found deleted",
        // responseGet.getBody().asString(),404);;
    }
}
