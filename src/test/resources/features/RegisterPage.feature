Feature: Register positive and negative scenarios

	@tag @tag1  
  Scenario Outline: Username required
    Given user is in register page
    And user did not enter any username "<SheetName>" and <RowNumber>
    When user clicks Register link
    Then user should see error message
    Examples: 
      | SheetName    | RowNumber |
      | RegisterPage |         2 |
      
    Scenario Outline: Password required
    Given user enters only username and confirmPassword "<SheetName>" and <RowNumber>
    When user clicks Register link again
    Then user should see error message on password

    Examples: 
      | SheetName    | RowNumber |
      | RegisterPage |         3 |
     
       
  Scenario Outline: Password confirmation required
    Given user does not enter any password confirmation "<SheetName>" and <RowNumber>
    When user clicks Register link third testcase
    Then user should see error message on confirm password

    Examples: 
      | SheetName    | RowNumber |
      | RegisterPage |         4|
     
     
    Scenario Outline: Invalid username
    Given user enters invalid username but valid password and confirmPassword "<SheetName>" and <RowNumber>
    When user clicks Register link for invalid username testcase
    Then user should see error message Invalid username on register page

    Examples: 
      | SheetName    | RowNumber |
      | RegisterPage |         5 |
      
           
 Scenario Outline: Invalid password and password confirmation but both are same
    Given user enters valid username but invalid password and confirmPassword "<SheetName>" and <RowNumber>
    When user clicks Register link for invalid pssword scenarios
    Then user should see error message Invalid password on register page

    Examples: 
      | SheetName    | RowNumber |
      | RegisterPage |         6 |
      | RegisterPage |         7 |
      | RegisterPage |         8 |
      | RegisterPage |         9 |
      
   
  Scenario Outline: password and password confirmation mismatch
    Given  user enters valid username and valid but different password confirmPassword values "<SheetName>" and <RowNumber>
    When user clicks Register link for password mismatch scenario
    Then user should see error message password and password confirmation doesnt match on register page

    Examples: 
      | SheetName    | RowNumber |
      | RegisterPage |        10 |
     
      
    Scenario Outline: user already registered error
    Given user enters valid username password confirmPassword values of an already registered user "<SheetName>" and <RowNumber>
    When user clicks Register link for already registered user scenario
    Then user should be able to see user already registered error message

    Examples: 
      | SheetName    | RowNumber |
      | RegisterPage |        11 |
  
  Scenario Outline: valid user registration
    Given user enters valid username,password,password confirmation values RegisterPage "<SheetName>" and <RowNumber>
    When user clicks Register 
    Then user should be able to see  home page with success message
    And the username displayed at the top right hand corner of the navigation bar 

    Examples: 
      | SheetName    | RowNumber |
      | RegisterPage |         1|

    @tag3  
    Scenario: Login link
    Given user is in Registration page
    When user clicks on Login link in register page
    Then user is redirected to Login page

      