Feature:
  User Story: As a user, I should be able to update settings.

@wip1
  Scenario Outline: Verify users update settings
    Given user is on the dashboard page
    When user enters "<username>" and password
    And user clicks on the login button
    And the user clicks the Files module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any buttons

    Examples:
    | username |
    | User9    |
    | User39   |
    | User69   |
    | User99   |

  @wip2
  Scenario Outline: Verify users to see the app storage usage
    Given user is on the dashboard page
    When user enters "<username>" and password
    And user clicks on the login button
    And the user clicks the Files module
    And user checks the current storage usage
    And user uploads file with the upload file option
    And user refresh the page
    Then the user should be able to see storage usage is increased

    Examples:
      | username |
      | User9    |
      | User39   |
      | User69   |
      | User99   |







