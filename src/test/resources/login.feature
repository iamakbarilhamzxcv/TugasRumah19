
@login
Feature: Login


  @valid-login
  Scenario: Login with valid username and password
    Given user is on login page
    And user input email on text box with "standard_user"
    And user input password on the text box  with "secret_sauce"
    When user click login button
    Then user will be redirect to homepage

  @invalid-login
  Scenario: Login with invalid username and password
    Given user is on login page
    And user input email on text box with "standard_sauce"
    And user input password on the text box  with "invalid"
    When user click login button
    Then  user able to see error message "Epic sadface: Username and password do not match any user in this service"





