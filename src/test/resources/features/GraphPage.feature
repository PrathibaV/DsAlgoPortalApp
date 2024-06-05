@Parallel
Feature: Graph page features
  User is able to navigate to different topics in Graph page and subsequently navigate to tryEditor page and see desired output in console for valid python code.

  @tag @tag1 @tag2
  Scenario: User navigates to Graph page
    Given User is in Graph page
    When User clicks on Graph "Graph" link in Graph page
    Then User should be navigated to Graph page with title "Graph"

  Scenario: User navigates to tryEditor page from Graph page
    When User clicks Try Here button in Graph page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Graph page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Graph page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Graph Representations page
    Given User has navigated to Graph page
    When User clicks on Graph Representations "Graph Representations" link in Graph page
    Then User should be navigated to Graph Representations page with title "Graph Representations"

  Scenario: User navigates to tryEditor page from Implementation page
    When User clicks on Try Here button in Implementation page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Graph Representations page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Graph Representations page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  @tag3
  Scenario: User navigates to Practice Questions page from Graph page
    Given User has navigated to Graph page
    When User clicks on any of the topics "Graph" on Graph page
    And user clicks on Practice Questions Link
    Then user should be redirected to Practice Questions page with title "Practice Questions"
