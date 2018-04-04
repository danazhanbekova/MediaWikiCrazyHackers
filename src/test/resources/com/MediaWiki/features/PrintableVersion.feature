Feature: Checking Printable Version functionality

  Background: 
    Given I open a MediaWiki page

  @printable
  Scenario: Checking new window pop up and buttons are visible and radio button is selected
    When I click on Printable Version
    Then Print and cancel buttons should be visible
    And Radio button All should be selected
    When I hover to Layout dropdown element and press it
    Then I should see two options Portrait and Landscape 
    When I hover to Color dropdown element and press it
    Then I should see two options Color and Black and White
    
   # @printable
    Scenario: Checking new window pop up and print page is visible
    When I When I click on Printable Version
    Then Print page is visible
    When I hover to More settings and press it
    Then I should see Paper size dropdown
    And It should have 10 options
    When I hover to Margins dropdown and press it 
    Then I should see "Default" selected by default
    And Scale should have a value 100
    And option Header and footer should be checked
    And optoin Background graphics should be unchecked
    
    
