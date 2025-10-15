package com.stepdefinit;

<<<<<<< HEAD
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Pom.paraBank;
=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.Pom.paraBank;
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterAndLogin {
    WebDriver driver;
    paraBank paraBankPage;

    @Given("I launch the ParaBank website")
    public void i_launch_the_para_bank_website() {
        WebDriverManager.chromedriver().setup();
<<<<<<< HEAD
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
        driver = new ChromeDriver(options);
=======
        driver = new ChromeDriver();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        // Initialize POM class
        paraBankPage = new paraBank(driver);
    }

    @When("I register a new user")
    public void i_register_a_new_user()  {
        paraBankPage.register();  // Calling register method from POM class
    }

    @When("I log in with the registered credentials")
    public void i_log_in_with_the_registered_credentials() {
        paraBankPage.login();  // Calling login method from POM class
    }

    @Then("I should be successfully logged in")
    public void i_should_be_successfully_logged_in() {
        //paraBankPage.LoggedIn(); // Verifying successful login
    }
}
