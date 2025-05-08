@Regression
Feature: WEB_Rajasekar_DemoTest


Scenario: 


Given user lauch the automation practice  
When User select radio button
And  User send the country details
And  User select the drop down box
And  User navigate to the child window
And  User navigate to the default window
Then user send the input value

@Smoke
Scenario: checkout


Given User launch Application  
When  User input the first name
When  User input the last name
When  User input the Zipcode
And   User Click the continue button
Then  User Click finish button.

@Sanity
Scenario: Add to cart

Given user launch the application with credentilas
When  user click add to cart button for sauce labs BackPack
Then user click the cart icon and navigates to Swag labs

@Smoke
Scenario:

Given user lauch the herokuapp automation page  
When User click the add remove elements
Then  verify stale element execption

@Smoke
Scenario:

Given user lauch the letcode dropdown button automation page  
When User get the dropdown button
Then User get multiselect

@Sanity
Scenario:
Given user lauch the letcode automation page  
When User click the simple alert
When User click confirm alert
Then A confirmation popup should appear

@Sanity
Scenario:

Given user lauch the letcode button automation page  
When User get the location of the button
When User get the colour of the button
When User get the size of the button
Then A confirmation on disable button

@Regression
Scenario:

Given user launch The Application  
When  user Enter The Username In Username Filed
And : User Enter The Password In Password Field
Then : User Click On The Login Button And It Navigates To Search Hotel Page

When : user Select The Location
When : user Select The Hotel
When : user Select The RoomType
When : user Select The NumberofRooms
When : user Enters The CheckinDate
When : user Enters The CheckOutDate
When : user Select The AdultPerRoom
When : user Select The ChildrenPerRoom
Then : User Click on the Search Button And It Navigates To Select Hotel page

When : user Select The RadioButton
When : user Select The ContinueButton

When : user Enters The FirstName
When : user Enters The LastName
When : user Enters The Address
When : user Enters The CCN Number
When : user Enters The CC TYpe
When : user Enters The CC Expiry Month
When : user Enters The CC Expiry Year
When : user Enters The CC CVV 
Then : User Click on the BookNow Button It Navigates To Booking Cofirmation Page


When : user Click My Itineary Button

Then : user Click Logout Button