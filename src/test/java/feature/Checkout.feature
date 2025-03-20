   
   Feature: Search and place the order for Products
   
   @PlaceOrder
   Scenario Outline: Search experience of product in product page and offers page
   Given User is on the Greencart landing page
   When User search with shortform <Name> in the search field and extract the matching option
   And User added the quantity "3" for the selected product in cart
   Then User proceed to the checkout page and verify the <Name> in the page
   And User should be visible with the promocode and place order button

   Examples: 
   |Name|
   |Tom|
   |Beet|
   |Cap|
