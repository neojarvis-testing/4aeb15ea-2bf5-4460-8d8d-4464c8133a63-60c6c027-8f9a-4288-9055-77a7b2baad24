Feature: Bracelets in Mayors Website  
Scenario Outline: Adding Bracelets to the Shopping Bag
Given I am on the Website
When I hover over Wedding
And I click on Bracelets
And I verify the word "<verify1>"
And I click on Yellow Gold
And I verify the page that loads the relevant content "<verify2>"
And I click on Diamond
And I verify the page that loads with relevant content "<verify3>"
And I click on Bracelets
And I  verify the page "<verify4>"
And I click on the first product
And I click on Add to Shopping Bag
Then I capture the screenshot
Examples:
|verify1 |verify2 |verify3 |verify4 |
|jewelry |Yellow Gold |Diamond |Bracelets |
