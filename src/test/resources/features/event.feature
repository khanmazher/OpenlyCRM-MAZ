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

  //Scenario: Set Reminder
    //When the user sets reminder

  Scenario: Select Event location
    When the user selects event location as Western meeting room

  Scenario: Add attendee
    When User clicks on "Add persons, groups or departments"
    Then User clicks on Employees and Departments
    And User selects persons, groups or departments from the available options

  Scenario: Click On More and Send Message
    When User clicks on more button
    Then user clicks on event accessibility and selects free
    Then user clicks on repeat option and selects never
    Then the user clicks on event importance and selects normal
    And the user clicks send button








