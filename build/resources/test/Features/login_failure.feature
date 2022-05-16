#language en

Feature: Validation of error messages
  I as an automator of gpstrackit mobile
  I need to enter wrong data
  To display validation messages

  Background: open browser
    Given I am in the chrome web browser at the url


  @required_user
  Scenario: User required validation
    When Only the password is entered
    Then The username validation message is expected to say that the field is required.

  @required_password
  Scenario: Password required validation
    When Only the username is entered
    Then The password validation message is expected to say that the field is required.

  @nonexistent_user
  Scenario: Validation of non-existent user message
    When Enter a user that does not exist
    Then The system is expected to display the validation message that the user does not exist.

  @incorrect_password
  Scenario: Incorrect password message validation
    When Enter an existing user and incorrect password
    Then The system is expected to display the validation message that the password is incorrect.