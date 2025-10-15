package com.stepdefinit;

import static org.junit.Assert.assertTrue;


import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OHR_SearchAndScroll {

    ChromeDriver driver;
    WebDriverWait wait;

    
    @Given("The user should be logged in")
    public void the_user_should_be_login_page() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");;
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(@class, 'orangehrm-login-button')]")).click();
    }

    
    @When("I enter {string} in the sidebar search field")
    public void i_enter_in_the_sidebar_search_field(String moduleR) {
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(moduleR);
        // WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
        //     By.xpath("//input[@placeholder='Search']")));

        // searchBox.clear();

        // searchBox.clear();

        // searchBox.sendKeys(moduleR);
    }

    @Then("I should see the {string} module visible in the sidebar")
    public void i_should_see_module_visible(String module) {

        WebElement item = driver.findElement(By.xpath("//span[text()='Recruitment']"));
        assertTrue(item.isDisplayed());
    }

}
