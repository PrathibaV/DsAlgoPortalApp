#Data Structures Introduction
@Feature
Feature: Data Structures-Introduction page features
  User is able to navigate to the topic in Data Structures-Introduction page and subsequently navigate to tryEditor page and see desired output in console for valid python code.

 @tag @tag1 @tag2
  Scenario: Check Time Complexity link in Data Structures-Introduction page is working
    Given user is in the Data Structures-Introduction page
    When user clicks on Time Complexity "Time Complexity" link in Data Structures-Introduction page
    Then user should be redirected to Time Complexity page with title "Time Complexity"

  Scenario: Check Practice Questions link in Time Complexity page is working    
    When user clicks on Practice Questions Link
    Then user should be redirected to Practice Questions page with title "Practice Questions"

  Scenario: Check "Try Here" button in Time Complexity page is working
    Given user is in Time Complexity page
    When user clicks on Try Here button in the Time Complexity page
    Then User should be navigated to tryEditor page with title "Assessment"    

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Time Complexity page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
	@tag3
  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Time Complexity page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
      
      