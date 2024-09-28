Feature: Verifying the booking functionality of an spicejet application

Scenario Outline: Login with valid credentials

Given user navigates to home page
When user click the login button for valid credentials
And user click the mobilenumber either email radio button for valid credentials
And user enter the valid "<Email>" id in the email field for valid credentials
And user enter the valid "<Password>" in the password field for valid credentials
Then user click the login button and navigate to booking page for valid credentials

Examples:
|Email|Password|
|dhivi@example.com|dd@1997|


Scenario Outline: Login with invalid credentials

Given user navigates to home page
When user click the login button for invalid credentials
And user click the mobilenumber either email radio button for invalid credentials
And user enter the invalid "<Email>" id in the email field for invalid credentials
And user enter the invalid "<Password>" in the password field for invalid credentials
Then user should get a proper warning message about invalid credentials for invalid credentials

Examples:
|Email|Password|
|divi@example.com|dd@test97|


Scenario Outline: Login with valid email and invalid password

Given user navigates to home page
When user click the login button for invalid password
And user click the mobilenumber either email radio button for invalid password
And user enter the valid "<Email>" id in the email field for invalid password
And user enter the invalid "<Password>" in the password field for invalid password
Then user should get a proper warning message about invalid credentials for invalid password

Examples:
|Email|Password|
|dhivi@example.com|dd@test97|



Scenario Outline: Login with invalid email and valid password

Given user navigates to home page
When user click the login button for invalid email
And user click the mobilenumber either email radio button for invalid email
And user enter the invalid "<Email>" id in the email field for invalid email
And user enter the valid "<Password>" in the password field for invalid email
Then user should get a proper warning message about invalid credentials for invalid email

Examples:
|Email|Password|
|divi@example.com|dd@1997|


Scenario: Login without providing any credentials

Given user navigates to home page
When user click the login button for without credentials
And user click the mobilenumber either email radio button for without credentials
Then user should get a proper warning message about invalid credentials for without credentials