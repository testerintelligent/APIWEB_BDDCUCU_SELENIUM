package com.Pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyTestCasePage {
WebDriver driver;

public VerifyTestCasePage (WebDriver driver) {
        this.driver = driver;
}
public void openLoginPage(String url) {
    driver.get(url);
}
public void testCasesVisible(){
    WebElement testCasesElement= driver.findElement(By.xpath("//a[text()=' Test Cases']"));
    boolean isVisible=testCasesElement.isDisplayed();
    Assert.assertTrue("contactUs not visible", isVisible);
}
public void testCasesClick(){
driver.findElement(By.xpath("//a[text()=' Test Cases']")).click();
}
public void testCasePageVisible(){
    WebElement testCasePageElement= driver.findElement(By.xpath("//b[text()='Test Cases']"));
    boolean testCaseIsVisible = testCasePageElement.isDisplayed();
    Assert.assertTrue("Test Case not visible", testCaseIsVisible);
}
}
