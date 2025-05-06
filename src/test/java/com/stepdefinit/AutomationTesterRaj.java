package com.stepdefinit;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pom.BookingHotel;
import com.Pom.SauceDemoelement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AutomationTesterRaj {

	WebDriver driver = new ChromeDriver();

	BookingHotel booking = new BookingHotel(driver);
	com.Pom.PracticePage practice; 
    SauceDemoelement sauce = new  SauceDemoelement(driver);



	@Given("user launch The Application")
	public void user_launch_the_application() {
		 WebDriverManager.chromedriver().setup();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  

	}
	@When("user Enter The Username In Username Filed")
	public void user_enter_the_username_in_username_filed() {

		//		inputValue(login.getUser_name(), "https://adactinhotelapp.com/");

		booking.getUser_name().sendKeys("rajasekari");

	}
	@When(": User Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {

		//		inputValue(login.getPassword(), "Raje@123");

		booking.getPassword().sendKeys("Raje@123");

	}
	@Then(": User Click On The Login Button And It Navigates To Search Hotel Page")
	public void user_click_on_the_login_button_and_it_navigates_to_search_hotel_page() {

		//		clickonElement(login.getSubmit());

		booking.getSubmit().click();

	}

	@When(": user Select The Location")
	public void user_select_the_location() {

		//		singledropdown(Search.getLocation(), "index", "1");

		//		WebElement locationDropdown = booking.getLocation();
		//		
		//		Select select = new Select(booking.getLocation());
		//		
		//		select.selectByIndex(1);

		WebElement location= driver.findElement(By.xpath("//*[@id=\"location\"]"));

		Select select = new Select(location);

		select.selectByIndex(1);

   }
	
	@When(": user Select The Hotel")
	public void user_select_the_hotel() {

//		singledropdown(Search.getHotels(), "index", "1");
		
		WebElement singledropdown = booking.getHotels();
		
		Select select = new Select(singledropdown);
		
		select.selectByIndex(1);

	}
	@When(": user Select The RoomType")
	public void user_select_the_room_type() {

//		singledropdown(Search.getRoomtype(), "index", "1");
		
		WebElement singledropdown = booking.getRoomtype();
		
        Select select = new Select(singledropdown);
		
		select.selectByIndex(1);
		
		

	}
	@When(": user Select The NumberofRooms")
	public void user_select_the_numberof_rooms() {
		
		
//		singledropdown(Search.getNumberofrooms(), "index", "1");
		
		WebElement singledropdown = booking.getNumberofrooms();
		
        Select select = new Select(singledropdown);
		
		select.selectByIndex(1);

	}
	@When(": user Enters The CheckinDate")
	public void user_enters_the_checkin_date() {

//		inputValue(Search.getcheckinDate(), "21/03/2025");
		
		booking.getcheckinDate().sendKeys("21/06/2025");
	}
	@When(": user Enters The CheckOutDate")
	public void user_enters_the_check_out_date() {

//		inputValue(Search.getcheckoutDate(), "21/03/2025");
		
		booking.getcheckoutDate().sendKeys("21/06/2025");

	}
	@When(": user Select The AdultPerRoom")
	public void user_select_the_adult_per_room() {
//		singledropdown(Search.getadultperroom(), "index", "1");
		
       WebElement singledropdown = booking.getadultperroom();
		
        Select select = new Select(singledropdown);
		
		select.selectByIndex(1);

	}
	@When(": user Select The ChildrenPerRoom")
	public void user_select_the_children_per_room() {

//		singledropdown(Search.getchildperroom(), "index", "1");
		
		 WebElement singledropdown = booking.getchildperroom();
			
	        Select select = new Select(singledropdown);
			
			select.selectByIndex(1);
		
		

	}
	@Then(": User Click on the Search Button And It Navigates To Select Hotel page")
	public void user_click_on_the_search_button_and_it_navigates_to_select_hotel_page() {

//		clickonElement(Search.getsearchhotel());
		
		booking.getsearchhotel().click();


	}
	
	@When(": user Select The RadioButton")
	public void user_select_the_radio_button() {
		
//		clickonElement(Select.getradiobutton());
		
		booking.getradiobutton().click();
		
		
		
	   
	}
	@When(": user Select The ContinueButton")
	public void user_select_the_continue_button() {
		
//		clickonElement(Select.getcontinuebutton());
		
		booking.getcontinuebutton().click();
	    
	}
	
	@When(": user Enters The FirstName")
	public void user_enters_the_first_name() {
		
//	inputValue(Payment.getFirstName(), "rajasekar");
	
	booking.getFirstName().sendKeys("rajasekar");
	   
	}
	
	@When(": user Enters The LastName")
	public void user_enters_the_last_name() {
		
//    inputValue(Payment.getLastName(), "inbasekaran");
    
    booking.getLastName().sendKeys("inbasekaran");
	   
	}
	
	@When(": user Enters The Address")
	public void user_enters_the_address() {
		
//	inputValue(Payment.getAddress(), "No/2/91 A Kovur Chennai");
	
	booking.getAddress().sendKeys("No/2/91 A Kovur Chennai");
	   
	}
	@When(": user Enters The CCN Number")
	public void user_enters_the_ccn_number() {
		
//	inputValue(Payment.getCCNNumber(), "1234567890123456");
	
	booking.getCCNNumber().sendKeys("1234567890123456");
	
	}
	
	@When(": user Enters The CC TYpe")
	public void user_enters_the_cc_t_ype() {
		
//	singledropdown(Payment.getCCType(), "index", "1");
		
		 WebElement singledropdown = booking.getCCType();
			
	      Select select = new Select(singledropdown);
			
			select.selectByIndex(1);
	 
	}
	@When(": user Enters The CC Expiry Month")
	public void user_enters_the_cc_expiry_month() {
		
//	singledropdown(Payment.getCCExpiryMonth(), "index", "1");
		
		 WebElement singledropdown = booking.getCCExpiryMonth();
			
	      Select select = new Select(singledropdown);
			
			select.selectByIndex(1);
	
	}
	
	@When(": user Enters The CC Expiry Year")
	public void user_enters_the_cc_expiry_year() {
		
//	singledropdown(Payment.getCCExpiryYear(), "index", "10");
	
	 WebElement singledropdown = booking.getCCExpiryYear();
		
     Select select = new Select(singledropdown);
		
		select.selectByIndex(10);

	}
	
	@When(": user Enters The CC CVV")
	public void user_enters_the_cc_cvv() {
		
//    inputValue(Payment.getCC_CVV(), "426");
		
		booking.getCC_CVV().sendKeys("426");

	}
	
	@Then(": User Click on the BookNow Button It Navigates To Booking Cofirmation Page")
	public void user_click_on_the_book_now_button_it_navigates_to_booking_cofirmation_page() {
		
//	clickonElement(Payment.getBookNow());
		
	booking.getBookNow().click();
	
	}
	
	@When(": user Click My Itineary Button")
	public void user_click_my_itineary_button() {
		
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(booking.getMyItineray()));
		
//	    clickonElement(Booking.getMyItineray());
	    booking.getMyItineray().click();
	}
	
	@Then(": user Click Logout Button")
	public void user_click_logout_button() {
		
//		clickonElement(Logout.getLogout());
		
		booking.getLogout().click();


	}

	@Given("user lauch the automation practice")
	public void user_lauch_the_automation_practice() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		practice = new com.Pom.PracticePage(driver);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  

	}

	@When("User select radio button")
	public void user_select_radio_button() {

		practice.checbox().click();

	}


	@When("User send the country details")
	public void user_send_the_country_details() {

		practice.input_country().sendKeys("India");

	}
	@When("User select the drop down box")
	public void user_select_the_drop_down_box() {

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		Select select = new Select(dropdown);

		for (WebElement option : select.getOptions()) {
		    if (option.getText().contains("Option3")) {
		        option.click();
		        break;
		    }

		WebElement checkbox1 = driver.findElement(By.xpath("//input[contains(@value,'option1')]"));
		WebElement checkbox2 = driver.findElement(By.xpath("//input[contains(@value,'option2')]"));
		WebElement checkbox3 = driver.findElement(By.xpath("//input[contains(@value,'option3')]"));

		if(checkbox1.isEnabled()){
			checkbox1.click();
			checkbox2.click();
			checkbox3.click();
		}}

	}
	@When("User navigate to the child window")
	public void user_navigate_to_the_child_window() {

		String defaultwindow= driver.getWindowHandle();

		WebElement openwindow=	driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));

		openwindow.click();	

		Set<String> allwindows= driver.getWindowHandles();

		for (String childwindow : allwindows) {

			driver.switchTo().window(defaultwindow);

		}

	}
	@When("User navigate to the default window")

	public void user_navigate_to_the_default_window() {

		String childwindow= driver.getWindowHandle();

		WebElement opentab= driver.findElement(By.xpath("//*[@id=\"opentab\"]"));

		opentab.click();

		Set<String> multiplewindows= driver.getWindowHandles();

		for (String childwindow1 : multiplewindows) {

			driver.switchTo().window(childwindow);

		}

	}
	@Then("user send the input value")
	public void user_send_the_input_value() {

		WebElement enteryourname= driver.findElement(By.xpath("//*[@id=\"name\"]"));

		enteryourname.sendKeys("raj");
		
		driver.quit();

	}
	
	
	
	@Given("User launch Application")
