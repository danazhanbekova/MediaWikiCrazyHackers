Feature: Create New Page

  
  Scenario Outline: Create and Verify New Page Creation
    When I create a "<Newpage>"
    Then I should be able to navigate to that "<Newpage>"
    Examples:
    |Newpage|
    |1|
    |2|
    |3|
    |4|
    

 
  Scenario: Verify Page Creation Features
    When I create a "<Newpage>"
    Then I should be able to use "<specialcommands>" in the Main Text Box that will create "<specialfeatures>"
    
