package com.stepdefinit;

import java.time.Duration;
import java.util.Iterator;
<<<<<<< HEAD
import java.util.Map;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;

=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenTabStepDefinitions {
<<<<<<< HEAD
    WebDriver driver;
=======
    WebDriver driver = new ChromeDriver();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    private String mainWindowHandle;

    @Given("I enter the URL of the practice page")
    public void i_enter_the_url_of_practice_page() {
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
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        mainWindowHandle = driver.getWindowHandle(); // Save the main window handle
    }

    @When("I click the open tab button")
    public void i_click_the_open_tab_button() {
        WebElement openTabBtn = driver.findElement(By.id("opentab"));
        openTabBtn.click();
    }

    @Then("I should see the new tab opened successfully")
    public void i_should_see_the_new_tab_opened_successfully() {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();

        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!childWindow.equals(mainWindowHandle)) {
                driver.switchTo().window(childWindow);  // Switch to the new tab
                
                // ✅ Use Duration.ofSeconds instead of int
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.titleContains("QAClick Academy"));


                System.out.println("New Tab Title: " + driver.getTitle());

                driver.close();  // Close the new tab
                driver.switchTo().window(mainWindowHandle); // Switch back to main tab
                break;
            }
        }
    }
}
