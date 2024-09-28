Feature: Verifying the booking functionality of an spicejet application

Scenario: validate the booking page fields

Given user navigate to booking page
When user click the check-in
And verify the title of the check-in page
And user click the flight status
And verify the title of the flight status page
And user click the manage booking
Then verify the title of the manage booking page