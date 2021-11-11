Feature: Login with in valid credentials
  @login
  Scenario: Login with different valid credentials
    Given the user is on the login page
    When the user enters by using "helpdesks76@cybertekschool.com" and "UserUseR"
    Then the should not be on home page

  @login
  Scenario: Login with different valid credentials
    Given the user is on the login page
    When the user enters by using "helpdesk76@cybertekschool.com" and "UserUseR"
    Then the should not be on home page

  @login
  Scenario: Login with different valid credentials
    Given the user is on the login page
    When the user enters by using "helpdesKK76@cybertekschool.com" and "UserUser"
    Then the should not be on home page
  @login
  Scenario: Login with different valid credentials
    Given the user is on the login page
    When the user enters by using "    " and "    "
    Then the should not be on home page