package com.stepdefinit;

import com.Pom.SauceLogin;
import com.Pom.SaucePro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Pom.SauceCart;
import com.resources.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class SauceStep extends BaseClass {
//WebDriver driver;
	SaucePro pro;
	SauceCart cart;
	SauceLogin login;
	
	
//	@After
//	public void after() {
//		driver.close();
//
//	}
	
	@Given("User should launch the browser")
	public void user_should_launch_the_browser() {
	  LaunchBrowser();
	  LaunchURL("https://www.saucedemo.com/");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("User should write {string} and {string}")
	public void user_should_write_and(String username, String password) {
	   login = new SauceLogin();
	  EnterValue(login.getUsername(), username);
	   EnterValue(login.getPassword(), password);
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
	  Click(login.getClick());
	}

	@Then("User should verify success message after login")
	public void user_should_verify_success_message_after_login() {
	    login.getText();
	    //assert.assertEquals("verify login", "Swag Labs", f);
	    
	}
	
	@Then("User should logoff")
	public void user_should_logoff() {
		driver.close();
	}



	
	@Then("User should click the product")
	public void user_should_click_the_product() {
		Click(login.getClick1());
		Click(login.getClick2());
		driver.close();
	}

	@Then("User should click the Add to cart button")
	public void user_should_click_the_add_to_cart_button() {
		Click(login.getClick3());
		Click(login.getClick4());
		EnterValue(login.getFirst(), "praveen");
		EnterValue(login.getLast(), "kumar");
		EnterValue(login.getPin(), "600096");
		Click(login.getClick5());
		Click(login.getClick7());
		driver.close();
	}

	@Then("User should click cart button")
	public void user_should_click_cart_button() {
		Click(login.getClick8());
		Click(login.getClick9());
		EnterValue(login.getFirstname(), "masi");
		EnterValue(login.getLastname(), "masi");
		EnterValue(login.getPinnumber(), "600096");
		Click(login.getClick11());
		Click(login.getClick12());
		driver.close();
	}

	@Then("User should click the filter button")
	public void user_should_click_the_filter_button() {
		cart = new SauceCart();
		SBI(cart.getDrop(), 1);
		Click(cart.getClick7());
		Click(cart.getClick8());
		Click(cart.getClick9());
		Click(cart.getClick00());
		EnterValue(cart.getFname(), "sam");
		EnterValue(cart.getLname(), "kumar");
		EnterValue(cart.getPincode(), "600097");
		Click(cart.getClick11());
		driver.close();
	}

	@Then("User should use dynamic path")
	public void user_should_use_dynamic_path() {
	    pro = new SaucePro();
	    Click(pro.getClick());
	    Click(pro.getClick1());
	    Click(pro.getClick2());
	    Click(pro.getClick3());
	    EnterValue(pro.getFirst(), "kumar");
	    EnterValue(pro.getLast(), "kumar");
	    EnterValue(pro.getClick5(),"600096");
	    Click(pro.getClick6());
	    Click(pro.getClick7());
	    driver.close();
	    	}

	@Then("User should click logout")
	public void user_should_click_logout() {
		 pro = new SaucePro();
	   Click(pro.getClick8());
	   Click(pro.getClick9());
	   driver.close();
	}

	@Then("User should all Add to Cart")
	public void user_should_all_add_to_cart() {
		 pro = new SaucePro();
	    Click(pro.getClick10());
	    Click(pro.getClick11());
	    driver.close();
	}

	@Then("User should click all cart")
	public void user_should_click_all_cart() {
		 pro = new SaucePro();
	   Click(pro.getClick12());
	   Click(pro.getClick14());
	   EnterValue(pro.getFirstname(), "aravind");
	   EnterValue(pro.getLastname(), "kumar");
	   EnterValue(pro.getPincode(), "600099");
	   Click(pro.getConclick());
	   driver.close();
	   
	}

	@Then("User should click cart")
	public void user_should_click_cart() {
		 pro = new SaucePro();
	Click(pro.getLclick());
	driver.close();
	    
	}

	@Then("User should click carts")
	public void user_should_click_carts() {
		 pro = new SaucePro();
	    Click(pro.getSclick());
	    Click(pro.getCclick());
	    driver.close();
	}

	@Then("User should click cart to contiune")
	public void user_should_click_cart_to_contiune() {
		 pro = new SaucePro();
	Click(pro.getScclick());
	Click(pro.getCsclick());
	driver.close();
	}

	@Then("User should about")
	public void user_should_about() {
		 pro = new SaucePro();
	  Click(pro.getMenuclick());
	  Click(pro.getSiclick());
	  driver.close();
	}

	@Then("User should click request")
	public void user_should_click_request() {
		 pro = new SaucePro();
	    Click(pro.getBuclick());
	    Click(pro.getAbclick());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

////login the application
//	@Given("User get the title")
//	public void user_get_the_title() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//
//	}
//
//	@When("User should enter the username")
//	public void user_should_enter_the_username() {
//		s = new LoginPage();
//		s.getSignIn().click();
//		s.getUsername().sendKeys("KavithaK_78");
//	}
//
//	@When("User should enter the password")
//	public void user_should_enter_the_password() {
//		s.getPassword().clear();
//		s.getPassword().sendKeys("Kavithak78@");
//	}
//
//	@Then("User should login the application")
//	public void user_should_login_the_application() {
//		s.getLogin().click();
//		driver.quit();
//	}
//
////Choose the fish
//	@Given("User launch the url")
//	public void user_launch_the_url() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		GetTitle();
//	}
//
//	@When("User choose the fish")
//	public void user_choose_the_fish() {
//		FrontPage f = new FrontPage();
//		f.getFish().click();
//
//	}
//
//	@Then("User should choose the product")
//	public void user_should_choose_the_product() {
//		ProductPage p = new ProductPage();
//		p.getAngleFish().click();
//		driver.quit();
//
//	}
//
////Choose the Dog
//	@Given("User get the current url")
//	public void user_get_the_current_url() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		GetTitle();
//	}
//
//	@When("User choose the Dos")
//	public void user_choose_the_dos() {
//		FrontPage f = new FrontPage();
//		f.getDogs().click();
//
//	}
//
//	@Then("User should choose the Dog")
//	public void user_should_choose_the_dog() {
//		ProductPage p = new ProductPage();
//		p.getBulldog().click();
//		driver.quit();
//	}
//
////Choose the Cats
//	@Given("User Get the url")
//	public void user_get_the_url() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		GetTitle();
//		GetCurrentURL();
//	}
//
//	@When("User choose the Cats")
//	public void user_choose_the_cats() {
//		FrontPage f = new FrontPage();
//		f.getCats().click();
//	}
//
//	@Then("User should choose the Cat")
//	public void user_should_choose_the_cat() {
//		ProductPage p= new ProductPage();
//		p.getManxCat().click();
//		driver.quit();
//	}
//
////Choose the Reptiles
//	@Given("User Get the title and url")
//	public void user_get_the_title_and_url() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		GetTitle();
//		GetCurrentURL();
//	}
//
//	@When("User choose the Reptiles")
//	public void user_choose_the_reptiles() {
//		FrontPage f = new FrontPage();
//		f.getReptiles().click();
//	}
//
//	@Then("User should choose the Reptiles")
//	public void user_should_choose_the_reptiles() {
//		ProductPage p = new ProductPage();
//		p.getRattlesnakeReptiles().click();
//		driver.quit();
//	}
//
////Choose the Birds
//	@Given("User should get the title")
//	public void user_should_get_the_title() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		GetTitle();
//		GetCurrentURL();
//	}
//
//	@When("User choose the Birds")
//	public void user_choose_the_birds() {
//		FrontPage f = new FrontPage();
//		f.getBirds().click();
//	}
//
//	@Then("User should choose the Birds")
//	public void user_should_choose_the_birds() {
//		ProductPage p = new ProductPage();
//		p.getFinchBird().click();
//		driver.quit();
//	}
//
////Add the fish to cart
//	@Given("User get the title for the application")
//	public void user_get_the_title_for_the_application() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		GetTitle();
//		GetCurrentURL();
//	}
//
//	@When("User choose the fish in the front page")
//	public void user_choose_the_fish_in_the_front_page() {
//		FrontPage f = new FrontPage();
//		f.getFish().click();
//	}
//
//	@Then("User should choose add the fish to cart")
//	public void user_should_choose_add_the_fish_to_cart() {
//		ProductPage p = new ProductPage();
//		p.getAngleFish().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//		driver.quit();
//
//	}
//
////Add the Dog to cart
//	@Given("User launch the application")
//	public void user_launch_the_application() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		GetTitle();
//		GetCurrentURL();
//	}
//
//	@When("User choose the Dog in the front page")
//	public void user_choose_the_dog_in_the_front_page() {
//		FrontPage f = new FrontPage();
//		f.getDogs().click();
//	}
//
//	@Then("User should choose add the Dog to cart")
//	public void user_should_choose_add_the_dog_to_cart() {
//		ProductPage p = new ProductPage();
//		p.getBulldog().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//		driver.quit();
//
//	}
//
////Add the Cats to cart
//	@Given("User launching the url")
//	public void user_launching_the_url() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		GetTitle();
//		GetCurrentURL();
//	}
//
//	@When("User choose the Cats in the front page")
//	public void user_choose_the_cats_in_the_front_page() {
//		FrontPage f = new FrontPage();
//		f.getCats().click();
//	}
//
//	@Then("User should add the cat to cart")
//	public void user_should_add_the_cat_to_cart() {
//		ProductPage p = new ProductPage();
//		p.getPersianCat().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//		driver.quit();
//	}
//
////Add the Reptiles to cart
//	@Given("User launch the url app")
//	public void user_launch_the_url_app() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		GetTitle();
//		GetCurrentURL();
//	}
//
//	@When("User choose the Reptiles in the front page")
//	public void user_choose_the_reptiles_in_the_front_page() {
//		FrontPage f = new FrontPage();
//		f.getReptiles().click();
//	}
//
//	@Then("User should add the Reptiles to cart")
//	public void user_should_add_the_reptiles_to_cart() {
//		ProductPage p = new ProductPage();
//		p.getIguanaReptiles().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//		driver.quit();
//	}
//
////Add the Birds to cart
//	@Given("User launching the application url")
//	public void user_launching_the_application_url() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//	}
//
//	@When("User choose the Birds in the front page")
//	public void user_choose_the_birds_in_the_front_page() {
//		FrontPage f = new FrontPage();
//		f.getBirds().click();
//
//	}
//
//	@Then("User should add the Birds to cart")
//	public void user_should_add_the_birds_to_cart() {
//		ProductPage p = new ProductPage();
//		p.getFinchBird().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//		driver.quit();
//	}
//
////Remove the fish to cart
//	@Given("Choose the fish to cart")
//	public void choose_the_fish_to_cart() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//	}
//
//	@When("User Add the fish to cart")
//	public void user_add_the_fish_to_cart() {
//		FrontPage f = new FrontPage();
//		f.getFish().click();
//		ProductPage p = new ProductPage();
//		p.getAngleFish().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//	}
//
//	@Then("User Remvoe the fish to cart")
//	public void user_remvoe_the_fish_to_cart() {
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		SauceLogin a= new SauceLogin();
//		a.getRemoveCart().click();
//		driver.quit();
//	}
//
////Remove dog to cart
//	@Given("Choose the Dog to cart")
//	public void choose_the_dog_to_cart() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//	}
//
//	@When("User Add the Dog to cart")
//	public void user_add_the_dog_to_cart() {
//		FrontPage f = new FrontPage();
//		f.getDogs().click();
//		ProductPage p = new ProductPage();
//		p.getBulldog().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//
//	}
//
//	@Then("User Remvoe the Dog to cart")
//	public void user_remvoe_the_dog_to_cart() {
//		SauceLogin a = new SauceLogin();
//		a.getRemoveCart().click();
//		driver.quit();
//	}
//
////Remove cat in cart
//	@Given("Choose the Cat to cart")
//	public void choose_the_cat_to_cart() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//	}
//
//	@When("User Add the Cat to cart")
//	public void user_add_the_cat_to_cart() {
//		FrontPage f = new FrontPage();
//		f.getCats().click();
//		ProductPage p = new ProductPage();
//		p.getManxCat().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//	}
//
//	@Then("User Remvoe the Cat to cart")
//	public void user_remvoe_the_cat_to_cart() {
//		SauceLogin a = new SauceLogin();
//		a.getRemoveCart().click();
//		driver.quit();
//	}
//
////Remove Reptiles in cart
//	@Given("Choose the Reptiles to cart")
//	public void choose_the_reptiles_to_cart() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//	}
//
//	@When("User Add the Reptiles to cart")
//	public void user_add_the_reptiles_to_cart() {
//		FrontPage f = new FrontPage();
//		f.getReptiles().click();
//		ProductPage p = new ProductPage();
//		p.getIguanaReptiles().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//	}
//
//	@Then("User Remvoe the Reptiles to cart")
//	public void user_remvoe_the_reptiles_to_cart() {
//		SauceLogin a = new SauceLogin();
//		a.getRemoveCart().click();
//		driver.quit();
//	}
//
////Remove birds in cart
//	@Given("Choose the Birds to cart")
//	public void choose_the_birds_to_cart() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//		FrontPage f = new FrontPage();
//		f.getBirds().click();
//	}
//
//	@When("User Add the Birds to cart")
//	public void user_add_the_birds_to_cart() {
//		ProductPage p = new ProductPage();
//		p.getFinchBird().click();
//		SauceLogin a = new SauceLogin();
//		a.getAddtocart1().click();
//
//	}
//
//	@Then("User Remvoe the Birds to cart")
//	public void user_remvoe_the_birds_to_cart() {
//		SauceLogin a = new SauceLogin();
//		a.getRemoveCart().click();
//		driver.quit();
//	}
//
////search the fish
//	@Given("Launch the app")
//	public void launch_the_app() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//
//	}
//
//	@When("Enter the fish name")
//	public void enter_the_fish_name() {
//		SauceLogin a = new SauceLogin();
//		a.getSearchKeyword().click();
//		a.getSearchKeyword().sendKeys("Angelfish");
//	}
//
//	@Then("click the search button")
//	public void click_the_search_button() {
//		SauceLogin a = new SauceLogin();
//		a.getSubmit().click();
//		driver.quit();
//	}
//
////Search the Dog
//	@Given("Launch the jpet app")
//	public void launch_the_jpet_app() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//	}
//
//	@When("Enter the Dog name")
//	public void enter_the_dog_name() {
//		SauceLogin a = new SauceLogin();
//		a.getSearchKeyword().sendKeys("Bulldog");
//	}
//
//	@Then("click the search")
//	public void click_the_search() {
//		SauceLogin a = new SauceLogin();
//		a.getSubmit().click();
//		driver.quit();
//	}
//
////Search the Cat
//	@Given("Launch the pet app")
//	public void launch_the_pet_app() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//	}
//
//	@When("Enter the Cat name")
//	public void enter_the_cat_name() {
//		SauceLogin a = new SauceLogin();
//		a.getSearchKeyword().sendKeys("Manx");
//	}
//
//	@Then("click the search the")
//	public void click_the_search_the() {
//		SauceLogin a = new SauceLogin();
//		a.getSubmit().click();
//		driver.quit();
//	}
//
////search the Reptiles
//	@Given("Launch the pet application")
//	public void launch_the_pet_application() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//
//	}
//
//	@When("Enter the Reptiles name")
//	public void enter_the_reptiles_name() {
//		SauceLogin a = new SauceLogin();
//		a.getSearchKeyword().sendKeys("Rattlesnake");
//	}
//
//	@Then("click search button")
//	public void click_search_button() {
//		SauceLogin a = new SauceLogin();
//		a.getSubmit().click();
//		driver.quit();
//	}
//
////search the Birds
//	@Given("Launch the Jpet application")
//	public void launch_the_jpet_application() {
//		LaunchBrowser();
//		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
//	}
//
//	@When("Enter the Birds name")
//	public void enter_the_Birds_name() {
//		SauceLogin a = new SauceLogin();
//		a.getSearchKeyword().sendKeys("Amazon Parrot");
//	}
//
//	@Then("click search btn")
//	public void click_search_btn() {
//		SauceLogin a = new SauceLogin();
//		a.getSubmit().click();
//		driver.quit();
//	}

}
