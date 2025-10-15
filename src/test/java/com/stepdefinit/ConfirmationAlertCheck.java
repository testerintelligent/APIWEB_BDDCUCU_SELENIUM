package com.stepdefinit;

import java.time.Duration;
<<<<<<< HEAD
import java.util.Map;

=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD
import io.github.bonigarcia.wdm.WebDriverManager;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

public class ConfirmationAlertCheck {
    WebDriver driver;
    WebDriverWait wait;

    // ✅ Constructor to initialize WebDriver & WebDriverWait
    public ConfirmationAlertCheck() {
<<<<<<< HEAD
        WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======
        driver = new ChromeDriver();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("I enter the URL of the practice page for alert")
    public void i_enter_the_URL_of_the_practice_page_for_alert() {
<<<<<<< HEAD
        WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        driver.manage().window().maximize();
    }

//     @When("I enter {string} in the text box")
// public void i_enter_in_the_text_box(String name) {
//     WebElement nameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[name='enter-name']")));

//     nameInput.clear();
//     nameInput.sendKeys(name);
// }


//     @When("I click on the alert button")
//     public void i_click_on_the_alert_button() {
//         WebElement alertButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("alertbtn")));
//         alertButton.click();
//     }

    @When("I enter {string} in the text")
    public void i_enter_in_the_text(String name) {
        WebElement nameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[name='enter-name']")));

        nameInput.clear();
        nameInput.sendKeys(name);
    }

    // @Then("I handle the alert popup")
    // public void i_handle_the_alert_popup() {
    //     Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    //     System.out.println("Alert Message: " + alert.getText());
    //     alert.accept();
    // }

    @When("I click on the confirm button")
    public void i_click_on_the_confirm_button() {
        WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmbtn")));
        confirmButton.click();
    }

    @Then("I handle the confirmation popup")
    public void i_handle_the_confirmation_popup() {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Confirmation Message: " + alert.getText());
        alert.accept();
        driver.quit();
    }    
}
