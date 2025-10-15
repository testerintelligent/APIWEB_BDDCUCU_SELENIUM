package com.stepdefinit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
<<<<<<< HEAD
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DragAndDropSteps {
    WebDriver driver;
=======
import static org.junit.Assert.assertEquals;

public class DragAndDropSteps {
    WebDriver driver = new ChromeDriver();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    private By boxA = By.id("column-a");
    private By boxB = By.id("column-b");

    @Given("I am on the Drag and Drop page")
    public void i_am_on_the_drag_and_drop_page() {
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
        driver.manage().window().maximize();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        wait.until(ExpectedConditions.visibilityOfElementLocated(boxA));
    }

    // JavaScript-based HTML5 drag and drop function
    public void dragAndDropJS(WebElement source, WebElement target) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "var target = arguments[1], event = document.createEvent('HTMLEvents');" +
                        "event.initEvent('dragover', true, true); target.dispatchEvent(event);" +
                        "event = document.createEvent('HTMLEvents'); event.initEvent('drop', true, true);" +
                        "target.dispatchEvent(event);";
        js.executeScript(script, source, target);
    }

    @When("I drag element {string} and drop it onto element {string}")
    public void i_drag_element_and_drop_it_onto_element(String source, String target) {
        WebElement sourceElement = source.equals("A") ? driver.findElement(boxA) : driver.findElement(boxB);
        WebElement targetElement = target.equals("B") ? driver.findElement(boxB) : driver.findElement(boxA);

        // Use JavaScript for drag and drop
        dragAndDropJS(sourceElement, targetElement);
    }

    @Then("element {string} should be in position of {string}")
    public void element_should_be_in_position_of(String source, String target) {
        WebElement expectedElement = target.equals("A") ? driver.findElement(boxA) : driver.findElement(boxB);
        String expectedText = target.equals("A") ? "A" : "B"; // Expect correct text

        String actualText = expectedElement.getText();
        assertEquals("Verify the position after drag and drop", expectedText, actualText);

        driver.quit(); // Close the browser after verification
    }
}
