Feature: Free CRM Login Feature

#without Example keyword

#Scenario: After Login Free CRM title Test Scenario			 
#Given user is already logged In
#When verify title of home page is CRMPRO
#Then Print title on console

#Scenario: Free CRM Login Test Scenario
#Given User is already on Login Page
#When title of login page is freeCRM
#Then user enters "Balli04" and "July@2019"
#Then user clicks on login page

#with Example keyword
Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When title of login page is freeCRM
Then user enters "<username>" and "<password>"
Then user clicks on login page
Then close the browser

Examples:

| username | password |
| Balli04  | July@2019|
| naveenk  | test@123 |
| Tom      | test@456 |
