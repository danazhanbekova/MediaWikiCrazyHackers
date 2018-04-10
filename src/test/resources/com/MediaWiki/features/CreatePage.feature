Feature: Create New Page

 @smoke
  Scenario Outline: Create and Verify New Page Creation
  	Given I log into MediaWiki
    When I create a "<Newpage>"
    And I should be able to use "<specialcommands>" in the Main Text Box that will create Special Features
    Then I should be able to navigate to that "<Newpage>"
    Examples:
    |Newpage|specialcommands|
    |1|'''quote1'''|
   


    


  Scenario Outline: Verify Page Creation Features
    When I attempt to  a create a "<Newpage>" that already exists
    Then I should be taken to that "<Newpage>" directly
    Examples:
    |Newpage|
    |Turkey Sausage|