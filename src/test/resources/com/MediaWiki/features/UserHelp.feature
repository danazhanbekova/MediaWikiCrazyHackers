Feature: Help

  @monika
  Scenario: Verify Help options
    Given I should log into WikiMedia
    When I clicked on  help button
    Then help options on the result page should be visible

  #@User_help
  #Scenario: Verify Searching button options
    #Given I should log  into WikiMedia
    #Then I clicked on  Help button
    #Then Under Reading option click on Searching button
    #And On the result page  headlines should be visible
    #And I logout from browser
