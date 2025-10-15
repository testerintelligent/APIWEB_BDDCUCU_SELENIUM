@all
@smoke
Feature: Web_RahulShetty_Frames_Alert_Validations

    Scenario: Switch to iframe and verify content
        Given I navigate to the automation practice page
        When I switch to the iframe
        Then I should see the "Learning Paths" link inside the iframe

    Scenario: Handling Simple Alert
        Given I navigate to the automation practice page
        When I enter "<name>" in the alert textbox
        And I click on the Alert button
        Then an alert with text containing "<name>" should appear
        And accept the alert

    Scenario: Handling confirm Alert
        Given I navigate to the automation practice page
        When I enter "<name>" in the alert textbox
        And I click on the Confirm button
        Then a confirm box with text containing "<name>" should appear
        And dismiss the alert

        Examples:
            | name   |
            | Muthu  |
            | Dhilip |




    Scenario: Validation of elements in practicepage
        Given launch the url "https://rahulshettyacademy.com/AutomationPractice/"
        When clicking the radio button
        And enter the conuntry name "Indi"
        And select the option from drop down
        And click the check box
        Then click the home button
        And verify if navigated to home page

