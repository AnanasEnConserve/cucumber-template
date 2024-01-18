Business Need: Allow properly filled out forms to be stored

  Scenario: Logging in with invalid credentials
    Given I move to the "Forms" page
    When Correctly filling in the form with validations
    Then The form should submit