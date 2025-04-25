Feature: Rings  
Scenario: Searching for Rings  
Given I am on the Mayors website.  
When I click on search.  
And I enter "<rings>" in the search box.  
And I verify the title contains "<title>"  
And I press enter to search.  
And I click on Rings.  
And I click on For Her.  
And I click on Brand.  
And I select Carlex.  
And I click on the first product.  
And I click on Get Live Expert Advice.  
Then I verify the Buy Now option and capture a screenshot.
Examples:
|rings|title|
|Rings|Rings|