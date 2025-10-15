package com.stepdefinit;

import java.time.Duration;
<<<<<<< HEAD
import java.util.Map;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWindow {
    WebDriver driver;

@Given("I enter into the Academy Domain of Rahul")
public void i_enter_into_the_academy_domain_of_rahul() {
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
=======

public class OpenWindow {
    WebDriver driver= new ChromeDriver();

@Given("I enter into the Academy Domain of Rahul")
public void i_enter_into_the_academy_domain_of_rahul() {
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize(); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
    driver.getTitle();
}
@When("I click the OpenWindow button")
public void i_click_the_open_window_button() {
    WebElement openWindowButton = driver.findElement(By.xpath("//button[text()='Open Window']"));
    openWindowButton.click();
}
@Then("I navigated to that window")
public void i_navigated_to_that_window() {
    driver.quit();
}
}
