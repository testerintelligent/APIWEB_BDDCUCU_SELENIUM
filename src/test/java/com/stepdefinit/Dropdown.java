package com.stepdefinit;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
    WebDriver driver;
    //@Before
    public void setUp() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Given("Notebook elements should be loaded properly")
    public void notebook_elements_should_be_loaded_properly() {
            WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/notebooks");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        driver.getTitle();
    }

    @When("I have to select the Sort by dropdown")
    public void i_have_to_select_the_sort_by_dropdown() {
        WebElement dropdownElement = driver.findElement(By.id("products-orderby"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Position");
    }

    @When("I have to select the Display")
    public void i_have_to_select_the_display() {
        WebElement dropdownElement = driver.findElement(By.id("products-pagesize"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("4");
    }

    @When("I have to select the view as")
    public void i_have_to_select_the_view_as() {
        WebElement dropdownElement = driver.findElement(By.id("products-viewmode"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Grid");
    }

    @Then("I can able to select the dropdown menu")
    public void i_can_able_to_select_the_dropdown_menu() {
        System.out.println("Selected the dropdown menu");
        driver.quit();
    }
}
