Feature: TryCloud Application login feature
  User Story:
  As a user, I should be able to log in. Verify user login fail with invalid credentials


  Scenario Template: Log in as a user
    Given user on the TryCloud login page
    When user enters "<invalidUsername>" and enters "<invalidPassword>"
    When user clicks on login button
    Then verify "<message>" message should be displayed


    Examples: invalid credentials
      | invalidUsername | invalidPassword | message                     |
      | user9           | Userpass125     | Wrong username or password. |
      | user140         | userpass123     | Wrong username or password. |
      | userUser        | userPass123     | Wrong username or password. |
