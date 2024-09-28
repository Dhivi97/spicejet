package stepdefinition;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.payment;
import utils.FileReaderManager;
import utils.baseclass;

public class PaymentProcess extends baseclass {

	payment pay = new payment(driver);

	@Given("user navigate to booking page for payment")
	public void user_navigate_to_booking_page_for_payment() throws IOException {
		FileReaderManager.getInstance().getConfigReader();
        launchBrowser("Chrome");
        launchUrl("www.spicejet.com");
        implicitlyWait(10);

	}

	@When("user click the oneway button on booking page for payment")
	public void user_click_the_oneway_button_on_booking_page_for_payment() throws InterruptedException {
		clickOnElement(pay.getOnewayButton());
		sleep(1000);
	}

	@And("user select the origin place from the from field for payment")
	public void user_select_the_origin_place_from_the_from_field_for_payment() throws InterruptedException {
		explicitlyWait(10, pay.getFromOriginClick());
		clickOnElement(pay.getFromOriginClick());
		passInput(pay.getFromOriginClick(), "DEL");
	}

	@And("user select the Destination place from the Destination field for payment")
	public void user_select_the_destination_place_from_the_destination_field_for_payment() throws InterruptedException {
		explicitlyWait(10, pay.getToDestination());
		clickOnElement(pay.getToDestination());
		passInput(pay.getToDestination(), "BOM");
		sleep(2000);
	}

	@And("user select the departure date on the date field for payment")
	public void user_select_the_departure_date_on_the_date_field_for_payment() throws InterruptedException {
		explicitlyWait(10, pay.getoneWayTripDepartureDatePickerForPayment());
		clickOnElement(pay.getoneWayTripDepartureDatePickerForPayment());
		sleep(2000);
	}

	@And("user click the passenger and add the passenger for payment")
	public void user_click_the_passenger_and_add_the_passenger_for_payment() throws InterruptedException {
		explicitlyWait(10, pay.getPassengers());
		clickOnElement(pay.getPassengers());
		explicitlyWait(10, pay.getAdult());
		clickOnElement(pay.getAdult());
	}

	@And("user click the search flight button for payment")
	public void user_click_the_search_flight_button_for_payment() throws InterruptedException {
		clickOnElement(pay.getSearchButton());
		sleep(1000);

	}

	@And("user click the continue button for payment")
	public void user_click_the_continue_button_for_payment() throws InterruptedException {
		explicitlyWait(10, pay.getContinueButton());
		clickOnElement(pay.getContinueButton());
		sleep(1000);

	}

	@And("user select the valid salutation in the salutation field for payment")
	public void user_select_the_valid_salutation_in_the_salutation_field_for_payment() throws InterruptedException {
		explicitlyWait(10, pay.getSelectSalutationBooking());
		clickOnElement(pay.getSelectSalutationBooking());
		clickOnElement(pay.getSelectSalutationBookingDrop());
		sleep(1000);

	}

	@And("user enter the valid {string} in the firstname field for payment")
	public void user_enter_the_valid_in_the_firstname_field_for_payment(String string) {
		passInput(pay.getContactDetailsFirstName(), string);

	}

	@And("user enter the valid {string} in the lastname field for payment")
	public void user_enter_the_valid_in_the_lastname_field_for_payment(String string) {
		passInput(pay.getContactDetailsLastName(), string);

	}

	@And("user enter the valid {string} in the phonenumberfield for payment")
	public void user_enter_the_valid_in_the_phonenumberfield_for_payment(String string) {
		passInput(pay.getContactDetailsPhoneNumber(), string);

	}

	@And("user enter the valid {string} in the Email field for payment")
	public void user_enter_the_valid_in_the_email_field_for_payment(String string) throws InterruptedException {
		clickOnElement(pay.getContactDetailsEmail());
		passInput(pay.getContactDetailsEmail(), string);
	}

	@And("user enter the valid {string} in the Town field for payment")
	public void user_enter_the_valid_in_the_town_field_for_payment(String string) throws InterruptedException {
		passInput(pay.getContactDetailsTown(), string);
		explicitlyWait(10, pay.getRetainMyDetailsPayment());
		clickOnElement(pay.getRetainMyDetailsPayment());
	}

	@And("user select the valid passenger one salutation in the salutation field for payment")
	public void user_select_the_valid_passenger_one_salutation_in_the_salutation_field_for_payment() throws InterruptedException {
		clickOnElement(pay.getSelectSalutationPassengerOne());
		clickOnElement(pay.getSelectSalutationPassengerOneDrop());
	}

	@And("user enter the valid {string} in the passenger one firstname field for payment")
	public void user_enter_the_valid_in_the_passenger_one_firstname_field_for_payment(String string) {
		passInput(pay.getPassengerOneFirstNameOne(), string);
	}

