Feature: As a user, I should be able to access to contacts module.

  @wip
  Scenario Outline: User will go to TryCloud site
    Given User on tryCloud login page
    When user enters "<userName>"
    And user enters password Userpass123
    And user clicks login button
    And user clicks Contact module
    Then user sees contact list and contact page title
    Examples:
      | userName |
      | User9    |
      | User39   |
      | User69   |
      | User99   |


Scenario: User will go to TryCloud site
  Given User on tryCloud login page
  When user enters User9
  And user enters password Userpass123
  And user clicks login button
  And user clicks Contact module
  Then user sees contact list and contact page title
