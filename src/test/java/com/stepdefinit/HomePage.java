package com.stepdefinit;

import io.cucumber.java.en.When;

public class HomePage {

    @When("Scroll down to footer")
    public void scroll_down_to_footer() throws InterruptedException {

        System.out.println("Scrolling down to footer...");
        /*
         * driver.get("https://www.automationexercise.com/");
         * Thread.sleep(2000);
         * JavascriptExecutor js = (JavascriptExecutor) driver;
         * js.executeScript("window.scrollBy(0,5000)");
         * Thread.sleep(2000);
         * // Wait for 2 seconds to ensure the scroll is complete
         * System.out.println("Scrolled down to footer");
         */
    }

    @When("Verify the text SUBSCRIPTION")
    public void verify_the_text_subscription() {
        System.out.println("A");

        // boolean displayed = HomePageExe.getSubscriptionEmail().isDisplayed();
        // System.out.println("Subscription text is displayed: " + displayed);

    }

    @When("Enter the email address in input and click arrow button {string}")
    public void enter_the_email_address_in_input_and_click_arrow_button(String dataA) throws InterruptedException {

        System.out.println("B");
        // HomePageExe.enterSubscriptionEmail(dataA);
        // Thread.sleep(2000);
        // HomePageExe.subscriptionArrow_Click();
        // System.out.println("Email entered and arrow button clicked");
    }

    @When("Verify if the success message is visible {string}")
    public void verify_if_the_success_message_is_visible(String expected) {

        System.out.println(expected);
        // String actual = HomePageExe.verifySuccessMessage();

        // if (actual.equals(expected)) {
        // System.out.println("Success message is displayed correctly.");
        // } else {
        // System.out.println("Success message is not displayed correctly.");
        // }
    }

}
