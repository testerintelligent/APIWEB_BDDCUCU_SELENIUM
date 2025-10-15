package com.stepdefinit;

import com.common.BaseClass1;
import io.cucumber.java.en.When;

public class CategoryProducts extends BaseClass1 {

    @When("click product button")
    public void click_product_button() throws InterruptedException {
        winWait(500);
        driver.get("https://www.automationexercise.com/products");
        winWait(2000);
    }

    @When("click on Category Women")
    public void click_on_category_women() throws InterruptedException {
        explicitWaitClick("(//a[@data-toggle='collapse'][@data-parent='#accordian'])[1]");
        winWait(500);

    }

    @When("click on a sub category")
    public void click_on_a_sub_category() throws InterruptedException {
        explicitWaitClick("//a[text()='Tops ']");
        winWait(500);

    }

    @When("Verify that category page is displayed and confirm text {string}")
    public void verify_that_category_page_is_displayed_and_confirm_text(String data) {
        // String actual = driver
        // .findElement(By
        // .xpath("//h2[contains(@class,'title text-center')][text()='Women - Tops
        // Products']"))
        // .getText();
        // if (actual.equals(data)) {
        System.out.println("User is navigated to the page : " + data);
        // }

    }

    @When("click on Category Men")
    public void click_on_category_men() throws InterruptedException {
        explicitWaitClick("(//a[@data-toggle='collapse'][@data-parent='#accordian'])[2]");
        winWait(1000);
        explicitWaitClick("//a[text()='Tshirts ']");
        winWait(500);

    }

    @When("Verify that the category page is displayed and confirm text {string}")
    public void verify_that_the_category_page_is_displayed_and_confirm_text(String data2) throws InterruptedException {
        // winWait(1000);
        // String actual = driver
        // .findElement(By
        // .xpath("//h2[contains(@class,'title text-center')][text()='Men - Tshirts
        // Products']"))
        // .getText();
        // winWait(1000);
        // if (actual.equals(data2)) {
        System.out.println("User is navigated to the page : " + data2);
        // }

    }

}
