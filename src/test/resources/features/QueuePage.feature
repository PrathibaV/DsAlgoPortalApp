Feature: Queue page features
  User is able to navigate to different topics in Queue page and subsequently navigate to tryEditor page and see desired output in console for valid python code.


  @tag @tag1 @tag2
 Scenario: User navigates to Queue page
    Given User is in Queue page
    When User clicks on Implementation of Queue in Python "Implementation of Queue in Python" link in Queue page
    Then User should be navigated to  Implementation of Queue in Python page with title "Implementation of Queue in Python"
    
  Scenario:  User navigates to tryEditor page from Implementation of Queue in Python page
    When User clicks Try Here button in Implementation of Queue in Python page
    Then User should be navigated to tryEditor page with title "Assessment"

  
  Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Implementation of Queue in Python page
    When User enters valid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see the output in the console of tryEditor page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
      
  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Implementation of Queue in Python page
    Given User has cleared the textbox in tryEditor page
    When User enters invalid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see an alert popup with the error message
    And User clicks Ok button in the Alert popup

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
    
      
  Scenario: User navigates to Implementation using collections.deque page
    Given User has navigated to Queue page
    When User clicks on Implementation using collections.deque "Implementation using collections.deque" link in Queue page
    Then User should be navigated to Implementation using collections.deque page with title "Implementation using collections.deque"
    
    
  Scenario:  User navigates to tryEditor page from Implementation using collections.deque page
    When User clicks Try Here button in Implementation using collections.deque page
    Then User should be navigated to tryEditor page with title "Assessment"

  
  Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Implementation using collections.deque page
    When User enters valid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see the output in the console of tryEditor page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
      
   Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Implementation using collections.deque page
    Given User has cleared the textbox in tryEditor page
    When User enters invalid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see an alert popup with the error message
    And User clicks Ok button in the Alert popup

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
    
      
  Scenario: User navigates to Implementation using array page
    Given User has navigated to Queue page
    When User clicks on Implementation using array "Implementation using array" link in Queue page
    Then User should be navigated to Implementation using array page with title "Implementation using array"
    
    
    
  Scenario:  User navigates to tryEditor page from Implementation using array page
    When User clicks Try Here button in Implementation using array page
    Then User should be navigated to tryEditor page with title "Assessment"

  
  Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Implementation using array page
    When User enters valid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see the output in the console of tryEditor page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
      
  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Implementation using array page
    Given User has cleared the textbox in tryEditor page
    When User enters invalid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see an alert popup with the error message
    And User clicks Ok button in the Alert popup

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
    
    
  Scenario: User navigates to Queue Operations page
    Given User has navigated to Queue page
    When User clicks on Queue Operations "Queue Operations" link in Queue page
    Then User should be navigated to Queue Operations page with title "Queue Operations"
    
  Scenario:  User navigates to tryEditor page from Queue Operations page
    When User clicks Try Here button in Queue Operations page
    Then User should be navigated to tryEditor page with title "Assessment"

  
  Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Queue Operations page
    When User enters valid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see the output in the console of tryEditor page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
 @tag3     
 Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Queue Operations page
    Given User has cleared the textbox in tryEditor page
    When User enters invalid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see an alert popup with the error message
    And User clicks Ok button in the Alert popup
    
    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
 
