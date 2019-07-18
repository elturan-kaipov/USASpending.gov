Feature:


  @Elturan
  Scenario:
    When user on the homepage
    Then user hover over to Award Searc
    And user click on Advanced Search
    And user Click on Keywor expand arrow
    Then user print in search box hospital chicago
    Then user click on Magnifying Glass in Keyword section
    Then user check box FY 2019 in Time Period Section
    And  user click on Submit Search button
    And user Verify there is a section with 2 Active Filters text on top of search results table
    And user Verify this section has keyword hospital Chicago and time period FY 2019
    Then user Verify column Grants has 38 results












#  Go to URL: https://www.usaspending.gov
#  Hover over "Award Search"
#  Click on "Advanced Search" in the dropdown
#  Click on "Keyword" expand arrow
#  In "Search by Keyword" line print "hospital chicago"
#  Click on "Magnifying Glass" button in "Keyword" section
#  Check box "FY 2019"
#  Click on "Submit Search" button
#  Verify there is a section with "2 Active Filters" text on top of search results table
#  Verify this section has keyword "hospital Chicago" and time period "FY 2019"
#  Verify column "Grants" has 38 results