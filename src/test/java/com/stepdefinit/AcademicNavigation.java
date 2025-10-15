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

public class AcademicNavigation {
    WebDriver driver;
   
@Given("I enter into the Academy Domain")
public void i_enter_into_the_academy_domain() {
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
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
=======

public class AcademicNavigation {
    WebDriver driver = new ChromeDriver();
@Given("I enter into the Academy Domain")
public void i_enter_into_the_academy_domain() {
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize(); 
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
    driver.getTitle();
}
@When("I click the OpenWindow Element")
public void i_click_the_open_window_element() {
    WebElement openWindowButton = driver.findElement(By.xpath("//button[text()='Open Window']"));
    openWindowButton.click();
}
@When("I navigated to another site")
public void i_navigated_to_another_site() {
    driver.get("https://www.qaclickacademy.com/");
    driver.manage().window().maximize();  
    driver.getTitle();
}
@Then("again Back to the Main URL")
public void again_back_to_the_main_url() {
    driver.quit();
}

}
