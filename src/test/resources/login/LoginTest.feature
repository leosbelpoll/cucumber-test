Feature: User Login
  User should be able to login using valid credentials

  Scenario Outline: Testing login with valid credentials
    Given The browser shows the login page
    When The user enters username as "<username>" and password as "<password>"
    And The user press login button
    Then The app redirect to user home page

    Examples:
      | username | password     |
      | leito    | passleito    |
      | pepe     | passwordpepe |

  Scenario: Testing login with invalid credentials
    Given The browser shows the login page
    When The user enters username as "invalid" and password as "password"
    And The user press login button
    Then The app show an error
