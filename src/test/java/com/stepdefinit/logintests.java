package com.stepdefinit;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logintests {
    WebDriver driver;
    @Given("I enter the url of banking domains")
public void i_enter_the_url_of_banking_domains() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
}
@When("I enter customer banking credentials")
public void i_enter_customer_banking_credentials() {
    Actions actions = new Actions(driver);

    WebElement computersMenu = driver.findElement(By.xpath("//a[@href='/computers']"));
    actions.moveToElement(computersMenu).perform();
    System.out.println(" Hovered over 'Computers'");

    WebElement desktopsSubmenu = driver.findElement(By.xpath("//a[@href='/desktops']"));
    desktopsSubmenu.click();
    System.out.println(" Clicked on 'Desktops'");

    WebElement cartLink = driver.findElement(By.xpath("//a[@href='/build-your-own-computer']"));
    cartLink.click();
    System.out.println(" Clicked on purchase ");

    WebElement optionList = driver.findElement(By.className("option-list"));
    List<WebElement> radioButtons = optionList.findElements(By.tagName("input"));
    boolean isSelected = false;
    if (!isSelected && !radioButtons.isEmpty()) {
        radioButtons.get(0).click();
        System.out.println("Selected the first option automatically: " + radioButtons.get(0).getDomAttribute("value"));
    } else if (radioButtons.isEmpty()) {
        System.out.println(" No options found in 'option-list'");
    }

 
    WebElement addToCart = driver.findElement(By.id("add-to-cart-button-16"));
    addToCart.click();
    System.out.println("Clicked on cart ");

   

    try {
        WebElement notification = driver.findElement(By.id("bar-notification"));
        
        // Wait for notification to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(notification));

        if (notification.isDisplayed()) {
            System.out.println(" Notification is displayed: " + notification.getText());
        } else {
            System.out.println(" Notification is NOT displayed");
        }
        
        // Optionally, close the notification
        WebElement closeButton = notification.findElement(By.className("close"));
        closeButton.click();
        System.out.println("Closed notification");
    } catch (NoSuchElementException e) {
        System.out.println("Notification not found!");
    }

    WebElement goToCart = driver.findElement(By.id("topcartlink"));
    goToCart.click();
    System.out.println("open shopping cart ");
    
    


    // driver.navigate().back();

    // actions.moveToElement(computersMenu).perform();
    // WebElement npSubmenu = driver.findElement(By.xpath("//a[@href='/notebooks']"));
    // npSubmenu.click();
    // System.out.println("✅ Clicked on 'Notebooks'");

    // driver.navigate().back();

    // actions.moveToElement(computersMenu).perform();
    // WebElement accSubmenu = driver.findElement(By.xpath("//a[@href='/accessories']"));
    // accSubmenu.click();
    // System.out.println("✅ Clicked on 'Accessories'"); 
}
@Then("I can login banking domain successfully")
public void i_can_login_banking_domain_successfully() {

    driver.quit();
}
}
