@tag
Feature: Application Login
 

  @tag1
  Scenario: Login Page Test
    Given user is on actitime landing page
    When user provides username and password
    And click on login
    Then Home Page shouldbe displayed

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
