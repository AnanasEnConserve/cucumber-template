Business Need: To allow employees to log in and keep non-employees out

  Scenario: Logging in with valid credentials
    Given I move to the sign in page
    When I enter valid credentials
    Then I should be logged in


  Scenario Outline: Logging in with invalid credentials
    Given I move to the sign in page
    When I enter an invalid "username" and "password" combination
    Then I should be denied access
    Examples:
      | username               | password          |
      | arnoutvanh@gmail.com   | niethetwachtwoord |
      | flarnoutvanh@gmail.com | ehvwwvAmazon      |