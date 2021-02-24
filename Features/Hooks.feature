Feature: Hooks in Cucumber
Description: testing Hooks in Cucumber

Scenario: Add New Customer
Given User is on Add Customer Page
When User Added all Details
Then Customer is added



Scenario: Edit Customer
Given User is on Edit Customer Page
When User Edit contact details
Then Contact Details updated



Scenario: Delete Customer
Given User is on Delete Customer Page
When User Delete Customer
Then Customer Deleted

