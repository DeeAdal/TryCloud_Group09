Feature: As a user, I should be able to search any item/users from the homepage
  User Story: As a user, I should be able to search any item/users from the homepage

  @search
  Scenario: Verify user is able to search any item/users from the homepage
    Given user on a homepage
    When user clicks on search button on the top right of page
    And write "<photos>" in a search line and clicks enter
    Then user should see "<photos>" related page