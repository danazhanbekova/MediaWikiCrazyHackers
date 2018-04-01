Feature: UserHelp

  Scenario: Verify User help options
    Given I logged in into MediaWiki
    When I clicked on User help button
    Then  help options on the result page should be visible
         

  Scenario: 
    Given I logged in into MediaWiki
    Then I clicked on  Usert help button
    Then Under Reading option click on Searching button
    And On the result page  headlines should be visible
      
