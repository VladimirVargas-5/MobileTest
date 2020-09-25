Feature: Login
  Background:
    Given I have a admin user

  Scenario: As Admin user
            I want to login o the application using email and pwd
            and select remember option
            So that only the user authentication enter to the application

    When I set the login textbox with admin
    And I set the pwd textbox with admin
    And I click login button
    Then I enter to the application

  Scenario: As Admin user
  I want to login o the application using email and pwd
  and select remember option
  So that only the user authentication enter to the application

    When I set the login textbox with admin
    And I set the pwd textbox with admin
    And I click login button
    Then I enter to the application


  Scenario: As Admin user
  I want to login o the application using email and pwd
  and select remember option
  So that only the user authentication enter to the application

    When I set the login textbox with admin
    And I set the pwd textbox with admin
    And I click login button
    Then I enter to the application