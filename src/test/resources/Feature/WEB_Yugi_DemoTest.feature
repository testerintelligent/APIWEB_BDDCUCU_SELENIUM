Feature: WEB_Yugi_DemoTest

  As a QA Engineer
  I want to validate various website functionalities like registration, login, and product actions
  So that I can ensure the application behaves as expected for different user workflows

  @Regression
  Scenario: Register and delete a user account
    # As a new user
    # I want to register and delete my account
    # So that I can verify account lifecycle functionality
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
    # As a user
    # I want to register and login to ParaBank
    # So that I can access the banking services
    Given I launch the ParaBank website
    When I register a new user
    When I log in with the registered credentials
    Then I should be successfully logged in

  @Sanity
  Scenario: SignUp to the website
    # As a visitor
    # I want to sign up on the website
    # So that I can create an account
    Given I launch the website
    Then Click the signup button
    When Fill the signup details
    And handle the alert

  @Regression
  Scenario: Sign up with existing email
    # As a returning user
    # I want to sign up again with an existing email
    # So that I can verify the system shows an error
    Given I want to launch the Automation Exercise website
    And I verify I landed on the home page
    And I want to click on signup button
    When I enter the already existing email and name
    And click on signup button
    Then I should see error popup stating Email already exists

  @Smoke
  Scenario: Testcases page verify
    # As a user
    # I want to visit the testcases page
    # So that I can verify available tests
    Given I want to launch the automation website
    And i want to check the home page
    When I click on the testcases page
    And verify if we are on the testcases page
    Then I validate if the testcases are present
    And check more outcomes

  @Sanity
  Scenario: Logout feature
    # As a logged-in user
    # I want to log out of the website
    # So that I can securely end my session
    Given I want to launch the website
    And verfiy if the home page is visible
    When I click on login button
    And Enter the correct credentials
    And Now I have clicked the log button
    Then I will check if the login is done successfully
    And i will now check if the logout button is available
    And I will click the logout button
    And I will check if the logout is correctly happened

  @Smoke
  Scenario: LoginWithIncorrectCredentials
    # As a user
    # I want to try logging in with wrong credentials
    # So that I can check the error handling
    Given I want to launch the Automation Website
    And Verfiy if the home page is available
    When I try to enter incorrect credentials
    And click on login button
    Then Error message should popup

  @Sanity
  Scenario: To fill up the contact us form in the website
    # As a visitor
    # I want to fill the contact us form
    # So that I can send a message to the support team
    Given I want to launch the website to check the contact form
    And I want to verify if we are on the home page
    When I click on contact us form
    And Enter the relevant contents
    And click on the submit button
    Then I have to handle the alert
    And check the success message

  @sauce_Login_logout
  Scenario Outline: Verify the Login and Logout Funtionality
    # As a SauceDemo user
    # I want to log in and log off
    # So that I can check login/logout flow
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should logoff

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @sauce_Product_Select
  Scenario Outline: Verify User is able Select Product after Login
    # As a logged-in user
    # I want to select a product
    # So that I can view product details
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should click the product

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @sauce_Product_selectFilter
  Scenario Outline: Verify User is able Select fitler button
    # As a user
    # I want to use the filter button
    # So that I can sort products
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should click the filter button

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @sauce_Product_LoginSuccessful
  Scenario Outline: Verify User is able to see success message after login
    # As a user
    # I want to see a login success message
    # So that I know I’m logged in
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should use dynamic path

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @sauce_Product_addAllProducttoCart
  Scenario Outline: Verify User is able to add all product to the cart
    # As a logged-in user
    # I want to add all products to my cart
    # So that I can purchase multiple items at once
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should all Add to Cart

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @cyclos_login_test
  Scenario Outline: Verify the cyclos site address
    # As a user
    # I want to log into Cyclos
    # So that I can check my profile info
    Given User should load the url cyclos
    When User should enter the username and password "<username>" and "<password>"
    And User should navigate to profile
    # Then User should validate the name
    # And User should validate the city
    # And User should validate the state

    Examples:
      |username |password   |
      |Krhithya |Divya@123  |
