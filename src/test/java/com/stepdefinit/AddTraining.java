package com.stepdefinit;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.common.BaseClass1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTraining extends BaseClass1{

    // public static WebDriver driver;
    WebDriver driver;
   // WebDriverWait waits; 

    @Given("launch the employee training url {string}")
    public void launch_the_employee_training_url(String url) throws InterruptedException {
        driver = new ChromeDriver();
        winWait(1000);
        driver.get(url);
        winWait(1000);
    }

    @Then("verify if the error msg is shown")
    public void verify_if_the_error_msg_is_shown() throws IOException, InterruptedException {
        winWait(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
            System.out.println("Alert Handled======");
        } catch (Exception e) {
            System.out.println("Alert disappeared");
        } finally {
            System.out.println("Error msg is shown");
        }

        // try {
        // Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        // System.out.println("Alert Text: " + alert.getText());
        // alert.accept();
        // } catch (Exception e) {
        // System.out.println("Alert not found or disappeared");
        // }

    }

    @When("enter the completion percentage {int}")
    public void enter_the_completion_percentage(Integer int3) throws InterruptedException {
        int val = int3;
        int randomPercentage = randomNumber(val);
        String percentage = String.valueOf(randomPercentage);

        WebElement element = driver.findElement(By.xpath("//input[@name='percentCompleted']"));
        element.clear();
        BaseClass1.winWait(2000);
        sendKeys(element, percentage);
        BaseClass1.winWait(2000);

    }

    @When("enter the name of employee {int}")
    public void enter_the_name_of_employee(Integer int1) throws InterruptedException {
        int n = int1;
        String randStrg = randomString(n);

        sendKeys(driver.findElement(By.xpath("//input[@type='text'][@name='employeeName']")), randStrg);
        BaseClass1.winWait(1000);

    }

    @When("enter the name of trainer {int}")
    public void enter_the_name_of_trainer(Integer int2) throws InterruptedException {
        int m = int2;
        String randStrg2 = randomString(m);

        sendKeys(driver.findElement(By.xpath("//input[@name='trainerName']")), randStrg2);
        BaseClass1.winWait(1000);

    }

    

    // @Given("launch the employee training url")
    // public void launch_the_employee_training_url() throws InterruptedException {
    // BaseClass.winWait(1000);

    // driver.get("http://10.192.190.130:3000/");
    // BaseClass.winWait(1000);

    // }

    @When("click the add training button")
    public void click_the_add_training_button() throws InterruptedException {
        BaseClass1.winWait(1000);
        // BaseClass.click(new AddTrainingLocator().getAddTrainingBtn());
        // BaseClass.winWait(2000);
       // waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class=\\\"MuiTouchRipple-root css-r3djoj-MuiTouchRipple-root\\\"])[2]")));
        WebElement addbtnclick = driver.findElement(By.xpath("//button[@aria-label=\"Add Training\"]"));   
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));     
        waits.until(ExpectedConditions.elementToBeClickable(addbtnclick)).click();
        BaseClass1.winWait(1000);
        System.out.println("clicked=====");
    }

    @When("verify the user is navigated to the add training page")
    public void verify_the_user_is_navigated_to_the_add_training_page() throws InterruptedException {
        System.out.println("User is navigated to add training page");
        BaseClass1.winWait(2000);
    }

    @When("Select the project name {string}")
    public void select_the_project_name(String index) throws InterruptedException {
        WebElement projectName = driver.findElement(By.xpath("(//div[@tabindex='0'][@role='combobox'])[1]"));
        click(projectName);
        System.out.println("Project name clicked==========");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        int n = Integer.parseInt(index);
        winWait(1000);
        pressDown(driver, n);
        winWait(1000);
        pressEnter(driver);
        winWait(1000);
    }

    @When("enter the employee name {string}")
    public void enter_the_employee_name(String data2) throws InterruptedException {
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript();
        sendKeys(driver.findElement(By.xpath("//input[@type='text'][@name='employeeName']")), data2);
        BaseClass1.winWait(1000);
    }

    @When("enter the course {string}")
    public void enter_the_course(String data3) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@name='course']")), data3);
        BaseClass1.winWait(1000);
    }

    @When("enter the trainer name {string}")
    public void enter_the_trainer_name(String data4) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@name='trainerName']")), data4);
        BaseClass1.winWait(1000);
    }

    @When("select the training type {string}")
    public void select_the_training_type(String data5) throws InterruptedException {

        WebElement trainingType = driver.findElement(By.xpath("(//div[@role='combobox'])[2]"));
        click(trainingType);
        System.out.println("Training type clicked==");
        int n = Integer.parseInt(data5);
        winWait(1000);
        pressDown(driver,n);
        winWait(1000);
        pressEnter(driver);
        winWait(1000);
        // sendKeys(driver.findElement(By.xpath("//div[text()='Udemy']")), data5);
        // BaseClass.winWait(1000);
    }

    @When("enter the start date {string}")
    public void enter_the_start_date(String data6) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath(" //input[@name='startDate']")), data6);
        BaseClass1.winWait(1000);
    }

    @When("enter the end date {string}")
    public void enter_the_end_date(String data7) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("// input[@name='endDate']")), data7);
        BaseClass1.winWait(1000);
    }

    @When("select the status {string}")
    public void select_the_status(String data8) throws InterruptedException {
        WebElement status = driver.findElement(By.xpath("(//div[@tabindex='0'][@role='combobox'])[3]"));
        click(status);
        System.out.println("Status clicked==");
        int n = Integer.parseInt(data8);
        winWait(1000);
        pressUp(driver,n);
        // pressDown(n);
        winWait(1000);
        pressEnter(driver);
        winWait(1000);
        // BaseClass.winWait(1000);
        // sendKeys(driver.findElement(By.xpath("//div[text()='Completed']")), data8);
        // pressEnter();
        // BaseClass.winWait(1000);

    }

    @When("enter the percentage completed {string}")
    public void enter_the_percentage_completed(String data9) throws InterruptedException {
        WebDriverWait waits1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        waits1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='percentCompleted']")));
        WebElement element = driver.findElement(By.xpath("//input[@name='percentCompleted']"));
        element.clear();
        BaseClass1.winWait(500);
        sendKeys(element, data9);
        BaseClass1.winWait(500);
    }

    @When("click the add button")
    public void click_the_add_button() throws InterruptedException, IOException {
        driver.findElement(By.xpath("//button[@type='button'][text()='Add']"));
        BaseClass1.winWait(1000);

        // takesScreenshot1();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        // try {
        // Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        // System.out.println("Alert Text: " + alert.getText());
        // alert.accept();
        // } catch (Exception e) {
        // System.out.println("Alert not found or disappeared");
        // }

        // takesScreenshot1();
    }

    @Then("verify if the page is navigated to details page")
    public void verify_if_the_page_is_navigated_to_details_page() {
        System.out.println("Navigated to details page");
        driver.quit();
    }

}
