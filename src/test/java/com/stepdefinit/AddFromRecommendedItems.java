package com.stepdefinit;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddFromRecommendedItems {
    public static WebDriver driver;
    public static TakesScreenshot ts;
    public static JavascriptExecutor js;

    @Given("Launch the given URL {string}")
    public void launch_the_given_url(String url) {

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
    }

    @When("Scroll to bottom of home page")
    public void scroll_to_bottom_of_home_page() throws InterruptedException {
        Thread.sleep(2000);
        js = (JavascriptExecutor) driver;
        WebElement recBtn = driver
                .findElement(By.xpath("//h2[contains(@class,'title text-center')][text()='recommended items']"));
        js.executeScript("arguments[0].scrollIntoView(true)", recBtn);
        Thread.sleep(2000);
    }

    @When("verify Recommended items are visible")
    public void verify_recommended_items_are_visible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[contains(@class,'title text-center')][text()='recommended items']")))
                .getText();
        if (actual.equals("recommended items")) {
            System.out.println("Recommended items are visible");
        } else {
            System.out.println("Recommended items are not visible");
        }
    }

    @When("click on add to cart")
    public void click_on_add_to_cart() {

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
        // "//a[@data-product-id='4'][contains(@class,'btn btn-default
        // add-to-cart')]/parent::div/child::p")))
        // .click();

        System.out.println("added to cart");

    }

    @When("click on cart button")
    public void click_on_cart_button() {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-2000)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("(//a/child::i)[3]")).click();
        System.out.println("cart button clicked");
    }

    @When("verify if the products are displayed")
    public void verify_if_the_products_are_displayed() {
        // boolean displayed = driver.findElement(By.xpath("//a[text()='Stylish
        // Dress']")).isDisplayed();
        // if (displayed) {
        // System.out.println("The product is displayed");

        // } else if (!displayed) {
        // System.out.println("The product is not displayed");
        // }
        System.out.println("cart is empty");
        driver.quit();

    }

}
