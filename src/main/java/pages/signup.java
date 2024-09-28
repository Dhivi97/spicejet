package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utils.baseclass;

public class signup extends baseclass {
	
public  WebDriver driver;
	
	public signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//div[contains(text(),'Signup')]")
	private WebElement signupButton;
	
	@FindBy (xpath ="//select[@class='form-control form-select ']")
	private WebElement selectSalutation;
	
	@FindBy (xpath ="//input[@id='first_name']")
	private WebElement signupFirstName;
	
	@FindBy (xpath ="//input[@id='last_name']")
	private WebElement signupLastName;
	
	@FindBy (xpath ="//select[@tabindex='0']")
	private WebElement selectCountry;
	
	@FindBy (xpath ="//input[@id='dobDate']")
	private WebElement dobCalendar;
	
	@FindBy (xpath ="//select[@class='react-datepicker__month-select']")
	private WebElement selectMonth;
	
	@FindBy (xpath ="//select[@class='react-datepicker__year-select']")
	private WebElement selectYear;
	
	@FindBy (xpath ="//div[text()='18']")
	private WebElement dobDate;
	
	@FindBy (xpath ="//input[@type='tel']")
	private WebElement signupPhoneNumber;

	@FindBy (xpath ="(//input[@type='text'])[4]")
	private WebElement signupEmailId;

	@FindBy (xpath ="//input[@id='new-password']")
	private WebElement signupPassword;

	@FindBy (xpath ="//input[@id='c-password']")
	private WebElement signupConfirmPassword;
	
	@FindBy (xpath ="//input[@type='checkbox']")
	private WebElement iAgreeButton;
	
	@FindBy (xpath ="//button[text()='Submit']")
	private WebElement submitButton;

	public WebElement getSignupButton() {
		return signupButton;
	}

	public void setSignupButton(WebElement signupButton) {
		this.signupButton = signupButton;
	}

	public WebElement getSelectSalutation() {
		return selectSalutation;
	}

	public void setSelectSalutation(WebElement selectSalutation) {
		this.selectSalutation = selectSalutation;
	}

	public WebElement getSignupFirstName() {
		return signupFirstName;
	}

	public void setSignupFirstName(WebElement signupFirstName) {
		this.signupFirstName = signupFirstName;
	}

	public WebElement getSignupLastName() {
		return signupLastName;
	}

	public void setSignupLastName(WebElement signupLastName) {
		this.signupLastName = signupLastName;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public void setSelectCountry(WebElement selectCountry) {
		this.selectCountry = selectCountry;
	}

	public WebElement getDobCalendar() {
		return dobCalendar;
	}

	public void setDobCalendar(WebElement dobCalendar) {
		this.dobCalendar = dobCalendar;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public void setSelectMonth(WebElement selectMonth) {
		this.selectMonth = selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public void setSelectYear(WebElement selectYear) {
		this.selectYear = selectYear;
	}

	public WebElement getDobDate() {
		return dobDate;
	}

	public void setDobDate(WebElement dobDate) {
		this.dobDate = dobDate;
	}

	public WebElement getSignupPhoneNumber() {
		return signupPhoneNumber;
	}

	public void setSignupPhoneNumber(WebElement signupPhoneNumber) {
		this.signupPhoneNumber = signupPhoneNumber;
	}

	public WebElement getSignupEmailId() {
		return signupEmailId;
	}

	public void setSignupEmailId(WebElement signupEmailId) {
		this.signupEmailId = signupEmailId;
	}

	public WebElement getSignupPassword() {
		return signupPassword;
	}

	public void setSignupPassword(WebElement signupPassword) {
		this.signupPassword = signupPassword;
	}

	public WebElement getSignupConfirmPassword() {
		return signupConfirmPassword;
	}

	public void setSignupConfirmPassword(WebElement signupConfirmPassword) {
		this.signupConfirmPassword = signupConfirmPassword;
	}

	public WebElement getiAgreeButton() {
		return iAgreeButton;
	}

	public void setiAgreeButton(WebElement iAgreeButton) {
		this.iAgreeButton = iAgreeButton;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;

}
}
