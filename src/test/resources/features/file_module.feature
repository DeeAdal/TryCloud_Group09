@wip
Feature: As a user, I should be able to access to Files module.
  User Story : As a user, I should be able to access to Files module.


  Background: verification all files are selected
    Given user on the dashboard page

  Scenario: Verify users can access to Files module
  #Given user on the dashboard page
    When the user clicks the "Files" module
    Then verify the page title is "Files - Trycloud QA.”


  Scenario: verify users can select all the uploaded files from the page
   # Given user on the dashboard page
   When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected


#This is how i would try in scenario outline, but i will play with that too
  #@wip
  #Scenario Outline: Verification that all files are selected
   # Given link to trycloud page
    #When user enters "<userName>"
    #And user enters password Userpass123
    #And user click on Login btn
    #And user on the dasboard page
    #And user clicks the "Files" module
    #Then verify the page title is "Files - Trycloud QA.”
    #And user click the top-left checkbox of the table
    #Then verify all the files are selected

  #Examples:
  #| userName |
  #| User09   |
  #| User39   |
  #| User69   |
  #| User99   |




