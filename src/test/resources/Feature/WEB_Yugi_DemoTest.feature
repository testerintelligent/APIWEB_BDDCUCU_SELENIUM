Feature: WEB_Yugi_DemoTest
@Regression
  Scenario: Register and delete a user account
    Given I want to launch the browser and navigate to the Automation Exercise website
    Given I verify that the home page is visible successfully
    When I click on the Signup/Login button
    When I verify that the New User Signup option is available
    When I enter the name and email address
    When I click the Signup button
    Then I verify that 'ENTER ACCOUNT INFORMATION' section is displayed
    Then I fill in all the required details
    Then I click the Create Account button
    Then I verify that the account creation confirmation message is displayed
    Then I click the Continue button
    Then I verify that I am logged in as the registered username
    @Smoke
  Scenario: Register and login to ParaBank
    Given I launch the ParaBank website
    When I register a new user
    When I log in with the registered credentials
    Then I should be successfully logged in
@Sanity
Scenario: SignUp to the website
  Given I launch the website
  Then Click the signup button
  When Fill the signup details
  And handle the alert
  @Regression
   Scenario: Sign up with existing email 
    Given I want to launch the Automation Exercise website
    And I verify I landed on the home page
    And I want to click on signup button
    When I enter the already existing email and name
    And click on signup button
    Then I should see error popup stating Email already exists
    @Smoke
    Scenario: Testcases page verify
    Given I want to launch the automation website
    And i want to check the home page
    When I click on the testcases page
    And verify if we are on the testcases page
    Then I validate if the testcases are present
    And check more outcomes
    @Sanity
     Scenario: Logout feature
    Given I want to launch the website
    And verfiy if the home page is visible
    When I click on login button
    And Enter the correct credentials
    And I click on the login button
    Then I will check if the login is done successfully
    And i will now check if the logout button is available
    And I will click the logout button
    And I will check if the logout is correctly happened
    @Regression
     Scenario: I want to login to the automation website using the correct credentials
    Given I want to launch the automation exercise website
    And I verify that the home page is visible
    When I click on the signup/login button
    And I verify that the "Login to your account" section is visible
    And I enter the correct email address and password
    And I click the login button
   
    @Smoke
     Scenario: LoginWithIncorrectCredentials
    Given I want to launch the Automation Website
    And Verfiy if the home page is available
    When I try to enter incorrect credentials
    And click on login button
    Then Error message should popup
    @Sanity
    Scenario: To fill up the contact us form in the website
    Given I want to launch the website to check the contact form
    And I want to verify if we are on the home page
    When I click on contact us form
    And Enter the relevant contents
    And click on the submit button
    Then I have to handle the alert
    And check the success message

    
    