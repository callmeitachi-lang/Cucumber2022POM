Feature: Searching of various product categories should be possible along with product search

Scenario: Search for the products under books category
Given I visit the website as a guest user
When I select the books option from the search icon
And I click on search icon option
Then I should see the page heading as Amazon Best Reads is getting displayed
But I should not see the other category products


