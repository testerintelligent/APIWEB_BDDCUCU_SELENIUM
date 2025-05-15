package com.stepdefinit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ComputerRegDBM {
     WebDriver driver = new ChromeDriver();
@Given("I enter the url of domain CompDB1login")
public void i_enter_the_url_of_domain_CompDB1login() {
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
