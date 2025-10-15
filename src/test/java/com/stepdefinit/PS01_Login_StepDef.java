package com.stepdefinit;

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
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD
import io.github.bonigarcia.wdm.WebDriverManager;

public class PS01_Login_StepDef {

    WebDriver driver;

    @Given("User is on the Adactin Login page")
public void user_is_on_the_adactin_login_page() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
=======

public class PS01_Login_StepDef {

    WebDriver driver = new ChromeDriver();

    @Given("User is on the Adactin Login page")
public void user_is_on_the_adactin_login_page() {
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
        driver.manage().window().maximize();
		  
}
@When("User enters the valid {string} and {string} for the Adactin site")
public void user_enters_the_valid_and_for_the_adactin_site(String userName, String password) {
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    
}
@When("User clicks the login button")
public void user_clicks_the_login_button() {
    driver.findElement(By.xpath("//input[@type='Submit']")).click();
    
}
@Then("User should be redirected to Adactin Homepage")
public void user_should_be_redirected_to_adactin_homepage() {
    
    WebElement welcome = driver.findElement(By.xpath("//td[@class='welcome_menu']"));
		String text = welcome.getText();
		System.out.println(text);
   
}
    
}
