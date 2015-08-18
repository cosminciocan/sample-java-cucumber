@ready
Feature: Login Feature
  This feature tests the login



  Scenario: Login to the UI site
    Given I access the "ui" site
    Then I should be logged in
    And I log out

