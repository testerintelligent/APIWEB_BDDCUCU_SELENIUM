package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Properties;

import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class BaseClass {
	// Intializing the variable
	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	public static String ID;
	public static String name;
	public static String addressLine1;
	public static String city;
	public static String region;

	public static void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headed");
		options.addArguments("disable-infobars");
		options.setExperimentalOption("prefs", Map.of(
				"credentials_enable_service", false,
				"profile.password_manager_enabled", false));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	public static String getproperty(String value) throws IOException { // Declaring and Handling IOException
		FileInputStream file = new FileInputStream("Config\\config.properties");
		Properties p = new Properties();
		p.load(file);
		return p.getProperty(value);
	}

	public static void LaunchURL(String URL) {
		driver.get(URL);
	}

	public static void Click(WebElement c) {
		c.click();
	}

	public static String GetCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		System.err.println(currentUrl);
		return currentUrl;
	}

	public static String GetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public static void EnterValue(WebElement w, String s) {
		w.sendKeys(s);
	}

	public void closeBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}

	public static void moveToElement(WebElement m) {
		a = new Actions(driver);
		a.moveToElement(m).perform();
	}

	public static void contextClick(WebElement c) {
		a = new Actions(driver);
		a.contextClick(c).perform();

	}

	public static void DoubleClick(WebElement d) {
		a = new Actions(driver);
		a.doubleClick(d).perform();
	}

	public static void dragDrop(WebElement src, WebElement des) {
		a.dragAndDrop(src, des).perform();
	}

	public static void SBI(WebElement w, int index) {
		s = new Select(w);
		s.selectByIndex(index);
	}

	public static void SBV(WebElement w, String value) {
		s = new Select(w);
		s.selectByValue(value);
	}

	public static void SBVT(WebElement w, String text) {
		s = new Select(w);
		s.selectByVisibleText(text);
	}

	// API POST Request with Header
	public void POST(String responseBody, String param, int statusCode, String jsonObj, String value)
			throws IOException {
		given().header("Authorization", "Basic ZGVtbzoxMjM0").header("Content-Type", "application/json")
				.contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(new File(getproperty(responseBody))).when().post(param).then().assertThat()
				.statusCode(statusCode).body(jsonObj, equalTo(value)).log().all();
	}

	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
