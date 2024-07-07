Feature: Register and login

  @register_login
  Scenario: Register to system and login
    Given Open Register page
    When Input to Firstname and Lastname textbox
    And Input to Email textbox
    And Input to Password and Confirm Password textbox
    When Click To Register button
    And Click To Continue button
    Then Homepage is displayed
    
