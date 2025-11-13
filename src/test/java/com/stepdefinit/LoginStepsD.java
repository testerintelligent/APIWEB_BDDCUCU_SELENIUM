package com.stepdefinit;

import java.util.Map;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.Pom.LoginPage;
import com.common.BaseClass1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepsD extends BaseClass1 {
    ChromeDriver driver;
    LoginPage loginpage;

@Given("User is on the login page")
public void user_is_on_the_login_page() {
 WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
//loginpage.openLoginPage("https://automationexercise.com/login");
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
driver.quit();
}

@Then("Login should be successful")
public void login_should_be_successful() {
System.out.println("Successfully loggedin");
driver.quit();
}

@Then("User should be Logged in as {string}")
public void user_should_be_logged_in_as(String expectedUserName) {
loginpage.verifyLoggedInUser(expectedUserName);
}

@Then("Click Logout button")
public void click_logout_button() {
loginpage.logOut();
driver.quit();
}
}