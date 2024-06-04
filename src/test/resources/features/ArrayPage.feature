Feature: Array page features
  User is able to navigate to different topics in Array page and subsequently navigate to tryEditor page and see desired output in console for valid python code.
  
 @tag @tag1 @tag2
  Scenario: User navigates to Array page
    Given User is in Array page
    When User clicks on Arrays in python "Arrays in python" link in Array page
    Then User should be navigated to  Array in Python page with title "Arrays in Python"
    
  Scenario:  User navigates to tryEditor page from Arrays in python page
    When User clicks Try Here button in Arrays in python page
    Then User should be navigated to tryEditor page with title "Assessment"

  
  Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Arrays in python page
    When User enters valid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see the output in the console of tryEditor page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
      
  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Arrays in python page
    Given User has cleared the textbox in tryEditor page
    When User enters invalid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see an alert popup with the error message
    And User clicks Ok button in the Alert popup

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
    
      
  Scenario: User navigates to Arrays Using List page
    Given User has navigated to Array page
    When User clicks on Arrays Using List "Arrays Using List" link in Array page
    Then User should be navigated to Arrays Using List page with title "Arrays Using List"
    
    
  Scenario:  User navigates to tryEditor page from Arrays Using List page
    When User clicks Try Here button in Arrays Using List page
    Then User should be navigated to tryEditor page with title "Assessment"

  
  Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Arrays Using List page
    When User enters valid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see the output in the console of tryEditor page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
      
   Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Arrays Using List page
    Given User has cleared the textbox in tryEditor page
    When User enters invalid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see an alert popup with the error message
    And User clicks Ok button in the Alert popup

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
    
      
  Scenario: User navigates to Basic Operations in Lists page
    Given User has navigated to Array page
    When User clicks on Basic Operations in Lists "Basic Operations in Lists" link in Array page
    Then User should be navigated to Basic Operations in Lists page with title "Basic Operations in Lists"
    
    
    
  Scenario:  User navigates to tryEditor page from Basic Operations in Lists page
    When User clicks Try Here button in Basic Operations in Lists page
    Then User should be navigated to tryEditor page with title "Assessment"

  
  Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Basic Operations in Lists page
    When User enters valid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see the output in the console of tryEditor page
    
    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
      
  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Basic Operations in Lists page
    Given User has cleared the textbox in tryEditor page
    When User enters invalid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see an alert popup with the error message
    And User clicks Ok button in the Alert popup

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
    
    
  Scenario: User navigates to Applications of Array page
    Given User has navigated to Array page
    When User clicks on Applications of Array "Applications of Array" link in Array page
    Then User should be navigated to Applications of Array page with title "Applications of Array"
    
  Scenario:  User navigates to tryEditor page from Applications of Array page
    When User clicks Try Here button in Applications of Array page
    Then User should be navigated to tryEditor page with title "Assessment"

  
  Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Applications of Array page
    When User enters valid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see the output in the console of tryEditor page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
      
  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Applications of Array page
    Given User has cleared the textbox in tryEditor page
    When User enters invalid python code in the textBox from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on Run button
    Then User should see an alert popup with the error message
    And User clicks Ok button in the Alert popup

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
    
    #**********************************************888
    
    Scenario: User navigates to Practice Questions page
    Given User has navigated to Array page
    When User clicks on Practice Questions link in Applications of Array page
    Then User should be navigated to Practice Questions page with title "Practice Questions"

 Scenario:  User navigates to Editor page from Practice Questions page 
    When User clicks  in Search the array link
    Then User should be navigated to Practice Questions Editor page with title "Assessment"

Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to Editor page from Practice Questions page having Search the array link
    Given User has cleared the Editor box in Assessment page
    When User enters valid python code in the Editor box from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button in Assessment Page
    Then User should see the output in the console in Assessment Page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to Editor page from Practice Questions page having Search the array link
    Given User clicks the Editor box and has cleared the Editor box in Assessment page
    When User enters invalid python code in the Editor box from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button in Assessment Page
    Then User should see an alert box with the error message in Assessment Page
    And User clicks Ok button in Alert in Assessment Page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |


 Scenario:  User navigates to Editor page from Practice Questions page having Max Consecutive Ones link
    Given User is in Practice Questions page
    When User clicks  in Max Consecutive Ones link
    Then User should be navigated to Practice Questions Editor page with title "Assessment"


Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to Editor page from Practice Questions page having Max Consecutive Ones link
    Given User has cleared the Editor box in Assessment page
    When User enters valid python code in the Editor box from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button in Assessment Page
    Then User should see the output in the console in Assessment Page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
      
      Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to Editor page from Practice Questions page having Max Consecutive Ones link
    Given User clicks the Editor box and has cleared the Editor box in Assessment page
    When User enters invalid python code in the Editor box from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button in Assessment Page
    Then User should see an alert box with the error message in Assessment Page
    And User clicks Ok button in Alert in Assessment Page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |




 Scenario:  User navigates to Editor page from Practice Questions page having Find Numbers with Even Number of Digits link
    Given User is in Practice Questions page
    When User clicks  in Find Numbers with Even Number of Digits link
    Then User should be navigated to Practice Questions Editor page with title "Assessment"
    
Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to Editor page from Practice Questions page having Find Numbers with Even Number of Digits link
    Given User has cleared the Editor box in Assessment page
    When User enters valid python code in the Editor box from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button in Assessment Page
    Then User should see the output in the console in Assessment Page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |
      
      
      Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to Editor page from Practice Questions page having Find Numbers with Even Number of Digits link
    Given User clicks the Editor box and has cleared the Editor box in Assessment page
    When User enters invalid python code in the Editor box from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button in Assessment Page
    Then User should see an alert box with the error message in Assessment Page
    And User clicks Ok button in Alert in Assessment Page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |



 Scenario:  User navigates to Editor page from Practice Questions page having Squares of a Sorted Array link
    Given User is in Practice Questions page
    When User clicks in Squares of a Sorted Array link
    Then User should be navigated to Practice Questions Editor page with title "Assessment"

Scenario Outline:  User gets output upon giving valid python code in Editor box after navigating to Editor page from Practice Questions page having Squares of a Sorted Array link
    Given User has cleared the Editor box in Assessment page
    When User enters valid python code in the Editor box from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button in Assessment Page
    Then User should see the output in the console in Assessment Page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

@tag3
Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to Editor page from Practice Questions page having Squares of a Sorted Array link
    Given User clicks the Editor box and has cleared the Editor box in Assessment page
    When User enters invalid python code in the Editor box from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button in Assessment Page
    Then User should see an alert box with the error message in Assessment Page
    And User clicks Ok button in Alert in Assessment Page

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
    
    
  
