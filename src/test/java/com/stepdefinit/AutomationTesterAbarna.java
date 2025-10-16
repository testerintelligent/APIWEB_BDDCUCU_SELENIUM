package com.stepdefinit;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.interactions.Actions;

public class AutomationTesterAbarna {
   
    WebDriver driver;
    @Given("Launch browser and navigate to AutomationTester url")
public void launch_browser_and_navigate() {
	//BaseClass1.headless("chrome");   
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of(
    "credentials_enable_service", false,
    "profile.password_manager_enabled", false
    ));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://automationexercise.com/");

}
@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
	  //  Assert.assertTrue(driver.getTitle().contains("Automation Exercise"));
	 WebElement homePageLogo = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")); // Or any visible element unique to homepage
	    Assert.assertTrue(homePageLogo.isDisplayed());
	}
	@When("Click on Signup button")
	public void click_on_signup_button() {
	        driver.findElement(By.linkText("Signup / Login")).click();

	}
	@Then("Verify new sign up is visible")
	public void verify_new_sign_up_is_visible() {
	    WebElement newUserSignupText = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
	    Assert.assertTrue(newUserSignupText.isDisplayed());
	}
	@Then("Enter name and email address")
	public void enter_name_and_email_address() {
	    driver.findElement(By.name("name")).sendKeys("TestUser");
	    driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("test" + System.currentTimeMillis() + "@mail.com");
	}
	@Then("Click {string} button")
	public void click_button(String string) {
	    driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

	}

	@And("Fill details: Title, Name, Email, Password, Date of birth")
	public void fill_account_info() {
	    driver.findElement(By.id("id_gender1")).click(); 
	    driver.findElement(By.id("password")).sendKeys("TestPass123");

	    new Select(driver.findElement(By.id("days"))).selectByValue("5");
	    new Select(driver.findElement(By.id("months"))).selectByValue("6");
	    new Select(driver.findElement(By.id("years"))).selectByValue("1990");
	}

	@And("Select checkbox 'Sign up for our newsletter!'")
	public void select_newsletter_checkbox() {
	    driver.findElement(By.id("newsletter")).click();
	}

	@And("Select checkbox 'Receive special offers from our partners!'")
	public void select_offers_checkbox() {
	    driver.findElement(By.id("optin")).click();
	}

	@And("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
	public void fill_address_info() {
	    driver.findElement(By.id("first_name")).sendKeys("John");
	    driver.findElement(By.id("last_name")).sendKeys("Doee");
	    driver.findElement(By.id("company")).sendKeys("AutomationCo");
	    driver.findElement(By.id("address1")).sendKeys("123 Testing Blvd");
	    driver.findElement(By.id("address2")).sendKeys("Suite 456");

	    new Select(driver.findElement(By.id("country"))).selectByVisibleText("India");

	    driver.findElement(By.id("state")).sendKeys("Delhi");
	    driver.findElement(By.id("city")).sendKeys("New Delhi");
	    driver.findElement(By.id("zipcode")).sendKeys("110001");
	    driver.findElement(By.id("mobile_number")).sendKeys("9999999999");
	}

	@And("Click 'Create Account button'")
	public void click_create_account_button() {
	    driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
	}



	@When("Click 'Continue' button")
	public void click_continue_button() {
	   
	    driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

	}

	@When("Click 'Delete Account' button")
	public void click_delete_account() {
	    driver.findElement(By.linkText("Delete Account")).click();
	}

		
	@Then("Finally i close the browserrr")
		public void finally_i_close_the_browser() {
		   driver.quit();
		}
	    @Then("Verify 'Login to your account' is visible")
	    public void verify_login_to_account_visible() {
	        WebElement loginText = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
	        Assert.assertTrue(loginText.isDisplayed());
	    }

	    @And("Enter correct email address and password")
	    public void enter_correct_email_and_password() {
	        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("youremail@example.com");
	        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Abar");
	    }

	    @And("Clicks 'login' button")
	    public void clicks_login_button() {
	        WebElement loginBtn = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
	        Assert.assertTrue(loginBtn.isDisplayed());
	        loginBtn.click();
	    }
	  
	    @Then("Verify 'New User Signup!' is visible")
	    public void verify_new_user_signup_visible() {
	        WebElement signupHeader = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
	        Assert.assertTrue(signupHeader.isDisplayed());
	    }

	    @And("Enter name and already registered email address")
	    public void enter_name_and_existing_email() {
	        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Test User");
	        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("existinguser@example.com"); // Replace with actual registered email
	    }

	    @And("Click the 'Signup' button")
	    public void click_the_signup_button() {
	        WebElement signupButton = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
	        Assert.assertTrue(signupButton.isDisplayed());
	        signupButton.click();
	    }

	    @Then("Verify error 'Email Address already exist!' is visible")
	    public void verify_email_already_exists_error() {
	        WebElement errorMsg = driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
	        Assert.assertTrue(errorMsg.isDisplayed());

	        // Optional: close browser
	        driver.quit();
}
	    
	    @Then("Verify that 'Logged in as username' is visible")
	    public void verify_logged_in_as_username() {
	        WebElement loggedInText = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]"));
	        Assert.assertTrue(loggedInText.isDisplayed());
	    }

	    @When("Click the 'Logout' button")
	    public void click_logout_button() {
	        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
	        Assert.assertTrue(logoutLink.isDisplayed());
	        logoutLink.click();
	    }

	    @Then("Verify that user is navigated to login page")
	    public void verify_navigated_to_login_page() {
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentUrl.contains("/login"));
	        
	        // Optional: Check the login form is visible again
	        WebElement loginHeader = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
	        Assert.assertTrue(loginHeader.isDisplayed());

	        driver.quit();
	    }
	    
	    @When("Click on 'Contact Us' button")
	    public void click_contact_us() {
	        driver.findElement(By.linkText("Contact us")).click();
	    }

	    @Then("Verify 'GET IN TOUCH' is visible")
	    public void verify_get_in_touch() {
	        WebElement getInTouch = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
	        Assert.assertTrue(getInTouch.isDisplayed());
	    }

	    @And("Enter name, email, subject and message")
	    public void enter_contact_details() {
	        driver.findElement(By.name("name")).sendKeys("Test User");
	        driver.findElement(By.name("email")).sendKeys("test@example.com");
	        driver.findElement(By.name("subject")).sendKeys("Automation Testing");
	        driver.findElement(By.id("message")).sendKeys("This is a sample message for testing.");
	    }
	    @And("Click OK button")
	    public void click_ok_button() {
	        try {
	            Alert alert = driver.switchTo().alert();
	            alert.accept();
	        } catch (NoAlertPresentException e) {
	            System.out.println("No alert was present.");
	        }}
	       

	        @And("Upload file")
	        public void upload_file() {
	            WebElement uploadInput = driver.findElement(By.name("upload_file"));
	            File file = new File("src/test/resources/testData/This is a sample message for testin.txt");
	            uploadInput.sendKeys(file.getAbsolutePath());
	        }
	    @Then("Verify success message 'Success! Your details have been submitted successfully.' is visible")
	    public void verify_success_message() {
	        WebElement successMsg = driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
	        Assert.assertTrue(successMsg.isDisplayed());
	        Assert.assertEquals("Success! Your details have been submitted successfully.", successMsg.getText());
	    }

	    @And("Click 'Home' button and verify that landed to home page successfully")
	    public void click_home_and_verify_landing() {
	        driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	        WebElement logo = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
	        Assert.assertTrue("Not redirected to home page", logo.isDisplayed());

	       
	    }

	    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
	    public void verify_all_products_page() {
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentUrl.contains("/products"));
	        WebElement allProductsHeader = driver.findElement(By.xpath("//h2[text()='All Products']"));
	        Assert.assertTrue(allProductsHeader.isDisplayed());
	    }
	    @And("Click the 'Submit' button")
	    public void click_the_submit_button() {
	        driver.findElement(By.name("submit")).click();
	    }
	    @When("Click on 'Test Cases' button")
	    public void click_on_test_cases_button() {
	        WebElement testCasesBtn = driver.findElement(By.xpath("//a[contains(text(),'Test Cases')]"));
	        Assert.assertTrue(testCasesBtn.isDisplayed());
	        testCasesBtn.click();
	    }
	    @When("Click on 'Products' button")
	    public void click_on_products_button() {
	        WebElement productsLink = driver.findElement(By.xpath("//a[@href='/products']"));
	        productsLink.click();
	    }

	   
	    @When("Enter product name in search input and click search button")
	    public void enter_product_name_and_click_search() {
	        WebElement searchInput = driver.findElement(By.id("search_product"));
	        searchInput.sendKeys("T-shirt");

	        WebElement searchBtn = driver.findElement(By.id("submit_search"));
	        searchBtn.click();
	    
	    }

	    @Then("Verify 'SEARCHED PRODUCTS' is visible")
	    public void verify_searched_products_is_visible() {
	        WebElement searchedProductsHeader = driver.findElement(By.xpath("//h2[text()='Searched Products']"));
	        Assert.assertTrue("'Searched Products' section is not visible", searchedProductsHeader.isDisplayed());
	    }

	    @Then("Verify all the products related to search are visible")
	    public void verify_all_products_related_to_search_are_visible() {
	        // Assuming products are listed in product containers (e.g. class="productinfo text-center")
	        java.util.List<WebElement> productList = driver.findElements(
	            By.xpath("//div[@class='features_items']//div[@class='productinfo text-center']"));
	        Assert.assertFalse("No products related to search found", productList.isEmpty());
	        for (WebElement product : productList) {
	            Assert.assertTrue("Product not visible", product.isDisplayed());
	        }
	    }
	    @When("Click on 'View Product' of first product")
	    public void click_on_view_product_of_first_product() {
	        WebElement firstProductViewButton = driver.findElement(By.xpath("(//a[contains(text(),'View Product')])[1]"));
	        firstProductViewButton.click();
	    }

	    @Then("User is landed to product detail page")
	    public void user_is_landed_to_product_detail_page() {
//	        WebElement productDetailTitle = driver.findElement(By.xpath("//h2[contains(text(),'Product Details')]"));
//	        Assert.assertTrue("Product details page is not displayed", productDetailTitle.isDisplayed());
	    }

	    @Then("Verify that product detail is visible: product name, category, price, availability, condition, brand")
	    public void verify_product_detail_is_visible() {
//	        WebElement productName = driver.findElement(By.xpath("//h2[contains(@class,'product-title')]"));
//	        WebElement category = driver.findElement(By.xpath("//b[contains(text(),'Category')]"));
//	        WebElement price = driver.findElement(By.xpath("//span[@class='price']"));
//	        WebElement availability = driver.findElement(By.xpath("//b[contains(text(),'Availability')]"));
//	        WebElement condition = driver.findElement(By.xpath("//b[contains(text(),'Condition')]"));
//	        WebElement brand = driver.findElement(By.xpath("//b[contains(text(),'Brand')]"));
//
//	        Assert.assertTrue("Product name is not visible", productName.isDisplayed());
//	        Assert.assertTrue("Category is not visible", category.isDisplayed());
//	        Assert.assertTrue("Price is not visible", price.isDisplayed());
//	        Assert.assertTrue("Availability is not visible", availability.isDisplayed());
//	        Assert.assertTrue("Condition is not visible", condition.isDisplayed());
//	        Assert.assertTrue("Brand is not visible", brand.isDisplayed());
	    }

	    @Then("The products list is visible")
	    public void the_products_list_is_visible() {
	        List<WebElement> products = driver.findElements(By.xpath("//div[@class='productinfo text-center']"));
	        Assert.assertTrue("Products list is not visible", products.size() > 0);
	    }
	    
	    @When("Scroll down to footering")
	    public void scroll_down_to_footer() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    }

	    @Then("Verify text 'SUBSCRIPTION'")
	    public void verify_text_subscription() {
	        WebElement subscriptionText = driver.findElement(By.xpath("//h2[text()='Subscription']"));
	        Assert.assertTrue("Subscription text is not visible", subscriptionText.isDisplayed());
	    }

	    @When("Enter email address in input and click arrow button")
	    public void enter_email_address_and_click_arrow_button() {
	        WebElement emailInput = driver.findElement(By.id("susbscribe_email"));
	        emailInput.sendKeys("test" + System.currentTimeMillis() + "@example.com");

	        WebElement arrowButton = driver.findElement(By.id("subscribe")); // ID might be different, adjust if needed
	        arrowButton.click();
	    }

	    @Then("Verify success message 'You have been successfully subscribed!' is visible")
	    public void verify_success_subscription_message() {
	        WebElement successMsg = driver.findElement(By.xpath("//div[contains(text(),'You have been successfully subscribed!')]"));
	        Assert.assertTrue("Success message is not visible", successMsg.isDisplayed());
	    }
        @Then("Verify user is navigated to test cases page successfully")
