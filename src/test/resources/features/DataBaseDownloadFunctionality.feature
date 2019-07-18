@DBDFunctionality
Feature: Verification of Data Base Download functionality

  Background: User is on the homepage and is able to see Download Center tab
    Given User is on the USAspending homepage
    And User is able to see the Download Center tab


  Scenario: Testing visibility of Download Center dropdown
    When User is hovering over Download Center
    Then User should see Award Data Archive
    And User should see Custom Award Data
    And User should see Custom Account Data
    And User should see Agency Submission Files
    And User should see Database Download
    And User should see API
    And User should see Data Dictionary


  Scenario: Testing visibility of Setup guide link in Database Download
    When User clicks on Database Download
    Then User switches to the new window
    And User should see Setup guide link with text "usaspending-db-setup.pdf (173 KB)"


  Scenario: Testing visibility of Database download link link
    When User clicks on Database Download
    Then User switches to the new window
    And User should see Database download link with text "usaspending-db_20190610.zip (50 GB)"

  Scenario: Testing title of Setup guide link link
    When User clicks on Database Download
    Then User switches to the new window
    And User clicks usaspending db setupink
    Then User switches to the new window
    And Title should be "usaspending-db-setup.pdf"