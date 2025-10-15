package com.stepdefinit;

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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
<<<<<<< HEAD
import java.util.Map;

public class SliderSteps {
    ChromeDriver driver;

    @Given("I open the slider webpage")
    public void i_open_the_slider_webpage() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======

public class SliderSteps {
    WebDriver driver =  new ChromeDriver();

    @Given("I open the slider webpage")
    public void i_open_the_slider_webpage() {
    	 WebDriverManager.chromedriver().setup();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
        driver.get("https://the-internet.herokuapp.com/horizontal_slider"); // Replace with your actual slider URL
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='range']")));
    }

    @When("I move the slider to {string}")
    public void i_move_the_slider_to(String value) {
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        
        // Use JavaScript to set the value and trigger events
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input')); arguments[0].dispatchEvent(new Event('change'));", 
                         slider, value);

        // Add a small wait to allow UI update
        try {
            Thread.sleep(500); // Give time for UI to update
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I should see the displayed value as {string}")
    public void i_should_see_the_displayed_value_as(String expectedValue) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement displayedValue = driver.findElement(By.id("range"));

        // Wait for the displayed value to update
        wait.until(ExpectedConditions.textToBe(By.id("range"), expectedValue));

        // Assert the displayed value
        Assert.assertEquals("Slider value did not update correctly!", expectedValue, displayedValue.getText());
    }
}
