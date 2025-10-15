package com.stepdefinit;

<<<<<<< HEAD
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Pom.AutomationExercise;
=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.Pom.AutomationExercise;
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTestcases {
	WebDriver driver;
<<<<<<< HEAD
	 com.Pom.AutomationExercise AE;
=======
	 com.example.Pom.AutomationExercise AE;
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
	
	@Given("I want to launch the automation website")
	public void i_want_to_launch_the_automation_website() {
		  // Set up WebDriver and AutomationExercise
        WebDriverManager.chromedriver().setup();
<<<<<<< HEAD
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
        driver = new ChromeDriver(options);
=======
        driver = new ChromeDriver();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
        driver.manage().window().maximize();
        AE = new AutomationExercise(driver);  // Initialize AE with WebDriver
        driver.get("https://automationexercise.com");
	}

	@Given("i want to check the home page")
	public void i_want_to_check_the_home_page() {
		AE.verifyHome();
	}

	@When("I click on the testcases page")
	public void i_click_on_the_testcases_page() {
	    AE.clickontestcase();
	}

	@When("verify if we are on the testcases page")
	public void verify_if_we_are_on_the_testcases_page() {
	    AE.verifytestcase();
	}

	@Then("I validate if the testcases are present")
	public void i_validate_if_the_testcases_are_present() {
	    AE.verifytestcase1();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    driver.quit();
	}



}
