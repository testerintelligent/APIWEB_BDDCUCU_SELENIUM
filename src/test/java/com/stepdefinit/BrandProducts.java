package com.stepdefinit;

import org.openqa.selenium.By;

import com.common.BaseClass1;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrandProducts extends BaseClass1 {

    @When("clicking product button")
    public void clicking_product_button() throws InterruptedException {

        winWait(2000);
        // driver.findElement(By.xpath("//a[@style='color:
        // orange;']/following::a[1]")).click();

        driver.get("https://www.automationexercise.com/products");

        // explicitWaitClick("//a[@style='color: orange;']/following::a[1]");

        // WebElement element1 = driver.findElement(By.xpath("//a[@style='color:
        // orange;']/child::i"));

        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].click()", element1);

        // // explicitWaitClick("//a[@style='color: orange;']");
        System.out.println("clicked");
        winWait(2000);

    }

    @When("click on any brand1")
    public void click_on_any_brand1() {
        explicitWaitClick("//a[text()='Mast & Harbour']");

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
        explicitWaitClick("//a[text()='Madame']");
        winWait(500);

    }

    @When("verify if the user is navigated to the coresponding brand page {string}")
    public void verify_if_the_user_is_navigated_to_the_coresponding_brand_page(String val2) {
        String actual = driver
                .findElement(By
                        .xpath("//h2[contains(@class,'title text-center')][text()='Brand - Madame Products']"))
                .getText();
        if (actual.equals(val2)) {
            System.out.println("User is navigated to the Madame brand page successfully");
        }

    }

    @Then("navigate back to the home page")
    public void navigate_back_to_the_home_page() {
        explicitWaitClick("//a[text()=' Home']");
        System.out.println("Navigated successfully");
        driver.quit();

    }

}
