Feature: validating the openCart login Functionality
@Smoke @ignore @dev @ignoreall 
Scenario: loging in with Credentials for checking the login functionality
Given I am into the loginPage
When I add the username as "knwrpl.singh@gmail.com" and password as "Kanwar@77"
And Click on the login Button
Then the page title will be "My Account"
And Logout from the Page and Click back on Login