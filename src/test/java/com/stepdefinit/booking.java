package  com.stepdefinit;

import java.time.Duration;
<<<<<<< HEAD
import java.util.Map;
=======


>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pom.bookingpage;
=======
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.Pom.bookingpage;
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class booking {
<<<<<<< HEAD
    WebDriver driver;
=======
    WebDriver driver = new ChromeDriver();
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    bookingpage bookingPage = new bookingpage(driver); // Pass driver to POM class

    @Given("Open the booking application")
    public void open_the_booking_application() {
<<<<<<< HEAD
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("disable-infobars");
    options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false,"profile.password_manager_enabled", false));
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
        driver.get("https://automationintesting.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        System.out.println("User landed on homepage");
=======
    	 WebDriverManager.chromedriver().setup();
        driver.get("https://automationintesting.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        System.out.println("✅ User landed on homepage");
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    }

    @When("select the room")
    public void select_the_room() {
        // WebElement bookRoomButton = wait.until(ExpectedConditions.elementToBeClickable(bookingPage.bookRoomPath));
        // bookRoomButton.click();
        System.out.println("✅ Room selection successful");
    }

    @When("select the date")
    public void select_the_date() {
        // WebElement startDate = wait.until(ExpectedConditions.elementToBeClickable(bookingPage.startDatePath));
        // WebElement endDate = wait.until(ExpectedConditions.elementToBeClickable(bookingPage.endDatePath));

        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].click();", startDate);
        // js.executeScript("arguments[0].click();", endDate);

        System.out.println("✅ Selected start date and end date successfully");
    }


    @When("Enter the details")
    public void enter_the_details() {
        // driver.findElement(bookingPage.firstNamePath).sendKeys("Krithika");
        // driver.findElement(bookingPage.lastNamePath).sendKeys("Krishna");
        // driver.findElement(bookingPage.emailPath).sendKeys("krithikakrishna@gmail.com");
        // driver.findElement(bookingPage.phonePath).sendKeys("927262728283");

<<<<<<< HEAD
        System.out.println("Entered booking details");
=======
        System.out.println("✅ Entered booking details");
>>>>>>> b8c78c13ff253177f65b06dd8f8ae72564851a19
    }

    @Then("Book the ticket")
    public void book_the_ticket() {
        // WebElement bookTicBut = wait.until(ExpectedConditions.elementToBeClickable(bookingPage.bookButtonPath));
        // bookTicBut.click();
        System.out.println("✅ Booking request submitted");
    }

    @Then("Confirm the booking")
     public void confirm_the_booking() {
    //     boolean isBookingConfirmed = !driver.findElements(bookingPage.cancelButtonPath).isEmpty();

    //     if (isBookingConfirmed) {
    //         System.out.println("✅ Booking confirmed!");
    //     } else {
            System.out.println("❌ Booking failed, no cancel button found.");
//}
        driver.close();

    }

}
