package stepdefinition;


import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.onewaybooking;
import utils.FileReaderManager;
import utils.baseclass;

public class OnewayStep extends baseclass {

	onewaybooking fob = new onewaybooking(driver);
	

	@Given("user navigate to booking page for oneway")
	public void user_navigate_to_booking_page_for_oneway() throws IOException {
		FileReaderManager.getInstance().getConfigReader();
		launchBrowser("Chrome");
		launchUrl("www.spicejet.com");
		implicitlyWait(10);
	}

	@When("user click the oneway button on booking page for oneway")
	public void user_click_the_oneway_button_on_booking_page_for_oneway() throws InterruptedException {
		clickOnElement(fob.getOnewayButton());
        sleep(2000);
	}

	@And("user select the origin place from the from field for oneway")
	public void user_select_the_origin_place_from_the_from_field_for_oneway() throws InterruptedException {
		explicitlyWait(10, fob.getFromOriginClick());
		clickOnElement(fob.getFromOriginClick());
		passInput(fob.getFromOriginClick(), "DEL");
	}

	@And("user select the Destination place from the Destination field for oneway")
	public void user_select_the_destination_place_from_the_destination_field_for_oneway() throws InterruptedException {
		explicitlyWait(10, fob.getToDestination());
		clickOnElement(fob.getToDestination());
		passInput(fob.getToDestination(), "BOM");
	}

	@And("user select the departure date on the date field for oneway")
	public void user_select_the_departure_date_on_the_date_field_for_oneway() throws InterruptedException {
		explicitlyWait(10, fob.getOneWayTripDepartureDatePicker());
		clickOnElement(fob.getOneWayTripDepartureDatePicker());
	}

	@And("user click the passenger and add the passenger for oneway")
	public void user_click_the_passenger_and_add_the_passenger_for_oneway() throws InterruptedException {
		explicitlyWait(2, fob.getPassengers());
		clickOnElement(fob.getPassengers());
		explicitlyWait(10, fob.getAdult());
		clickOnElement(fob.getAdult());
	}

	@And("user click the search flight button for oneway")
	public void user_click_the_search_flight_button_for_oneway() throws InterruptedException {
		clickOnElement(fob.getSearchButton());
		sleep(2000);
	}

	@And("user click the continue button for oneway")
	public void user_click_the_continue_button_for_oneway() throws InterruptedException {
		explicitlyWait(10, fob.getContinueButton());
		clickOnElement(fob.getContinueButton());
	}

	@And("user select the valid salutation in the salutation field for oneway")
	public void user_select_the_valid_salutation_in_the_salutation_field_for_oneway() throws InterruptedException {
		explicitlyWait(10, fob.getSelectSalutationBooking());
		clickOnElement(fob.getSelectSalutationBooking());
		clickOnElement(fob.getSelectSalutationBookingDrop());
		sleep(2000);
	}

	@And("user enter the valid {string} in the firstname field for oneway")
	public void user_enter_the_valid_in_the_firstname_field_for_oneway(String string) {
		passInput(fob.getContactDetailsFirstName(), string);

	}

	@And("user enter the valid {string} in the lastname field for oneway")
	public void user_enter_the_valid_in_the_lastname_field_for_oneway(String string) {
		passInput(fob.getContactDetailsLastName(), string);

	}

	@And("user enter the valid {string} in the phonenumberfield for oneway")
	public void user_enter_the_valid_in_the_phonenumberfield_for_oneway(String string) {
		passInput(fob.getContactDetailsPhoneNumber(), string);

	}

	@And("user enter the valid {string} in the Email field for oneway")
	public void user_enter_the_valid_in_the_email_field_for_oneway(String string) throws InterruptedException {
		clickOnElement(fob.getContactDetailsEmail());
		passInput(fob.getContactDetailsEmail(), string);
	}

	@And("user enter the valid {string} in the Town field for oneway")
	public void user_enter_the_valid_in_the_town_field_for_oneway(String string) throws InterruptedException {
		passInput(fob.getContactDetailsTown(), string);
		explicitlyWait(10, fob.getRetainMyDetails());
		clickOnElement(fob.getRetainMyDetails());
	}

	@And("user select the valid passenger one salutation in the salutation field for oneway")
	public void user_select_the_valid_passenger_one_salutation_in_the_salutation_field_for_oneway() throws InterruptedException {
		clickOnElement(fob.getSelectSalutationPassengerOne());
		clickOnElement(fob.getSelectSalutationPassengerOneDrop());
	}

	@And("user enter the valid {string} in the passenger one firstname field for oneway")
	public void user_enter_the_valid_in_the_passenger_one_firstname_field_for_oneway(String string) {
		passInput(fob.getPassengerOneFirstNameOne(), string);
	}

	@And("user enter the valid {string} in the passenger one Lastname field for oneway")
	public void user_enter_the_valid_in_the_passenger_one_lastname_field_for_oneway(String string) {
		passInput(fob.getPassengerOneLastNameOne(), string);
	}

	@And("user enter the valid {string} in the passenger one PhoneNunber field for oneway")
	public void user_enter_the_valid_in_the_passenger_one_phone_nunber_field_for_oneway(String string) {
		passInput(fob.getPassengerOnePhoneNumberOne(), string);
	}

	@And("user select the valid passenger two salutation in the salutation field for oneway")
	public void user_select_the_valid_passenger_two_salutation_in_the_salutation_field_for_oneway() throws InterruptedException {
		clickOnElement(fob.getPassengerTwoDropArrow());
		clickOnElement(fob.getSelectSalutationPassengerTwo());
		clickOnElement(fob.getSelectSalutationPassengerTwoDrop());

	}

	@And("user enter the valid {string} in the passenger two firstname field for oneway")
	public void user_enter_the_valid_in_the_passenger_two_firstname_field_for_oneway(String string) {
		passInput(fob.getPassengerOneFirstNameTwo(), string);
		
	}

	@And("user enter the valid {string} in the passenger two Lastname field for oneway")
	public void user_enter_the_valid_in_the_passenger_two_lastname_field_for_oneway(String string) {
		passInput(fob.getPassengerOneLastNameTwo(), string);
	}

	@And("user enter the valid {string} in the passenger two PhoneNunber field for oneway")
	public void user_enter_the_valid_in_the_passenger_two_phone_nunber_field_for_oneway(String string) {
		passInput(fob.getPassengerOnePhoneNumberTwo(), string);

	}

	@And("user click the continue button for oneway trip")
	public void user_click_the_continue_button_for_oneway_trip() throws InterruptedException {
		sleep(5000);
		clickOnElement(fob.getPaymentContinueButton());
		sleep(1000);

	}

	@Then("user should get a Trip Summary message on webpage and click the homepage button for oneway")
	public void user_should_get_a_trip_summary_message_on_webpage_and_click_the_homepage_button_for_oneway() throws InterruptedException {
		clickOnElement(fob.getHomePage());
		sleep(1000);
	}

}