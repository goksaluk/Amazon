
@oneOcean
Feature: Shopping from Amazon
  Scenario: Teddy bear search
    Given the user is on the main page
    When the user search "Teddy bear"
    And the user sorts the result according to "Avg. Customer Review"
    And the user selects the Age range between five to seven years old
    And the user adds the first two items in his cart
    Then the user verifies whether the two items are on the chart.
