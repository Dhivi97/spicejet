package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.baseclass;



	public class Roundtrip extends baseclass {

		public  WebDriver driver;

		public Roundtrip(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "(//*[name()='circle'])[3]")
		private WebElement roundTripButton;

		@FindBy(xpath = "(//input[@type='text'])[1]")
		private WebElement roundTripFromOriginClick;

		@FindBy(xpath = "(//input[@type='text'])[2]")
		private WebElement roundTripToDestination;
		
		@FindBy(xpath = "//div[contains(text(),'BOM')]")
		private WebElement selectMumbai;

		@FindBy(xpath = "//div[text()='Departure Date']")
		private WebElement roundTripDepartureDatePicker;
		
		 @FindBy(xpath = "//div[text()='31']")
		    private WebElement selectDay;

		@FindBy(xpath = "//div[text()='Select Date']")
		private WebElement roundTripReturnDatePicker;

		@FindBy(xpath = "//div[text()='Passengers']")
		private WebElement roundTripPassengers;

		@FindBy(xpath = "(//*[name()='svg'][@data-testid='svg-img'])[18]")
		private WebElement roundTripAdult;

		@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
		private WebElement roundTripSearchButton;

		@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
		private WebElement continueButtonRound;

		@FindBy(xpath = "(//div[text()='Mr'][text()='Mr'])[1]")
		private WebElement selectSalutationBookingRound;

		@FindBy(xpath = "(//div[text()='Mr'][text()='Mr'])[2]")
		private WebElement selectSalutationBookingDropRound;

		@FindBy(xpath = "(//input[@type='text'])[1]")
		private WebElement contactDetailsFirstNameRound;

		@FindBy(xpath = "(//input[@type='text'])[2]")
		private WebElement contactDetailsLastNameRound;

		@FindBy(xpath = "(//input[@type='text'])[3]")
		private WebElement contactDetailsPhoneNumberRound;

		@FindBy(xpath = "(//input[@type='text'])[4]")
		private WebElement contactDetailsEmailRound;

		@FindBy(xpath = "(//input[@type='text'])[5]")
		private WebElement contactDetailsTownRound;
		
		@FindBy(xpath = "//div[contains(text(),'Retain my details for the next visit.')]")
		private WebElement retainMyDeatilsRound;

		@FindBy(xpath = "(//div[text()='Mr'])[2]")
		private WebElement selectSalutationPassengerOneRound;

		@FindBy(xpath = "(//div[text()='Mr'])[3]")
		private WebElement selectSalutationPassengerOneDropRound;

		@FindBy(xpath = "(//input[@type='text'])[6]")
		private WebElement PassengerOneFirstNameOneRound;

		@FindBy(xpath = "(//input[@type='text'])[7]")
		private WebElement PassengerOneLastNameOneRound;

		@FindBy(xpath = "(//input[@type='text'])[8]")
		private WebElement PassengerOnePhoneNumberOneRound;
		
		@FindBy(xpath = "//div[text()='Next']")
		private WebElement passengerTwoDropArrowRound;

		@FindBy(xpath = "(//div[text()='Mr'])[2]")
		private WebElement selectSalutationPassengerTwoRound;

		@FindBy(xpath = "(//div[text()='Mr'])[3]")
		private WebElement selectSalutationPassengerTwoDropRound;

		@FindBy(xpath = "(//input[@type='text'])[6]")
		private WebElement PassengerOneFirstNameTwoRound;

		@FindBy(xpath = "(//input[@type='text'])[7]")
		private WebElement PassengerOneLastNameTwoRound;

		@FindBy(xpath = "(//input[@type='text'])[8]")
		private WebElement PassengerOnePhoneNumberTwoRound;
		
		@FindBy(xpath = "//div[text()='Next']")
		private WebElement passengerThreeDropArrowRound;

		@FindBy(xpath = "(//div[text()='Mr'])[2]")
		private WebElement selectSalutationPassengerThreeRound;

		@FindBy(xpath = "(//div[text()='Mr'])[3]")
		private WebElement selectSalutationPassengerThreeDropRound;

		@FindBy(xpath = "(//input[@type='text'])[6]")
		private WebElement PassengerOneFirstNameThreeRound;

		@FindBy(xpath = "(//input[@type='text'])[7]")
		private WebElement PassengerOneLastNameThreeRound;

		@FindBy(xpath = "(//input[@type='text'])[8]")
		private WebElement PassengerOnePhoneNumberThreeRound;


		@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
		private WebElement paymentContinueButtonRound;
		
		@FindBy(xpath = "//img[@class='css-9pa8cd' and @src='https://www.spicejet.com/v1.svg']")
		private WebElement homePageRound;


		public WebElement getRoundTripButton() {
			return roundTripButton;
		}

		public void setRoundTripButton(WebElement roundTripButton) {
			this.roundTripButton = roundTripButton;
		}

		public WebElement getRoundTripFromOriginClick() {
			return roundTripFromOriginClick;
		}

		public void setRoundTripFromOriginClick(WebElement roundTripFromOriginClick) {
			this.roundTripFromOriginClick = roundTripFromOriginClick;
		}

		public WebElement getRoundTripToDestination() {
			return roundTripToDestination;
		}

		public void setRoundTripToDestination(WebElement roundTripToDestination) {
			this.roundTripToDestination = roundTripToDestination;
		}

		public WebElement getSelectMumbai() {
			return selectMumbai;
		}
		
		public void setSelectMumbai(WebElement selectMumbai) {
	        this.selectMumbai = selectMumbai;
	    }
		
		public WebElement getRoundTripDepartureDatePicker() {
			return roundTripDepartureDatePicker;
		}

		public void setRoundTripDepartureDatePicker(WebElement roundTripDepartureDatePicker) {
			this.roundTripDepartureDatePicker = roundTripDepartureDatePicker;
		}

		public WebElement getRoundTripReturnDatePicker() {
			return roundTripReturnDatePicker;
		}

		public void setRoundTripReturnDatePicker(WebElement roundTripReturnDatePicker) {
			this.roundTripReturnDatePicker = roundTripReturnDatePicker;
		}
		
		public WebElement getDay() {
			return selectDay;
		}
		
		public void setDay(WebElement selectDay) {
			this.selectDay = selectDay;
		}

		public WebElement getRoundTripPassengers() {
			return roundTripPassengers;
		}

		public void setRoundTripPassengers(WebElement roundTripPassengers) {
			this.roundTripPassengers = roundTripPassengers;
		}

		public WebElement getRoundTripAdult() {
			return roundTripAdult;
		}

		public void setRoundTripAdult(WebElement roundTripAdult) {
			this.roundTripAdult = roundTripAdult;
		}

		public WebElement getRoundTripSearchButton() {
			return roundTripSearchButton;
		}

		public void setRoundTripSearchButton(WebElement roundTripSearchButton) {
			this.roundTripSearchButton = roundTripSearchButton;
		}

		public WebElement getContinueButtonRound() {
			return continueButtonRound;
		}

		public void setContinueButtonRound(WebElement continueButtonRound) {
			this.continueButtonRound = continueButtonRound;
		}

		public WebElement getSelectSalutationBookingRound() {
			return selectSalutationBookingRound;
		}

		public void setSelectSalutationBookingRound(WebElement selectSalutationBookingRound) {
			this.selectSalutationBookingRound = selectSalutationBookingRound;
		}

		public WebElement getSelectSalutationBookingDropRound() {
			return selectSalutationBookingDropRound;
		}

		public void setSelectSalutationBookingDropRound(WebElement selectSalutationBookingDropRound) {
			this.selectSalutationBookingDropRound = selectSalutationBookingDropRound;
		}

		public WebElement getContactDetailsFirstNameRound() {
			return contactDetailsFirstNameRound;
		}

		public void setContactDetailsFirstNameRound(WebElement contactDetailsFirstNameRound) {
			this.contactDetailsFirstNameRound = contactDetailsFirstNameRound;
		}

		public WebElement getContactDetailsLastNameRound() {
			return contactDetailsLastNameRound;
		}

		public void setContactDetailsLastNameRound(WebElement contactDetailsLastNameRound) {
			this.contactDetailsLastNameRound = contactDetailsLastNameRound;
		}

		public WebElement getContactDetailsPhoneNumberRound() {
			return contactDetailsPhoneNumberRound;
		}

		public void setContactDetailsPhoneNumberRound(WebElement contactDetailsPhoneNumberRound) {
			this.contactDetailsPhoneNumberRound = contactDetailsPhoneNumberRound;
		}

		public WebElement getContactDetailsEmailRound() {
			return contactDetailsEmailRound;
		}

		public void setContactDetailsEmailRound(WebElement contactDetailsEmailRound) {
			this.contactDetailsEmailRound = contactDetailsEmailRound;
		}

		public WebElement getContactDetailsTownRound() {
			return contactDetailsTownRound;
		}

		public void setContactDetailsTownRound(WebElement contactDetailsTownRound) {
			this.contactDetailsTownRound = contactDetailsTownRound;
		}
		
		public WebElement getRetainMyDeatilsRound() {
			return retainMyDeatilsRound;
		}

		public void setRetainMyDeatilsRound(WebElement retainMyDeatilsRound) {
			this.retainMyDeatilsRound = retainMyDeatilsRound;
		}

		public WebElement getSelectSalutationPassengerOneRound() {
			return selectSalutationPassengerOneRound;
		}

		public void setSelectSalutationPassengerOneRound(WebElement selectSalutationPassengerOneRound) {
			this.selectSalutationPassengerOneRound = selectSalutationPassengerOneRound;
		}

		public WebElement getSelectSalutationPassengerOneDropRound() {
			return selectSalutationPassengerOneDropRound;
		}

		public void setSelectSalutationPassengerOneDropRound(WebElement selectSalutationPassengerOneDropRound) {
			this.selectSalutationPassengerOneDropRound = selectSalutationPassengerOneDropRound;
		}

		public WebElement getPassengerOneFirstNameOneRound() {
			return PassengerOneFirstNameOneRound;
		}

		public void setPassengerOneFirstNameOneRound(WebElement passengerOneFirstNameOneRound) {
			PassengerOneFirstNameOneRound = passengerOneFirstNameOneRound;
		}

		public WebElement getPassengerOneLastNameOneRound() {
			return PassengerOneLastNameOneRound;
		}

		public void setPassengerOneLastNameOneRound(WebElement passengerOneLastNameOneRound) {
			PassengerOneLastNameOneRound = passengerOneLastNameOneRound;
		}

		public WebElement getPassengerOnePhoneNumberOneRound() {
			return PassengerOnePhoneNumberOneRound;
		}

		public void setPassengerOnePhoneNumberOneRound(WebElement passengerOnePhoneNumberOneRound) {
			PassengerOnePhoneNumberOneRound = passengerOnePhoneNumberOneRound;
		}

		public WebElement getPassengerTwoDropArrowRound() {
			return passengerTwoDropArrowRound;
		}

		public void setPassengerTwoDropArrowRound(WebElement passengerTwoDropArrowRound) {
			this.passengerTwoDropArrowRound = passengerTwoDropArrowRound;
		}

		public WebElement getSelectSalutationPassengerTwoRound() {
			return selectSalutationPassengerTwoRound;
		}

		public void setSelectSalutationPassengerTwoRound(WebElement selectSalutationPassengerTwoRound) {
			this.selectSalutationPassengerTwoRound = selectSalutationPassengerTwoRound;
		}

		public WebElement getSelectSalutationPassengerTwoDropRound() {
			return selectSalutationPassengerTwoDropRound;
		}

		public void setSelectSalutationPassengerTwoDropRound(WebElement selectSalutationPassengerTwoDropRound) {
			this.selectSalutationPassengerTwoDropRound = selectSalutationPassengerTwoDropRound;
		}

		public WebElement getPassengerOneFirstNameTwoRound() {
			return PassengerOneFirstNameTwoRound;
		}

		public void setPassengerOneFirstNameTwoRound(WebElement passengerOneFirstNameTwoRound) {
			PassengerOneFirstNameTwoRound = passengerOneFirstNameTwoRound;
		}

		public WebElement getPassengerOneLastNameTwoRound() {
			return PassengerOneLastNameTwoRound;
		}

		public void setPassengerOneLastNameTwoRound(WebElement passengerOneLastNameTwoRound) {
			PassengerOneLastNameTwoRound = passengerOneLastNameTwoRound;
		}

		public WebElement getPassengerOnePhoneNumberTwoRound() {
			return PassengerOnePhoneNumberTwoRound;
		}

		public void setPassengerOnePhoneNumberTwoRound(WebElement passengerOnePhoneNumberTwoRound) {
			PassengerOnePhoneNumberTwoRound = passengerOnePhoneNumberTwoRound;
		}
		
		public WebElement getPassengerThreeDropArrowRound() {
			return passengerThreeDropArrowRound;
		}

		public void setPassengerThreeDropArrowRound(WebElement passengerThreeDropArrowRound) {
			this.passengerThreeDropArrowRound = passengerThreeDropArrowRound;
		}

		public WebElement getSelectSalutationPassengerThreeRound() {
			return selectSalutationPassengerThreeRound;
		}

		public void setSelectSalutationPassengerThreeRound(WebElement selectSalutationPassengerThreeRound) {
			this.selectSalutationPassengerThreeRound = selectSalutationPassengerThreeRound;
		}

		public WebElement getSelectSalutationPassengerThreeDropRound() {
			return selectSalutationPassengerThreeDropRound;
		}

		public void setSelectSalutationPassengerThreeDropRound(WebElement selectSalutationPassengerThreeDropRound) {
			this.selectSalutationPassengerThreeDropRound = selectSalutationPassengerThreeDropRound;
		}

		public WebElement getPassengerOneFirstNameThreeRound() {
			return PassengerOneFirstNameThreeRound;
		}

		public void setPassengerOneFirstNameThreeRound(WebElement passengerOneFirstNameThreeRound) {
			PassengerOneFirstNameThreeRound = passengerOneFirstNameThreeRound;
		}

		public WebElement getPassengerOneLastNameThreeRound() {
			return PassengerOneLastNameTwoRound;
		}

		public void setPassengerOneLastNameThreeRound(WebElement passengerOneLastNameThreeRound) {
			PassengerOneLastNameThreeRound = passengerOneLastNameThreeRound;
		}

		public WebElement getPassengerOnePhoneNumberThreeRound() {
			return PassengerOnePhoneNumberTwoRound;
		}

		public void setPassengerOnePhoneNumberThreeRound(WebElement passengerOnePhoneNumberThreeRound) {
			PassengerOnePhoneNumberThreeRound = passengerOnePhoneNumberThreeRound;
		}


		public WebElement getPaymentContinueButtonRound() {
			return paymentContinueButtonRound;
		}

		public void setPaymentContinueButtonRound(WebElement paymentContinueButtonRound) {
			this.paymentContinueButtonRound = paymentContinueButtonRound;
		}

		public WebElement getHomePageRound() {
			return homePageRound;
		}

		public void setHomePageRound(WebElement homePageRound) {
			this.homePageRound = homePageRound;
		}
		
		

	}