	@And("user enter the valid {string} in the passenger one Lastname field for payment")
	public void user_enter_the_valid_in_the_passenger_one_lastname_field_for_payment(String string) {
		passInput(pay.getPassengerOneLastNameOne(), string);
	}

	@And("user enter the valid {string} in the passenger one PhoneNunber field for payment")
	public void user_enter_the_valid_in_the_passenger_one_phone_nunber_field_for_payment(String string) {
		passInput(pay.getPassengerOnePhoneNumberOne(), string);
	}

	@And("user select the valid passenger two salutation in the salutation field for payment")
	public void user_select_the_valid_passenger_two_salutation_in_the_salutation_field_for_payment() throws InterruptedException {
		clickOnElement(pay.getPassengerTwoDropArrow());
		clickOnElement(pay.getSelectSalutationPassengerTwo());
		clickOnElement(pay.getSelectSalutationPassengerTwoDrop());

	}

	@And("user enter the valid {string} in the passenger two firstname field for payment")
	public void user_enter_the_valid_in_the_passenger_two_firstname_field_for_payment(String string) {
		passInput(pay.getPassengerOneFirstNameTwo(), string);

	}

	@And("user enter the valid {string} in the passenger two Lastname field for payment")
	public void user_enter_the_valid_in_the_passenger_two_lastname_field_for_payment(String string) {
		passInput(pay.getPassengerOneLastNameTwo(), string);
	}

	@And("user enter the valid {string} in the passenger two PhoneNunber field for payment")
	public void user_enter_the_valid_in_the_passenger_two_phone_nunber_field_for_payment(String string) {
		passInput(pay.getPassengerOnePhoneNumberTwo(), string);

	}

	@And("user click the continue button for payment two")
	public void user_click_the_continue_button_for_payment_two() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	     wait.until(ExpectedConditions.visibilityOf(pay.getPaymentContinueButton()));
	     wait.until(ExpectedConditions.elementToBeClickable(pay.getPaymentContinueButton()));
	     clickOnElement(pay.getPaymentContinueButton());

	     // Wait for the second button to be visible and clickable
	     wait.until(ExpectedConditions.visibilityOf(pay.getPaymentContinueButtonPayment()));
	     wait.until(ExpectedConditions.elementToBeClickable(pay.getPaymentContinueButtonPayment()));
	     clickOnElement(pay.getPaymentContinueButtonPayment());
	}

	@And("user click the skip and continue button for payment")
	public void user_click_the_skip_and_continue_button_for_payment() throws InterruptedException {
		clickOnElement(pay.getSkipAndContinue());
		sleep(5000);
		driver.switchTo().frame(0);
	}

	@And("navigate to payment process and enter the {string} in the card number field for payment")
	public void navigate_to_payment_process_and_enter_the_in_the_card_number_field_for_payment(String string) {
		explicitlyWait(10, pay.getCardNumber());
		passInput(pay.getCardNumber(), string);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);

	}

	@And("user enter the {string} in the CardName field for payment")
	public void user_enter_the_in_the_card_name_field_for_payment(String string) {
		explicitlyWait(10, pay.getCardHolderName());
		passInput(pay.getCardHolderName(), string);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		
	}

	@And("user enter the card exp {string} in the exp month field for payment")
	public void user_enter_the_card_exp_in_the_exp_month_field_for_payment(String string) {
		explicitlyWait(10, pay.getCardExpMonth());
		passInput(pay.getCardExpMonth(), string);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);

	}

	@And("user enter the card exp {string} in the exp year field for payment")
	public void user_enter_the_card_exp_in_the_exp_year_field_for_payment(String string) {
		explicitlyWait(10, pay.getCardExpYear());
		passInput(pay.getCardExpYear(), string);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(4);
	}

	@And("user enter the card exp {string} number in the exp cvv field for payment")
	public void user_enter_the_card_exp_number_in_the_exp_cvv_field_for_payment(String string) {
		explicitlyWait(10, pay.getCardExpSecurity());
		passInput(pay.getCardExpSecurity(), string);
		driver.switchTo().defaultContent();
	}

	@And("user click the I have read and understood checkbox for payment")
	public void user_click_the_i_have_read_and_understood_checkbox_for_payment() throws InterruptedException {
		scrollDownorUp("window.scrollBy(0,300)");
		explicitlyWait(10, pay.getProceedToPay());
		clickOnElement(pay.getProceedToPay());
	}

	@Then("user click the proceed to pay button for payment")
	public void user_click_the_proceed_to_pay_button_for_payment() throws InterruptedException {
		explicitlyWait(10, pay.getProceedToPay());
		clickOnElement(pay.getProceedToPay());

	}

	@Then("user should get a propper message on webpage and click the homepage button for payment")
	public void user_should_get_a_propper_message_on_webpage_and_click_the_homepage_button_for_payment() {
		if (driver.getPageSource().contains("Invalid Card Details")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

}
