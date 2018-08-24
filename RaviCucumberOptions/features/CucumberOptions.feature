Feature: GitHub Login 
@sanity @regression
Scenario: Enter Github Home Page

Given Open github
When User enters invalid username
Then User should get the message 'Incorrect username or password'
When User enters invalid password
Then User should get the message 'Incorrect username or password'
When User enters valid username and password
Then User should be Successfully LoggedIn


@regression
Scenario: Enter Github Home Page

Given Open github
When User enters invalid username
Then User should get the message 'Incorrect username or password'
When User enters invalid password
Then User should get the message 'Incorrect username or password'
When User enters valid username and password
Then User should be Successfully LoggedIn