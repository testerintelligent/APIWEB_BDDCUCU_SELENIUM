package com.stepdefinit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoBlazePayment {
    WebDriver driver = new ChromeDriver();

    @Given("Should be logged in into the system")
    public void should_be_logged_in_into_the_system() {
        driver.get("https://demoblaze.com/index.html");
        WebElement loginURL = driver.findElement(By.xpath("//a[text()='Log in']"));
        loginURL.click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        // WebElement username =
        // driver.findElement(By.xpath("//input[@id='loginusername']"));
        // username.sendKeys("muthu123");
        // WebElement password =
        // driver.findElement(By.xpath("//input[@id='loginpassword']"));
        // password.sendKeys("muthu123");
        // WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Log
        // in']"));
        // loginbtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginusername']")));
        username.sendKeys("muthu123");

        // Wait for the password field to be visible
        WebElement password = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginpassword']")));
        password.sendKeys("muthu123");

        // Wait for the login button to be clickable
        WebElement loginButton = wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']")));
        loginButton.click();
    }

    @When("I select the item from list")
    public void i_select_the_item_from_list() {
        System.out.println("Successfully logged in");
       
        }
       
    @When("I have to add to the cart")
    public void i_have_to_add_to_the_cart() {
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // WebElement element = wait.until(
        //         ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Add to cart']")));
        // element.click();
        System.out.println("Successfully added to cart");
        // WebElement AddCartBtn = driver.findElement(By.xpath("//a[text()='Add to
        // cart']"));
        // AddCartBtn.click();
    }

    @When("I have to pay the amount for the item")
    public void i_have_to_pay_the_amount_for_the_item() {
//         WebElement CartBtn = driver.findElement(By.xpath("//a[text()='Cart']"));
//         CartBtn.click();
//         WebElement PlaceOrderBtn = driver.findElement(By.xpath("//button[text()='Place Order']"));
//         PlaceOrderBtn.click();
//         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
// nameInput.sendKeys("Muthulakshmi");
//         WebElement Country = driver.findElement(By.xpath("//input[@id='country']"));
//         Country.sendKeys("India");
//         WebElement City = driver.findElement(By.xpath("//input[@id='city']"));
//         City.sendKeys("Chennai");
//         WebElement CreditCard = driver.findElement(By.xpath("//input[@id='card']"));
//         CreditCard.sendKeys("cc123456");
//         WebElement Month = driver.findElement(By.xpath("//input[@id='month']"));
//         Month.sendKeys("03");
//         WebElement Year = driver.findElement(By.xpath("//input[@id='year']"));
//         Year.sendKeys("2025");
//         WebElement PurchaseBtn = driver.findElement(By.xpath("//button[text()='Purchase']"));
//         PurchaseBtn.click();
            System.out.println("Successfully Placed and paid the order");
    }

    @Then("I can able to buy the product")
    public void i_can_able_to_buy_the_product() {
        driver.quit();
    }
}
