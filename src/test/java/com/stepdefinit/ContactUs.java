package com.stepdefinit;

import java.time.Duration;
<<<<<<< HEAD
import java.util.Map;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pom.*;
=======
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.Pom.*;
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUs {
	WebDriver driver;
<<<<<<< HEAD
	com.Pom.AutomationExercise AE;
=======
	com.example.Pom.AutomationExercise AE;
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
	
	
	@Given("I want to launch the website to check the contact form")
	public void i_want_to_launch_the_website_to_check_the_contact_form() {
		  // Set up WebDriver and AutomationExercise
<<<<<<< HEAD
        // WebDriverManager.chromedriver().setup();
        // driver = new ChromeDriver();
        // driver.manage().window().maximize();

		WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of(
    "credentials_enable_service", false,
    "profile.password_manager_enabled", false
    ));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
        AE = new com.Pom.AutomationExercise(driver);  // Initialize AE with WebDriver
=======
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        AE = new com.example.Pom.AutomationExercise(driver);  // Initialize AE with WebDriver
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
        driver.get("https://automationexercise.com");
	}
	
	@Given("I want to verify if we are on the home page")
	public void i_want_to_verify_if_we_are_on_the_home_page() {
	    AE.verifyHome();
	}

	@When("I click on contact us form")
	public void i_click_on_contact_us_form() {
	    AE.clickContactUs();
	}

	@When("Enter the relevant contents")
	public void enter_the_relevant_contents() {
<<<<<<< HEAD
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   WebElement contactName =  driver.findElement(By.xpath("//input[@name='name']"));
	   contactName.sendKeys("Test");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   WebElement contactEmail =  driver.findElement(By.xpath("//input[@name='email']"));
	   contactEmail.sendKeys("Test@test.com");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
=======
	   WebElement contactName =  driver.findElement(By.xpath("//input[@name='name']"));
	   contactName.sendKeys("Test");
	   WebElement contactEmail =  driver.findElement(By.xpath("//input[@name='email']"));
	   contactEmail.sendKeys("Test@test.com");
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
	   WebElement contactSubject =  driver.findElement(By.xpath("//input[@name='subject']"));
	   contactSubject.sendKeys("For testing functions");
	 
	   
	}

	@When("click on the submit button")
	public void click_on_the_submit_button() {
		  WebElement SubmitButton =  driver.findElement(By.xpath("//input[@name='submit']"));
		   SubmitButton.sendKeys("For testing functions");
	}

	@Then("I have to handle the alert")
	public void i_have_to_handle_the_alert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// Switch to the alert
		Alert alert = driver.switchTo().alert();

		// Print alert text
		System.out.println("Alert text: " + alert.getText());

		// Accept the alert
		alert.accept();
	}

	@Then("check the success message")
	public void check_the_success_message() {
	   WebElement SuccessMessage =  driver.findElement(By.xpath("(//div[contains(text(),'Success! Your details have been submitted successfully.')])[1]"));
	  boolean s =  SuccessMessage.isDisplayed();
	  if (s) {
		System.out.println("The success message is shown!");
	}
	
	}



}
