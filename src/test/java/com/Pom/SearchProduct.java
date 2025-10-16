package com.Pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProduct {
WebDriver driver;

public SearchProduct (WebDriver driver) {
        this.driver = driver;
}
public void openLoginPage(String url) {
    driver.get(url);
}
public void ProductOptionClick(){
driver.findElement(By.xpath("//a[@href='/products']")).click();
}
public void enterProductInSearch(String product){
    driver.findElement(By.id("search_product")).sendKeys(product);
}
public void searchProductClick(){
    driver.findElement(By.id("submit_search")).click();
}
public void searchedProductVisible(){
    WebElement searchedProductElement= driver.findElement(By.xpath("//h2[text()='Searched Products']"));
    boolean searchedProductIsVisible = searchedProductElement.isDisplayed();
    Assert.assertTrue("Searched Product not visible", searchedProductIsVisible);
}
public void verifyAllProductsMatchSearch(String searchedproductname) {
    List<WebElement> products = driver.findElements(By.xpath("//div[@class='productinfo text-center']/p"));
    for (WebElement product : products){
        String productname = product.getText();
       Assert.assertTrue(productname, productname.toLowerCase().contains(searchedproductname.toLowerCase())); 
    }
}
}
