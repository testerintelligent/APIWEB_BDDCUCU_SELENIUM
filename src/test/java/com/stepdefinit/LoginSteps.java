package com.stepdefinit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Pom.loginOR;
import com.common.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass1 {
    public static ChromeDriver driver;

    @Given("I open the login page")
    public void open_login_page() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");

             driver = new ChromeDriver(options);
             driver.manage().window().maximize();
        driver.get("https://demo-saas.bugbug.io/sign-in");
    }

    @When("I enter valid credentials")
    public void enter_credentials() throws Exception {
        winWait(2000);
        driver.findElement(loginOR.EMAIL_INPUT).sendKeys("felixjerrin@gmail.com");
        driver.findElement(loginOR.PASSWORD_INPUT).sendKeys("Felixjerry@1234");
        driver.findElement(loginOR.LOGIN_BUTTON).click();
    }

    @Then("I should see the homepage")
    public void verify_homepage() throws Exception {
        winWait(2000);
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        // Update this check to match the actual homepage title after login
        if (!title.toLowerCase().contains("demo saas")) {
            throw new AssertionError("Homepage not displayed! Title was: " + title);
        }
    }

    @Then("I click logout")
public void i_click_logout() {
    System.out.println("Logout the Application");
}
@Then("validate the response message {string}")
public void validate_the_response_message(String string) {
    System.out.println("Success Message showing");
    // Write code here that turns the phrase above into concrete actions
    driver.quit();
}
}
