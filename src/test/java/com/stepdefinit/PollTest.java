package com.stepdefinit;
import java.time.Duration;
<<<<<<< HEAD
import java.util.Map;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PollTest {
    WebDriver driver;    
@Given("I logged into the application")
public void i_logged_into_the_application() {
        WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PollTest {
    WebDriver driver = new ChromeDriver();

    
@Given("I logged into the application")
public void i_logged_into_the_application() {
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();  
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
}
@When("I have choosen the option for community poll")
public void i_have_choosen_the_option_for_community_poll() {
    WebElement PollText = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
    PollText.click();
}
@Then("I can submit the vote button")
public void i_can_submit_the_vote_button() {
    WebElement SubmitBtn = driver.findElement(By.xpath("//input[@class='button-2 vote-poll-button']"));
    SubmitBtn.click();
    driver.quit();
}
}