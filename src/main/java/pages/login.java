package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.baseclass;

public class login extends baseclass{

public  WebDriver driver;
	
	public login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[text()='Login']")
	private WebElement loginButton;
	
	@FindBy (xpath = "//div[text()='Email']")
	private WebElement loginPageEmailButton;
	
	@FindBy (xpath = "//input[@type='email']")
	private WebElement loginPageEmail;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement loginPagePassword;
	
	@FindBy (xpath = "//div[@data-testid='login-cta']")
	private WebElement loginPageLoginButton;
	
	@FindBy (xpath = "(//*[name()='path'])[17]")
	private WebElement loginPageCloseButton;
	
	@FindBy (xpath = "//div[normalize-space()='Hi Boopalan']")
	private WebElement popUp;
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-c20mna']")
	private WebElement logoutButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getLoginPageEmailButton() {
		return loginPageEmailButton;
	}

	public void setLoginPageEmailButton(WebElement loginPageEmailButton) {
		this.loginPageEmailButton = loginPageEmailButton;
	}

	public WebElement getLoginPageEmail() {
		return loginPageEmail;
	}

	public void setLoginPageEmail(WebElement loginPageEmail) {
		this.loginPageEmail = loginPageEmail;
	}

	public WebElement getLoginPagePassword() {
		return loginPagePassword;
	}

	public void setLoginPagePassword(WebElement loginPagePassword) {
		this.loginPagePassword = loginPagePassword;
	}

	public WebElement getLoginPageLoginButton() {
		return loginPageLoginButton;
	}

	public void setLoginPageLoginButton(WebElement loginPageLoginButton) {
		this.loginPageLoginButton = loginPageLoginButton;
	}

	public WebElement getLoginPageCloseButton() {
		return loginPageCloseButton;
	}

	public void setLoginPageCloseButton(WebElement loginPageCloseButton) {
		this.loginPageCloseButton = loginPageCloseButton;
	}
	
	public WebElement getPopup() {
		return popUp;
	}
	
	public void setPopup(WebElement popUp) {
		this.popUp = popUp;
	}
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public void setLogoutButton(WebElement logoutButton) {
		this.logoutButton = logoutButton;
	}

}
