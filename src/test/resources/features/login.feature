Feature: Login Feature
  Scenario: Login successful with valid credentials
    Given user on lgin page
    When user enter valid credentials
    Then user must be landed on home page

  Scenario: Login successful with valid credentials
    Given user in a login page
    When user enter valid credentials
    Then user must be landed on home page