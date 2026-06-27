
Feature: Test Alert functionality

@aps
Scenario: Accept alert
Given User Lands on <URL> page
When User clicks on alert creation button 
Then Click on alert button and accept the alert

Examples:
| URL |
| "https://demoqa.com/alerts" |

