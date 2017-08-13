@journey
Feature: plan a journey

  Scenario Outline: :plan a journey
    Given I enter url
    When  i enter "<From>" as source
    And i enter "<To>" as destination
    And i click on plan my journey button
#    Then i should see "JOURNEY RESULTS"
#    And I should see "<From>" in From field
#    And I should see "<To>" in To field
#    And I should see "Edit journey" hyperlink
#    And I should see "Travel preferences & accessibility:"
#    And I should see "Edit preferences" hyperlink
#   And i should see "https://tfl.gov.uk/plan-a-journey/results" in URL


    Examples:
      | From          | To           |
      | London Bridge | Waterloo     |
#      | Waterloo      | Canary wharf |
#      | Canary Wharf  | Waterloo     |
