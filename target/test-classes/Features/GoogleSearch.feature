Feature: Test Google Search functionality

@test
Scenario Outline: Check Google search functionality
Given User Lands on google search page
When User enters <search_value> in search box
Then User Lands on search result page

Examples:
| search_value |
| "Selenium WebDriver" |
#| "Cucumber Framework" |