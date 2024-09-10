package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class Cyclos extends BaseClass{

	public Cyclos() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()=' Login ']")
	private WebElement login;
	
	@FindBy(xpath="//input[@autocomplete='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@autocomplete='password']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//div[text()='  Divya ']")
	private WebElement user;
	
	@FindBy(xpath="(//div[@class='data-item'])[1]")
	private WebElement name;
	
	@FindBy(xpath="(//div[@class='data-item'])[3]")
	private WebElement city;
	
	@FindBy(xpath="(//div[@class='data-item'])[4]")
	private WebElement state;
	
	@FindBy(xpath="(//span[@class='inline-label'])[2]")
	private WebElement City_01;

	public WebElement getCity_01() {
		return City_01;
	}

	public void setCity_01(WebElement city_01) {
		City_01 = city_01;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public WebElement getUser() {
		return user;
	}

	public void setUser(WebElement user) {
		this.user = user;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}
	
	
	
}
