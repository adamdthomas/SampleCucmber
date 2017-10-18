@userTest
Feature: LFG user accounts

@regression
Scenario: Account login from homepage
	Given I navigate to the lfg homepage
	When I enter my username "apprehensiveEisenhower"
	And I click next
	Then I should be at the sign on page

@Smoke
Scenario: Account login from homepage
	Given I navigate to the lfg homepage
	When I enter my username "apprehensiveEisenhower"
	And I click next
	Then I should be at the sign on page
	
Scenario: Account login from homepage
	Given I navigate to the lfg homepage
	When I enter my username "apprehensiveEisenhower"
	And I click next
	Then I should be at the sign on page