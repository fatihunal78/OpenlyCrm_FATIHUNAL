@login
Feature: Login  As a user should be able to login

  Scenario Outline: Login with different valid credentials
    Given the user is on the login page
    When the user enters "<username>" and "<password>"
    Then the user should be on the home page
    Examples:
      | username                       | password |
      | hr91@cybertekschool.com        | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | marketing91@cybertekschool.com | UserUser |





