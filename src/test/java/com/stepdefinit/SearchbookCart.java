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

public class SearchbookCart {
    
 WebDriver driver;
    
@Given("The url should be loaded properly")
public void the_url_should_be_loaded_properly() {
        WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======

public class SearchbookCart {
    
 WebDriver driver = new ChromeDriver();
    
@Given("The url should be loaded properly")
public void the_url_should_be_loaded_properly() {
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    driver.get("https://automationbookstore.dev/");
    driver.manage().window().maximize();  
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
}
@When("I enter the book name in the search box")
public void i_enter_the_book_name_in_the_search_box() {
    WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchBar']"));
    searchBox.sendKeys("Agile Testing");
}
@Then("I can able to see the book")
public void i_can_able_to_see_the_book() {
  driver.close();
}
}
