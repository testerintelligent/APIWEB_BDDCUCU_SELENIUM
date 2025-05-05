
@Sanity

Feature: Abarna_22APR_2025__WEB_Verify Subscription in Home Page


  Scenario: Verify Subscription section functionality
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    When Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible
    And Finally i close the browserrr
