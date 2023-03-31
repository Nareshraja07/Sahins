#Author: naresh@agiratech.com
@smoke
Feature: Login & order assign
@login
  Scenario: Login check
    Given  Navigate to sahins url
    When user enter username and password
    And user clicks login button
    Then  user in dashboard
    
@assignordertophlebo
Scenario: order assign
    Given  Navigate to sahins url
    When user enter username and password
    And user clicks login button
    And user clicks order management
    And user clicks refresh button
    And user clicks order ID
    And user in order details page
    And user clicks assign phlebo button
    Then user assign phlebo
    And Back to order list
    
    
    #Examples: 
      #| username|password|
      #|sahins@agiratech.com|Sahins@123|
   
