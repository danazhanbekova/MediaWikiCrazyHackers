Feature: Upload File

  @uplad_file
  Scenario: Uplaoding file from
    Given I should log into WikiMedia
    When Logo for page should be visible
    Then I press upload file section
    And I upload groups logo
    And I logout from browser
