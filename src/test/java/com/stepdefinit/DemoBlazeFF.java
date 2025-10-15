package com.stepdefinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlazeFF {
    WebDriver driver;    
@Given("I navigate to the login page")
public void i_navigate_to_the_login_page() {
        WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://www.demoblaze.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement loginURL = driver.findElement(By.xpath("//a[text()='Log in']"));
    loginURL.click();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
}
@When("I enter username {string} and password {string}")
public void i_enter_username_and_password(String string, String string2) {
    
    driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(string);
    driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(string2);
       

}
@When("I click the login button")
public void i_click_the_login_button() {
    WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Log in']"));
    loginbtn.click();
}
@Then("I can able to login")
public void i_can_able_to_login() {
    driver.quit();
}



// @Given("I navigate to the login page")
// public void i_navigate_to_the_login_page() {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }

}
