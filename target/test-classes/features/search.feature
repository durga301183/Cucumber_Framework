Feature: search and place order for vegetables
  @Test
  Scenario:
    Given User is on Greencart Landing page
    When User searched for "Brinjal" vegetable
    And added items to cart
    And User proceeded to checkout page for purchase
    Then verify selected "Brinjal" items are displayed in checkout page
