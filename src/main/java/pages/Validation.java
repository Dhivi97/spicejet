package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.baseclass;


public class Validation extends baseclass {

	public  WebDriver driver;

	public Validation(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='check-in']")
	private WebElement checkIn;

	@FindBy(xpath = "//div[text()='flight status']")
	private WebElement flightStatus;

	@FindBy(xpath = "//div[text()='manage booking']")
	private WebElement manageBooking;

	public WebElement getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(WebElement checkIn) {
		this.checkIn = checkIn;
	}

	public WebElement getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(WebElement flightStatus) {
		this.flightStatus = flightStatus;
	}

	public WebElement getManageBooking() {
		return manageBooking;
	}

	public void setManageBooking(WebElement manageBooking) {
		this.manageBooking = manageBooking;
	}

}


