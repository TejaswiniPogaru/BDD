Feature: Registration for project
Scenario: user navigate to registration page
Given Iam on registration page 
When I enter firstname as Tejaswini 
And I enter lastname as Pogaru
And I enter email Id as Tejaswini.Pogaru@gmail.com
And I enter contactnumber as 9876
And I enter address as niz
And I enter city as hyd
And I select state as Andhra 
        And  I enter Project Details as J2EE project
		And I enter Project name is LV
		And  I enter Client name is HV
		And  I enter Team Size is 5
		Then Finally reached to registration success page


