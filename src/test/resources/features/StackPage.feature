@Parallel
Feature: Stack page features
  User is able to navigate to different topics in Stack page and subsequently navigate to tryEditor page and see desired output in console for valid python code.

  @tag @tag1 @tag2
  Scenario: User navigates to Operations in Stack page
    Given User is in Stack page
    When User clicks on Operations in Stack "Operations in Stack" link in Stack page
    Then User should be navigated to Operations in Stack page with title "Operations in Stack"

  Scenario: User navigates to tryEditor page from Operations in Stack page
    When User clicks Try Here button in Operations in Stack page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Operations in Stack page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Operations in Stack page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Implementation page
    Given User has navigated to Stack page
    When User clicks on Implementation "Implementation" link in Stack page
    Then User should be navigated to Implementation page with title "Implementation"

  Scenario: User navigates to tryEditor page from Implementation page
    When User clicks on Try Here button in Implementation page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Implementation page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Implementation page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Applications page
    Given User has navigated to Stack page
    When User clicks on Applications "Applications" link in Stack page
    Then User should be navigated to Applications page with title "Applications"

  Scenario: User navigates to tryEditor page from Applications page
    When User clicks on Try Here button in Applications page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Applications page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
  
  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Applications page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

	 @tag3
   Scenario: User navigates to Practice Questions page from Stack page
   	Given User has navigated to Stack page
    When User clicks on any of the topics "Applications" on Stack page
    And user clicks on Practice Questions Link
    Then user should be redirected to Practice Questions page with title "Practice Questions"