@Muthu
Feature: Muthu_13APR2025_Web_CompDBReg
 
Scenario: Test the banking operations in customer Registration
    Given I enter the url of Registration of domain
    When I enter the customer Registration Details
    Then I can able to Register successfully

Scenario: Test the banking operations in customer CompDBlogin
    Given I enter the url of domain CompDataBaselogin
    When I enter customer credentials of CompDataBaselogin
    Then I can login domain of CompDBlogin successfully

Scenario: Test the functionality of Search ComputerDatabase
    Given I enter the url for search the Computer Database
    When I enter the ComputerDB name one by one
    Then I can able to Search Computer DB

Scenario: Test the cancel of ComputerDatabase
    Given I enter the cancelled the register of ComputerDatabase
    When I enter the ComputerDatabase Info
    Then I can able to cancel ComputerDatabase
