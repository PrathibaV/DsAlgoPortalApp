@Feature
Feature: Dsportalapp Home page features
  User is able to perform various functions in the Home page.

   
  @tag
  Scenario: User navigates to the Home Page  
  When User clicks Get Started button from the landing page
  Then User should be navigated to the Home page with title "NumpyNinja"
  
  
  Scenario: User should see Register and Sign In link on navigation bar before loggin in
    Given User is in the home page
    Then User should see Register link and Sign In link on the navigation bar
    
 
  Scenario: User should not navigate to data structure pages on clicking Get Started button without logging in
    When User clicks on Get Started button under any of the data structure modules in the Home page
    Then User should see the message "You are not logged in"

  
  Scenario: User should not navigate to data structure pages on clicking any options in the Data Structure dropdown without logging in
    When User clicks Data Structure dropdown in the Home page
    And User clicks any of the links from the dropdown.
    Then User should see the alert message "You are not logged in"
	
	
  Scenario Outline: User should see Username and Sign Out link on navigation bar after loggin in
    # Given User has navigated to the Home page
    When User logs into the portal with username "<userName>" and password "<password>"
    Then User should see username "<userName>" link and Sign Out "Sign out" link on the navigation bar

    Examples: 
      | userName   | password   |
      | TechTitans | TT1234$#@! |

  
  Scenario Outline: User should navigate to data structure pages on clicking Get Started button after logging in
    When User clicks Get Started button under dataStructure "<DataStructures>" in the Home page
    Then User should be navigated to the data structure page with title as "<DataStructures>"
    And User navigates to Home page by clicking Numpy Ninja link

    Examples: 
      | DataStructures               |
      | Data Structures-Introduction |
      | Array                        |
      | Linked List                  |
      | Stack                        |
      | Queue                        |
      | Tree                         |
      | Graph                        |

	
  Scenario Outline: User should navigate to data structure pages on clicking any options in the Data Structure dropdown after logging in
    When User clicks the Data Structure dropdown in the Home page
    And User clicks the Data Structure "<DataStructures>" link from the dropdown
    Then User should navigate to the data structure page with title as "<DataStructures>"

    Examples: 
      | DataStructures |
      | Array          |
      | Stack          |
      | Linked List    |
      | Queue          |
      | Tree           |
      | Graph          |

  @tag3 
  Scenario Outline: User should be navigated to Home page on clicking the Numpy Ninja link on the navigation bar
    Given User is in the Home page
    When User clicks on Get Started button under Array "<DataStructure>" Data Structure
    And User clicks on Numpy Ninja link on the navigation bar
    Then User should be navigated to the Home page with the URL "https://dsportalapp.herokuapp.com/home"

    Examples: 
      | DataStructure |
      | Array          |
