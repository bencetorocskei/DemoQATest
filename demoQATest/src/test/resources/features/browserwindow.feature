# Created by bence at 2023. 03. 03.
Feature: Browse Window

  Scenario: Test New Tab button
    Given I am on the demoQA Browser Window page
    When I click on the New Tab button
    Then I see This is a sample page

  Scenario: Test New Window button
    Given I am on the demoQA Browser Window page
    When I click on the New Window button
    Then I see a new sample page window

#  Scenario: Test New Window message button
#    Given I am on the demoQA Browser Window page
#    When I click on the New Window message button
#    Then I see a new window with a message