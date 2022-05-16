#language:en

Feature: Login to the Platform Manager page
  I as an automator of gpstrackit
  I need to authenticate on the Platform Manager page
  To verify login

  Scenario: Validación del login exitoso
    Given I am in the chrome web browser at the url
    When Credentials are entered
    Then Successful login is expected