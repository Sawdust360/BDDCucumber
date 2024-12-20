Feature: Successful Login

  Scenario: Successful Login with Valid Credentials
    Given that I am in the login page
    When I enter valid credentials
    And I click the login button
    Then I should see the shop.
