@login
Feature: Login  As a user should be able to login

  Scenario Outline: Login with different valid credentials
    Given the user is on the login page
    When the user enters "<username>" and "<password>"
    Then the user should be on the home page
    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | helpdesk101@cybertekschool.com | UserUser |
      | marketing99@cybertekschool.com | UserUser |


