Feature: Verifying the booking functionality of an spicejet application

Scenario Outline: Signup with valid credentials

Given user must launch the url
When user click the signup button for valid
And user navigate to the signup page for valid
And user enter the valid "<Title>" in the title field
And user enter the valid "<FirstName>" in the firstname field
And user enter the valid "<LastName>" in the lastname field
And user select the valid "<Country>"
And user select the valid  dateofbirth in the calendar field
And user enter the valid "<Phonenumber>" in the phone number field
And user enter the valid "<Email>" in the email field
And user enter the valid "<Password>" in the password field
And user enter the valid "<ConfirmPassword>" in the confirmpassword field
And user click the iagree and submit button for valid
And user verify the OTP
Then user switch back to parent window for valid

Examples:
|Title|FirstName|LastName|Country|Phonenumber|Email|Password|ConfirmPassword|
|Mr|Boopalan|P|India |9385909297|dhivi@example.com|dd@1997|dd@1997|

Scenario Outline: Signup with invalid password characters

Given user must launch the url
When user click the signup button for invalid
And user navigate to the signup page for invalid
And user enter the "<Title>" in the title field
And user enter the "<FirstName>" in the firstname field
And user enter the "<LastName>" in the lastname field
And user select the "<Country>"
And user select the dateofbirth in the calendar field
And user enter the "<Phonenumber>" in the phone number field
And user enter the "<Email>" in the email field
And user enter the invalid "<Password>" in the password field
And user enter the invalid "<ConfirmPassword>" in the confirmpassword field
And user click the iagree and submit button for invalid
And User should get a proper warning message about Password characters 
Then user switch back to parent window for invalid

Examples:
|Title|FirstName|LastName|Country|Phonenumber|Email|Password|ConfirmPassword|
|Mr|Boopalan|P|India |9385909297|dhivi@example.com|dd@test97|dd@test97|

Scenario: Signup with empty credentials

Given user must launch the url
When user click the signup button for empty
And user navigate to the signup page for empty
And user click the iagree and submit button for empty
And User should get a proper warning message about Please fill all mandatory fields marked with an '*' to proceed
Then user switch back to parent window for empty