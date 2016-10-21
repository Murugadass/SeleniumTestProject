Feature: Times paid Journey
  As a Times customer
  I want to register Times with Creditcard payment
  So that I can access the Times content

@Times
  Scenario: Time Paid Journey
    Given I am on "Times" web page with "TEST_MP110" promocode
    When I fill personal details
    And I submit personal details
    When I choose "credit card" payment option
    And I fill card details
    And I fill billing address section
    And I choose home delivery option
    And I submit payment details
    Then I should see review Order section
    When I agree to "Times" terms and condition
    And I click submit the review order form
    Then I should see Times Thank You page
    And I take screenshot of the current state
