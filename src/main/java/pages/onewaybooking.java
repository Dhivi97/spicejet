package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.baseclass;

public class onewaybooking extends baseclass {

	public WebDriver driver;

	public onewaybooking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='one way']")
	private WebElement onewayButton;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement fromOriginClick;


	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement toDestination;
	
	@FindBy(xpath = "//div[contains(text(),'BOM')]")
	private WebElement selectMumbai;

	@FindBy(xpath = "//div[text()='Departure Date']")
	private WebElement oneWayTripDepartureDatePicker;
	
    @FindBy(xpath = "//div[text()='31']")
    private WebElement selectDay;

	@FindBy(xpath = "//div[text()='Passengers']")
	private WebElement passengers;

	@FindBy(xpath = "(//*[name()='svg'][@data-testid='svg-img'])[18]")
	private WebElement adult;

	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	private WebElement searchButton;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	private WebElement continueButton;

	@FindBy(xpath = "(//div[text()='Mr'][text()='Mr'])[1]")
	private WebElement selectSalutationBooking;

	@FindBy(xpath = "(//div[text()='Mr'][text()='Mr'])[2]")
	private WebElement selectSalutationBookingDrop;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement contactDetailsFirstName;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement contactDetailsLastName;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement contactDetailsPhoneNumber;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement contactDetailsEmail;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement contactDetailsTown;
	
	@FindBy(xpath = "//div[contains(text(),'Retain my details for the next visit.')]")
	private WebElement retainMyDetails;

	@FindBy(xpath = "(//div[text()='Mr'])[2]")
	private WebElement selectSalutationPassengerOne;

	@FindBy(xpath = "(//div[text()='Mr'])[3]")
	private WebElement selectSalutationPassengerOneDrop;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement PassengerOneFirstNameOne;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement PassengerOneLastNameOne;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement PassengerOnePhoneNumberOne;

	@FindBy(xpath = "//div[text()='Next']")
	private WebElement passengerTwoDropArrow;

	@FindBy(xpath = "(//div[text()='Mr'])[2]")
	private WebElement selectSalutationPassengerTwo;

	@FindBy(xpath = "(//div[text()='Mr'])[3]")
	private WebElement selectSalutationPassengerTwoDrop;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement PassengerOneFirstNameTwo;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement PassengerOneLastNameTwo;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement PassengerOnePhoneNumberTwo;

	@FindBy(xpath  = "//div[@data-testid='traveller-info-continue-cta']")
	private WebElement paymentContinueButton;

	@FindBy(xpath = "//img[@class='css-9pa8cd' and @src='https://www.spicejet.com/v1.svg']")
	private WebElement homePage;

	public WebElement getOnewayButton() {
		return onewayButton;
	}

	public void setOnewayButton(WebElement onewayButton) {
		this.onewayButton = onewayButton;
	}

	public WebElement getFromOriginClick() {
		return fromOriginClick;
	}

	public void setFromOriginClick(WebElement fromOriginClick) {
		this.fromOriginClick = fromOriginClick;
	}

	public WebElement getToDestination() {
		return toDestination;
	}

	public void setToDestination(WebElement toDestination) {
		this.toDestination = toDestination;
	}
	
	public WebElement getSelectMumbai() {
		return selectMumbai;
	}
	
	public void setSelectMumbai(WebElement selectMumbai) {
        this.selectMumbai = selectMumbai;
    }

	public WebElement getOneWayTripDepartureDatePicker() {
		return oneWayTripDepartureDatePicker;
	}

	public void setOneWayTripDepartureDatePicker(WebElement oneWayTripDepartureDatePicker) {
		this.oneWayTripDepartureDatePicker = oneWayTripDepartureDatePicker;
	}
	
	public WebElement getDay() {
		return selectDay;
	}
	
	public void setDay(WebElement selectDay) {
		this.selectDay = selectDay;
	}

	public WebElement getPassengers() {
		return passengers;
	}

	public void setPassengers(WebElement passengers) {
		this.passengers = passengers;
	}

	public WebElement getAdult() {
		return adult;
	}

	public void setAdult(WebElement adult) {
		this.adult = adult;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(WebElement continueButton) {
		this.continueButton = continueButton;
	}

	public WebElement getSelectSalutationBooking() {
		return selectSalutationBooking;
	}

	public void setSelectSalutationBooking(WebElement selectSalutationBooking) {
		this.selectSalutationBooking = selectSalutationBooking;
	}

	public WebElement getSelectSalutationBookingDrop() {
		return selectSalutationBookingDrop;
	}

	public void setSelectSalutationBookingDrop(WebElement selectSalutationBookingDrop) {
		this.selectSalutationBookingDrop = selectSalutationBookingDrop;
	}

	public WebElement getContactDetailsFirstName() {
		return contactDetailsFirstName;
	}

	public void setContactDetailsFirstName(WebElement contactDetailsFirstName) {
		this.contactDetailsFirstName = contactDetailsFirstName;
	}

	public WebElement getContactDetailsLastName() {
		return contactDetailsLastName;
	}

	public void setContactDetailsLastName(WebElement contactDetailsLastName) {
		this.contactDetailsLastName = contactDetailsLastName;
	}

	public WebElement getContactDetailsPhoneNumber() {
		return contactDetailsPhoneNumber;
	}

	public void setContactDetailsPhoneNumber(WebElement contactDetailsPhoneNumber) {
		this.contactDetailsPhoneNumber = contactDetailsPhoneNumber;
	}

	public WebElement getContactDetailsEmail() {
		return contactDetailsEmail;
	}

	public void setContactDetailsEmail(WebElement contactDetailsEmail) {
		this.contactDetailsEmail = contactDetailsEmail;
	}

	public WebElement getContactDetailsTown() {
		return contactDetailsTown;
	}

	public void setContactDetailsTown(WebElement contactDetailsTown) {
		this.contactDetailsTown = contactDetailsTown;
	}

	public WebElement getRetainMyDetails() {
		return retainMyDetails;
	}

	public void setRetainMyDetails(WebElement retainMyDetails) {
		this.retainMyDetails = retainMyDetails;
	}

	public WebElement getSelectSalutationPassengerOne() {
		return selectSalutationPassengerOne;
	}

	public void setSelectSalutationPassengerOne(WebElement selectSalutationPassengerOne) {
		this.selectSalutationPassengerOne = selectSalutationPassengerOne;
	}

	public WebElement getSelectSalutationPassengerOneDrop() {
		return selectSalutationPassengerOneDrop;
	}

	public void setSelectSalutationPassengerOneDrop(WebElement selectSalutationPassengerOneDrop) {
		this.selectSalutationPassengerOneDrop = selectSalutationPassengerOneDrop;
	}

	public WebElement getPassengerOneFirstNameOne() {
		return PassengerOneFirstNameOne;
	}

	public void setPassengerOneFirstNameOne(WebElement passengerOneFirstNameOne) {
		PassengerOneFirstNameOne = passengerOneFirstNameOne;
	}

	public WebElement getPassengerOneLastNameOne() {
		return PassengerOneLastNameOne;
	}

	public void setPassengerOneLastNameOne(WebElement passengerOneLastNameOne) {
		PassengerOneLastNameOne = passengerOneLastNameOne;
	}

	public WebElement getPassengerOnePhoneNumberOne() {
		return PassengerOnePhoneNumberOne;
	}

	public void setPassengerOnePhoneNumberOne(WebElement passengerOnePhoneNumberOne) {
		PassengerOnePhoneNumberOne = passengerOnePhoneNumberOne;
	}

	public WebElement getPassengerTwoDropArrow() {
		return passengerTwoDropArrow;
	}

	public void setPassengerTwoDropArrow(WebElement passengerTwoDropArrow) {
		this.passengerTwoDropArrow = passengerTwoDropArrow;
	}

	public WebElement getSelectSalutationPassengerTwo() {
		return selectSalutationPassengerTwo;
	}

	public void setSelectSalutationPassengerTwo(WebElement selectSalutationPassengerTwo) {
		this.selectSalutationPassengerTwo = selectSalutationPassengerTwo;
	}

	public WebElement getSelectSalutationPassengerTwoDrop() {
		return selectSalutationPassengerTwoDrop;
	}

	public void setSelectSalutationPassengerTwoDrop(WebElement selectSalutationPassengerTwoDrop) {
		this.selectSalutationPassengerTwoDrop = selectSalutationPassengerTwoDrop;
	}

	public WebElement getPassengerOneFirstNameTwo() {
		return PassengerOneFirstNameTwo;
	}

	public void setPassengerOneFirstNameTwo(WebElement passengerOneFirstNameTwo) {
		PassengerOneFirstNameTwo = passengerOneFirstNameTwo;
	}

	public WebElement getPassengerOneLastNameTwo() {
		return PassengerOneLastNameTwo;
	}

	public void setPassengerOneLastNameTwo(WebElement passengerOneLastNameTwo) {
		PassengerOneLastNameTwo = passengerOneLastNameTwo;
	}

	public WebElement getPassengerOnePhoneNumberTwo() {
		return PassengerOnePhoneNumberTwo;
	}

	public void setPassengerOnePhoneNumberTwo(WebElement passengerOnePhoneNumberTwo) {
		PassengerOnePhoneNumberTwo = passengerOnePhoneNumberTwo;
	}

	public WebElement getPaymentContinueButton() {
		return paymentContinueButton;
	}

	public void setPaymentContinueButton(WebElement paymentContinueButton) {
		this.paymentContinueButton = paymentContinueButton;
	}

	public WebElement getHomePage() {
		return homePage;
	}

	public void setHomePage(WebElement homePage) {
		this.homePage = homePage;
	}

}

