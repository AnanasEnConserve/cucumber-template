Business Need: Allow properly filled out forms to be stored

  Scenario: Logging in with invalid credentials
    Given I move to the "Forms" page
    When Correctly filling in "city" "state" and "zipcode"
    Then The form should submit