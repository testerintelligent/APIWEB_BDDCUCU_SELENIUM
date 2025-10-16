package com.Pom;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsForm {

    WebDriver driver;

public ContactUsForm (WebDriver driver) {
        this.driver = driver;
}
public void openLoginPage(String url) {
    driver.get(url);
}
public void contactUsVisible(){
    WebElement contactUsElement= driver.findElement(By.xpath("//a[@href='/contact_us']"));
    boolean isVisible=contactUsElement.isDisplayed();
    Assert.assertTrue("contactUs not visible", isVisible);
}
public void contactUsClick(){
driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
}
public void enterName(String name){
driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys(name);
}
public void enterEmail(String email){
driver.findElement(By.name("email")).sendKeys(email);
}
public void enterSubject(String subject){
driver.findElement(By.name("subject")).sendKeys(subject);
}
public void enterMessage(String message){
driver.findElement(By.id("message")).sendKeys(message);
}
public void clickSubmit(){
driver.findElement(By.name("submit")).click();
}
public void okAlert(){
    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
    Alert okPress=wait.until(ExpectedConditions.alertIsPresent());
    okPress.accept();
}
public void sucessMessageVisible(){
    WebElement sucessElement= driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
    boolean sucessIsVisible = sucessElement.isDisplayed();
    Assert.assertTrue("sucess message not visible", sucessIsVisible);
}
    
}
