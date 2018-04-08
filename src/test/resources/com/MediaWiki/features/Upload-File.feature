Feature: Upload File

  @upload_file
  Scenario: Uplaoding file from
    Given I should log into WikiMedia
    When Logo for page should be visible
    Then I press upload file section
    And I upload groups logo
    And I logout from browser

  @test
  Scenario: Uploading page verify
    Given I should log into WikiMedia
    When Logo for page should be visible
    Then I press upload file section
    Then menu options should be visible
