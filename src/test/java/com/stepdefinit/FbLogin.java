package com.stepdefinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbLogin {
    public static WebDriver driver;

    @Given("launch the url")
    public void launch_the_url() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @When("user enters the fbemail <{string}>")
    public void user_enters_the_fbemail(String data) throws InterruptedException {

        WebElement user = driver.findElement(By.id("email"));
        user.sendKeys(data);
        Thread.sleep(2000);
    }

    @When("user enters the fbpassword <{string}>")
    public void user_enters_the_fbpassword(String data) throws InterruptedException {
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys(data);
        Thread.sleep(2000);
    }

    @When("clicks the fblogin button")
    public void clicks_the_fblogin_button() {
        WebElement log = driver.findElement(By.name("login"));
        log.click();
    }

    @Then("user is directed to the fb home page")
    public void user_is_directed_to_the_fb_home_page() {
        System.out.println("user entered home page");
        driver.quit();
    }

    @Given("launching url")
    public void launching_url() {
        System.out.println("launch");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }

    @When("user enters the userone {string}")
    public void user_enters_the_userone(String data1) throws InterruptedException {
        System.out.println(data1);
        WebElement user = driver.findElement(By.id("email"));
        user.sendKeys(data1);
        Thread.sleep(2000);
    }

    @When("user enters the passone {string}")
    public void user_enters_the_passone(String data2) throws InterruptedException {
        System.out.println(data2);
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys(data2);
        Thread.sleep(2000);
        driver.quit();
    }

    /*
     * @Given("launching url")
     * public void launching_url() {
     * // Write code here that turns the phrase above into concrete actions
     * throw new io.cucumber.java.PendingException();
     * }
     * 
     * @When("user enters the userone {string}")
     * public void user_enters_the_userone(String string) {
     * // Write code here that turns the phrase above into concrete actions
     * throw new io.cucumber.java.PendingException();
     * }
     * 
     * @When("user enters the passone {string}")
     * public void user_enters_the_passone(String string) {
     * // Write code here that turns the phrase above into concrete actions
     * throw new io.cucumber.java.PendingException();
     * }
     * 
     * 
     * %TRACEE
     * 
     * %TESTE 4,Validation of Login Page #2(Login Page)
     * %TESTS 5,Validation of Login Page #3(Login Page)
     * 
     * %ERROR 5,Validation of Login Page #3(Login Page)
     * %TRACES
     * io.cucumber.junit.UndefinedStepException: The step 'launching url' and 2
     * other step(s) are undefined.
     * You can implement these steps using the snippet(s) below:
     * 
     * @Given("launching url")
     * public void launching_url() {
     * // Write code here that turns the phrase above into concrete actions
     * throw new io.cucumber.java.PendingException();
     * }
     * 
     * @When("user enters the userone {string}")
     * public void user_enters_the_userone(String string) {
     * // Write code here that turns the phrase above into concrete actions
     * throw new io.cucumber.java.PendingException();
     * }
     * 
     * @When("user enters the passone {string}")
     * public void user_enters_the_passone(String string) {
     * // Write code here that turns the phrase above into concrete actions
     * throw new io.cucumber.java.PendingException();
     * }
     */

}
