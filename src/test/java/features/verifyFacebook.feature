Feature: Facebook login page

  @displayed
  Scenario: Verify login page
    Given Open Facebook application
    Then Verify email textbox is displayed
    And Verify password textbox is displayed
    And Close application
    
  @datatable_step
  Scenario: Create new Customer with email <Username>
  	Given Open Facebook application
    When Input to Username and Password
	 		|Username		|Password		|Address|
    	|<Username>	|<Password>	|<Address>|
    And Click to Submit button
    Then Verify submit info displayed
    	|Username		|Address		|
    	|<Username>	|<Address>	|
    And Input to Customer name textbox
    And Close application 
