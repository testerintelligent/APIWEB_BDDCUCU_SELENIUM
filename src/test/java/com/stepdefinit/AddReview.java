package com.stepdefinit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.common.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddReview extends BaseClass1 {

    @Given("launching the url1 {string}")
    public void launching_the_url1(String url) throws InterruptedException {
        driver.get(url);
        winWait(2000);

    }

    @When("click the product button")
    public void click_the_product_button() throws InterruptedException {
        winWait(2000);
        explicitWaitClick("//i[contains(@class,'material-icons card_travel')][@style='font-size: 16px;']");

    }

    @When("Verify user entered the all products page")
    public void verify_user_entered_the_all_products_page() {
        boolean displayed = driver
                .findElement(By.xpath("//h2[text()='All Products'][contains(@class,'title text-center')]"))
                .isDisplayed();
        if (displayed) {
            System.out.println("User entered the all products page successfully");
        }

    }

    @When("click on view product")
    public void click_on_view_product() throws InterruptedException {
        explicitWaitClick("//a[text() = ' Products']");
        winWait(2000);

    }

    @When("verify Write your Review element is visible")
    public void verify_write_your_review_element_is_visible() {
        boolean displayed = driver
                .findElement(By.xpath("//a[text()='Write Your Review'][@data-toggle='tab']"))
                .isDisplayed();
        if (displayed) {
            System.out.println("Write your Review element is visible");
        }

    }

    @When("enter your name {string}")
    public void enter_your_name(String data1) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@id='name']")), data1);
        winWait(500);

    }

    @When("enter the email address {string}")
    public void enter_the_email_address(String data2) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@id='email']")), data2);
        winWait(500);

    }

    @When("write your review {string}")
    public void write_your_review(String data3) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//textarea[@id='review'][@name='review']")), data3);
        winWait(500);

    }

    @When("clicking the submit button")
    public void clicking_the_submit_button() throws InterruptedException {
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
