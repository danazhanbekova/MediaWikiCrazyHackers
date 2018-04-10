Feature: Checking Page Information functionality

  Background: 
    Given I open a MediaWiki page

  @pageinfo1
  Scenario: Verify that elements on Page are presented
    When I click on Page Information
    Then title should contain "Cybertek's Wiki!"
    And I should see next: 
      | Basic information |
      | Page protection   |
      | Edit history      |

  @pageinfo1
  Scenario: Verify WebElements and Table
    When I click on Page Information
    Then I should see that logo is presented
    And Table is matching next table:
      | Page creator                                 |
      | Date of page creation                        |
      | Latest editor                                |
      | Date of latest edit                          |
      | Total number of edits                        |
      | Total number of distinct authors             |
      | Recent number of edits (within past 90 days) |
      | Recent number of distinct authors            |
