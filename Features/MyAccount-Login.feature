Feature: MyAccount-Login Feature
  Description: This feature will test a Login feature

  #Simple login without parameters
	#Scenario: Log-in with valid username and password 
	#Given Open the browser
	#When Enter the URL "http://practice.automationtesting.in/"
	#And Click on My Account Menu
	#And Enter registered username and password
	#And Click on login button
	#Then User must successfully login to the web page

  #Simple login with parameters
	#Scenario: Log-in with valid username and password 
	#Given Open the browser
	#When Enter the URL "http://practice.automationtesting.in/"
	#And Click on My Account Menu
	#And Enter registered username "pavanoltraining" and password "Test@selenium123"
	#And Click on login button
	#Then User must successfully login to the web page
	
  #Simple login with multiple Parameter
	#Scenario Outline: Log-in with valid username and password 
	#Given Open the browser
	#When Enter the URL "http://practice.automationtesting.in/"
	#And Click on My Account Menu
	#And Enter registered username "<username>" and password "<password>"
	#And Click on login button
	#Then Verify login
	#Then Close browser
	
	#Examples:
 	#	|	username		|	password			|
	#	|	pavanoltraining	|	Test@selenium123	|
	#	|	pavanol123		|	Test@123			|
	#	|	pavanoltr		|	Test123				|
	
	
  #Simple login with Data Table Param
	#Scenario: Log-in with valid username and password 
	#Given Open the browser
	#When Enter the URL "http://practice.automationtesting.in/"
	#And Click on My Account Menu
	#And Enter registered username and password 
	#	|	pavanoltraining		|	Test@selenium123	|
	#And Click on login button
	#Then Verify login
	#Then Close browser
	
	
		
  #Simple login with Data Table Param
	Scenario: Log-in with valid username and password 
	Given Open the browser
	When Enter the URL "http://practice.automationtesting.in/"
	And Click on My Account Menu
	And Enter registered username and password 
	|	username 	|	password	|
	|	pavanoltraining		|	Test@selenium123	|
	And Click on login button
	Then Verify login
	Then Close browser