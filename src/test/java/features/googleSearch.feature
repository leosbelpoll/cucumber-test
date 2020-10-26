Feature: Google search
  User should be able to search on google

  Scenario: Testing google search
    Given The browser shows the google page
    When The user enters "testing" into google search bar
    And The user press enter key
    Then The app show several results
