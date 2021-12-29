Feature: feature1
Scenario Outline: scenario1
Given user is in "Web Examples - CrossBrowserTesting.com" page
When user click on Selenium Example Page link
Then system should display "Selenium Test Example Page" page
When  user enters "<names1>" on Form Elements
And user enters "<names2>" on text box
Then user click on  Submit button



Examples:
|names1|names2|
|sireesh|mohan|
|krishna|ram|
|rajesh|rajaaa|