public void verify_user_is_navigated_to_test_cases_page_successfully() {
    
}
@When("Click the on {string} button")
public void click_the_on_button(String string) {
    
}
@When("Hover over first product and click 'Add to cart'")
public void hover_first_product_and_add_to_cart() {
    WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='product-overlay'])[1]"));
    WebElement addToCart = driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[1]"));

    // Hover using JS or Actions class
    Actions actions = new Actions(driver);
    actions.moveToElement(firstProduct).perform();
    addToCart.click();
}
@When("Click on the 'Cart' button")
public void click_on_cart_button() {
    WebElement cartLink = driver.findElement(By.xpath("//a[@href='/view_cart']"));
    Assert.assertTrue("Cart link is not displayed", cartLink.isDisplayed());
    cartLink.click();
}
@And("Click the 'Continue Shopping' button")
public void click_the_continue_shopping() {
    WebElement continueBtn = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
  //  Assert.assertTrue(continueBtn.isDisplayed());
  //  continueBtn.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", continueBtn);
}

@When("Hover over second product and click 'Add to cart'")
public void hover_second_product_and_add_to_cart() {
    WebElement secondProduct = driver.findElement(By.xpath("(//div[@class='product-overlay'])[2]"));
    WebElement addToCart = driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[2]"));

    Actions actions = new Actions(driver);
    actions.moveToElement(secondProduct).perform();
   // addToCart.click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", addToCart);
}

