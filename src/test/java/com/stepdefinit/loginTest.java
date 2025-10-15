
package com.stepdefinit;
import java.time.Duration;
<<<<<<< HEAD
import java.util.Map;
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import com.Pom.LoginPage;
=======
import org.openqa.selenium.support.FindBy;

import com.example.Pom.LoginPage;
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
    WebDriver driver;
=======

public class loginTest {
    WebDriver driver = new ChromeDriver();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    LoginPage loginPage = new LoginPage(driver);

    @FindBy(xpath="//input[@class='button-1 login-button']")
    WebElement loginbtn;

@Given("I enter the url of domain")
public void i_enter_the_url_of_domain() {
<<<<<<< HEAD
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
=======
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    driver.get("https://demowebshop.tricentis.com/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    
        driver.getTitle();

}
@When("I enter customer credentials")
public void i_enter_customer_credentials() {
    WebElement EmailtextBox =driver.findElement(loginPage.customerlogin);    
    EmailtextBox.sendKeys("muthu2@gmail.com");
    //WebElement PasswordText = driver.findElement(By.xpath("//input[@id='Password']"));
    
    loginPage.enterPassword("muthu123"); //using @FindBy
    //WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
    WebElement loginBtn = driver.findElement(loginPage.loginButton);
    loginBtn.click(); //using @FindBy locally
}

@Then("I can login domain successfully")
public void i_can_login_domain_successfully() {
    //boolean isLoginSuccessful = driver.findElement(By.id("logoutButton")).isDisplayed();
    boolean isLoginSuccessful = driver.findElement(By.linkText("Log out")).isDisplayed();
            
    if (isLoginSuccessful) {
        System.out.println("Login successful!");
    } else {
        System.out.println("Login failed!");
    }
        driver.quit();
}
}


 
 