@all
@smoke
Feature: Web_React_Create_New_Record

Scenario Outline: Validating the creation of new training

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
#And enter the employee name "<name>"
And enter the name of employee 7
And enter the course "<course>"
#And enter the trainer name "<trainerName>"
And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
#And enter the percentage completed "<percentage>"
And enter the completion percentage 100
And click the add button 
Then verify if the page is navigated to details page

Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|0|Arun|Selenium|Kumar|0|07232025|07252025|0|0|
|1|Muthu|Playwright|Navin|1|08152025|08162025|1|70|
|2|Divya|Cypress|Priya|2|10032025|10042025|2|95|
|3|Dhilip|CSharp|Raja|3|05172025|05182025|1|69|
|4|Dinesh|Java|Swetha|2|11262025|11272025|2|100|


Scenario Outline: Creation of new Training with Empty EmployeeName field

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
And enter the name of employee 0
And enter the course "<course>"
And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
And enter the completion percentage 100
And click the add button 
Then verify if the error msg is shown

Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|0|Arun|Selenium|Kumar|0|07232025|07252025|0|0|


Scenario Outline: Creation of new Training with Empty course field

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
And enter the name of employee 8
#And enter the course 0
And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
And enter the completion percentage 100
And click the add button 
Then verify if the error msg is shown

Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|0|Arun|Selenium|Kumar|0|07232025|07252025|0|0|



Scenario Outline: Creation of new Training with Empty trainerName field

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
And enter the name of employee 8
And enter the course "<course>"
#And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
And enter the completion percentage 100
And click the add button 
Then verify if the error msg is shown

Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|0|Arun|Selenium|Kumar|0|07232025|07252025|0|0|


Scenario Outline: Creation of new Training with Empty text fields

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
#And enter the name of employee 8
#And enter the course "<course>"
#And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
And enter the completion percentage 100
And click the add button 
Then verify if the error msg is shown

Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|0|Arun|Selenium|Kumar|0|07232025|07252025|0|0|






