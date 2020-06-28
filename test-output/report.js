$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/search.feature");
formatter.feature({
  "name": "search and place order for vegetables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.stepdef.userIsOnGreencartLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for \"Brinjal\" vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.stepdef.userSearchedForVegetable(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat PageObjects.HomePage.search(HomePage.java:20)\r\n\tat StepDefinition.stepdef.userSearchedForVegetable(stepdef.java:32)\r\n\tat ✽.User searched for \"Brinjal\" vegetable(file:///C:/Users/G%20S%20Sastry/Axone%20Workspace/BDDFramework_Cucumber/src/test/resources/features/search.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "added items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.stepdef.addedItemsToCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.stepdef.userProceededToCheckoutPageForPurchase()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify selected \"Brinjal\" items are displayed in checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.stepdef.verifySelectedItemsAreDisplayedInCheckoutPage(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});