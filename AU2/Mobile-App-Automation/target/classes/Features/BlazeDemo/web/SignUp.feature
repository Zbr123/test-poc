
Feature: SignUp

  @test
  Scenario:To verify that the user is able to SignUp successfully by entering Unique user name and Password
    Given [Main Page] Navigate to Blaze Web app
    When  [Main Page] Go to the SignUp
    And   [Main Page] Enter UserName "Zubair Alam"
    And   [Main Page] Enter Password "vista123"
    Then  [Main Page] Click on SignUp Button


