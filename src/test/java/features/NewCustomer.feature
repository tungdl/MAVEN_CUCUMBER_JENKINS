@new_customer
Feature: Validation for New Customer function
  As an Automation Tester
  I want to validator for New Customer function
  So that I make sure this function work well

  @name_cannot_be_empty
  Scenario: Name cannot be empty
    Given I click to New Customer link
    When I leave Customer Name blank
    And I move to next field
    Then The error message "Customer name must not be blank" must be shown

  @name_cannot_be_numeric
  Scenario: Name cannot be numeric
    Given I enter Customer Name "1234"
    When I move to next field
    Then The error message "Numbers are not allowed" must be shown


