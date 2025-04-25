Feature: Footer  
Scenario: Scroll to Footer  
Given I am on the homepage.  
When I scroll down to the footer.  
And I click on Contact Us.  
And I verify the "<title1>" and "<URL1>" of Contact Us.  
And I click on Luxury Services.  
And I verify the "<title2>" and "<URL2>" of Luxury Services.  
And I click on Store Finder.  
And I verify the "<title3>" and "<URL3>" of Store Finder.  
And I click on Delivery Information.  
And I verify the "<title4>" and "<URL4>" of Delivery Information.  
And I click on Click and Collect.  
And I verify the "<title5>" and "<URL5>" of Click and Collect.  
And I click on Return Policy.  
And I verify the "<title6>" and "<URL6>" of Return Policy.  
And I click on Affirm Finance.  
And I verify the "<title7>" and "<URL7>" of Affirm Finance.  
And I click on Your Feedback.  
And I verify the "<title8>" and "<URL8>" of Your Feedback.  
Then I capture a screenshot.
Examples:
|title1|title2|title3|title4|title5|title6|title7|title8|URL1|URL2|URL3|URL4|URL5|URL6|URL7|URL8|
|Contact Us|Luxury Services|Store Finder|Delivery Information|Click and Collect |Return Policy |Affirm Finance |Your Feedback |https://www.mayors.com/contact-us|https://www.mayors.com/luxury-services|https://www.mayors.com/store-finder|https://www.mayors.com/delivery-information|https://www.mayors.com/click-and-collect|https://www.mayors.com/return-policy|https://www.mayors.com/affirm-finance|https://www.mayors.com/your-feedback|