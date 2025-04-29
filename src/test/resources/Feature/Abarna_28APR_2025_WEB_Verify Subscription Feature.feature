@Abar
Feature:  Abarna_28APR_2025_WEB_Verify Subscription Feature

  Scenario:Verify Subscription in Cart page
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on the 'Cart' button
    And Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    When Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible
    Then Finally i close the browserrr