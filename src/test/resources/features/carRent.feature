Feature: rentCar

  @rent
  Scenario: Add a car
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on the Login Link
    And User enters valid data
    And User clicks on Yalla Button
    And User verifies Success message is displayed
    And User clicks OK button
    And User clicks on Let the car work link
    And User enters valid data about car
    And User clicks submit button
    Then User verifies message car was added
    And User quites browser