package com.stepdefinit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchCDBM {
     WebDriver driver=new ChromeDriver();
    @Given("I enter the url of Registration of domain")
public void i_enter_the_url_of_registration_of_domain() {
    // Write code here that turns the phrase above into concrete actions
     driver.get("https://demowebshop.tricentis.com/register");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
     driver.getTitle();
}
@When("I enter the customer Registration Details")
public void i_enter_the_customer_registration_details() {
    // Write code here that turns the phrase above into concrete actions
        WebElement genderMale=driver.findElement(By.id("gender-male"));
        genderMale.click();
        WebElement firtsname=driver.findElement(By.xpath("//input[@id='FirstName']"));
        firtsname.sendKeys("Muthu");
        WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
        lastname.sendKeys("lakshmi");
        WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
        Email.sendKeys("muthu20@gmail.com");
        WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
        Password.sendKeys("Password@200490");
        WebElement ConPassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        ConPassword.sendKeys("Password@200490");
        WebElement RegistButton=driver.findElement(By.xpath("//input[@id='register-button']"));
        RegistButton.click();
    }       

@Then("I can able to Register successfully")
public void i_can_able_to_register_successfully() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Regsitration Successfull");
         driver.quit();
}
}

