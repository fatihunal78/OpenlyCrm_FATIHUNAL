
  Feature: Add the Users
   Agile Story: As a user,I  should be able to create a  poll by clicking on Poll tab under Active Stream

      Scenario: User should be login
      Given the user should be login page
      When  the user enters the username and password
      Then  the user navigates to the home page


    Scenario: Add users by selecting multiple contacts from Employee and Departments contact lists

      Given the user navigates to the home page
      When the user should click the poll button
      Then the user clicks the Add More button
      And  the user clicks the Employees and departments
      And  the user clicks the new department's name
      And  the user clicks the all department employees
      And  the user clicks the hr76@cybertekschool.com
      Then clicked users are seen in the receiver box filed


      Scenario: attach a link by clicking on the link icon
        Given the user navigates to the home page
        When the user should click the poll button
        Then  the user clicks the link icon
        And   the user writes the link text in the Text box
        And   the user writes the link url in the Link box
        And   the user clicks the Save button
        Then  link text is seen in the message field


      Scenario:  add the mention by clicking the add mention icon

        Given the user navigates to the home page
        When the user should click the poll button
        And   the user clicks Add mention icon
        And   the user clicks on the Employee and departments
        And   the user clicks the hr76@cybertekschool.com
        Then  clicked user is seen in the receiver "To" filed

        Scenario: add questions and multiple answers

          Given the user navigates to the home page
          When the user should click the poll button
          And the user writes a question in the Question box
          And the user writes an answer in the Answer 1 box
          And the user writes another answer in the Answer 2 box
          And the user writes another answer in the Answer 3 box
          And the user clicks the add question button
          And the user writes a question in the new Question box
          And the user writes an answer in the new Answer 1 box
          And the user writes another answer in the new Answer 2 box
          And the user writes another answer in the new Answer 3 box
          And the user writes a message in the message box
          And the user clicks the Send button
          Then the user see the questions and answers on the home page






