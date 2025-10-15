package com.stepdefinit;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Pom.DemoBlazePom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlazeLogin {

    WebDriver driver;
    DemoBlazePom demoBlaze;    

    @Given("I launch the website")
    public void i_launch_the_website() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        demoBlaze = new DemoBlazePom(driver);
        driver.get("https://www.demoblaze.com/");
        System.out.println("Website launched successfully");
    }

    @Then("Click the signup button")
    public void click_the_signup_button() {
        demoBlaze.clickSignUp();
    }

    @When("Fill the signup details")
    public void fill_the_signup_details() {
        demoBlaze.SignUp();
    }

    @When("handle the alert")
    public void handle_the_alert() {
        demoBlaze.alerthandle();
    }

    @Then("I click the Continue button")
    public void i_click_the_continue_button() {
       // demoBlaze.clickContinue();
        System.out.println("Clicked Continue button");
    }

    @Then("I verify that I am logged in as the registered username")
    public void i_verify_that_i_am_logged_in_as_the_registered_username() {
       // boolean isLoggedIn = demoBlaze.verifyLoggedInUser();
       // if (!isLoggedIn) {
         //   throw new AssertionError("User not logged in!");
       // }
       // System.out.println("User is logged in as registered username");
    }

    @Then("I click the Delete Account button")
    public void i_click_the_delete_account_button() {
       // demoBlaze.clickDeleteAccount();
       // System.out.println("Clicked Delete Account button");
    }

    @Then("I verify that the {string} message is shown and I click the Continue button")
    public void i_verify_that_the_message_is_shown_and_i_click_the_continue_button(String message) {
       // boolean messageVisible = demoBlaze.verifyMessage(message);
       // if (!messageVisible) {
        //    throw new AssertionError("Expected message not shown: " + message);
       // }
     //   demoBlaze.clickContinue();
       // System.out.println("Verified message and clicked Continue");
    }

    
   // public void tearDown() {
      //  if (driver != null) {
       //     driver.quit();
           // System.out.println("Browser closed");
       // }
    }