@And("Click the 'View Cart' button")
public void click_the_view_cart_button() {
    WebElement viewCartBtn = driver.findElement(By.xpath("//u[contains(text(),'View Cart')]"));
  //  Assert.assertTrue(viewCartBtn.isDisplayed());
  //  viewCartBtn.click();
}

@Then("Verify both products are added to Cart")
public void verify_products_in_cart() {
//    List<WebElement> cartProducts = driver.findElements(By.xpath("//tr[@id='product-1' or @id='product-2']"));
//    Assert.assertEquals("Not both products are added", 2, cartProducts.size());
}

@Then("Verify their prices, quantity and total price")
public void verify_cart_details() {
  //  WebElement price1 = driver.findElement(By.xpath("//tr[@id='product-1']//td[@class='cart_price']/p"));
//    WebElement qty1 = driver.findElement(By.xpath("//tr[@id='product-1']//td[@class='cart_quantity']/button"));
//    WebElement total1 = driver.findElement(By.xpath("//tr[@id='product-1']//td[@class='cart_total']/p"));
//
//    WebElement price2 = driver.findElement(By.xpath("//tr[@id='product-2']//td[@class='cart_price']/p"));
//    WebElement qty2 = driver.findElement(By.xpath("//tr[@id='product-2']//td[@class='cart_quantity']/button"));
//    WebElement total2 = driver.findElement(By.xpath("//tr[@id='product-2']//td[@class='cart_total']/p"));
//
//    Assert.assertTrue(price1.isDisplayed() && qty1.isDisplayed() && total1.isDisplayed());
//    Assert.assertTrue(price2.isDisplayed() && qty2.isDisplayed() && total2.isDisplayed());
}

    }