Feature: Tags in Cucumber
Description: to check All tags in Cucumber

@SmokeTest 
Scenario: Verify Login
Given this is Login Test

@SmokeTest @End2End
Scenario: Verify Logout
Given this is Logout Test

@RegressionTest
Scenario: Verify Search
Given this is Search Test

@RegressionTest @End2End
Scenario: Verify Advance Search Test
Given this is advanced search Test

@End2End
Scenario: Verify Prepaid Recharge Test
Given this is Prepaid Recharge Test

@End2End
Scenario: Verify PostPaid Recharge  Test
Given this is PostPaid Recharge Test