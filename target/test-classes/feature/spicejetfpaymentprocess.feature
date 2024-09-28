Feature: Verifying the booking functionality of an spicejet application

Scenario Outline: Payment and Checkout functionality

Given user navigate to booking page for payment
When user click the oneway button on booking page for payment
And user select the origin place from the from field for payment
And user select the Destination place from the Destination field for payment
And user select the departure date on the date field for payment
And user click the passenger and add the passenger for payment
And user click the search flight button for payment
And user click the continue button for payment
And user select the valid salutation in the salutation field for payment
And user enter the valid "<FirstName>" in the firstname field for payment
And user enter the valid "<LastName>" in the lastname field for payment
And user enter the valid "<PhoneNumber>" in the phonenumberfield for payment
And user enter the valid "<Email>" in the Email field for payment
And user enter the valid "<Town>" in the Town field for payment
And user select the valid passenger one salutation in the salutation field for payment
And user enter the valid "<PassengerOneFirstName>" in the passenger one firstname field for payment
And user enter the valid "<PassengerOneLastName>" in the passenger one Lastname field for payment
And user enter the valid "<PassengerOnePhoneNumber>" in the passenger one PhoneNunber field for payment
And user select the valid passenger two salutation in the salutation field for payment
And user enter the valid "<PassengerTwoFirstName>" in the passenger two firstname field for payment
And user enter the valid "<PassengerTwoLastName>" in the passenger two Lastname field for payment
And user enter the valid "<PassengerTwoPhoneNumber>" in the passenger two PhoneNunber field for payment
And user click the continue button for payment two
And user click the skip and continue button for payment
And navigate to payment process and enter the "<CardNumber>" in the card number field for payment
And user enter the "<CardName>" in the CardName field for payment
And user enter the card exp "<Month>" in the exp month field for payment
And user enter the card exp "<Year>" in the exp year field for payment
And user enter the card exp "<CVVNumber>" number in the exp cvv field for payment	
And user click the I have read and understood checkbox for payment
And user click the proceed to pay button for payment
Then user should get a propper message on webpage and click the homepage button for payment

Examples:

|FirstName|LastName|PhoneNumber|Email|Town|PassengerOneFirstName|PassengerOneLastName|PassengerOnePhoneNumber|PassengerTwoFirstName|PassengerTwoLastName|PassengerTwoPhoneNumber|CardNumber|CardName|Month|Year|CVVNumber|
| Boopalan| P| 9385909297| dhivi@example.com|Chennai|Boopalan|P|9385909297|Gowtham|P|6381267221|456443521224|dhivi|08|30|444|