public void user_launch_application() {
		 WebDriverManager.chromedriver().setup();
	driver.get("https://www.saucedemo.com/");
		sauce.user_name().sendKeys("standard_user");
		sauce.password().sendKeys("secret_sauce");
		sauce.login_button().click();
		WebElement backpack= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		backpack.click();
		  WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
	        assertEquals("1", cartBadge.getText());
	        WebElement cartclick= driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
			cartclick.click();
			WebElement chekout= driver.findElement(By.xpath("//button[contains(@id,'checkout')]"));
			chekout.click();
			
   
}

@When("User input the first name")
public void user_input_the_first_name() {
	WebElement firstname= driver.findElement(By.id("first-name"));
	firstname.sendKeys("raja");
    
}

	
	@When("User input the last name")
	public void user_input_the_last_name() {
		
		WebElement lastname= driver.findElement(By.id("last-name"));
		lastname.sendKeys("sekar");
	   
	}
	
	@When("User input the Zipcode")
	public void user_input_the_zipcode() {
		
		WebElement Zipcode = driver.findElement(By.id("postal-code"));
		Zipcode.sendKeys("109876");
	   
	}
	
	@When("User Click the continue button")
	public void user_click_the_continue_button() {
		
		WebElement cont= driver.findElement(By.id("continue"));
		cont.click();
	    
	}
	@Then("User Click finish button.")
	public void user_click_finish_button() {
		
		WebElement finish= driver.findElement(By.id("finish"));
		finish.click();
	   
	}
	
	
	@Given("user launch the application with credentilas")
	public void user_launch_the_application_with_credentilas() {
		 WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
		sauce.user_name().sendKeys("standard_user");
		sauce.password().sendKeys("secret_sauce");
		sauce.login_button().click();
	    
	}
	
	
	@When("user click add to cart button for sauce labs BackPack")
	public void user_click_add_to_cart_button_for_sauce_labs_back_pack() {
		
		WebElement backpack= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		backpack.click();
	    
	}
	
	
	@Then("user click the cart icon and navigates to Swag labs")
	public void user_click_the_cart_icon_and_navigates_to_swag_labs() {
		
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
        assertEquals("1", cartBadge.getText());
        WebElement cartclick= driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
		cartclick.click();

	}
	
	@Given("user lauch the herokuapp automation page")
	public void user_lauch_the_herokuapp_automation_page() {
		 WebDriverManager.chromedriver().setup();
		driver.get("https://the-internet.herokuapp.com/");

	}


	@When("User click the add remove elements")
	public void user_click_the_add_remove_elements() {

		String defaultwindow= driver.getWindowHandle();

		WebElement addremoveelement= driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a"));

		String openInNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		addremoveelement.sendKeys(openInNewTab);

		Set<String> allwindows= driver.getWindowHandles();

		driver.switchTo().window(allwindows.iterator().next());

		for (String handel : allwindows) {

			if (!handel.equals(defaultwindow)) {

				driver.switchTo().window(handel);

				System.out.println("Get Tittle" + " " + driver.getTitle());
				break;
			}

		}


	}


	@Then("verify stale element execption")
	public void verify_stale_element_execption() {

		WebElement addelement= driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));

		addelement.click();

		addelement.click();

		addelement.click();

		List<WebElement> title= driver.findElements(By.xpath("//button[@class='added-manually' and @onclick='deleteElement()']"));

		WebElement deletebutton = title.get(0);

		deletebutton.click();

		for (WebElement link : title) {

			try {
				System.out.println(link.getText());
			} catch (StaleElementReferenceException e) {
				List<WebElement> title1= driver.findElements(By.xpath("//button[@class='added-manually' and @onclick='deleteElement()']"));
				System.out.println("Output: " + " " + title1);
			}  

		}

		


	}
	
	@Given("user lauch the letcode dropdown button automation page")
