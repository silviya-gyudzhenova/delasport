Feature: DelaSport site functionality

  A DelaSport site is a gambling site

  Scenario: Log in the DelaSport site and verify
    When A user logs in with the following credentials:
          | username  | password |
          | betplayer | Pass112# |
    And I close all the pop-ups
    Then User balance is "€0.00"