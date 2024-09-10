package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class SauceCart extends BaseClass {
	public SauceCart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//select[@class='product_sort_container']")
	private WebElement drop;
	
	@FindBy(xpath ="//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement click7;
	
	@FindBy(xpath ="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement click8;
	
	@FindBy(xpath ="//a[@class='shopping_cart_link']")
	private WebElement click9;
	
	@FindBy(xpath ="//button[@id='checkout']")
	private WebElement click00;
	
	@FindBy(id ="first-name")
	private WebElement fname;
	
	@FindBy(id ="last-name")
	private WebElement lname;
	
	@FindBy(id ="postal-code")
	private WebElement pincode;
	
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement click11;

	public WebElement getDrop() {
		return drop;
	}

	public WebElement getClick7() {
		return click7;
	}

	public WebElement getClick8() {
		return click8;
	}

	public WebElement getClick9() {
		return click9;
	}

	public WebElement getClick00() {
		return click00;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getClick11() {
		return click11;
	}

	
}
