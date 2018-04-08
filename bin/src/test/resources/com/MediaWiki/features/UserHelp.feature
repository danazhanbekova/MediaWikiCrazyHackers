Feature: Help

  Scenario: Verify Help options
    Given I logged in into MediaWiki
    When I clicked on  help button
    Then  help options on the result page should be visible
         

  Scenario: Verify Searching button options
    Given I logged in into MediaWiki
    Then I clicked on  Help button
    Then Under Reading option click on Searching button
    And On the result page  headlines should be visible
      
