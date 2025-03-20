   
   Feature: Search and place the order for Products
   
   @OfferPage
   Scenario Outline: Search experience of product in product page and offers page
   Given User is on the Greencart landing page
   When User search with shortform <Name> in the search field and extract the matching option
   Then User search the same product with shortform <Name> in the offer page to check the product exist

   Examples: 
   |Name|
   |TOM|
   |Beet|
