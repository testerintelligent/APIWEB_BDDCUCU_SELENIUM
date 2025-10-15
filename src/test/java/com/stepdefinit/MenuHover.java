package com.stepdefinit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuHover {
    WebDriver driver;

@Given("Menu items should be loaded properly")
public void menu_items_should_be_loaded_properly() {
        WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle(); 
}
@When("I have to hover the menu")
public void i_have_to_hover_the_menu() {
    WebElement HoverMenu = driver.findElement(By.xpath("//ul[@class='top-menu']//following-sibling::a[contains(text(),'Computers')]"));
    Actions actions = new Actions(driver);
    actions.moveToElement(HoverMenu).perform();
    //Thread.sleep(2000);
    System.out.println("Hovered the menu");
}
@Then("I can able to select the submenu")
public void i_can_able_to_select_the_submenu() {
    WebElement SubMenu = driver.findElement(By.xpath("//a[@href='/notebooks']"));
    SubMenu.click();
    System.out.println("Selected the submenu");
    driver.quit();
}

}
