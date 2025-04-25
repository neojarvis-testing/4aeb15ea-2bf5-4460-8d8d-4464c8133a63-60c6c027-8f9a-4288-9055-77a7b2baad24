Feature: About Mayors
Scenario Outline: Click on About Mayors
Given I am on the home page "<homes>"
When I click on About Mayors in footer section
And I verify title for Mayors page "<mayors>"
And I verify the url for mayors page "<Mayorsurl>"
And I click on Press Room link in the footer section
And I verify title for press room page "<pressroom>"
And I verify url for press room page "<pressurl>"
And I click on careers link in the footer section
And I verify title for careers page "<career>"
And I verify url for careers page "<careerurl>"
And I click on sustainability in footer section
And I verify title for sustainability page "<sus>"
And I verify url for sustainability page "<susurl>"
And I click on newsletter in the footer section
And I verify title for newsletter page "<news>"
And I verify url for newsletter page "<newsurl>"
And I click on wedding in the footer section
And I verify title for wedding page "<wedding>"
And I verify url for wedding page "<wedurl>"
And I click on rolex in the footer section
And I verify title for rolex page "<rolex>"
And I verify url for rolex page "<rolexurl>"
And I click on brands in the footer section
And I verify title for brand page "<brands>"
Then I verify url for brand page "<brandurl>"

Examples:
|homes  |mayors|Mayorsurl|pressroom|pressurl             |career |careerurl             |sus           |susurl        |wedding|wedurl |rolex|rolexurl|brands |brandurl|news|newsurl|
|Mayors|Mayors|about-us |Press    |press-media-enquiries|Careers|jobs/divisions/mayors/|Sustainability|sustainability|Wedding|wedding|Rolex|rolex   | Brands| Brands |Newsletter|newsletter|

