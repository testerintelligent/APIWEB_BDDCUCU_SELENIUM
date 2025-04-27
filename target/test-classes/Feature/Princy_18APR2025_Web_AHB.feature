Feature: Princy_18APR2025_Web_AHB

   Scenario Outline: Validation of Login Credentials AHB
    Given User is on the Adactin Login page
    When User enters the valid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then User should be redirected to Adactin Homepage

    Examples: 
      | Username      | Password |
      | PrincyPrabha | Princy@119 |

  
