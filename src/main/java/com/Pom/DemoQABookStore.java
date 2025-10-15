package com.Pom;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQABookStore {
WebDriver driver;

public DemoQABookStore(WebDriver driver) {
        this.driver = driver;
}
public void launchBookStore(String url) {
    driver.get(url);
}
public void verifyLogininBookStore(){
    WebElement bookstoreloginpageelement= driver.findElement(By.xpath("//h5[text()='Login in Book Store']"));
    boolean isVisible=bookstoreloginpageelement.isDisplayed();
    Assert.assertTrue("Login in Book Store not present", isVisible);
}
public void bookStoreUserLogin(String username, String password){
    driver.findElement(By.id("userName")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
}
public void bookStoreLoginClick(){
driver.findElement(By.id("login")).click();
}
public void verifybookstoreloggedinuser(String expectedUsername){
    WebElement userNameElement = driver.findElement(By.xpath("//label[text()='TestUser555']"));
    String actualUserName = userNameElement.getText();
    Assert.assertEquals(expectedUsername, actualUserName);
}
public void newUserClick(){
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
WebElement newUserButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("newUser")));
newUserButton.click();
}
public void verifyBookStoreRegister(){
    WebElement registerElement= driver.findElement(By.xpath("//h4[text()='Register to Book Store']"));
    boolean isVisible=registerElement.isDisplayed();
    Assert.assertTrue("Register to Book Store is not visible", isVisible);
}
public void fillRegisterDetails(String firstname, String lastname, String username, String password){
driver.findElement(By.id("firstname")).sendKeys(firstname);
driver.findElement(By.id("lastname")).sendKeys(lastname);
driver.findElement(By.id("userName")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
}
public void bookStorelogoutClick(){
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log out']")));
    logoutButton.click();
}
}
