  Feature: Send Message
   Agile Story: As a user, I should be able to send messages by clicking on Message tab under Active Stream


   Background:
    Given the user is on the login page
    When the user enters by using "marketing99@cybertekschool.com" and "UserUser"
    Then the user should be on the home page
    And the user should click the "Activity Stream" button
    And the user should click the Message button
@wip
    Scenario: User should be able to send a message

      Then the user enters "Hello Cybertek EU6 Group 4 Sprint 2" message
      And the user clicks the SEND button
      Then the user sees "Hello Cybertek EU6 Group 4 Sprint 2" message on the page






