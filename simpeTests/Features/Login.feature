Feature: Login

Scenario: Successful New User Register
	Given User Launch Chrome browser
	When User opens URL "http://automationpractice.com/index.php"
	And Click on Sign in
	Then Page TITLE should be "Login - My Store"
	Then User Eneter Random Email
	And Click on Create An Account
	Then Enter First Name "Imie"
	Then Enter Last Name "Nazwisko"
	Then Enter Password "Haslo123"
	Then Enter Address "Adres"
	Then Enter State
	Then Enter City "Warszawa"
	Then Enter Zip Code "12345"
	Then Enter Mobile Phone "111222333"
	Then Click Register Buttton
	Then Page TITLE should be "My account - My Store"
	And close browser

Scenario: User Authorization
	Given User Launch Chrome browser
	When User opens URL "http://automationpractice.com/index.php"
	And Click on Sign in
	Then Page TITLE should be "Login - My Store"
	Then User Enter Old Email 'random1@gmail.com'
	Then User Enter Old Password "12345"
	Then Click On Sign Button
	Then Page TITLE should be "My account - My Store"
	And close browser


Scenario: Choose Women Cloths
	Given User Launch Chrome browser
	When User opens URL "http://automationpractice.com/index.php"
	Then Click Women
	Then Page TITLE should be "Women - My Store"
	And close browser