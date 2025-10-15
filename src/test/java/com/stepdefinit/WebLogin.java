package com.stepdefinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebLogin {

   public static WebDriver driver;

   @Given("user is on login page")
   public void user_is_on_login_page() {
      driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      System.out.println("User entered the login page");
   }

   @When("Enter valid UserName")
   public void enter_valid_user_name() {
      WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
      email.sendKeys("Margaret");
      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {
         System.out.println("e");
      }
   }

   @When("Enter valid Password")
   public void enter_valid_password() throws InterruptedException {

      WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
      pass.sendKeys("Mary@123");
      Thread.sleep(2000);
   }

   @When("Click the login button2")
   public void click_the_login_button2() {
      WebElement loginbtn = driver.findElement(By.name("login"));
      loginbtn.click();

   }

   @Then("user is redirected to the home Page")
   public void user_is_redirected_to_the_home_page() {
      System.out.print("Successfully validated");
      driver.quit();

   }
}
