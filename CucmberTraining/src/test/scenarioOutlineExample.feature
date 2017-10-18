Feature: LFG user accounts

Scenario Outline: Account login from homepage
	Given I navigate to the lfg homepage
	When I enter my username "<UserName>"
	And I click next 
	Then I should be at the sign on page

	
	Examples:
		|UserName|
		|apprehensiveEisenhower|
		|honestAbe|
		|jazzyBill|
	