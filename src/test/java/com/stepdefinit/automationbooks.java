package com.stepdefinit;

import java.time.Duration;
import java.util.List;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class automationbooks {
	
<<<<<<< HEAD
     WebDriver driver;
=======
     WebDriver driver = new ChromeDriver();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    
     
    @Given("I enter the url of bookstore")
public void i_enter_the_url_of_bookstore() {
<<<<<<< HEAD
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======
    	 WebDriverManager.chromedriver().setup();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    driver.get("https://automationbookstore.dev/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle(); 
}
@SuppressWarnings("deprecation")
@When("I search books")
public void i_search_books() {
      WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBar")));
        searchBar.sendKeys("Agile");

        // Wait for filtered results
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Agile Testing')]")));
        //get the book list
        List<WebElement> bookResults = driver.findElements(By.xpath("//ul[@id='productList']/li[not(contains(@style, 'display: none'))]"));
         // Assert that at least one book is visible
         Assert.assertTrue("No books found after filtering!",bookResults.size() > 0 );
       
}
@Then("I can retrive books successfully")
public void i_can_retrive_books_successfully() {
    System.out.println("Search functionality works correctly!");
    driver.quit();
}
}