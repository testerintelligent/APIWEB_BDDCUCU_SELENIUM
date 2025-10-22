package com.stepdefinit;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.common.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyAlerts_iFrame extends BaseClass1 {
    ChromeDriver driver;

    @Given("I navigate to the automation practice page")
    public void i_navigate_to_the_automation_practice_page() throws InterruptedException {
         WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        winWait(2000);
    }

    @When("I switch to the iframe")
    public void i_switch_to_the_iframe() throws InterruptedException {
        // //iframe[@name='iframe-name'][@id='courses-iframe']
        List<WebElement> li = driver.findElements(By.tagName("iframe"));
        System.out.println(li.size());
        driver.switchTo().frame(0);
        winWait(2000);
    }

    @Then("I should see the {string} link inside the iframe")
    public void i_should_see_the_link_inside_the_iframe(String string) throws InterruptedException {
        boolean displayed = driver.findElement(By.xpath("(//a[contains(@class,'new-navbar-highlighter')])[2]"))
                .isDisplayed();
                winWait(1000);
        if (displayed) {
            System.out.println("Link displayed : " + string);
        } else {
            System.out.println("Link not displayed======");
        }        
        driver.switchTo().parentFrame();
        //System.out.println("Switched to parent frame");
    }
    
    @When("I enter {string} in the alert textbox")
    public void i_enter_in_the_alert_textbox(String data1) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
        sendKeys(element, data1);
        winWait(2000);
    }

    @When("I click on the Alert button")
    public void i_click_on_the_alert_button() throws InterruptedException {
        WebElement alertBtn = driver.findElement(By.xpath("//input[@id='alertbtn'][@value='Alert']"));
        click(alertBtn);
        winWait(2000);
    }

    @Then("an alert with text containing {string} should appear")
    public void an_alert_with_text_containing_should_appear(String data2) throws InterruptedException {
        Alert simpleAlert = driver.switchTo().alert();
        String alertMsg1 = simpleAlert.getText();
        if (alertMsg1.contains(data2)) {
            System.out.println("Alert conatined the text" + data2);
        }
        winWait(2000);
    }

    @Then("accept the alert")
    public void accept_the_alert() throws InterruptedException {
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        winWait(2000);
    }

    @When("I click on the Confirm button")
    public void i_click_on_the_confirm_button() throws InterruptedException {
        WebElement confirmBtn = driver.findElement(By.xpath("//input[@id='confirmbtn'][@value='Confirm']"));
        click(confirmBtn);
        winWait(2000);
    }

    @Then("a confirm box with text containing {string} should appear")
    public void a_confirm_box_with_text_containing_should_appear(String data3) throws InterruptedException {
        Alert confirmAlert = driver.switchTo().alert();
        String alertMsg = confirmAlert.getText();
        if (alertMsg.contains(data3)) {
            System.out.println("Confirm Alert conatined the text" + data3);
        }
        winWait(2000);
    }

    @Then("dismiss the alert")
    public void dismiss_the_alert() throws InterruptedException {
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();
        winWait(2000);
    }

}
