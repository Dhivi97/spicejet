package stepdefinition;


import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Roundtrip;
import utils.FileReaderManager;
import utils.baseclass;

public class RoundwayStep extends baseclass {

	Roundtrip frb = new Roundtrip(driver);
	

	@Given("user navigate to booking page for roundtrip")
	public void user_navigate_to_booking_page_for_roundtrip() throws IOException {
		FileReaderManager.getInstance().getConfigReader();
        launchBrowser("Chrome");
        launchUrl("www.spicejet.com");
        implicitlyWait(10);

	}

	@When("user click the Round Trip button on booking page roundtrip")
	public void user_click_the_round_trip_button_on_booking_page_roundtrip() throws InterruptedException {
		clickOnElement(frb.getRoundTripButton());
        sleep(2000);

	}

	@And("user select the origin place from the from field roundtrip")
	public void user_select_the_origin_place_from_the_from_field_roundtrip() throws InterruptedException {
		clickOnElement(frb.getRoundTripFromOriginClick());
		passInput(frb.getRoundTripFromOriginClick(), "DEL");

	}

	@And("user select the Destination place from the Destination field roundtrip")
	public void user_select_the_destination_place_from_the_destination_field_roundtrip() throws InterruptedException {
		clickOnElement(frb.getRoundTripToDestination());
		passInput(frb.getRoundTripToDestination(), "BOM");

	}

	@And("user select the departure date on the date field roundtrip")
	public void user_select_the_departure_date_on_the_date_field_roundtrip() throws InterruptedException {
		sleep(3000);
		clickOnElement(frb.getRoundTripDepartureDatePicker());

	}

	@And("user select the return date on the date field roundtrip")
	public void user_select_the_return_date_on_the_date_field_roundtrip() throws InterruptedException {
		sleep(3000);
		clickOnElement(frb.getRoundTripReturnDatePicker());
	}

	@And("user click the passenger and add the passenger roundtrip")
	public void user_click_the_passenger_and_add_the_passenger_roundtrip() throws InterruptedException {
		clickOnElement(frb.getRoundTripPassengers());
		clickOnElement(frb.getRoundTripAdult());
	}

	@And("user click the search flight button roundtrip")
	public void user_click_the_search_flight_button_roundtrip() throws InterruptedException {
		clickOnElement(frb.getRoundTripSearchButton());

	}

	@And("user click the continue button roundtrip")
	public void user_click_the_continue_button_roundtrip() throws InterruptedException {
		explicitlyWait(10, frb.getContinueButtonRound());
		clickOnElement(frb.getContinueButtonRound());
		sleep(2000);
	}

	@And("user select the valid salutation in the salutation field roundtrip")
	public void user_select_the_valid_salutation_in_the_salutation_field_roundtrip() throws InterruptedException {
		explicitlyWait(10, frb.getSelectSalutationBookingRound());
		clickOnElement(frb.getSelectSalutationBookingRound());
		clickOnElement(frb.getSelectSalutationBookingDropRound());
	}

	@And("user enter the valid {string} in the firstname field roundtrip")
	public void user_enter_the_valid_in_the_firstname_field_roundtrip(String string) {
		passInput(frb.getContactDetailsFirstNameRound(), string);

	}

	@And("user enter the valid {string} in the lastname field roundtrip")
	public void user_enter_the_valid_in_the_lastname_field_roundtrip(String string) {
		passInput(frb.getContactDetailsLastNameRound(), string);

	}

	@And("user enter the valid {string} in the phonenumberfield roundtrip")
	public void user_enter_the_valid_in_the_phonenumberfield_roundtrip(String string) {
		passInput(frb.getContactDetailsPhoneNumberRound(), string);

	}

	@And("user enter the valid {string} in the Email field roundtrip")
	public void user_enter_the_valid_in_the_email_field_roundtrip(String string) throws InterruptedException {
		clickOnElement(frb.getContactDetailsEmailRound());
		passInput(frb.getContactDetailsEmailRound(),string);
		
	}

	@And("user enter the valid {string} in the Town field roundtrip")
	public void user_enter_the_valid_in_the_town_field_roundtrip(String string) throws InterruptedException {
		passInput(frb.getContactDetailsTownRound(), string);
		explicitlyWait(10, frb.getRetainMyDeatilsRound());
		clickOnElement(frb.getRetainMyDeatilsRound());

	}

	@And("user select the valid passenger one salutation in the salutation field roundtrip")
	public void user_select_the_valid_passenger_one_salutation_in_the_salutation_field_roundtrip() throws InterruptedException {
		clickOnElement(frb.getSelectSalutationPassengerOneRound());
		clickOnElement(frb.getSelectSalutationPassengerOneRound());
	}

	@And("user enter the valid {string} in the passenger one firstname field roundtrip")
	public void user_enter_the_valid_in_the_passenger_one_firstname_field_roundtrip(String string) {
		passInput(frb.getPassengerOneFirstNameOneRound(), string);

	}

	@And("user enter the valid {string} in the passenger one Lastname field roundtrip")
	public void user_enter_the_valid_in_the_passenger_one_lastname_field_roundtrip(String string) {
		passInput(frb.getPassengerOneLastNameOneRound(), string);

	}

	@And("user enter the valid {string} in the passenger one PhoneNunber field roundtrip")
	public void user_enter_the_valid_in_the_passenger_one_phone_nunber_field_roundtrip(String string) {
		passInput(frb.getPassengerOnePhoneNumberOneRound(), string);

	}

	@And("user select the valid passenger two salutation in the salutation field roundtrip")
	public void user_select_the_valid_passenger_two_salutation_in_the_salutation_field_roundtrip() throws InterruptedException {
		clickOnElement(frb.getPassengerTwoDropArrowRound());
		clickOnElement(frb.getSelectSalutationPassengerTwoRound());
		clickOnElement(frb.getSelectSalutationPassengerTwoDropRound());

	}

	@And("user enter the valid {string} in the passenger two firstname field roundtrip")
	public void user_enter_the_valid_in_the_passenger_two_firstname_field_roundtrip(String string) {
		passInput(frb.getPassengerOneFirstNameTwoRound(), string);

	}

	@And("user enter the valid {string} in the passenger two Lastname field roundtrip")
	public void user_enter_the_valid_in_the_passenger_two_lastname_field_roundtrip(String string) {
		passInput(frb.getPassengerOneLastNameTwoRound(), string);

	}

	@And("user enter the valid {string} in the passenger two PhoneNunber field roundtrip")
	public void user_enter_the_valid_in_the_passenger_two_phone_nunber_field_roundtrip(String string) {
		passInput(frb.getPassengerOnePhoneNumberTwoRound(), string);

	}

	@And("user click the continue button roundwaytrip")
	public void user_click_the_continue_button_roundwaytrip() throws InterruptedException {
		explicitlyWait(5, frb.getPaymentContinueButtonRound());
		clickOnElement(frb.getPaymentContinueButtonRound());
		sleep(1000);
	}

	@Then("user should get a Trip Summary message on webpage and click the homepage button roundtrip")
	public void user_should_get_a_trip_summary_message_on_webpage_and_click_the_homepage_button_roundtrip() throws InterruptedException {
        explicitlyWait(10, frb.getHomePageRound());
		clickOnElement(frb.getHomePageRound());
		


	}

}
