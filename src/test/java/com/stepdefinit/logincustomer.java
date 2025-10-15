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

public class logincustomer {
    WebDriver driver;
  //  WebDriverManager.chromedriver().setup();
    @Given("I enter the shop login url of domain")
public void i_enter_the_shop_login_url_of_domain() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
}
@When("I enter customer login credentials")
public void i_enter_customer_login_credentials() {
   WebElement emailLogin = driver.findElement(By.id("Email"));
    WebElement pswLogin = driver.findElement(By.id("Password"));
    emailLogin.sendKeys("test@gamsil.com");
    pswLogin.sendKeys("test123");
    WebElement loginButton = driver.findElement(By.cssSelector(".button-1.login-button"));
    loginButton.click();
    System.out.println("Login Successfully");
}
@Then("I can login shop successfully")
public void i_can_login_shop_successfully() {
   driver.quit();
}
}
