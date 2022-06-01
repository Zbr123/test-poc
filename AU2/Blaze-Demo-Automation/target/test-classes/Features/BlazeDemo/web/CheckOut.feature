Feature: CheckOut

  @test
  Scenario:To verify that the user is able to complete checkout process
    Given [Main Page] Navigate to Blaze Web app
    When  [Main Page] Go to the LogIn
    And   [Main Page] Enter Username in logIn filed "Zubair Alam"
    And   [Main Page] Enter Password in logIn filed "vista123"
    Then  [Main Page] Click on LogIn Button
    And   [Main Page] Click on Chart
    And   [Main Page] Click on placeOrder
    When  [Main Page] Enter Buyer name "Zubair ALam"
    And   [Main Page] Enter Country "Pakistan"
    And   [Main Page] Enter City "Karachi"
    And   [Main Page] Enter card number "42424242424424242"
    When  [Main Page] Enter month "March"
    And   [Main Page] Enter year "2020"
    Then  [Main Page] Click on purchase button



