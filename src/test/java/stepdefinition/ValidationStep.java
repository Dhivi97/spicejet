package stepdefinition;


import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.Validation;
import utils.FileReaderManager;
import utils.baseclass;

public class ValidationStep extends baseclass {

	Validation vp = new Validation(driver);


	@Given("user navigate to booking page")
	public void user_navigate_to_booking_page() throws IOException {
		FileReaderManager.getInstance().getConfigReader();
        launchBrowser("Chrome");
        launchUrl("www.spicejet.com");
        implicitlyWait(10);

	}

	@When("user click the check-in")
	public void user_click_the_check_in() throws InterruptedException {
		clickOnElement(vp.getCheckIn());
	}

	@And("verify the title of the check-in page")
	public void verify_the_title_of_the_check_in_page() {
		if (driver.getPageSource().contains("Web Check-In")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

	@And("user click the flight status")
	public void user_click_the_flight_status() throws InterruptedException {
		clickOnElement(vp.getFlightStatus());
	}

	@And("verify the title of the flight status page")
	public void verify_the_title_of_the_flight_status_page() {
		if (driver.getPageSource().contains("Flight Status")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

	@And("user click the manage booking")
	public void user_click_the_manage_booking() throws InterruptedException {
		clickOnElement(vp.getManageBooking());
	}

	@Then("verify the title of the manage booking page")
	public void verify_the_title_of_the_manage_booking_page() {
		if (driver.getPageSource().contains("View / Manage Booking")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

}