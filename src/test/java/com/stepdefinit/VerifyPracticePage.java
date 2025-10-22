package com.stepdefinit;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.common.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyPracticePage extends BaseClass1 {

    public static ChromeDriver driver;
    WebDriverWait waits;

    @Given("launch the url {string}")
    public void launch_the_url(String url) throws InterruptedException {
        driver = new ChromeDriver();
       // BaseClass1.driver = driver; 
        driver.manage().window().maximize();
        driver.get(url);
        winWait(2000);
    }

    @When("clicking the radio button")
    public void clicking_the_radio_button() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='radio3'][@name='radioButton'][@type='radio']"));
        winWait(2000);
        System.out.println("button clicked");

    }

    @When("enter the country name {string}")
    public void enter_the_conuntry_name(String name) throws InterruptedException {
       
        WebElement sendname = driver.findElement(By.xpath("//input[@id='autocomplete'][@type='text']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        sendname.sendKeys(name);
        //sendKeys(driver.findElement(By.xpath("//input[@id='autocomplete'][@type='text']")), name);
        winWait(2000);
        pressDown(2);
        pressEnter();
        winWait(2000);
    }

    @When("select the option from drop down")
    public void select_the_option_from_drop_down() throws InterruptedException {

        WebElement element = driver
                .findElement(By.xpath("//select[@id='dropdown-class-example'][@name='dropdown-class-example']"));
        element.sendKeys("Option1");
        winWait(1000);
        // selectOptions_Index(element, 0);

    }

    @When("click the check box")
    public void click_the_check_box() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
        winWait(2000);
        driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
        winWait(2000);

    }

    @Then("click the home button")
    public void click_the_home_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')][text()='Home']"));
        winWait(2000);

    }

    @Then("verify if navigated to home page")
    public void verify_if_navigated_to_home_page() {
        System.out.println("Navigated to home page successfully!");

    }

}
