Feature: verify login and logout

Background: user login
Given enter URL
Given click the login button
When Enter the username and password
And click the sign in  button

Scenario: To check login functionality
Then Check the page title 

Scenario: To check logout functionality
When click the logout button
Then verify succesfull logout 

#Scenario: To update address

#When click  myaddresses and update the address
#Then check the updated address

#Scenario: select a item and purchase it
#When Select summer dress from womens section
#Then Select printed summer dress and confirm the order



#Scenario: To check working of MyAccounts page
#When Enter into MyAccounts page
#Then click order history details and verify
#Then click order My Credit slip and verify
#Then click order My Addresses and verify
#Then click order My Personal information and verify
#Then click order My Wishlists and verify
