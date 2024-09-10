package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;
import com.resources.BaseClass;

public class SaucePro extends BaseClass {
	public SaucePro() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']//parent::a//preceding::div//button[text()='Add to cart']")
	 private WebElement click;
	 
	 @FindBy(xpath = "//div[text()='Sauce Labs Backpack']//parent::div//following::a/div[text()='Sauce Labs Fleece Jacket']")
	 private WebElement click1;
	 
	 @FindBy(xpath = "//a[@class='shopping_cart_link']")
	 private WebElement click2;
	 
	 @FindBy(xpath = "//button[@id='checkout']")
	 private WebElement click3;
	 
	 @FindBy(id = "first-name")
	 private WebElement first;
	 
	 @FindBy(id = "last-name")
	 private WebElement last;
	 
	 @FindBy(id = "postal-code")
	 private WebElement click5;
	 
	 @FindBy(xpath = "//input[@id='continue']")
	 private WebElement click6;
	 
	 @FindBy(xpath = "//button[@id='finish']")
	 private WebElement click7;
	 
	 @FindBy(xpath = "//button[text()='Open Menu']")
	 private WebElement click8;
	 
	 @FindBy(xpath = "//a[text()='Logout']")
	 private WebElement click9;
	 
	 @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	 private WebElement click10;
	 
	 @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	 private WebElement click11;
	 
	 @FindBy(xpath = "//a[@class='shopping_cart_link']")
	 private WebElement click12;
 
	 @FindBy(xpath = "//a[text()='Logout']")
	 private WebElement click13;
	 
	 @FindBy(xpath = "//button[@id='checkout']")
	 private WebElement click14;
	 
	 @FindBy(id = "first-name")
	 private WebElement firstname;
	 
	 @FindBy(xpath = "//input[@id='last-name']")
	 private WebElement lastname;
	 
	 @FindBy(id = "postal-code")
	 private WebElement pincode;
	 
	 @FindBy(xpath = "//input[@id='continue']")
	 private WebElement conclick;
	 
	 @FindBy(xpath = "//h3[text()='Error: Last Name is required']")
	 private WebElement ass;
	 
	 @FindBy(xpath = "//a[@class='shopping_cart_link']")
	 private WebElement lclick;
	 
	 @FindBy(xpath = "//a[@class='shopping_cart_link']")
	 private WebElement sclick;
	 
	 @FindBy(xpath = "//button[@id='checkout']")
	 private WebElement cclick;
	 
	 @FindBy(xpath = "//a[@class='shopping_cart_link']")
	 private WebElement scclick;
	 
	 @FindBy(xpath = "//button[@id='continue-shopping']")
	 private WebElement csclick;
	 
	 @FindBy(xpath = "//a[@class='shopping_cart_link']")
	 private WebElement cssclick;
	 
	 @FindBy(xpath = "//button[@id='checkout']")
	 private WebElement csuclick;
	 
	 @FindBy(xpath = "//button[@id='continue-shopping']")
	 private WebElement cscclick;
	 
	 @FindBy(id = "first-name")
	 private WebElement name;
	 
	 @FindBy(id = "last-name")
	 private WebElement namel;
	 
	 @FindBy(id = "postal-code")
	 private WebElement pinzip;
	 
	 @FindBy(xpath = "//input[@id='continue']")
	 private WebElement cseclick;
	 
	 @FindBy(xpath = "//button[@id='finish']")
	 private WebElement fnclick;
	 
	 @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	 private WebElement menuclick;
	 
	 @FindBy(xpath = "//a[@id='about_sidebar_link']")
	 private WebElement siclick;
	 
	 @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	 private WebElement buclick;
	 
	 @FindBy(xpath = "//a[@id='about_sidebar_link']")
	 private WebElement abclick;
	 
//	 @FindBy(xpath = "//button[text()='Sign in']")
//	 private WebElement sigclick;

	public WebElement getClick() {
		return click;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getClick2() {
		return click2;
	}

	public WebElement getClick3() {
		return click3;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getClick5() {
		return click5;
	}

	public WebElement getClick6() {
		return click6;
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

	public WebElement getClick10() {
		return click10;
	}

	public WebElement getClick11() {
		return click11;
	}

	public WebElement getClick12() {
		return click12;
	}

	public WebElement getClick13() {
		return click13;
	}

	public WebElement getClick14() {
		return click14;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getConclick() {
		return conclick;
	}

	public WebElement getAss() {
		return ass;
	}

	public WebElement getLclick() {
		return lclick;
	}

	public WebElement getSclick() {
		return sclick;
	}

	public WebElement getCclick() {
		return cclick;
	}

	public WebElement getScclick() {
		return scclick;
	}

	public WebElement getCsclick() {
		return csclick;
	}

	public WebElement getCssclick() {
		return cssclick;
	}

	public WebElement getCsuclick() {
		return csuclick;
	}

	public WebElement getCscclick() {
		return cscclick;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getNamel() {
		return namel;
	}

	public WebElement getPinzip() {
		return pinzip;
	}

	public WebElement getCseclick() {
		return cseclick;
	}

	public WebElement getFnclick() {
		return fnclick;
	}

	public WebElement getMenuclick() {
		return menuclick;
	}

	public WebElement getSiclick() {
		return siclick;
	}

	public WebElement getBuclick() {
		return buclick;
	}

	public WebElement getAbclick() {
		return abclick;
	}

//	public WebElement getSigclick() {
//		return sigclick;
//	}

	
}
