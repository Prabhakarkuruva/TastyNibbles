Feature: Login with Valid & Invalid Credentials To verify My Account
Background:
Given User opens the Browser
And User navigate to the "https://www.tastynibbles.in/" web page
When User clicks on Account link
 
Scenario Outline: User Login with Invalid Credentials
When User enters '<Email>' in the email field
And User enters '<Password>' in the password field
And User clicks on Sign In button
Then User verifies the '<error>' message displayed above the login
Examples:
|Email|Password|error|
|prabha@gmail.com|prabha@123|Incorrect email or password.|

Scenario Outline: User Login with valid Credentials
 When User enters '<Email>' in the email field
 And User enters '<Password>' in the password field
 And User clicks on Sign In button
 Then User verifies the '<message>' displayed after login

Examples:
|Email|Password|message|
|prabha@gmail.com|prabha@33|My account|