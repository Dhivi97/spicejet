Feature: Verifying the booking functionality of an spicejet application

Scenario Outline: Round Trip booking functionality

Given user navigate to booking page for roundtrip 
When user click the Round Trip button on booking page roundtrip
And user select the origin place from the from field roundtrip
And user select the Destination place from the Destination field roundtrip
And user select the departure date on the date field roundtrip
And user select the return date on the date field roundtrip
And user click the passenger and add the passenger roundtrip
And user click the search flight button roundtrip
And user click the continue button roundtrip
And user select the valid salutation in the salutation field roundtrip
And user enter the valid "<FirstName>" in the firstname field roundtrip
And user enter the valid "<LastName>" in the lastname field roundtrip
And user enter the valid "<PhoneNumber>" in the phonenumberfield roundtrip
And user enter the valid "<Email>" in the Email field roundtrip
And user enter the valid "<Town>" in the Town field roundtrip
And user select the valid passenger one salutation in the salutation field roundtrip
And user enter the valid "<PassengerOneFirstName>" in the passenger one firstname field roundtrip
And user enter the valid "<PassengerOneLastName>" in the passenger one Lastname field roundtrip
And user enter the valid "<PassengerOnePhoneNumber>" in the passenger one PhoneNunber field roundtrip
And user select the valid passenger two salutation in the salutation field roundtrip
And user enter the valid "<PassengerTwoFirstName>" in the passenger two firstname field roundtrip
And user enter the valid "<PassengerTwoLastName>" in the passenger two Lastname field roundtrip
And user enter the valid "<PassengerTwoPhoneNumber>" in the passenger two PhoneNunber field roundtrip
And user click the continue button roundwaytrip
Then user should get a Trip Summary message on webpage and click the homepage button roundtrip

Examples:

|FirstName|LastName|PhoneNumber|Email|Town|PassengerOneFirstName|PassengerOneLastName|PassengerOnePhoneNumber|PassengerTwoFirstName|PassengerTwoLastName|PassengerTwoPhoneNumber|
|Boopalan|P|9385909297|dhivi@example.com|chennai|Boopalan|P|9385909297|Gowtham|P|6381267221|