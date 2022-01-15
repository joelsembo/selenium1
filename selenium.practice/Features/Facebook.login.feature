Feature: User want to sign in and sign off from Facebook

In order to sign in and sign off from account 
As a register user
I want to enter E-Mail Adress, password and click sign-in to login
and click sign off for sign out

Scenario Outline: Positive user login and logout with valid E-Mail Address and password

Given user visiting homepage 
When user enter"<E-Mail Adress>" and "<password>" and user click on sign in in button
Then user successfully login to fbk and click on log off for logout

Examples:
|E-Mail Adress    |password|
|swisbys@gmail.com|textme  |
