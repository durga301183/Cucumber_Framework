Feature: search and place order for vegetables
  @Test
  Scenario Outline:
    Given User is on Greencart Landing page
    When User searched for <vegetable> vegetable
    And added items to cart
    And User proceeded to checkout page for purchase
    Then verify selected <vegetable> items are displayed in checkout page
Examples:
    | vegetable|
    |  Brinjal |