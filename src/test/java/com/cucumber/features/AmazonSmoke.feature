@AmazonLoginScenario 
Feature: Amazon application login functionality testing 
This feature inclues test cases such as login with Valid UserName and Password, ... etc

@TC1 @demo
Scenario: Login the application with valid username and password 
	Given User should be in Amazon Home Page 
	When User mouse hover to SignIn button in the Header 
	And User Click on Signin button in AJAX call 
	And User enter the email/mobile number in the emailid feild 
	And User click on Continue button 
	And User enter the password in the password feild 
	And User click the signin button to login the application 
	And User wait for '1' seconds
	Then User validate the username in the Header 
	And User mouse hover to username in the header 
	And User click on signout button
	
	
@LoginwithStepdata @Ignore
Scenario: Login the application with valid username and password with step data 
	Given User should be in Amazon Home Page 
	When User mouse hover to SignIn button in the Header 
	And User Click on Signin button in AJAX call 
	And User enter the email/mobile '9791585555' in the emailid feild 
	And User click on Continue button 
	And User enter the password 'parthiv@2012' in the password field 
	And User click the signin button to login the application 
	And User wait for '1' seconds 
	Then User validate the username 'Hello, bindhu' in the Header 
	And User mouse hover to username in the header 
	And User click on signout button 
	
@LoginwithExamples @demo
Scenario Outline: Login the application with valid username and password for multiple set of datas 
	Given User should be in Amazon Home Page
	When User mouse hover to SignIn button in the Header 
	And User Click on Signin button in AJAX call 
	And User enter the email/mobile '<Mobile Number>' in the emailid feild 
	And User click on Continue button 
	Then User verify the entered mobile '<Mobile Number>' in the login header title
	And User enter the password '<Password>' in the password field 
	And User click the signin button to login the application 
	And User wait for '2' seconds
	Then User validate the username '<UserName>' in the Header 
	And User mouse hover to username in the header 
	And User click on signout button

Examples:
|Mobile Number|Password		|UserName			|
|9884774411   |Lumia*1989*	|Hello, HariPriya	|
|9791585555   |parthiv@2012	|Hello, bindhu		|

	
	