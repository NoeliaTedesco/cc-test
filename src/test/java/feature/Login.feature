Feature: Cucumber-LoginIntranet
  Login in the OSDE intranet

  Scenario: Login
    Given I want to open the intranet
    And  I write the username and password
    When  I click on the login button
    Then I login in the intranet page
