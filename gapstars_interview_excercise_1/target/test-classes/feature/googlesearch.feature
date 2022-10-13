Feature: feature to test the google search function
  Scenario:validate google search is working
    Given browser is open
    And user is going search page
    When user enters a text in search box
    And hits enter
    Then user is navigate to another page

