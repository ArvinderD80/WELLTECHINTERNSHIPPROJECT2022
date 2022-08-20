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
Scenario: Guest user can able to explore job placement page AND after clicking apply now button all the fields on submission page should visible 

    Given Guest user is in homepage
    When  Guest user clicks over on service icon 
    Then job placement icon should be visible to Guest users in services drop down 
    When Guest user clicks on Job Placement
    Then  Job Placement page should be open 
    When  Guest user click the Apply Now button
    Then  Guest user should be directed towards submission form page 
    
       
Scenario: when Guest Users left all the mandatory feilds blank intentionally and tries to submit button 
     
    Given Guest user is in homepage
    When  Guest user clicks over on service icon 
    Then job placement icon should be visible to Guest users in services drop down 
    When Guest user clicks on Job Placement
    Then  Job Placement page should be open 
    When  Guest user click the Apply Now button
    Then  Guest user should be directed towards submission form page   
    When Guest user click on firstname textbox field 
    And  Guest User left all the fields blank and click submit button 
    Then Guest user should not be registerd and see errors on all  mandatory fields
    
    
  Scenario: when Guest User enters all valid data in the submission form and tries to submit the contact information   
    Given Guest user is in homepage
    When  Guest user clicks over on service icon 
    Then job placement icon should be visible to Guest users in services drop down 
    When Guest user clicks on Job Placement
    Then  Job Placement page should be open 
    When  Guest user click the Apply Now button
    Then  Guest user should be directed towards submission form page   
    When Guest user click on firstname textbox field 
    Then Guest user can be able to enter and see the first name
    When Guest user  click  the last name field  
    Then Guest user can be able to enter  the last  name
    When Guest user click Email field 
    Then Guest user can be able to enter  the email
    When Guest user clicks the  drop down to select the country
    Then Guest user should see the country list
     When Guest user select the country in cell phone field 
    Then Guest user can be able to select   the country
    And Guest user  should click and enter the cell phone in ten  digits .
    Then Guest user should able to enter only ten  digits
    When Guest user clicks on state field
    Then Guest user can be able to enter  the state
    When Guest user writes the state
    Then guest user able to write and see the state name
    And Guest user should  check the check box
    Then Guest user be able to check the check box
    When  Guest user clicks the message field
    Then Guest user can able to writes and see in the message field
    When Guest user clicks the submit button
    Then Guest user should arrive on the homepage https://transfotechacademy.com/
    
    
    
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
      
      # And   All the contact information fields should be visible to Guest users
       #All contact information fields  should be visible to Guest user  on submission form.
       #Guest user can able to see job placement page#
