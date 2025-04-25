Feature: Accessibility Functionality

Scenario Outline: Verifying Accessibility Functionality

Given user is on mayors website
When user clicks on your security in footer
And user verifies the page title "<yourSecurity>"
And user clicks on terms and conditions in footer
And user verifies the page title "<termsCondition>"
And user clicks on privacy policy in footer
And user verifies the page title "<privacyPolicy>"
And user clicks on cookie policy in footer
And user verifies the page title "<cookiePolicy>"
And user clicks on accessibility in footer
And user verifies the page title "<accessibility>"
And user clicks on paybylink in footer
And user verifies the page title "<payByLink>"
And user clicks on watches in footer
And user verifies the page title "<watches>"
And user clicks on jewellery in footer
And user verifies the page title "<jewelry>"
And user verifies the categories keyword 
Then user captures the screenshot of the result page

Examples:
    | yourSecurity | termsCondition | privacyPolicy | cookiePolicy | accessibility | payByLink | watches | jewelry |
    | Your Security | Terms & Conditions  | Privacy Policy  | Privacy Policy | Accessibility | PayByLink Terms | Watches | Jewelry |