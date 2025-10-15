package com.stepdefinit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT {
    
public static void main(String[] args) {
    
    ChromeOptions options = new ChromeOptions();
 
        // Set your existing Chrome user data directory
        options.addArguments("user-data-dir=C:\\Selenium");
 
        // Specify which profile folder to use (Default or Profile 1, etc.)
        options.addArguments("profile-directory=Profile 3"); // or "Default"
 
        // Recommended flags for automation stability
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.addArguments("--remote-allow-origins=*");
 
        ChromeDriver driver = new ChromeDriver(options);
         WebDriverManager.chromedriver().setup();
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();

    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

}

}
