Feature: Users should be able to login

  @wip
  Scenario: Login as a hr
    Given the user is on the login page
    When the user enters the hr login information
    Then the user should be able to login

  Scenario: Login as a held desk
    Given the user is on the login page
    When the user enters the help desk login information
    Then the user should be able to login

  Scenario: Login as a marketing
    Given the user is on the login page
    When the user enters the marketing login information
    Then the user should be able to login