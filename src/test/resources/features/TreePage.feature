@Parallel
Feature: Tree page features
  User is able to navigate to different topics in Tree page and subsequently navigate to tryEditor page and see desired output in console for valid python code.


  @tag @tag1 @tag2
  Scenario: User navigates to Overview of Trees page
    Given User is in Tree page
    When User clicks on Overview of Trees "Overview of Trees" link in Tree page
    Then User should be navigated to Overview of Trees page with title "Overview of Trees"

  Scenario: User navigates to tryEditor page from Overview of Trees page
    When User clicks Try Here button in Overview of Trees page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Overview of Trees page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Overview of Trees page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Terminologies page
    Given User has navigated to Tree page
    When User clicks on Terminologies "Terminologies" link in Tree page
    Then User should be navigated to Terminologies page with title "Terminologies"

  Scenario: User navigates to tryEditor page from Terminologies page
    When User clicks on Try Here button in Terminologies page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Terminologies page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Terminologies page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Types of Trees page
    Given User has navigated to Tree page
    When User clicks on Types of Trees "Types of Trees" link in Tree page
    Then User should be navigated to Types of Trees page with title "Types of Trees"

  Scenario: User navigates to tryEditor page from Types of Trees page
    When User clicks on Try Here button in Types of Trees page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Types of Trees page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Types of Trees page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Tree Traversals page
    Given User has navigated to Tree page
    When User clicks on Tree Traversals "Tree Traversals" link in Tree page
    Then User should be navigated to Tree Traversals page with title "Tree Traversals"

  Scenario: User navigates to tryEditor page from Tree Traversals page
    When User clicks Try Here button in Tree Traversals page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Tree Traversals page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Tree Traversals page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Traversals-illustration page
    Given User has navigated to Tree page
    When User clicks on Traversals-Illustration "Traversals-Illustration" link in Tree page
    Then User should be navigated to Traversals-Illustration page with title "Traversals-Illustration"

  Scenario: User navigates to tryEditor page from Traversals-illustration page
    When User clicks Try Here button in Traversals-illustration page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Traversals-illustration page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Traversals-illustration page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Binary Trees page
    Given User has navigated to Tree page
    When User clicks on Binary Trees "Binary Trees" link in Tree page
    Then User should be navigated to Binary Trees page with title "Binary Trees"

  Scenario: User navigates to tryEditor page from Binary Trees page
    When User clicks Try Here button in Binary Trees page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Binary Trees page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Binary Trees page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Types of Binary Trees page
    Given User has navigated to Tree page
    When User clicks on Types of Binary Trees "Types of Binary Trees" link in Tree page
    Then User should be navigated to Types of Binary Trees page with title "Types of Binary Trees"

  Scenario: User navigates to tryEditor page from Types of Binary Trees page
    When User clicks Try Here button in Types of Binary Trees page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Types of Binary Trees page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Types of Binary Trees page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Types of Implementation in Python page
    Given User has navigated to Tree page
    When User clicks on Implementation in Python "Implementation in Python" link in Tree page
    Then User should be navigated to Implementation in Python page with title "Implementation in Python"

  Scenario: User navigates to tryEditor page from Implementation in Python page
    When User clicks Try Here button in Implementation in Python page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Implementation in Python page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Implementation in Python page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Binary Tree Traversals in Python page
    Given User has navigated to Tree page
    When User clicks on Binary Tree Traversals "Binary Tree Traversals" link in Tree page
    Then User should be navigated to Binary Tree Traversals page with title "Binary Tree Traversals"

  Scenario: User navigates to tryEditor page from Binary Tree Traversals page
    When User clicks Try Here button in Binary Tree Traversals page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Binary Tree Traversals page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Binary Tree Traversals page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Implementation of Binary Trees in Python page
    Given User has navigated to Tree page
    When User clicks on Implementation of Binary Trees "Implementation of Binary Trees" link in Tree page
    Then User should be navigated to Implementation of Binary Trees page with title "Implementation of Binary Trees"

  Scenario: User navigates to tryEditor page from Implementation of Binary Trees page
    When User clicks Try Here button in Implementation of Binary Trees page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Implementation of Binary Trees page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Implementation of Binary Trees page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Applications of Binary trees in Python page
    Given User has navigated to Tree page
    When User clicks on Applications of Binary trees "Applications of Binary trees" link in Tree page
    Then User should be navigated to Applications of Binary trees page with title "Applications of Binary trees"

  Scenario: User navigates to tryEditor page from Applications of Binary trees page
    When User clicks Try Here button in Applications of Binary trees page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Applications of Binary trees page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Applications of Binary trees page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Binary Search Trees in Python page
    Given User has navigated to Tree page
    When User clicks on Binary Search Trees "Binary Search Trees" link in Tree page
    Then User should be navigated to Binary Search Trees page with title "Binary Search Trees"

  Scenario: User navigates to tryEditor page from Binary Search Trees page
    When User clicks Try Here button in Binary Search Trees page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Binary Search Trees page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Binary Search Trees page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  Scenario: User navigates to Implementation Of BST in Python page
    Given User has navigated to Tree page
    When User clicks on Implementation Of BST "Implementation Of BST" link in Tree page
    Then User should be navigated to Implementation Of BST page with title "Implementation Of BST"

  Scenario: User navigates to tryEditor page from Implementation Of BST page
    When User clicks Try Here button in Implementation Of BST page
    Then User should be navigated to tryEditor page with title "Assessment"

  Scenario Outline: User gets output upon giving valid python code in Editor box after navigating to tryEditor page from Implementation Of BST page
    When User enters valid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see the output in the console

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         1 |

  Scenario Outline: User gets error message alert upon giving invalid python code in Editor box after navigating to tryEditor page from Implementation Of BST page
    Given User has cleared the Editor box in tryEditor page
    When User enters invalid python code in the Editor from the given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks Run button
    Then User should see an alert box with the error message
    And User clicks Ok button in Alert

    Examples: 
      | SheetName | RowNumber |
      | tryEditor |         2 |

  @tag3
  Scenario: User navigates to Practice Questions page from Tree page
    Given User has navigated to Tree page
    When User clicks on any of the topics "Implementation Of BST" on Tree page
    And user clicks on Practice Questions Link
    Then user should be redirected to Practice Questions page with title "Practice Questions"
