package com.common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public static WebDriver driver;

    public static String userID = "";

    public static WebElement element;

    public void browserLaunch() {
        // ✅ Use headless mode in Jenkins
        ChromeOptions options = new ChromeOptions();
        if (isHeadlessEnv()) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
        }
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void closeBrowser() {
        driver.quit();
    }

    public static void sendKeys(WebElement element, String data) {
        element.sendKeys(data);
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static void winWait(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public static void explicitWaitClick(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    // ✅ Replaced Robot with WebDriver Keys
    public static void pressEnter() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public static void pressDown(int count) throws InterruptedException {
        Actions actions = new Actions(driver);
        for (int i = 0; i < count; i++) {
            actions.sendKeys(Keys.DOWN).perform();
            Thread.sleep(500); // slight wait to simulate user interaction
        }
    }

    public static void pressUp(int count) throws InterruptedException {
        Actions actions = new Actions(driver);
        for (int i = 0; i < count; i++) {
            actions.sendKeys(Keys.UP).perform();
            Thread.sleep(500); // slight wait to simulate user interaction
        }
    }

    public static void selectOptions_Index(WebElement dropdown, int index) throws InterruptedException {
        Select sc = new Select(dropdown);
        List<WebElement> options = sc.getOptions();
        for (WebElement option : options) {
            option.getText(); // optional, unused
        }
        Thread.sleep(500);
        sc.selectByIndex(index);
        Thread.sleep(500);
    }

    private boolean isHeadlessEnv() {
        // Customize this logic as needed
        return System.getenv("JENKINS_HOME") != null || System.getProperty("headless", "false").equals("true");
    }

    public static String randomString(int n) {
        String rand = RandomStringUtils.randomAlphabetic(n);
        return rand;
    }

    public static int randomNumber(int num) {
        Random random = new Random();
        int randomNum = random.nextInt(num);
        return randomNum;
    }

    public static void takesScreenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File path = new File("C:\\Users\\malbert\\Desktop\\screenshots\\WebSample\\Screenshots\\image.jpg");
        FileHandler.copy(src, path);
    }

    public static void takesScreenshot1() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File path = new File("C:\\Users\\malbert\\Desktop\\screenshots\\WebSample\\Screenshots\\name.png");
        FileHandler.copy(src, path);
    }

    public static void js_ScrollDown(int i) {
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,i)");

    }

}
