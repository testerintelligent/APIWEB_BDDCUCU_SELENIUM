package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class LoginPage {
    WebDriver driver = new ChromeDriver();
    public By customerlogin=(By.xpath("//input[@id='Email']"));
    
    @FindBy(xpath=("//input[@id='Password']"))
    public WebElement passwordTextbox;

    public By loginButton = (By.xpath("//input[@class='button-1 login-button']"));
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize elements        
    }
    public void enterPassword(String password) {
        passwordTextbox.sendKeys(password);
    }

    public void openLoginPage(String url) {
    driver.get(url);
}

public void enterUsername(String username){
    driver.findElement(By.name("email")).sendKeys(username);
}

public void enterPasswords(String password){
    driver.findElement(By.name("password")).sendKeys(password);
}

public void loginClick(){
    driver.findElement(By.xpath("//button[text()='Login']")).click();
}

public void verifyLoggedInUser(String expectedUsername){
    WebElement userNameElement = driver.findElement(By.xpath("//b[text()='testuser1']"));
    String actualUserName = userNameElement.getText();
    Assert.assertEquals(expectedUsername, actualUserName);
}
public void logOut(){
    driver.findElement(By.xpath("//a[@href='/logout']")).click();
}
}
