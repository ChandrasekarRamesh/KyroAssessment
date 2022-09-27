@login

Feature: Kyro - Dashboard module

  Scenario Outline: : Create and validate New task under project details
    Given User access the kyro website url
    When User click on the login button
    And User should be presented with the kyro login page
    And User enter a username <username>
    And User enter a password <password>
    And User click on the continue button
    And User should be presented with the home page
    And User click on Dashboard tab
    And User click on kyroTest project
    And User click on the create task button
    And User should be presented with create task dialog box
    And User enter a unique summary
    And User enter a unique tasktype
    And User enter a unique description
    And User select a priority
    And User enter a unique location
    And User enter a startdate
    And User enter a duedate
    And User click on the submit button
    Then new task created in the list view under the project

    Examples:
      | username           | password |
      | ramesh123@mail.com | Test@123 |
