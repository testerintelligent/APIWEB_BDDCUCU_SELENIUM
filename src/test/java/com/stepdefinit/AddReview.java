package com.stepdefinit;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.common.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddReview extends BaseClass1 {

    @Given("launching the url1 {string}")
    public void launching_the_url1(String url) throws Exception {
        WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless=new");
    options.addArguments("--disable-gpu");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--window-size=1920,1080");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
        driver.get(url);
        winWait(2000);
    }

    @When("click the product button")
    public void click_the_product_button() throws Exception {
        winWait(2000);
        driver.findElement(By.xpath("//a[text()=' Products']")).click();
    }

    @When("Verify user entered the all products page")
    public void verify_user_entered_the_all_products_page() throws Exception{
            winWait(5000);
        WebElement textdisplays = driver.findElement(By.xpath("//h2[(text()='All Products')]"));
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true);", textdisplays);
        boolean displays = driver
                .findElement(By.xpath("//h2[(text()='All Products')]"))
                .isDisplayed();
        if (displays) {
            System.out.println("User entered the all products page successfully");
        }
    }

    @When("click on view product")
    public void click_on_view_product() throws Exception {
        WebElement viewprod = driver.findElement(By.xpath("(//a[text()='View Product'])[1]"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", viewprod);
        winWait(1000);
        WebElement viewprodlist = driver.findElement(By.xpath("(//a[text()='View Product'])[1]"));
        viewprodlist.click();
        winWait(2000);
    }

    @When("verify Write your Review element is visible")
    public void verify_write_your_review_element_is_visible() {
        WebElement reviewbtn = driver.findElement(By.xpath("//a[@href='#reviews']"));        
        JavascriptExecutor reviewjs = (JavascriptExecutor)driver;
        reviewjs.executeScript("arguments[0].scrollIntoView(true)", reviewbtn);
        boolean displayed = driver
                .findElement(By.xpath("//a[text()='Write Your Review']"))
                .isDisplayed();
        if (displayed) {
            System.out.println("Write your Review element is visible");
        }
    }

    @When("enter your name {string}")
    public void enter_your_name(String data1) throws Exception {
        sendKeys(driver.findElement(By.xpath("//input[@id='name']")), data1);
        winWait(500);
    }

    @When("enter the email address {string}")
    public void enter_the_email_address(String data2) throws Exception {
        sendKeys(driver.findElement(By.xpath("//input[@id='email']")), data2);
        winWait(500);
    }

    @When("write your review {string}")
    public void write_your_review(String data3) throws Exception {
        sendKeys(driver.findElement(By.xpath("//textarea[@id='review'][@name='review']")), data3);
        winWait(500);
    }

    @When("clicking the submit button")
    public void clicking_the_submit_button() throws Exception {
        explicitWaitClick("//button[@id='button-review'][@type='submit']");
        winWait(500);
    }

    @Then("validate the response message")
    public void validate_the_response_message() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text()='Thank you for your review.'][@style='font-size: 20px;']"))).getText();
        if (actual.equals("Thank you for your review.")) {
            System.out.println("Response validated!");
        }
    }
}
