package com.stepdefinit;

import com.Pom.LoginPage;
import com.common.BaseClass1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsD extends BaseClass1 {
LoginPage loginpage;

@Given("User is on the login page")
public void user_is_on_the_login_page() {
loginpage = new LoginPage(driver);
loginpage.openLoginPage("https://automationexercise.com/login");
}

@When("User enters username {string}")
public void user_enters_username(String username) {
loginpage.enterUsername(username);
}

@And("User enters password {string}")
public void user_enters_password(String password) {
loginpage.enterPassword(password);
}

@And("User clicks the login button")
public void user_clicks_the_login_button() {
loginpage.loginClick();
}

@Then("Login should be successful")
public void login_should_be_successful() {
System.out.println("Successfully loggedin");
}

@Then("User should be Logged in as {string}")
public void user_should_be_logged_in_as(String expectedUserName) {
loginpage.verifyLoggedInUser(expectedUserName);
}

@Then("Click Logout button")
public void click_logout_button() {
loginpage.logOut();
}
}