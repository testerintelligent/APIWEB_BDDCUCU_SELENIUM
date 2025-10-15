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


public class AddCart {
    WebDriver driver;

    @Given("Product should be visible to choose")
public void product_should_be_visible_to_choose() {
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


public class AddCart {
    WebDriver driver = new ChromeDriver();

    @Given("Product should be visible to choose")
public void product_should_be_visible_to_choose() {
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();  
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
}


@When("I have choosen the option to add cart")
public void i_have_choosen_the_option_to_add_cart() {
    WebElement ItemDetails = driver.findElement(By.xpath("//a[@href='/141-inch-laptop']"));
    ItemDetails.click();
}
@Then("I can press the add cart button")
public void i_can_press_the_add_cart_button() {
    
    //WebElement AddCartBtn = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']]"));
    WebElement AddCartBtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
    AddCartBtn.click();
    System.out.println("added to the cart");
    driver.quit();
}
}
