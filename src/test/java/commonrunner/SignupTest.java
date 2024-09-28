package commonrunner;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.signup;
import utils.baseclass;

public class SignupTest extends baseclass {

    @Test(priority = 1)
    public void positiveSignupScenario() throws InterruptedException, IOException {
            signup sip = new signup(driver);
            explicitlyWait(5, sip.getSignupButton());
            clickOnElement(sip.getSignupButton());
            String parent = driver.getWindowHandle();
            windowHandles("SpiceClub - The frequent flyer program of SpiceJet");

            selectValue(sip.getSelectSalutation(), "Mr");
            passInput(sip.getSignupFirstName(), "Boopalan");
            passInput(sip.getSignupLastName(), "P");
            selectByVisibleText(sip.getSelectCountry(), "India");

            clickOnElement(sip.getDobCalendar());
            selectByVisibleText(sip.getSelectMonth(), "August");
            selectByVisibleText(sip.getSelectYear(), "1997");
            clickOnElement(sip.getDobDate());
            sleep(4000);
            scrollDownorUp("window.scrollBy(0,500)");
            explicitlyWait(5, sip.getSignupPhoneNumber());
            passInput(sip.getSignupPhoneNumber(), "9385909297");
            sleep(5000);
            passInput(sip.getSignupEmailId(), "dhivi1@example.com");
            passInput(sip.getSignupPassword(), "Dd@1997");
            implicitlyWait(10);
            passInput(sip.getSignupConfirmPassword(), "Dd@1997");

            clickOnElement(sip.getiAgreeButton());
            clickOnElement(sip.getSubmitButton());
            pageSource("OTP", "Page has been verified successfully", "Page is not verified");

            driver.switchTo().window(parent);
            Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void invalidEmailSignupScenario() throws InterruptedException, IOException {
            signup sip = new signup(driver);
            explicitlyWait(5, sip.getSignupButton());
            clickOnElement(sip.getSignupButton());
            String parent = driver.getWindowHandle();
            windowHandles("SpiceClub - The frequent flyer program of SpiceJet");

            selectValue(sip.getSelectSalutation(), "Mr");
            passInput(sip.getSignupFirstName(), "Boopalan");
            passInput(sip.getSignupLastName(), "P");
            selectByVisibleText(sip.getSelectCountry(), "India");

            clickOnElement(sip.getDobCalendar());
            selectByVisibleText(sip.getSelectMonth(), "February");
            selectByVisibleText(sip.getSelectYear(), "2000");
            clickOnElement(sip.getDobDate());

            scrollDownorUp("window.scrollBy(0,500)");
            explicitlyWait(5, sip.getSignupPhoneNumber());
            passInput(sip.getSignupPhoneNumber(), "9385909297");
            passInput(sip.getSignupEmailId(), "invalid-email");
            passInput(sip.getSignupPassword(), "Dd@1997");
            passInput(sip.getSignupConfirmPassword(), "Dd@1997");

            clickOnElement(sip.getiAgreeButton());
            clickOnElement(sip.getSubmitButton());
            pageSource("Please enter a valid email address", "Invalid email test passed", "Invalid email test failed");

            driver.switchTo().window(parent);
            Assert.assertTrue(true);
    }

    @Test(priority = 3)
    public void mismatchedPasswordSignupScenario() throws InterruptedException, IOException {
            signup sip = new signup(driver);
            explicitlyWait(5, sip.getSignupButton());
            clickOnElement(sip.getSignupButton());
            String parent = driver.getWindowHandle();
            windowHandles("SpiceClub - The frequent flyer program of SpiceJet");

            selectValue(sip.getSelectSalutation(), "Mr");
            passInput(sip.getSignupFirstName(), "Boopalan");
            passInput(sip.getSignupLastName(), "P");
            selectByVisibleText(sip.getSelectCountry(), "India");

            clickOnElement(sip.getDobCalendar());
            selectByVisibleText(sip.getSelectMonth(), "February");
            selectByVisibleText(sip.getSelectYear(), "2000");
            clickOnElement(sip.getDobDate());

            scrollDownorUp("window.scrollBy(0,500)");
            explicitlyWait(5, sip.getSignupPhoneNumber());
            passInput(sip.getSignupPhoneNumber(), "6381267221");
            passInput(sip.getSignupEmailId(), "cibhi38@gmail.com");
            passInput(sip.getSignupPassword(), "1234@dd");
            passInput(sip.getSignupConfirmPassword(), "1234@dd");

            clickOnElement(sip.getiAgreeButton());
            clickOnElement(sip.getSubmitButton());
            pageSource("Passwords do not match", "Mismatched password test passed", "Mismatched password test failed");

            driver.switchTo().window(parent);
            Assert.assertTrue(true);
    }

    @Test(priority = 4)
    public void emptyFieldsSignupScenario() throws InterruptedException, IOException {
            signup sip = new signup(driver);
            explicitlyWait(5, sip.getSignupButton());
            clickOnElement(sip.getSignupButton());
            String parent = driver.getWindowHandle();
            windowHandles("SpiceClub - The frequent flyer program of SpiceJet");

            clickOnElement(sip.getiAgreeButton());
            clickOnElement(sip.getSubmitButton());
            pageSource("This field is required", "Empty fields test passed", "Empty fields test failed");

            driver.switchTo().window(parent);
            Assert.assertTrue(true);

    }
    
    @AfterMethod
    public void refreshAfterEachTest() {
        refreshPage();
    }
}
