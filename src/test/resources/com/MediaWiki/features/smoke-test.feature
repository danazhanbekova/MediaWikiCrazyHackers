Feature: Smoke Test MediaWiki

  @smoketest
  Scenario: Smoke Test
    Given I should log into WikiMedia
    When Logo for page should be visible
    And 
