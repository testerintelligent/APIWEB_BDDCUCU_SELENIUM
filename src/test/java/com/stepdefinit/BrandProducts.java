package com.stepdefinit;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.common.BaseClass1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrandProducts extends BaseClass1 {
    ChromeDriver driver;

    @Given("launching the Automation website url {string}")
    public void launching_the_url(String url) {
        WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get(url);
    }

    @When("clicking product button")
    public void clicking_product_button() throws InterruptedException {
       winWait(2000);
        driver.get("https://www.automationexercise.com/products");
        System.out.println("clicked");
        winWait(2000);

    }

    @When("Verifying user entered the all products page")
    public void Verifying_user_entered_the_all_products_page() {
        WebElement textdisplays = driver
                .findElement(By.xpath("//h2[contains(text(),'All Products')]"));
       // driver.manage().window().maximize();
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true);", textdisplays);
       // driver.manage().window().maximize();
        boolean displays = driver
                .findElement(By.xpath("//h2[text()='All Products'][contains(@class,'title text-center')]"))
                .isDisplayed();
        if (displays) {
            System.out.println("User entered the all products page successfully");
        }
    }

    @When("click on any brand1")
    public void click_on_any_brand1() throws Exception {
        WebElement scrollharbour = driver.findElement(By.xpath("//a[text()='Mast & Harbour']"));
        JavascriptExecutor jsec = (JavascriptExecutor)driver;
        jsec.executeScript("arguments[0].scrollIntoView(true)",scrollharbour);
        scrollharbour.click();
        winWait(2000);
    }

    @When("verify if the user is navigated to the particular brand page {string}")
    public void verify_if_the_user_is_navigated_to_the_particular_brand_page(String val1) {
        String actual = driver
                .findElement(By
                        .xpath("//h2[contains(@class,'title text-center')][text()='Brand - Mast & Harbour Products']"))
                .getText();
        if (actual.equals(val1)) {
            System.out.println("User is navigated to the Mast & Harbour brand page successfully");
        }

    }

    @When("click on any other brand")
    public void click_on_any_other_brand() throws InterruptedException {
        WebElement brandname = driver.findElement(By.xpath("//a[text()='Madame']"));
        JavascriptExecutor brdjs = (JavascriptExecutor)driver;
        brdjs.executeScript("arguments[0].scrollIntoView(true)", brandname);
        brandname.click();
        winWait(500);
    }

    @When("verify if the user is navigated to the coresponding brand page {string}")
    public void verify_if_the_user_is_navigated_to_the_coresponding_brand_page(String val2) {
        String actual = driver
                .findElement(By
                        .xpath("//h2[text()='Brand - Madame Products']"))
                .getText();
        if (actual.equals(val2)) {
            System.out.println("User is navigated to the Madame brand page successfully");
        }

    }

    @Then("navigate back to the home page")
    public void navigate_back_to_the_home_page() {
        driver.findElement(By.xpath("//a[text()=' Home']"));
        System.out.println("Navigated successfully");
        driver.quit();

    }

}
