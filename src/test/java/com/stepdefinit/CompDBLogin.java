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

public class CompDBLogin {
     WebDriver driver;
@Given("I enter the url of domain CompDBlogin")
public void i_enter_the_url_of_domain_CompDBlogin() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======

public class CompDBLogin {
     WebDriver driver = new ChromeDriver();
@Given("I enter the url of domain CompDBlogin")
public void i_enter_the_url_of_domain_CompDBlogin() {
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://demowebshop.tricentis.com/Login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
   }
@When("I enter customer credentials of CompDBlogin")
public void i_enter_customer_credentials_of_CompDBlogin() {
    // Write code here that turns the phrase above into concrete actions
    
        WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
        Email.sendKeys("muthu00@gmail.com");
        WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
        Password.sendKeys("Muthu@123");
        WebElement Login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Login.click();
        
  
}
@Then("I can login domain of CompDBlogin successfully")
public void i_can_login_domain_of_CompDBlogin_successfully() {
    // Write code here that turns the phrase above into concrete actions
    //WebElement message = driver.findElement(By.id("message"));
       // message.getText();
       System.out.println("Login successful!");
      // boolean isLoginSuccessful=driver.findElement(By.linkText("Log out")).isDisplayed();
       //if(isLoginSuccessful)
       //{
        //System.out.println("Login successful!");
       //}
       //else
       //{
        //System.out.println("Login failed!");
       //}
        //driver.quit();
   
}
}
