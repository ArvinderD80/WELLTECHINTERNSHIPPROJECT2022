#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Release1.0
Feature: Service for Job Placement
AS a Guest User i should able to get registered to submit my information in order to be contacted by Transfotech Academy  .
 
 @Regression @smoke @sanity
Scenario: Guest user can able to see job placement page

    Given Guest user is in homepage
    When  Guest user clicks over on service icon 
    Then job placement icon should be visible to Guest users in services drop down 
    When Guest user clicks on Job Placement
    Then  Job Placement page should be open 
    #When  Guest user click the Apply Now button
    #Then  Guest user should be directed towards submission form page 
    #And   All the contact information fields should be visible to Guest users
    #All contact information fields  should be visible to Guest user  on submission form.
    #Guest user can able to see job placement page#
    
 #Scenario:   
    #When Guest user click on firstname textbox field box
    #Then Guest user should able write name in text box field
     #When Guest user enters First name
     #Then Guest user can be able to enter and see the first name
     #When Guest user  click  the last name field  
     #Then Guest user can be able to enter and see the last  name
     #When Guest user enters  the Last name 
     #Then Guest user can be able to enter and see the last  name
     #When Guest user click Email field 
     #
      #
     #Then Guest user can be able to enter  the email
     #When Guest user clicks the  drop down to select the country
     #Then Guest user should see the country list
     #When Guest user select the country in cell phone field 
     #Then Guest user can be able to select   the country
     #And Guest user  should click ,enter the cell phone in 10 digits .
     #Then Guest user should able to enter only 10 digits
     #When Guest user clicks on state field
     #Then Guest user can be able to enter  the state
     #When Guest user writes the state
     #Then guest user able to write and see the state name
     #And Guest user should  check the check box
     #Then Guest user be able to check the check box
     #When Guest user clicks the message field
     #Then Guest user can able to write the field
      #When Guest user writes in the message field
      #Then Guest user can able to writes and see in the message field
      #When Guest user clicks the submit button
      #Then Guest user should arrive on the homepage https://transfotechacademy.com/
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
