package com.stepdefinit;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Pom.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginwithIncorrectCredentials {
	 WebDriver driver;
	   AutomationExercise AE;
	
	@Given("I want to launch the Automation Website")
	public void i_want_to_launch_the_automation_website() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        AE = new AutomationExercise(driver);  // Initialize AE with WebDriver
	        driver.get("https://automationexercise.com");
	}

	@Given("Verfiy if the home page is available")
	public void verfiy_if_the_home_page_is_available() {
		System.out.println("Verifying that the home page is visible...");
        AE.verifyHome();  // Now AE is properly initialized
	}

	@When("I try to enter incorrect credentials")
	public void i_try_to_enter_incorrect_credentials() {
		 AE.clickSignupLogin();
		 System.out.println("Entering the correct email and password...");
	        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	        email.sendKeys("123456@gmail.com");
	        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	        pass.sendKeys("YuTes");
	}

	@When("click on login button")
	public void click_on_login_button() {
		 WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	        login.click();
	        
	}

	@Then("Error message should popup")
	public void error_message_should_popup() {
	   WebElement Error = driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect!')]"));
	   if (Error.isDisplayed()) {
		System.out.println("Error message is displayed");
	}
		driver.quit();
	}



}
