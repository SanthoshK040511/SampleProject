Feature: To Validate the login functionality of facebook application

Scenario: To validate login with empty username and empty password
Given To Launch the chrome browser and maxmize window
When To launch the Url of facebook application
And To Pass valid username in email field
And To Pass invalid password in password field
And To click the login button
And To check whether navigate to homepage or not
Then To Close the browser

Scenario Outline: To Validate the positive and negative combination of login functionality
Given User has to launch the browser and maximize the window
When User has to hit the Facebook Url
And User has to pass the data "<emaildatas>" in email field
And user has to pass the data "<passworddatas>"in password field
And User has to click the login button
Then User has to close the browser

Examples:
|emaildatas          |passworddatas|
|Santhosh@gmail.com  |Santhoshkumar|
|happykumar@gmail.com|happykumar|
|abcdef@gmail.com    |994475|
|ghijkl@gmail.com    |240199|
|cucumber@gmail.com  |Santhosh|
|Java@gmail.com      |None|

