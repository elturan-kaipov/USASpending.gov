Feature: Verification of State and Territory Name in States Profiles functionality

  Background: Travel to dropdown

    Given User goes to Usaspending website
    And User hovers over Profiles
    Then User clicks on States option of the dropdown menu

  @56
  Scenario: Verification of the search summary

    Then User should see fifty six results in the search summary
    And the table of the search results should contain fifty six rows

  @namesorder
  Scenario: Verification of the state names and the order of the search results in the search summary

    Then State and Territory Name Column of the search summary should contain state names starting from Alabama and ending with US Virgin Islands VI
    And State and Territory Name Column search results from one to fifty one of the search summary should contain state names in the alphabetical order

  @52-56
  Scenario:

    Then State and Territory Name Column search result fifty two of the search summary should be American Samoa (AS)
    And State and Territory Name Column search result fifty three of the search summary should be Guam (GU)
    And State and Territory Name Column search result fifty four of the search summary should be Northern Mariana Islands (MP)
    And State and Territory Name Column search result fifty five of the search summary should be Puerto Rico (PR)
    And State and Territory Name Column search result fifty six of the search summary should be U.S. Virgin Islands (VI)

  @ascending
  Scenario:

    Then User hovers over upward arrow in Awarded Amount cell
    Then User should see the prompt showing up with text Sort table by ascending awarded amount

  @descending
  Scenario:

    Then User clicks on the downward arrow in Awarded Amount cell
    Then User should see the amounts in Awarded Amount column sorted in descending order