@Parallel
Feature: Linked List page features
  User is able to navigate to different topics in Linked List page and subsequently navigate to tryEditor page and see desired output in console for valid python code.

  @tag @tag1 @tag2
  Scenario: User navigates to Introduction in Linked List page
    Given User is in Linked List page
    When User clicks on Introduction "Introduction" link in Linked List page
    Then User should be navigated to Introduction page with title "Introduction"

  Scenario: User navigates to tryEditor page from Introduction page
    When User clicks Try Here button in Introduction page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Introduction page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Introduction page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Creating Linked List page
    Given User has navigated to Linked List page
    When User clicks on Creating Linked List "Creating Linked LIst" link in Linked List page
    Then User should be navigated to Creating Linked List page with title "Creating Linked LIst"

  Scenario: User navigates to tryEditor page from Creating Linked LIst page
    When User clicks on Try Here button in Creating Linked LIst page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Creating Linked LIst page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Creating Linked LIst page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Types of Linked List page
    Given User has navigated to Linked List page
    When User clicks on Types of Linked List "Types of Linked List" link in Linked List page
    Then User should be navigated to Types of Linked List page with title "Types of Linked List"

  Scenario: User navigates to tryEditor page from Types of Linked List page
    When User clicks on Try Here button in Types of Linked List page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Types of Linked List page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

   Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Types of Linked List page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
      
   Scenario: User navigates to Implement Linked List in Python page
    Given User has navigated to Linked List page
    When User clicks on Implement Linked List in Python "Implement Linked List in Python" link in Linked List page
    Then User should be navigated to Implement Linked List in Python page with title "Implement Linked List in Python"

  Scenario: User navigates to tryEditor page from Implement Linked List in Python page
    When User clicks on Try Here button in Implement Linked List in Python page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Implement Linked List in Python page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Implement Linked List in Python page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Traversal page
    Given User has navigated to Linked List page
    When User clicks on Traversal "Traversal" link in Linked List page
    Then User should be navigated to Traversal page with title "Traversal"

  Scenario: User navigates to tryEditor page from Traversal page
    When User clicks on Try Here button in Traversal page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Traversal page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

   Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Traversal page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
   
  Scenario: User navigates to Insertion page
    Given User has navigated to Linked List page
    When User clicks on Insertion "Insertion" link in Linked List page
    Then User should be navigated to Insertion page with title "Insertion"

  Scenario: User navigates to tryEditor page from Insertion page
    When User clicks on Try Here button in Insertion page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Insertion page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Insertion page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Deletion page
    Given User has navigated to Linked List page
    When User clicks on Deletion "Deletion" link in Linked List page
    Then User should be navigated to Deletion page with title "Deletion"

  Scenario: User navigates to tryEditor page from Deletion page
    When User clicks on Try Here button in Deletion page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Deletion page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  
  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Deletion page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |
      
   @tag3
   Scenario: User navigates to Practice Questions page from Linked List page
   	Given User has navigated to Linked List page
    When User clicks on any of the topics "Introduction" on Linked List page
    And user clicks on Practice Questions Link
    Then user should be redirected to Practice Questions page with title "Practice Questions"   
