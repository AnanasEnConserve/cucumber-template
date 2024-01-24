Business Need: Allow properly filled out forms to be stored

  @formtest
  Scenario: Correctly filling out the form
    Given I move to the "Forms" page
    When Correctly filling in "city" "state" and "zipcode"
    Then The form should submit

  @formtest
  Scenario: Incorrectly filling the form
    Given I move to the "Forms" page
    When Incorrectly filling in "city" "state" and "zipcode"
    Then The form should submit
