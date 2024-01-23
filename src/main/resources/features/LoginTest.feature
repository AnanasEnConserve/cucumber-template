Business Need: Users should be able to create an account and log in

  Background: Make data driven tests with direct interaction of Testdata files and system - also generate and store

  Scenario: Should be able to log in and add a pizza to my cart (use admin admin as credentials) [TC01]
    Given I move to the detail page
    When I log in as an existing user


  Scenario: Register as a new user (generate random name and email and password) [TC02]
    Given I move to the detail page
    And I move to the registration page
    When I fill in my personal information
    Then I should be registered successfully



