package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

//Inheritance - SauceLogin is inherited from SuperClass(BaseClass.java)
public class SauceLogin extends BaseClass {
	public SauceLogin() {  //Constructor - Instance of a class 
		PageFactory.initElements(driver, this);   //PageFactory is being intialized here
	}

	//Encapsulation (Data Hiding)- Below private declaration are used to call within the class 
	@FindBy(xpath="//input[@name='user-name']")
	private WebElement username;

	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement click;
	
	@FindBy(xpath ="//div[text()='Swag Labs']")
	private WebElement text;
	
	@FindBy(xpath ="//div[normalize-space()='Sauce Labs Backpack']")
	private WebElement click1;
	
	@FindBy(xpath ="//button[@id='add-to-cart']")
	private WebElement click2;
	
	@FindBy(xpath ="//a[@class='shopping_cart_link']")
	private WebElement click3;
	
	@FindBy(xpath ="//button[@id='checkout']")
	private WebElement click4;
	
	@FindBy(id="first-name")
	private WebElement first;
	
	@FindBy(id="last-name")
	private WebElement last;
	
	@FindBy(id="postal-code")
	private WebElement pin;
	
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement click5;
	
	@FindBy(xpath ="//button[@id='finish']")
	private WebElement click7;
	
	@FindBy(xpath ="//a[@class='shopping_cart_link']")
	private WebElement click8;
	
	@FindBy(xpath ="//button[@id='checkout']")
	private WebElement click9;
	
	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(id="last-name")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement pinnumber;
	
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement click11;
	
	@FindBy(xpath ="//button[@id='finish']")
	private WebElement click12;


	//Encapsulation -Below Getter and Setter method are used
	//Get -To retrieve the value of above private field
	//Set -To set the value of above private field
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getText() {
		return text;
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

	public WebElement getClick4() {
		return click4;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getClick5() {
		return click5;
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

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPinnumber() {
		return pinnumber;
	}

	public WebElement getClick11() {
		return click11;
	}

	public WebElement getClick12() {
		return click12;
		
	}
	
}
