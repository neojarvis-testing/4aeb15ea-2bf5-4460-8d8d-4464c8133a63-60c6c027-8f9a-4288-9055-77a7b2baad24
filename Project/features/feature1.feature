Feature: Rolex watches
Scenario Outline: verifying the rolex watches
  Given I hover on Rolex
  When I click on deepsea
  And I verify the page title "<deepSea>"
  And I click on rolex watches
  And I verify the text "<rolexwatch>"
  And I click on discover watches
  And I verify the page title "<discover>"
  And I click on New watches
  And I verify the page title "<newwatch>"
  And I click on watchmaking
  Then I verify the keyword "<watchmake>"

Examples:
  | deepSea        | rolexwatch     | discover        | newwatch   | watchmake          |
  | Rolex Deepsea  | Rolex watches  | Official Rolex  | New Rolex  | Rolex Watchmaking  |