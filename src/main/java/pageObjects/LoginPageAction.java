package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.LoginPageUI;
import commons.AbstractPage;

public class LoginPageAction extends AbstractPage {

	WebDriver driver;

	public LoginPageAction(WebDriver driver_) {
		this.driver = driver_;
	}

	public void enterUsername(String username) {
		sendkeyToElement(driver, LoginPageUI.TXB_USERNAME, username);
	}

	public void enterPassword(String password) {
		sendkeyToElement(driver, LoginPageUI.TXB_PASSWORD, password);
	}

	public void clickLoginButton() {
		clickToElement(driver, LoginPageUI.BTN_LOGIN);
	}

	public String getLoginURL() {
		return driver.getCurrentUrl();
	}

	public void clickHereLink() {
		clickToElement(driver, LoginPageUI.LNK_HERE);
	}
	
}
