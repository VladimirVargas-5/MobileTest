Feature: Login

  Scenario Outline: As Admin user
  I want to login o the application using email and pwd
  and select remember option
  So that only the user authentication enter to the application
    Given I have a admin user
    When I set the login textbox with <user>
    And I set the pwd textbox with <password>
    And I click login button
    Then I enter to the application

    Examples:
      | user  | password |
      | vayo1 | pwd1     |
      | vayo2 | pwd2     |