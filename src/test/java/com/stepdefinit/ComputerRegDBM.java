package com.stepdefinit;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ComputerRegDBM {
     WebDriver driver;
@Given("I enter the url of domain CompDB1login")
public void i_enter_the_url_of_domain_CompDB1login() {
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
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://demowebshop.tricentis.com/Login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
   }
@When("I enter customer credentials of CompDB1login")
public void i_enter_customer_credentials_of_CompDB1login() {
    // Write code here that turns the phrase above into concrete actions
    
        WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
        Email.sendKeys("muthu20@gmail.com");
        WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
        Password.sendKeys("Password@200391");
        WebElement Login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Login.click();
        
  
}

}
