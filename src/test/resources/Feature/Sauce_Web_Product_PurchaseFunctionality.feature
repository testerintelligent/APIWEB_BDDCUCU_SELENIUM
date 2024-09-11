Feature: Verifying Product Purchase functinality  in Sauce Labs Website

@sauce_Login_logout
Scenario Outline: Verify the Login and Logout Funtionality
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should logoff

Examples:
|username|password|
|standard_user|secret_sauce|

@sauce_Product_Select
Scenario Outline: Verify User is able Select Product after Login
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click the product

Examples:
|username|password|
|standard_user|secret_sauce|

@sauce_Product_addtoCart
Scenario Outline: Verify User is able Select Product after Login and add to Cart
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click the Add to cart button

Examples:
|username|password|
|standard_user|secret_sauce|

@sauce_Product_addProductoCart
Scenario Outline: Verify User is able add the product to the cart
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click cart button

Examples:
|username|password|
|standard_user|secret_sauce|

@sauce_Product_selectFilter
Scenario Outline: Verify User is able Select fitler button
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should click the filter button

Examples:
|username|password|
|standard_user|secret_sauce|

@sauce_Product_LoginSuccessful
Scenario Outline: Verify User is able to see success message after login
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should use dynamic path

Examples:
|username|password|
|standard_user|secret_sauce|

@sauce_Product_addAllProducttoCart
Scenario Outline: Verify User is able to add all product to the cart
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should all Add to Cart

Examples:
|username|password|
|standard_user|secret_sauce|