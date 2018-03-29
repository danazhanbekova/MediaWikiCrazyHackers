Feature: Create Account

  Background: 
    Given I open a MediaWiki page

  Scenario Outline: Verify error message with invalid registration data
    When I click on Create Account link
    And I enter registration credentials in the "<username>", "<password>", "<confirm_password>"
    Then I should get failure message "<message>"

    Examples: 
      | username | password | confirm_password | message                                                                            |
      | Dana     | abc123   | abc123           | Username entered already in use.Please choose a different name                     |
      | Flower   | Flower   |                  | Your password must be different from your username                                 |
      | Flower   | abc123   | abc1234          | There are problems with some of your input. The passwords you entered do not match |
      
      

  Scenario: Create account using  Main page
    When I create a new account with random username
    Then I should be able to create a new account