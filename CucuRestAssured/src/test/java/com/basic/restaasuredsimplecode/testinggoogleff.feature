Feature: Testing Google

Scenario: test the google is running

Given I start rest aasured testing
When I hit the Google Website
Then I check the status code from respone