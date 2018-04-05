Feature: Upload File

  Scenario Outline: Uploading page verify
    Given I should log into WikiMedia
    When I press a Upload file:
      | menuOption | <menuoption> |
    Then I should see menu option "<menuoption>"

    Examples: 
      | menuoption        |
      | Main page         |
      | Recent changes    |
      | Random page       |
      | Help              |
      | Upload file       |
      | Special pages     |
      | Printable version |

  @uplad_file
  Scenario: Uplaoding file from
    Given I should log into WikiMedia
    When Logo for page should be visible
    Then I press upload file section
    And I upload groups logo
    And I logout from browser
