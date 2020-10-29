@e2e
Feature: Google search
  User should be able to search on google

  Scenario Outline: Testing google search
    Given The browser shows the google page
    When The user enters "<searchPhrase>" into google search bar
    And The user press enter key
    Then The app show several results
    Examples:
      | searchPhrase |
      | testing      |
      | cucumber     |
      | java         |