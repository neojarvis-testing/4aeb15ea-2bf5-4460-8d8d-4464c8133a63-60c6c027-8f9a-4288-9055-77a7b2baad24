Feature: Searching Products on mayors Website
Scenario Outline: Search for Earrings
Given I am on the website
When I click on the search Bar
And I search for "<value>"
And I  verify the search results with "<verify1>"
And I click on brand
And I click on Gucci
And I verify the page whether it has "<verify2>"
And I click on Rose Gold
And I click on Drop Earrings
And I verify the page <verify3>
And I click on the first product appered after the filters
And I click on get live expert advice
Then I take the screenshot of the page
Examples:
| value | verify1 | verify2 | verify3 |
| Earrings | Earrings | Gucci | Drop Earrings |