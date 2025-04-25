Feature: Jewelry 
Scenario Outline: Hover over Jewelry
Given I am on home page "<home>"
When I hover over jewelry and click on chanel
Then the result page for "<chanel>" is displayed
And I click on rings
And I verify page for "<ring>"
And I click on cococrush under brand type
And I verify page for "<cococrush>"
And I click on white gold under metal type
And I verify page for "<whitegold>"
Then I click on first product from available products
Examples:
|home|chanel|ring|cococrush|whitegold|
|Mayors|CHANEL|Rings|Coco Crush|White Gold|

