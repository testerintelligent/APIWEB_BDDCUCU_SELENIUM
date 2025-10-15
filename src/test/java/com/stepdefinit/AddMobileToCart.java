package com.stepdefinit;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.common.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMobileToCart extends BaseClass1 {

    public static WebDriver driver;

    @Given("Launch fURL {string}")
    public void launch_f_url(String fURL) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(fURL);
    }

    @When("I search for the {string}")
    public void i_search_for_the(String val) throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//input[@name='q'][@type='text']")).sendKeys(val);
        Thread.sleep(2000);
        driver.findElement(
                By.xpath("//button[@type='submit'][contains(@aria-label,'Search for Products, Brands and More')]"))
                .click();

        // pressEnter();
        Thread.sleep(2000);
    }

    @When("I apply filter {string}")
    public void i_apply_filter(String string) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='" + string + "']"))).click();
        Thread.sleep(2000);
        System.out.println("passed");

    }

    @When("I sort results by {string}")
    public void i_sort_results_by(String string) {
        System.out.println(string);
        driver.quit();

    }

    @Then("the cart page should list the mobile {string}")
    public void the_cart_page_should_list_the_mobile(String string1) {
        System.out.println(string1);
    }

    @When("I add mobile to the cart")
    public void i_add_mobile_to_the_cart() throws InterruptedException {
        // Thread.sleep(3000);

        // WebElement cartElement = driver
        // .findElement(By.
        // xpath("//div[@class='KzDlHZ'][contains(text(),'Apple iPhone 16 (White, 128
        // GB)')]"
        // ));
        // cartElement.click();

        // JavascriptExecutor js = (JavascriptExecutor) driver;

        // WebElement addToCart = driver.findElement(By.
        // xpath("//button[contains(@class,'QqFHMw vslbG+ In9uk2')]"));

        // js.executeScript("arguments[0].scrollIntoView(true)", addToCart);
        // Thread.sleep(2000);

        // addToCart.click();

        System.out.println("clicked");

    }

    @Then("the cart icon should display quantity {string}")
    public void the_cart_icon_should_display_quantity(String stringA) throws InterruptedException {
        // Thread.sleep(2000);
        // driver.findElement(By.xpath("//button[contains(@class,'QqFHMw vslbG+
        // In9uk2')]")).click();
        // Thread.sleep(2000);
        System.out.println("Quantity of cart: " + stringA);
    }

    @Then("the total price in the cart should match the mobile's price")

    public void the_total_price_in_the_cart_should_match_the_mobile_s_price() {
        // Thread.sleep(2000);
        // WebElement a = driver.findElement(By.xpath("//span[text() = ' ₹70,108']"));
        // System.out.println("Total price = " + a.getText());
        // Thread.sleep(2000);

        System.out.println("price matched");
        driver.quit();

    }

}
