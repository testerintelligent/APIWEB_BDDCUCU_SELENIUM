package com.stepdefinit;

import com.Pom.DemoQABookStore;
import com.common.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoQaSteps extends BaseClass1 {
DemoQABookStore bookstore;
@Given("User is on the DemoQA login page")
public void user_is_on_the_demo_qa_login_page() {
bookstore = new DemoQABookStore(driver);
bookstore.launchBookStore("https://demoqa.com/login");
}
@Then("Verify user is on Login in Book Store")
public void verify_user_is_on_login_in_book_store() {
bookstore.verifyLogininBookStore();
}
@Then("enter username {string} and password {string}")
public void enter_username_and_password(String username, String password) {
bookstore.bookStoreUserLogin(username, password);
}
@Then("clicks on the login button")
public void clicks_on_the_login_button() {
bookstore.bookStoreLoginClick();
}
@Then("Verify User is sucessfully loggedin as {string}")
public void verify_user_is_sucessfully_loggedin_as(String expectedUsername) {
bookstore.verifybookstoreloggedinuser(expectedUsername);
}
@When("User clicks on New User button")
public void user_clicks_on_new_user_button() {
bookstore.newUserClick();
}
@When("Verify user is on register to book store page")
public void verify_user_is_on_register_to_book_store_page() {
bookstore.verifyBookStoreRegister();
}
@Then("user enters first name {string}, last name {string}, username {string}, and password {string}")
public void user_enters_first_name_last_name_username_and_password(String firstname, String lastname, String username, String password) {
bookstore.fillRegisterDetails(firstname, lastname, username, password);
}

}
