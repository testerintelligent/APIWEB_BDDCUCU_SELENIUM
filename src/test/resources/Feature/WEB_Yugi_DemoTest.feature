Feature: WEB_Yugi_DemoTest

  As a QA Engineer
  I want to validate various website functionalities like registration, login, and product actions
  So that I can ensure the application behaves as expected for different user workflows

  @Regression
  Scenario Outline: Register and delete a user account
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
    Examples:
      | dummy |
      | test  |

  @Smoke
  Scenario Outline: Register and login to ParaBank
    Given I launch the ParaBank website
    When I register a new user
    When I log in with the registered credentials
    Then I should be successfully logged in
    Examples:
      | dummy |
      | test  |

  @Sanity
  Scenario Outline: SignUp to the website
    Given I launch the website
    Then Click the signup button
    When Fill the signup details
    And handle the alert
    Examples:
      | dummy |
      | test  |

  @Regression
  Scenario Outline: Sign up with existing email
    Given I want to launch the Automation Exercise website
    And I verify I landed on the home page
    And I want to click on signup button
    When I enter the already existing email and name
    And click on signup button
    Then I should see error popup stating Email already exists
    Examples:
      | dummy |
      | test  |

  @Smoke
  Scenario Outline: Testcases page verify
    Given I want to launch the automation website
    And i want to check the home page
    When I click on the testcases page
    And verify if we are on the testcases page
    Then I validate if the testcases are present
    And check more outcomes
    Examples:
      | dummy |
      | test  |

  @Sanity
  Scenario Outline: Logout feature
    Given I want to launch the website
    And verfiy if the home page is visible
    When I click on login button
    And Enter the correct credentials
    And Now I have clicked the log button
    Then I will check if the login is done successfully
    And i will now check if the logout button is available
    And I will click the logout button
    And I will check if the logout is correctly happened
    Examples:
      | dummy |
      | test  |

  @Smoke
  Scenario Outline: LoginWithIncorrectCredentials
    Given I want to launch the Automation Website
    And Verfiy if the home page is available
    When I try to enter incorrect credentials
    And click on login button
    Then Error message should popup
    Examples:
      | dummy |
      | test  |

  @Sanity
  Scenario Outline: To fill up the contact us form in the website
    Given I want to launch the website to check the contact form
    And I want to verify if we are on the home page
    When I click on contact us form
    And Enter the relevant contents
    And click on the submit button
    Then I have to handle the alert
    And check the success message
    Examples:
      | dummy |
      | test  |

  @Sanity @sauce_Login_logout
  Scenario Outline: Verify the Login and Logout Funtionality
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should logoff

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Regression @sauce_Product_Select
  Scenario Outline: Verify User is able Select Product after Login
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should click the product

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Smoke @sauce_Product_selectFilter
  Scenario Outline: Verify User is able Select fitler button
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should click the filter button

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Smoke @sauce_Product_LoginSuccessful
  Scenario Outline: Verify User is able to see success message after login
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should use dynamic path

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Regression @sauce_Product_addAllProducttoCart
  Scenario Outline: Verify User is able to add all product to the cart
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should all Add to Cart

    Examples:
      |username       |password      |
      |standard_user  |secret_sauce  |

  @Sanity @cyclos_login_test
  Scenario Outline: Verify the cyclos site address
    Given User should load the url cyclos
    When User should enter the username and password "<username>" and "<password>"
    And User should navigate to profile
    # Then User should validate the name
    # And User should validate the city
    # And User should validate the state

    Examples:
      |username |password   |
      |Krhithya |Divya@123  |
