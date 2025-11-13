package com.common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.io.FileUtils;
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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.restassured.http.ContentType;

public class BaseClass1 {
    public static String userID;
    public static ChromeDriver driver;

     public static WebDriver headless(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				ChromeDriverManager cmd = new ChromeDriverManager();
				cmd.setup();
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--headless");
				chromeOptions.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(chromeOptions);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions firefox = new FirefoxOptions();
				firefox.addArguments("--headless");
				WebDriver driver = new FirefoxDriver(firefox);

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.silentOutput", "true");
				WebDriverManager.iedriver().setup();
				WebDriver driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				EdgeOptions edgeOptions = new EdgeOptions();
				edgeOptions.addArguments("--headless");
				WebDriver driver = new EdgeDriver(edgeOptions);
			}
            driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;
	}

    public static String randomString(int n) {
        String rand = RandomStringUtils.randomAlphabetic(n);
        return rand;
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

	   public String waitinputText(Object elementOrLocator, String value, int num) {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(num));
       WebElement element = null;
      if (elementOrLocator instanceof WebElement) {
         element = (WebElement)wait.until(ExpectedConditions.visibilityOf((WebElement)elementOrLocator));
      } else if (elementOrLocator instanceof By) {
         element = (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated((By)elementOrLocator));
      }

      element.sendKeys(value);
      return value;
   }

    public static void explicitWaitClick(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    // ✅ Replaced Robot with WebDriver Keys
    public static void pressEnter(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
    }

	    public static void pressDown(WebDriver driver,int count) throws InterruptedException  {
        Actions actions = new Actions(driver);
        for (int i = 0; i < count; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(2000); // slight wait to simulate user interaction
        }
    }

    public static String getCurrentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        return LocalDateTime.now().format(formatter);
    }

    public static String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDateTime.now().format(formatter);
    }

	    public static void pressUp(WebDriver driver,int count) throws InterruptedException {
        Actions actions = new Actions(driver);
        for (int i = 0; i < count; i++) {
            actions.sendKeys(Keys.ARROW_UP).build().perform();
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

	//Code for Screenshot
	public static void TakeScreenShot() throws IOException {  
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File SaveFile = new File("C:\\Users\\VDI020\\eclipse-workspace\\Maven_Proj_M\\ScreenshotSS.jpeg");
		FileUtils.copyDirectory(screenshotAs, SaveFile);

	}
	
	 public static void takesScreenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File path = new File("C:\\Users\\aarulfrancis\\Desktop\\screenshots\\WebSample\\Screenshots\\image.jpg");
        FileHandler.copy(src, path);
    }

    public static void takesScreenshot1() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File path = new File("C:\\Users\\aarulfrancis\\Desktop\\screenshots\\WebSample\\Screenshots\\name.png");
        FileHandler.copy(src, path);
    }

    public static void js_ScrollDown(int i) {
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,i)");
    }

	    public static int randomNumber(int num) {
        Random random = new Random();
        int randomNum = random.nextInt(num);
        return randomNum;
    }

    public static void LaunchBrowser() {
	WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headed");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of(
    "credentials_enable_service", false,
    "profile.password_manager_enabled", false
    ));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
}

        public static void launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.silentOutput", "true");
				WebDriverManager.chromedriver().setup();
				ChromeOptions chromeOptions =new ChromeOptions();
				chromeOptions.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(chromeOptions);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.silentOutput", "true");
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.silentOutput", "true");
				WebDriverManager.iedriver().setup();
				WebDriver driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.silentOutput", "true");
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
			}
          // driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//return driver;
	}

}
