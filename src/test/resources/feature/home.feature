@login
Feature: DOIR3 Application Launch
  @smoke @regression @master
  Scenario: Open DOIR3 application by clicking "Create a New Model"
    Given user is on the DOIR3 home page
    When user clicks on "Create a New Model"
    Then user should be taken to the model creation page