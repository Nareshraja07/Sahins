
Feature: Login &  customer creation
@login1
  Scenario: Customer creation
    Given  Navigate to sahins url
    When user enter username and password
    And user clicks login button
    Then  user in dashboard
    And user clicks user management
    And user clicks customer management
    And user clicks create button
    And user enters all mandatory fields
    Then user clicks register button
    Then verify created customer in table
    
    