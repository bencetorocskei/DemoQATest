# Created by bence at 2023. 03. 15.
Feature: Alert


  Scenario: Test alert button
    Given I am on the demoQA alert page
    When I click the Button to see alert
    Then I see an alert window

  Scenario: Test timer alert button
    Given I am on the demoQA alert page
    When I click the timer alert Button to see alert
    Then I see an alert after 5 sec

  Scenario: Test confirm box button
    Given I am on the demoQA alert page
    When I click the confirm box button
    When I accept the confirmation
    Then I see a confirmation text appears next to the button

  Scenario: Test prompt button
    Given I am on the demoQA alert page
    When I click on the prompt box button
    When I enter my name and accept
    Then I see a result text next to the button