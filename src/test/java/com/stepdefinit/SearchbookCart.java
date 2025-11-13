package com.stepdefinit;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
  driver.quit();
}
}
