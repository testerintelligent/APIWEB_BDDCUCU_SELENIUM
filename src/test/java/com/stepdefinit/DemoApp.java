package com.stepdefinit;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoApp {
    
WebDriver driver;

@Given("The app url should be loaded properly")
public void the_app_url_should_be_loaded_properly() {
        WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://codebase.show/projects/realworld");
    driver.manage().window().maximize(); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
    driver.getTitle();
}
@When("I navigated the hover")
public void i_navigated_the_hover() {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement hoverElement = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Backend']"))
        );
        hoverElement.click();
//   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement hover= wait.until(driver.findElement(By.xpath("//div[text()='Backend']")));
//       hover.click();
}
@Then("I can able to see all the apps")
public void i_can_able_to_see_all_the_apps() {
   driver.close();
}
}
