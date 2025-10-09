package com.common;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseClass1 {
    public static String userID;
    public static WebDriver driver;

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
				driver = new FirefoxDriver(firefox);

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.silentOutput", "true");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				EdgeOptions edgeOptions = new EdgeOptions();
				edgeOptions.addArguments("--headless");
				driver = new EdgeDriver(edgeOptions);
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
    
}
