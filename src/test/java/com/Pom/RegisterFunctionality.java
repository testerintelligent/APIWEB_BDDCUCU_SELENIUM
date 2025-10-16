package com.Pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterFunctionality {
WebDriver driver;

public RegisterFunctionality(WebDriver driver){
    this.driver= driver;
}
public void openLoginPage(String url) {
    driver.get(url);
}
public void signUpLoginClick(){
driver.findElement(By.xpath("//a[@href='/login']")).click();
}
public void newUserSignUpVisible(){
    WebElement signUpElement= driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
    boolean isVisible=signUpElement.isDisplayed();
    Assert.assertTrue("New User Signup! is not visible", isVisible);
}
public void signUpName(String name){
driver.findElement(By.name("name")).sendKeys(name);
}
public void emailAddress(String email){
    driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
}
public void signUpClick(){
    driver.findElement(By.xpath("//button[text()='Signup']")).click();
}
}