public void user_lauch_the_letcode_dropdown_button_automation_page() {

    driver.get("https://letcode.in/dropdowns");
   
}

@When("User get the dropdown button")
public void user_get_the_dropdown_button() {
    WebElement dropdown =driver.findElement(By.id("fruits"));
		
		Select select= new Select(dropdown);
		
		select.selectByIndex(1);
		
		//Thread.sleep(3000);
		
		select.selectByValue("2");
		
		//Thread.sleep(3000);
		
		select.selectByVisibleText("Banana");
		
		List<WebElement> listofoptions = select.getOptions();
		
		Integer size= listofoptions.size();
		
		System.out.println("Number of emlemts:" + size);
		
		dropdown.sendKeys("Pine");
  
}

@Then("User get multiselect")
public void user_get_multiselect() {

    WebElement multiselect = driver.findElement(By.id("superheros"));
		
		Select multiselectbox = new Select(multiselect);
		
		multiselectbox.selectByIndex(2);
		
		multiselectbox.selectByIndex(3);
		
		multiselectbox.selectByIndex(4);
  
}

 @Given("user lauch the letcode automation page")
public void user_lauch_the_letcode_automation_page() {

    driver.get("https://letcode.in/alert");
}
@When("User click the simple alert")
public void user_click_the_simple_alert() {
    	WebElement simpleAlert= driver.findElement(By.id("accept"));
		
		simpleAlert.click();
		 
		//Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String text= alert.getText();
		
		System.out.println("Alert text is " + text);
		 
		alert.accept();
    
}
@When("User click confirm alert")
public void user_click_confirm_alert() {
    WebElement confirmAlert= driver.findElement(By.id("confirm"));
		
    confirmAlert.click();
    
    Alert alert2 = driver.switchTo().alert();
    
    String text2= alert2.getText();
    
    System.out.println("Confirm alert text is " + text2);
    
    //Thread.sleep(3000);
    
    alert2.dismiss();
}
@Then("A confirmation popup should appear")
public void a_confirmation_popup_should_appear() {

    WebElement promptAlert= driver.findElement(By.id("prompt"));
    promptAlert.click();
		
    Alert alert3= driver.switchTo().alert();
    
    alert3.sendKeys("raj");
    
    alert3.accept();

    driver.close();
   
}

 @Given("user lauch the letcode button automation page")
