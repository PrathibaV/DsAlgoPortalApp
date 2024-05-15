@Home
Feature: Dsportalapp Home page features
User is able to perform various functions in the Home page.
	
	Scenario: User should see Register and Sign In link on navigation bar before loggin in
		Given User has navigated to the Home page
		Then User should see Register link and Sign In link on the navigation bar 
		
	Scenario: User should not navigate to data structure pages on clicking Get Started button without logging in
    Given User has navigated to the Home page 
    When User clicks Get Started button under any of the data structure modules in the Home page   
    Then User should see the message "You are not logged in"

  Scenario: User should not navigate to data structure pages on clicking any options in the Data Structure dropdown without logging in
    Given User has navigated to the Home page 
    When User clicks Data Structure dropdown in the Home page  
    And User clicks any of the 6 links from the dropdown. 
    Then User should see the message "You are not logged in"
    
	Scenario Outline: User should see Username and Sign Out link on navigation bar after loggin in
		Given User has navigated to the Home page
		When User logs into portal
		Then User should see <userName> link and Sign Out link on the navigation bar 
		
		Examples:
		|userName|
		|TechTitans|
   
  Scenario: User should navigate to data structure pages on clicking Get Started button after logging in
    Given User has navigated to the Home page 
    When User clicks Get Started button under any of the data structure modules in the Home page   
    Then User should be navigated to the data structure page
    
  Scenario: User should navigate to data structure pages on clicking any options in the Data Structure dropdown after logging in
    Given User has navigated to the Home page 
    When User clicks Data Structure dropdown in the Home page  
    And User clicks any of the 6 links from the dropdown. 
    Then User should be navigated to the data structure page
    
  Scenario: User should be navigated to Home page on clicking the Numpy Ninja link on the navigation bar
  	Given User has navigated to the stack page 
  	When User clicks Numpy Ninja link on the navigation bar
  	Then User should be navigated to the Home page  
  	
 
    