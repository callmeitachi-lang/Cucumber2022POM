Feature: to create a account through registration

@WIP
Scenario: Register for the application by providing valid details
Given I Navigate to register page
When I enter the below details
  |firstname|kanwar| 
  |lastname |singh  |
  |email|knwrpl.singh342@gmail.com|
  |telephone|123455341|
  |password|Kanwar@775|
  
  And I select the privacy policy option
And I click on Continue button
Then user should be successfully registered 
  