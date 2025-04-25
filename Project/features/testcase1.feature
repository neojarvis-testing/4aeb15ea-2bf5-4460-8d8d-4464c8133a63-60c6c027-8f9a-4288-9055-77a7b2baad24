Feature: Testing Mayors
        Scenario Outline: Testing Mayors
        Given I click on accept cookies
        When I Hover on watches
        And I click on Best sellers
        And I click verify page title "<Best-Sellers>"
        And I click on close pop-up
        And I click on For Him.
        And I verify page loaded with relevent content "<ForHim>"
        And I click on cartier
        And I verify loaded page content "<Cartier>"
        And I click on Dial color
        And I click on Black
        And I verify page content "<Black>"
        And I click on First product
        Then I click on Add to Bag
Examples:
  | Best-Sellers  | ForHim       | Cartier  | Black       |
  | Watches       | Best-Sellers  | Watches  | Dmayors_us  |

    
