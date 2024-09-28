package commonrunner;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.Validation;
import utils.baseclass;


public class ValidateProcessTest extends baseclass {

    @Test(priority = 13)
    public void validateBookingPage() {
        Validation vp = new Validation(driver);

        clickOnElement(vp.getCheckIn());
        if (driver.getPageSource().contains("Web Check-In")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        clickOnElement(vp.getFlightStatus());
        if (driver.getPageSource().contains("Flight Status")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        clickOnElement(vp.getManageBooking());
        if (driver.getPageSource().contains("View / Manage Booking")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        System.out.println("All Done");
    }
    
    @AfterMethod
    public void refreshAfterEachTest() {
        refreshPage();
    }
}