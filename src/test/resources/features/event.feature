Feature: As a user I should be able to create an Event

  Background:
    Given the user is on the login page
    When the user enters by using "helpdesk101@cybertekschool.com" and "UserUser"
    Then the user should be on the home page
    Then the user should click the events button

  @WIP
  Scenario: Select a Valid Start and End Date and Time Zone
    When the user writes an event name
    Then the user select the start date
    Then the user selects the start time
    Then the user selects the end date
    Then the user selects the end time
    And the user selects the start time zone
    And the user selects the end time zone





