@amazon
Feature: Shopping from Amazon
  Scenario Outline: Selecting the product correctly and seeing its definition
    Given the user is on the main page
    When the user clicks on burger menu for all products
    Then the user clicks "<mainProducts>" on the main page
    And the user clicks the "<generalProductsNames>" on the main page
    And the user is on the categorised product page with "<categorisedPageTitle>"
    And the user clicks the "<product>" which is under the "<commonName>" on the categorised product page
    Then the user is on the product page with "<productPageTitle>"
    When the user clicks on the "<particularProduct>"
    And the user selects price preference from "<selectionOptions>" on the result page
    And the user clicks the second highest priced product on the results page
    Then the product description header is visible to the user

    Examples:
    | mainProducts                    | generalProductsNames  | categorisedPageTitle                                                                                                 |product              | commonName |productPageTitle                                                                                                      |particularProduct|selectionOptions    |
    | Electronics, Computers & Office | TV & Home Theatre     | Amazon.ca: Televisions & Video: Electronics: Accessories, Projectors, AV Receivers & Amplifiers, Televisions & More  |Televisions          | Electronics|Amazon.ca: Televisions - Televisions & Video: Electronics                                                             |Samsung          | Price: High to Low |
    | Electronics, Computers & Office | TV & Home Theatre     | Amazon.ca: Televisions & Video: Electronics: Accessories, Projectors, AV Receivers & Amplifiers, Televisions & More  |Televisions          | Electronics|Amazon.ca: Televisions - Televisions & Video: Electronics                                                             |Hisense          | Price: High to Low |
    | Electronics, Computers & Office | TV & Home Theatre     | Amazon.ca: Televisions & Video: Electronics: Accessories, Projectors, AV Receivers & Amplifiers, Televisions & More  |Televisions          | Electronics|Amazon.ca: Televisions - Televisions & Video: Electronics                                                             |LG               | Price: High to Low |
    | Electronics, Computers & Office | Headphones & Speakers | Amazon.ca: Home & Portable Audio: Electronics                                                                        |Audio & Home Theatre | Electronics|Amazon.ca: Home Audio: Electronics: Accessories, Radios & Boomboxes, Home Theatre Systems, Speakers & More            |iSkey            | Price: High to Low |
    | Electronics, Computers & Office | Car Electronics       | Amazon.ca: Car & Vehicle Electronics: Electronics: Accessories, Car Electronics, Motorcycle Electronics & More       |Marine Electronics   | Electronics|Amazon.ca: Marine Electronics: Electronics: Marine Antennas & More                                                    |Boss Audio       | Price: High to Low |
    | Electronics, Computers & Office | Camera, Photo & Video | Amazon.ca: Camera, Photo & Video: Electronics: Video, Lighting & Studio, Accessories, Film Photography & More        |Tripods & Monopods   | Electronics|Amazon.ca: Tripods & Monopods: Electronics: Complete Tripods, Monopods, Tripod Heads, Tabletop & Travel Tripods & More|VIJIM            | Price: High to Low |
