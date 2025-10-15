@all
@regression_check
Feature: Web_React_Create_Edit_And_Delete

Scenario Outline: Validating the creation of new training

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
And enter the employee name "<name>"
And enter the name of employee 7
And enter the course "<course>"
And enter the trainer name "<trainerName>"
And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
And enter the percentage completed "<percentage>"
And enter the completion percentage 100
And click the add button 
Then verify if the page is navigated to details page

@run
Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|2|karthik|Selenium|Kumar|0|10072025|10072025|0|60|
|1|Muthu|Playwright|Navin|1|10072025|10072025|1|70|
@skip
Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|2|karthik|Cypress|Priya|2|10072025|10072025|2|95|
|3|Dhilip|CSharp|Raja|3|10072025|10072025|1|69|
|4|Dinesh|Java|Swetha|2|10072025|10072025|2|100|

 Scenario: Edit first record sucessfully
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 Then click edit on frist record
 And verify user is on edit training
 Then I change the employeename to "Arun" and the course to "Automation"
 Then click on update button

Scenario: Search course edit employee name first record
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 Then search for course "Auto"
 Then click edit on frist record
 And verify user is on edit training
 Then I change the employeename to "Karthik"
 Then click on update button

 Scenario: Search employeename and course delete first record
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 Then search for employeename "karthik"
 Then search for course "Automation"
 Then click delete on first record

@demo
 Scenario Outline: Search course and delete all records
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 Then search for course "<coursename>"
 Then delete all records of "<coursename>" course
 @run
Examples:
    | coursename |
    | Selenium   |
    @skip
Examples:
    | coursename |
    | CSharp     |
    | Java       |

Scenario: filter by Start date and verify date with filter records
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 And filter Start Date by CurrentdateTime
 Then verify filtered records have CurrentdateTime