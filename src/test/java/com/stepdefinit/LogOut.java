package com.stepdefinit;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Pom.AutomationExercise;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogOut {
    WebDriver driver;
    AutomationExercise AE;

    @Given("I want to launch the website")
    public void i_want_to_launch_the_website() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        AE = new AutomationExercise(driver);
        driver.get("https://automationexercise.com");
    }

    @Given("verfiy if the home page is visible")
    public void verfiy_if_the_home_page_is_visible() {
        System.out.println("Verifying that the home page is visible...");
        AE.verifyHome();
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("Clicking on the signup/login button...");
        AE.clickSignupLogin();
    }

    @When("Enter the correct credentials")
    public void enter_the_correct_credentials() {
        System.out.println("Entering the correct email and password...");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("demo@test.yu");
        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("YuTest");
    }

    @And("Now I have clicked the log button")
public void now_I_have_clicked_the_log_button() {
    WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
    loginButton.click();
    System.out.println("Clicked the login button.");
}

    @Then("I will check if the login is done successfully")
    public void i_will_check_if_the_login_is_done_successfully() {
        AE.verifyLoggedInUsernameVisible();
        System.out.println("Verifying that the username is displayed as logged in...");
    }

    @Then("i will now check if the logout button is available")
    public void i_will_now_check_if_the_logout_button_is_available() {
        WebElement logout = driver.findElement(By.xpath("//*[contains(text(),' Logout')]"));
        if (logout.isDisplayed()) {
            System.out.println("The logout button is visible.");
        }
    }

    @Then("I will click the logout button")
    public void i_will_click_the_logout_button() {
        WebElement logout = driver.findElement(By.xpath("//*[contains(text(),' Logout')]"));
        logout.click();
    }

    @Then("I will check if the logout is correctly happened")
    public void i_will_check_if_the_logout_is_correctly_happened() {
        System.out.println("Verifying that the home page is visible again...");
        AE.verifyHome();
    }
}
