package com.Pom;

import com.common.BaseClass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class LoginPage extends BaseClass1 {
    WebDriver driver;
    public By customerlogin=(By.xpath("//input[@id='Email']"));
    
    @FindBy(xpath=("//input[@id='Password']"))
    public WebElement passwordTextbox;

    public By loginButton = (By.xpath("//input[@class='button-1 login-button']"));
    
    public LoginPage(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver2, this);  // Initialize elements        
    }
    public void enterPassword(String password) {
        passwordTextbox.sendKeys(password);
    }

    public void openLoginPage(String url) {
    driver.get(url);
}

@FindBy(xpath="//input[@data-qa=\"login-email\"]")
public WebElement loginname;

public void enterUsername(String username){
    waitinputText(loginname, username, 10);
}

public void enterPasswords(String password){
    driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(password);
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
