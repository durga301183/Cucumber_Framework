Feature: Add New Customer

Given User Launches chrome browser
When  User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And   User enters Email as "admin@yourstore.com" and Password as "admin"
And   click on Login
Then  User can view Dashboard
When  User clicks on customers menu
And   click on customer menu item
Then  User can view Add new user page
When  user enters the info
And   clicks on save button
Then  user can view confirmation message " The new user has been added successfully."
And   close browser