public void user_lauch_the_letcode_button_automation_page() {
    	 WebDriverManager.chromedriver().setup();
    driver.get("https://letcode.in/button");
    
}
@When("User get the location of the button")
public void user_get_the_location_of_the_button() {

    		WebElement Cordinates= driver.findElement(By.xpath("//*[@id=\"position\"]"));

		org.openqa.selenium.Point xypoint=Cordinates.getLocation();

		int xvalue= xypoint.getX();

		int yvalue= xypoint.getY();

		System.out.println("x value is : " + xvalue +  "y value is : "+ yvalue);
    
}
@When("User get the colour of the button")
public void user_get_the_colour_of_the_button() {
    WebElement color= driver.findElement(By.id("color"));

		String colourbutton= color.getCssValue("background-color");

		System.out.println("Button colour is :" + colourbutton);

		
}
@When("User get the size of the button")
public void user_get_the_size_of_the_button() {
    WebElement size= driver.findElement(By.id("property"));

		int buttonHeight= size.getSize().getHeight();

		int buttonWidth= size.getSize().getWidth();

		System.out.println("Button height is :" + buttonHeight +"   " + "Button Width is :" + buttonWidth );
    
}

@Then("A confirmation on disable button")
public void a_confirmation_on_disable_button() {
    WebElement disabledbutton= driver.findElement(By.id("isDisabled"));

    Boolean disable= disabledbutton.isEnabled();

    System.out.println(disable);

    WebElement homebutton=driver.findElement(By.id("home"));

    homebutton.click();
    
}

}
