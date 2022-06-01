
Feature: LogIn

  @test
  Scenario:To verify that the user is able to login by entering valid user name and Password
    Given [Main Page] Navigate to Blaze Web app
    When  [Main Page] Go to the LogIn
    And   [Main Page] Enter Username in logIn filed "Zubair Alam"
    And   [Main Page] Enter Password in logIn filed "vista123"
    Then  [Main Page] Click on LogIn Button