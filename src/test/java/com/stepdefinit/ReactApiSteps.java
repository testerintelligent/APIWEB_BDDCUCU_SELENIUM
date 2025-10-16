package com.stepdefinit;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.common.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReactApiSteps extends BaseClass1 {

private Response response;
private String createdTrainingId;

@Given("url and getting all training records")
    public void url_and_getting_all_training_records() {
    response = RestAssured
    .given()
    .header("Accept", "application/json")
    .when()
    .get("http://10.192.190.130:5000/api/trainings")
    .then()
    .extract()
    .response();
}
@Then("verify response code should be {int}")
public void verify_response_code_should_be(int expectedstatuscode) {
  Assert.assertEquals(expectedstatuscode, response.getStatusCode());
}
@Then("verify response has list of trainings")
public void verify_response_has_list_of_trainings() {
  Assert.assertFalse(response.jsonPath().getList("$").isEmpty());
}
@Then("print first training record")
public void print_first_training_record() {
List<Map<String, Object>> trainings = response.jsonPath().getList("$");
    if (!trainings.isEmpty()) {
        System.out.println("First training record: " + trainings.get(0));
    } else {
        System.out.println("No training records found");
    }
}
@When("I create a new training record")
public void i_create_a_new_training_record() {
    String body = "{"
    + "\"empId\": \"A1345\","
    + "\"employeeName\": \"Mark\","
    + "\"course\": \"JavaScript\","
    + "\"startDate\": \"2025-01-01T00:00:00.000Z\","
    + "\"endDate\": \"2026-01-01T00:00:00.000Z\","
    + "\"status\": \"In Progress\","
    + "\"trainerName\": \"Stalin\","
    + "\"trainingType\": \"Virtual\","
    + "\"percentCompleted\": 55,"
    + "\"projectName\": \"EFG\""
    + "}";
    response = RestAssured
            .given()
            .header("Content-Type", "application/json")
            .body(body)
            .when()
            .post("http://10.192.190.130:5000/api/trainings")
            .then()
            .extract()
            .response();
}
@Then("the response code should be expected {int}")
    public void the_response_code_should_be(int expectedStatusCode) throws InterruptedException {
        BaseClass1.winWait(2000);
        Assert.assertEquals(expectedStatusCode, response.getStatusCode());
}

@Then("I store the training ID from response")
public void i_store_the_training_id_from_response() {
    createdTrainingId = response.jsonPath().getString("_id");
    Assert.assertNotNull("Training ID should not be null", createdTrainingId);
    System.out.println("Stored Training ID: " + createdTrainingId);
}

@When("I update the training record using stored ID")
    public void i_update_the_training_record_using_stored_id() {
        Assert.assertNotNull("Training ID is not set", createdTrainingId);
        String updatedBody = "{"
                + "\"empId\": \"R1372\","
                + "\"employeeName\": \"MarkAntony\","
                + "\"course\": \"JavaScript Advanced\","
                + "\"startDate\": \"2025-01-01T00:00:00.000Z\","
                + "\"endDate\": \"2026-01-15T00:00:00.000Z\","
                + "\"status\": \"Completed\","
                + "\"trainerName\": \"Stalin\","
                + "\"trainingType\": \"Virtual\","
                + "\"percentCompleted\": 90,"
                + "\"projectName\": \"EFG\""
                + "}";

        response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(updatedBody)
                .when()
                .put("http://10.192.190.130:5000/api/trainings/" + createdTrainingId)
                .then()
                .extract()
                .response();
    }
@When("I delete the training record using stored ID")
    public void i_delete_the_training_record_using_stored_id() {
        Assert.assertNotNull("Training ID is not set", createdTrainingId);
        response = RestAssured
                .given()
                .when()
                .delete("http://10.192.190.130:5000/api/trainings/" + createdTrainingId)
                .then()
                .extract()
                .response();
    }
@Then("I verify the new training record is visible on the web UI")
public void i_verify_the_new_training_record_is_visible_on_the_web_ui() {
driver.get("http://10.192.190.130:3000/");
boolean isPresent = !driver.findElements(By.xpath("//td[text()='Mark']")).isEmpty();
Assert.assertTrue("New training record should be visible on UI", isPresent);
}
@Then("I verify the updated training record is reflected on the web UI")
public void i_verify_the_updated_training_record_is_reflected_on_the_web_ui() {
driver.get("http://10.192.190.130:3000/");
boolean isPresent = !driver.findElements(By.xpath("//td[text()='MarkAntony']")).isEmpty();
Assert.assertTrue("Updated training record should be visible on UI", isPresent);
}
@Then("I verify the training record is no longer visible on the web UI")
public void i_verify_the_training_record_is_no_longer_visible_on_the_web_ui() {
driver.get("http://10.192.190.130:3000/");
boolean isNotPresent = driver.findElements(By.xpath("//td[text()='MarkAntony']")).isEmpty();
Assert.assertTrue("Training record should no longer be visible on UI", isNotPresent);
}

}
