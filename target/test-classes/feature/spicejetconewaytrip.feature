Feature: Verifying the booking functionality of an spicejet application

Scenario Outline: Oneway booking functionality

Given user navigate to booking page for oneway
When user click the oneway button on booking page for oneway
And user select the origin place from the from field for oneway
And user select the Destination place from the Destination field for oneway
And user select the departure date on the date field for oneway
And user click the passenger and add the passenger for oneway
And user click the search flight button for oneway
And user click the continue button for oneway
And user select the valid salutation in the salutation field for oneway
And user enter the valid "<FirstName>" in the firstname field for oneway
And user enter the valid "<LastName>" in the lastname field for oneway
And user enter the valid "<PhoneNumber>" in the phonenumberfield for oneway
And user enter the valid "<Email>" in the Email field for oneway
And user enter the valid "<Town>" in the Town field for oneway
And user select the valid passenger one salutation in the salutation field for oneway
And user enter the valid "<PassengerOneFirstName>" in the passenger one firstname field for oneway
And user enter the valid "<PassengerOneLastName>" in the passenger one Lastname field for oneway
And user enter the valid "<PassengerOnePhoneNumber>" in the passenger one PhoneNunber field for oneway
And user select the valid passenger two salutation in the salutation field for oneway
And user enter the valid "<PassengerTwoFirstName>" in the passenger two firstname field for oneway
And user enter the valid "<PassengerTwoLastName>" in the passenger two Lastname field for oneway
And user enter the valid "<PassengerTwoPhoneNumber>" in the passenger two PhoneNunber field for oneway
And user click the continue button for oneway trip
Then user should get a Trip Summary message on webpage and click the homepage button for oneway

Examples:

|FirstName|LastName|PhoneNumber|Email|Town|PassengerOneFirstName|PassengerOneLastName|PassengerOnePhoneNumber|PassengerTwoFirstName|PassengerTwoLastName|PassengerTwoPhoneNumber|
|Boopalan|P|9385909297|dhivi@example.com|chennai|Boopalan|P|9385909297|Gowtham|P|6381267221|