Feature: MensWatch Selection Functionality

Scenario Outline: Verifying Mens Watches
Given user is on homepage of Mayors
When user hovers over brands 
And user clicks on omega
And user verifies the title of the page "<omega>"
And user clicks on Mens Watches
And user clicks on seamaster
And user clicks on blue 
And user clicks on first product
And user click on add to shopping
And user verifies the "<keyword>"
Then user captures the screenshot

Examples:
    | omega | keyword |
    | Omega Watches, Mens  | stores |