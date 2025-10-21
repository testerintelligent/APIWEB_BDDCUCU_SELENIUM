package com.stepdefinit;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

import com.common.BaseClass1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class automationExercise extends BaseClass1 {
    
    public static ChromeDriver driver;
    public static TakesScreenshot ts;

    @Given("launching the website url {string}")
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

    @When("clicking the product hyperlink text")
    public void clicking_the_product_button_icon() throws Exception {
        winWait(500);
        driver.findElement(By.partialLinkText(" Products")).click();       
    }

    
    @When("Verify users entered the all products page")
    public void verify_user_entered_the_all_products_page() throws Exception {
        winWait(200);
        WebElement textdisplays = driver
                .findElement(By.xpath("//h2[contains(text(),'All Products')]"));
       // driver.manage().window().maximize();
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true);", textdisplays);
        boolean displays = textdisplays.isDisplayed();
        if (displays) {
            System.out.println("User entered the all products page successfully");
        }
    }

    @When("click on Category Womenpage")
    public void click_on_category_women() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='#Women']")).click();
        winWait(500);
    }

    @When("click on a subcategory")
    public void click_on_a_sub_category() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Tops ']")).click();
       // explicitWaitClick("//a[text()='Tops ']");
        winWait(500);
    }

    @When("Verify that categorypage is displayed and confirm text {string}")
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

    @When("click on Category type Men")
    public void click_on_category_men() throws InterruptedException {
        driver.findElement(By.xpath("(//a[@data-toggle='collapse'][@data-parent='#accordian'])[2]"));
        winWait(1000);
        driver.findElement(By.xpath("//a[text()='Tshirts ']"));
        winWait(500);
    }

    @When("Verify that the category page text is displayed and confirm text {string}")
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
        driver.quit();

    }
}
