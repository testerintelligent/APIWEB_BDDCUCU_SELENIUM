package com.stepdefinit;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Voting {
     WebDriver driver;
  
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("I logged into the applications")
    public void i_logged_into_the_applications() {
       
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    }

    @When("I have chosen the option for community polls")
    public void i_have_choosen_the_option_for_community_polls() {
        WebElement PollText = wait.until(ExpectedConditions.elementToBeClickable(By.id("pollanswers-1")));
        PollText.click();
    }

    @Then("I can submit the voting buttons")
    public void i_can_submit_the_voting_button() throws InterruptedException {
        WebElement SubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='button-2 vote-poll-button']")));
        SubmitBtn.click();

      //  Thread.sleep(2000);  // Wait for 2 seconds before closing
        driver.quit();
    }
}
