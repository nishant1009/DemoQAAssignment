Feature: Smoke tests for DemoQA Website

  Background: Launching of DemoQA Test Site
    Given WebDriver is Initialized for Browser and DemoQA Website is launched
    
    
    Scenario: Search Products
    Given User Navigates to Womens Jackets Page
    When User applies color filter
    And Sort by Newness option
    And Change the Price filter
    Then results matching the search criteria should be displayed
    
        