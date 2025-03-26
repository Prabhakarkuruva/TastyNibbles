Feature: Order conformation 
Background:
Given User opens the Browser
And User navigate to the "https://www.tastynibbles.in/" web page
When User clicks on Account link
 
Scenario Outline: User enters invalid adress details 
When User enters '<Email>' in the email field
And User enters '<Password>' in the password field
And User clicks on Sign In button
And User clicks on Cart button
And User clicks on checkout button
And User enters invalid shpping details 
Then User verifies the '<error>' message displayed above order conformation
Examples:
|Email|Password|error|
|prabha@gmail.com|prabha@123|Invalid shipping details|

Scenario Outline: User Login with valid Credentials
When User enters '<Email>' in the email field
And User enters '<Password>' in the password field
And User clicks on Sign In button
And User clicks on checkout button
And User enters valid shpping details 
Then User verifies the '<message>' displayed after order conformation

Examples:
|Email|Password|message|
|prabha@gmail.com|prabha@33|Your is successfully orederd|