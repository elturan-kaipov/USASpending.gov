@TC004
Feature: TC004AwardSearch

  Scenario: Award Search option is present
    Given User is on UsaSpendingGov homepage
    Then User should see Award Search option

  Scenario: Award Search tooltip text
    Given User is on UsaSpendingGov homepage
    And user is hovering over Award Search option
    Then user sees tooltip with text Award Search: Search through awards and discover trends and connections

  Scenario: Award Search expand menu button tooltip text
    Given User is on UsaSpendingGov homepage
    And user is hovering over Award Search expand menu button
    Then user sees tooltip with text Expanded menu

