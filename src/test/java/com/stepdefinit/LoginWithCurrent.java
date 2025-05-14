package com.stepdefinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class LoginWithCurrent {

    WebDriver driver;

    @Given("I want to launch the automation exercise website")
    public void i_want_to_launch_the_automation_exercise_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }

    @And("I verify that the home page is visible")
    public void i_verify_that_the_home_page_is_visible() {
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();
        assertEquals("Home page title does not match", expectedTitle, actualTitle);
    }

    @When("I click on the signup/login button")
    public void i_click_on_the_signup_login_button() {
        WebElement signupLoginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        signupLoginButton.click();
    }

    @And("I verify that the {string} section is visible")
    public void i_verify_that_the_section_is_visible(String expectedText) {
        WebElement loginSection = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        assertTrue("Login section is not visible", loginSection.isDisplayed());
        assertEquals(expectedText, loginSection.getText());
    }

    @And("I enter the correct email address and password")
    public void i_enter_the_correct_email_address_and_password() {
        driver.findElement(By.name("email")).sendKeys("demo@test.yu"); // Replace with valid email
        driver.findElement(By.name("password")).sendKeys("YuTest"); 
        
         WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();// Replace with valid password
    }

    //@And("I click the login button")
   // public void i_click_the_login_button() {
       
   // }
}
