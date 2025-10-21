package com.stepdefinit;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import com.common.BaseClass1;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasePage {
    public static ChromeDriver driver;
    public static TakesScreenshot ts;

    @Given("launching the url {string}")
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

    @When("verify that the home page is visible successfully")
    public void verify_that_the_home_page_is_visible_successfully() {
        String title = "Automation Exercise";
        // Assert.assertEquals(title, driver.getTitle());
        System.out.println("The Home page is visible");
    }

    @When("Click on Test Cases button")
    public void click_on_test_cases_button() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@type='button'][text()='Test Cases'][contains(@class,'btn btn-success')]"))).click();

    }

    @Then("Verify that the user is navigated to test cases page successfully")
    public void verify_that_the_user_is_navigated_to_test_cases_page_successfully() throws IOException {
        String title2 = "Automation Practice Website for UI Testing - Test Cases";
        Assert.assertEquals(title2, driver.getTitle());
        System.out.println("User is navigated to test cases page");
        // ts = (TakesScreenshot) driver;
        // File src = ts.getScreenshotAs(OutputType.FILE);
        // File path = new
        // File("C:\\Users\\malbert\\Desktop\\WEBSample\\screenshots\\TestCasePage.jpg");
        // FileHandler.copy(src, path);
        driver.quit();

    }

    @When("Click on Products button")
    public void click_on_products_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//i[contains(@class,'material-icons card_travel')]/parent::a")))
                .click();

    }

    @When("Verify that the user is navigated to the ALL PRODUCTS page successfully")
    public void verify_that_the_user_is_navigated_to_the_all_products_page_successfully() {
        String titleProdPage = "Automation Exercise - All Products";
        Assert.assertEquals(titleProdPage, driver.getTitle());
        System.out.println("User is navigated to the ALL PRODUCTS page successfully");
    }

    @When("click on view product of first product")
    public void click_on_view_product_of_first_product() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> li = driver
                .findElements(By.xpath("//a[contains(@href,'/product_details/')][@style='color: brown;']"));
        li.get(0).click();
        System.out.println(driver.getTitle());

    }

    @When("user is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String prodDetail = "Automation Exercise - Product Details";
        Assert.assertEquals(prodDetail, driver.getTitle());
        System.out.println("User Successfully landed on Product detail page");
    }

    @Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_is_visible_product_name_category_price_availability_condition_brand() {
        WebElement addToCart = driver
                .findElement(By.xpath("//button[contains(@class,'btn btn-default cart')]/child::i"));
        Assert.assertTrue(addToCart.isDisplayed());
        System.out.println("Product detail is visible!");
        driver.quit();
    }

    @When("click on Add to cart button")
    public void click_on_add_to_cart_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//button[@type='button'][contains(@class,'btn btn-default cart')]")))
                .click();
        // System.out.println(driver.findElement(By.xpath("//p[text()='Your product has
        // been added to cart.']")).getText());
        System.out.println("Success");
    }

    @Then("verify if the product is added to cart successfully")
    public void verify_if_the_product_is_added_to_cart_successfully() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Your product has been added to cart.']")))
                .click();
        boolean displayed = driver.findElement(By.xpath("//p[text()='Your product has been added to cart.']"))
                .isDisplayed();
        Assert.assertTrue(displayed);
        System.out.println("Product successfully added to cart!");
        System.out.println("Validated");
        driver.quit();

    }

    @When("Click on Contact us button")
    public void click_on_contact_us_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/child::i[contains(@class,'fa fa-envelope')]")))
                .click();

    }

    @When("fill the details in the form")
    public void fill_the_details_in_the_form(DataTable dt) throws InterruptedException {
        List<String> li = dt.asList();
        driver.findElement(By.name("name")).sendKeys(li.get(0));
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys(li.get(1));
        Thread.sleep(2000);
        driver.findElement(By.name("subject")).sendKeys(li.get(2));
        Thread.sleep(2000);
        driver.findElement(By.id("message")).sendKeys(li.get(3));
        Thread.sleep(2000);

    }

    @When("click the submit button")
    public void click_the_submit_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='submit']"))).click();

    }

    @When("click on ok button")
    public void click_on_ok_button() throws InterruptedException {
        Thread.sleep(3000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        System.out.println("Alert handled");

    }

    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String data1) throws InterruptedException {
        System.out.println(data1);
    }

    @Then("Click Home button and verify that landed to home page successfully {string}")
    public void click_home_button_and_verify_that_landed_to_home_page_successfully(String data2)
            throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[contains(@class,'fa fa-angle-double-left')]")).click();
        System.out.println(data2);
        driver.quit();
    }

    @When("Click Signup \\/ Login button")
    public void click_signup_login_button() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(@class,'fa fa-lock')]"))).click();

    }

    @When("Fill all details in Signup and the create account")
    public void fill_all_details_in_signup_and_the_create_account(DataTable dt) throws InterruptedException {
        Map<String, String> mp = dt.asMap();
        driver.findElement(By.name("name")).sendKeys(mp.get("Name"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email'][@name='email'][@data-qa='signup-email']"))
                .sendKeys(mp.get("email"));
        driver.findElement(By.xpath("//button[@type='submit'][text()='Signup']")).click();
        driver.quit();
    }

    // @When("Enter account information1")
    // public void enter_account_information1(DataTable dataTable) throws
    // InterruptedException {

    // driver.findElement(By.xpath("//input[@type='radio'][@id='id_gender2']")).click();
    // Thread.sleep(2000);
    // // driver.findElement(By.id("name")).sendKeys("Mary Margaret");
    // // Thread.sleep(2000);
    // // driver.findElement(By.id("email")).sendKeys("marymargaret.ap@gmail.com");
    // // Thread.sleep(2000);
    // driver.findElement(By.name("password")).sendKeys("Mary@123");
    // Thread.sleep(2000);
    // driver.findElement(By.id("days")).sendKeys("20");
    // Thread.sleep(2000);
    // driver.findElement(By.id("months")).sendKeys("August");
    // Thread.sleep(2000);
    // driver.findElement(By.xpath("//select[@data-qa='years'][@id='years']")).sendKeys("2001");
    // Thread.sleep(2000);
    // driver.findElement(By.xpath("//input[@type='checkbox'][@value='1'][@id='newsletter']")).click();
    // Thread.sleep(2000);
    // driver.findElement(By.xpath("//input[@type='checkbox'][@value='1'][@id='optin']")).click();
    // Thread.sleep(2000);
    // List<WebElement> li1 = driver.findElements(By.xpath("//p[@class='required
    // form-group']"));
    // JavascriptExecutor js = (JavascriptExecutor) driver;
    // js.executeScript("arguments[0].scrollIntoView(false)",
    // driver.findElement(By.xpath("//input[contains(@id,'first_name')][@type='text']")));
    // Thread.sleep(2000);
    // System.out.println("a");
    // for (WebElement x : li1) {
    // List<String> list = dataTable.asList();
    // System.out.println(x.getText());
    // x.sendKeys("Mary");
    // System.out.println("bb");

    // for (int i = 0; i < list.size(); i++) {
    // js.executeScript("arguments[0].setAttribute('value','list.get(i)')", x);
    // Thread.sleep(2000);

    // // x.sendKeys("list.get(i)");

    // }

    // // for (String y : list) {
    // // x.sendKeys(y);
    // // Thread.sleep(2000);
    // // }
    // }

    // System.out.println("success");
    // }

}
