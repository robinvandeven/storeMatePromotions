@run

   Feature: Create new promotion

      Scenario: Login to storeMate MO as administrator
           Given I enter the username and password
             | Username | Password |
             | administrator | |
           Then I should be logged in


      Scenario: Navigate to Promotion Maintenance
           Given I am on the home menu
           Then I want to navigate to Promotion Maintenance


       Scenario Outline: Create new promotion
           Given I am on the Promotion Maintenance page
           Then I want to create a new promotion with name <name>
           And with type <type>

        Examples:
        | name | type |
        |  test01    |  Item   |



