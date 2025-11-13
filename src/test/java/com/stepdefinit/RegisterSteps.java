package com.stepdefinit;

import com.Pom.RegisterFunctionality;
import com.common.BaseClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends BaseClass1 {

    RegisterFunctionality register;

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        register = new RegisterFunctionality(driver);
        register.openLoginPage("https://automationexercise.com/");
    }

    @When("clicks on the Click on Signup \\/ Login button")
    public void clicks_on_the_click_on_signup_login_button() {
        register.signUpLoginClick();
    }

    @Then("Verify New User Signup is visible")
    public void verify_new_user_signup_is_visible() {
        register.newUserSignUpVisible();
    }

    @Then("enter name {string}")
    public void enter_name(String name) {
        register.signUpName(name);
    }

    @Then("already registered email address {string}")
    public void already_registered_email_address(String email) {
        register.emailAddress(email);
    }

    @When("Click Signup button")
    public void click_signup_button() {
        register.signUpClick();
    }

    @Then("Verify error Email Address already exist is visible")
    public void verify_error_email_address_already_exist_is_visible() {
        WebElement signUpNotification = driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
        System.out.println(signUpNotification.getText());
        driver.quit();
    }
}