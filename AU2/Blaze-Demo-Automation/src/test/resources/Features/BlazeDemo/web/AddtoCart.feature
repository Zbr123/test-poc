Feature: Add to Chart

  @test
  Scenario:To verify that the user is able to add products to chart
    Given [Main Page] Navigate to Blaze Web app
    When  [Main Page] Go to the LogIn
    And   [Main Page] Enter Username in logIn filed "Zubair Alam"
    And   [Main Page] Enter Password in logIn filed "vista123"
    Then  [Main Page] Click on LogIn Button
    And   [Main Page] Enter Items to add on cart
    Then  [Main Page] Click on Add to Chart