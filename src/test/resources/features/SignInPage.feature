
Feature: Login page positive and negative testcases

  @tag @tag1
  Scenario Outline: Login with valid credentials
    Given user is in the login page
    When user enters valid testdata "<SheetName>" and <RowNumber>
    And user clicks on Login button
    Then user is redirected to home page
    And username should be displayed in the right hand side corner of homepage
    And user ushould be able to see message

    Examples: 
      | SheetName  | RowNumber |
      | SignInPage |         1 |

  Scenario: Username required
    Given user is redirected the login page
    When user clicks on login button without giving any values
    Then user should see error message on username textbox

  Scenario: Password required
    Given user is in the login page
    When user enters valid username but no password
    And user clicks on login button without giving any values for password
    Then user should see error message-Please fill out this field message on password textbox and should stay in the same page

  Scenario Outline: Invalid Username and password error message
    Given user is in the login page
    And user enters invalid username and password from "<SheetName>" and <RowNumber>
    When user clicks Login button
    Then user should see error message Invalid Username and Password

    Examples: 
      | SheetName  | RowNumber |
      | SignInPage |         2 |
      | SignInPage |         3 |
      | SignInPage |         4 |
      
   @tag3
  Scenario: Register link
    Given user is in the login page
    When user clicks on Register! link from the Login page
    Then user is redirected to register page   
