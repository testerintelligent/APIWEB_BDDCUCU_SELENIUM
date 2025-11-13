package com.stepdefinit;

import com.Pom.VerifyTestCasePage;
import com.common.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyTestCasePageSteps extends BaseClass1 {

    VerifyTestCasePage testcasepage ;
    @Given("Given User is on the home page")
public void given_user_is_on_the_home_page() {
   testcasepage= new VerifyTestCasePage(driver);
   testcasepage.openLoginPage("https://automationexercise.com/");
}
@Then("verify test cases option is visible")
public void verify_test_cases_option_is_visible() {
    testcasepage.testCasesVisible();
}
@When("clicks on test cases page")
public void clicks_on_test_cases_page() {
    testcasepage.testCasesClick();
}
@Then("user navigates to test page successfully")
public void user_navigates_to_test_page_successfully() {
testcasepage.testCasePageVisible();
driver.quit();
}

}
