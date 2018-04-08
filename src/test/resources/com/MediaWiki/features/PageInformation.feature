Feature: Checking Page Information functionality

  Background: 
    Given I open a MediaWiki page

  @pageinfo
  Scenario Outline: Verify that elements on Page are presented
    When I click on Page Information
    Then I should see that title changed for "Information for \"Main Page\""
    And I should see next "<headers>":

    Examples: 
      | headers           |
      | Basic information |
      | Page protection   |
      | Edit history      |

  @pageinfo
  Scenario Outline: Verify WebElements and Table
    When I click on Page Information
    Then I should see that "Number of redirects to this page" is presented
    And Table is matching "<expected>" table:

    Examples: 
      | expected                                     |
      | Page creator                                 |
      | Date of page creation                        |
      | Latest editor                                |
      | Date of latest edit                          |
      | Total number of edits                        |
      | Total number of distinct authors             |
      | Recent number of edits (within past 90 days) |
      | Recent number of distinct authors            |
