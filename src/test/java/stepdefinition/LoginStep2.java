package stepdefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login;
import utils.FileReaderManager;
import utils.baseclass;

public class LoginStep2 extends baseclass {

    login lp = new login(driver);

    @Given("user navigates to home page")
    public void user_navigates_to_home_page() throws InterruptedException, IOException {
        FileReaderManager.getInstance().getConfigReader();
        launchBrowser("Chrome");
        launchUrl("www.spicejet.com");
        implicitlyWait(10);
    }

    @When("user click the login button for valid credentials")
    public void user_click_the_login_button_for_valid_credentials() throws InterruptedException {
        clickOnElement(lp.getLoginButton());
    }

    @And("user click the mobilenumber either email radio button for valid credentials")
    public void user_click_the_mobilenumber_either_email_radio_button_for_valid_credentials() throws InterruptedException {
        clickOnElement(lp.getLoginPageEmailButton());
    }

    @And("user enter the valid {string} id in the email field for valid credentials")
    public void user_enter_the_valid_id_in_the_email_field_for_valid_credentials(String string) {
        passInput(lp.getLoginPageEmail(), string);
    }

    @And("user enter the valid {string} in the password field for valid credentials")
    public void user_enter_the_valid_in_the_password_field_for_valid_credentials(String string) {
        passInput(lp.getLoginPagePassword(), string);
    }

    @Then("user click the login button and navigate to booking page for valid credentials")
    public void user_click_the_login_button_and_navigate_to_booking_page_for_valid_credentials() throws InterruptedException {
        clickOnElement(lp.getLoginPageLoginButton());
    }

    @When("user click the login button for invalid credentials")
    public void user_click_the_login_button_for_invalid_credentials() throws InterruptedException {
        clickOnElement(lp.getLoginButton());
    }

    @And("user click the mobilenumber either email radio button for invalid credentials")
    public void user_click_the_mobilenumber_either_email_radio_button_for_invalid_credentials() throws InterruptedException {
        clickOnElement(lp.getLoginPageEmailButton());
        sleep(1000);
    }

    @And("user enter the invalid {string} id in the email field for invalid credentials")
    public void user_enter_the_invalid_id_in_the_email_field_for_invalid_credentials(String string) {
        passInput(lp.getLoginPageEmail(), string);
    }

    @And("user enter the invalid {string} in the password field for invalid credentials")
    public void user_enter_the_invalid_in_the_password_field_for_invalid_credentials(String string) {
        passInput(lp.getLoginPagePassword(), string);
    }

    @Then("user should get a proper warning message about invalid credentials for invalid credentials")
    public void user_should_get_a_proper_warning_message_about_invalid_credentials_for_invalid_credentials() throws InterruptedException {
        clickOnElement(lp.getLoginPageLoginButton());
    }

    @When("user click the login button for invalid password")
    public void user_click_the_login_button_for_invalid_password() throws InterruptedException {
        clickOnElement(lp.getLoginButton());
        sleep(2000);

    }

    @And("user click the mobilenumber either email radio button for invalid password")
    public void user_click_the_mobilenumber_either_email_radio_button_for_invalid_password() throws InterruptedException {
        clickOnElement(lp.getLoginPageEmailButton());
        sleep(2000);
    }

    @And("user enter the valid {string} id in the email field for invalid password")
    public void user_enter_the_valid_id_in_the_email_field_for_invalid_password(String string) throws InterruptedException {
        passInput(lp.getLoginPageEmail(), string);
        sleep(2000);
    }

    @And("user enter the invalid {string} in the password field for invalid password")
    public void user_enter_the_invalid_in_the_password_field_for_invalid_password(String string) throws InterruptedException {
        passInput(lp.getLoginPagePassword(), string);
        sleep(2000);
    }

    @Then("user should get a proper warning message about invalid credentials for invalid password")
    public void user_should_get_a_proper_warning_message_about_invalid_credentials_for_invalid_password() throws InterruptedException {
        clickOnElement(lp.getLoginPageLoginButton());
        sleep(2000);
    }

    @When("user click the login button for invalid email")
    public void user_click_the_login_button_for_invalid_email() throws InterruptedException {
        clickOnElement(lp.getLoginButton());
        sleep(2000);

    }

    @And("user click the mobilenumber either email radio button for invalid email")
    public void user_click_the_mobilenumber_either_email_radio_button_for_invalid_email() throws InterruptedException {
        clickOnElement(lp.getLoginPageEmailButton());
        sleep(2000);

    }

    @And("user enter the invalid {string} id in the email field for invalid email")
    public void user_enter_the_invalid_id_in_the_email_field_for_invalid_email(String string) throws InterruptedException {
        passInput(lp.getLoginPageEmail(), string);
        sleep(1000);
    }

    @And("user enter the valid {string} in the password field for invalid email")
    public void user_enter_the_valid_in_the_password_field_for_invalid_email(String string) {
        passInput(lp.getLoginPagePassword(), string);
    }

    @Then("user should get a proper warning message about invalid credentials for invalid email")
    public void user_should_get_a_proper_warning_message_about_invalid_credentials_for_invalid_email() throws InterruptedException {
        clickOnElement(lp.getLoginPageLoginButton());
        sleep(2000);
    }

    @When("user click the login button for without credentials")
    public void user_click_the_login_button_for_without_credentials() throws InterruptedException {
        clickOnElement(lp.getLoginButton());
        sleep(2000);
    }

    @And("user click the mobilenumber either email radio button for without credentials")
    public void user_click_the_mobilenumber_either_email_radio_button_for_without_credentials() throws InterruptedException {
        clickOnElement(lp.getLoginPageEmailButton());
    }

    @Then("user should get a proper warning message about invalid credentials for without credentials")
    public void user_should_get_a_proper_warning_message_about_invalid_credentials_for_without_credentials() throws InterruptedException {
        pageSource("Please enter a valid email address", "Login page has been verified successfull",
                "Login page not verified");
        explicitlyWait(10, lp.getLoginPageCloseButton());
        clickOnElement(lp.getLoginPageCloseButton());
    }

}
