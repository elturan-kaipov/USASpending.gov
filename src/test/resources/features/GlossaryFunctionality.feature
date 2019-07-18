@GlossaryFunctionality
Feature: Verification of Glossary functionality

  Background: User is on the homepage and is able to see Glosary tab
    Given User is on the USAspending homepage
    And User is able to see the Glossary tab


  Scenario: Testing terms starting with O letter
    When User clicks on Glossary
    Then User should see Glossary window
    And  User should see eight glossary terms starting with O letter


  Scenario: Testing Object Class definitions page title
    When User clicks on Glossary
    Then User should see Glossary window
    Then User clicks on Object Class link
    Then User clicks on Official Definition link
    Then User clicks on Object Class definitions link
    Then User should switch to new window with title Object Class definitions