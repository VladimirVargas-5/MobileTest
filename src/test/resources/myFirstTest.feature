Feature: Login
  //Suit que se ejecutaran si usamos el tag

  #Comment
  @Regression @SmokeTest @SanityTest
  Scenario: As Admin user
            I want to login o the application using email and pwd
            and select remember option
            So that only the user authentication enter to the application
    Given I have a admin user
    When I set the login textbox with admin
    And I set the pwd textbox with admin
    And I click login button
    Then I enter to the application

