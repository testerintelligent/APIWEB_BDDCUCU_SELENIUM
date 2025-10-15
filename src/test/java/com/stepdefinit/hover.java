package com.stepdefinit;

import java.time.Duration;
import java.util.List;
<<<<<<< HEAD
import java.util.Map;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
<<<<<<< HEAD
import io.github.bonigarcia.wdm.WebDriverManager;

public class hover {
    WebDriver driver;
    //WebDriverManager.chromedriver().setup();
    @Given("I enter the url of domains")
public void i_enter_the_url_of_domains() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======

public class hover {
    WebDriver driver = new ChromeDriver();
    //WebDriverManager.chromedriver().setup();
    @Given("I enter the url of domains")
public void i_enter_the_url_of_domains() {
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
}
@When("I enter customers credentials")
public void i_enter_customers_credentials() {
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
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Wait for the notification to appear
    WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bar-notification")));
    System.out.println("Notification displayed: " + notification.getText());

    // Close the notification if it is still visible
    WebElement closeButton = notification.findElement(By.className("close"));
    closeButton.click();
    System.out.println("Notification closed!");

    // Ensure notification disappears before proceeding
    wait.until(ExpectedConditions.invisibilityOf(notification));
    System.out.println("Notification disappeared!");

    // Now click on the cart
    WebElement goToCart = wait.until(ExpectedConditions.elementToBeClickable(By.id("topcartlink")));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", goToCart);
    Thread.sleep(500); // Allow UI to settle
    goToCart.click();
    System.out.println("Opened shopping cart successfully!");
} catch (Exception e) {
    System.out.println("Failed to click shopping cart: " + e.getMessage());
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
@Then("I can login domains successfully")
public void i_can_login_domains_successfully() {

    driver.quit();
}
}
