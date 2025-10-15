package com.stepdefinit;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
<<<<<<< HEAD
import java.util.Map;

public class ContextMenuSteps {
    ChromeDriver driver;
=======

public class ContextMenuSteps {
    WebDriver driver = new ChromeDriver();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    Alert alert;

    @Given("I open the context menu webpage")
    public void i_open_the_context_menu_webpage() {
<<<<<<< HEAD
WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======
    	 WebDriverManager.chromedriver().setup();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        driver.get("https://the-internet.herokuapp.com/context_menu");  
    }

    @When("I right-click on the context menu box")
    public void i_right_click_on_the_context_menu_box() {
        WebElement contextMenuBox = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(contextMenuBox).perform(); // Right-click action
    }
    
    @Then("I should see an alert with text {string}")
    public void i_should_see_an_alert_with_text(String expectedText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        alert = wait.until(ExpectedConditions.alertIsPresent()); // Wait for alert

        String actualAlertText = alert.getText();
        System.out.println("Actual Alert Text: " + actualAlertText); // Debugging purpose

        Assert.assertEquals("Alert text does not match!", expectedText, actualAlertText);
    }

    @And("I accept the alert")
    public void i_accept_the_alert() {
        if (alert != null) {
            alert.accept(); // Clicks OK on the alert
        }
    }

    @And("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
