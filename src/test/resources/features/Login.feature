Feature: Login Functionality
Scenario: Successful Login with Credentials
  Given  User Launches chrome browser
  When   User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
  And    User enters Email as "admin@yourstore.com" and Password as "admin"
  And    click on login button
  Then   Page title should be "Dashboard / nopCommerce administration"
  When   user clicks on Logout link
  Then   Page title should be "Your store.Login"
  And    close browser


  Scenario Outline: Login Data Driven
    Given  User Launches chrome browser
    When   User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And    User enters Email as "<email>" and Password as "<password>"
    And    click on login button
    Then   Page title should be "Dashboard / nopCommerce administration"
    When   user clicks on Logout link
    Then   Page title should be "Your store.Login"
    And    close browser

    Examples:

    | email                   |     password |
    |  admin@yourstore.com    |    admin     |
    |  admin@yourstore.com    |  admin123    |