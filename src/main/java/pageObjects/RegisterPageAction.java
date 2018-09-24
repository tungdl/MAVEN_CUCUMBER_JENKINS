package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.RegisterPageUI;
import commons.AbstractPage;

public class RegisterPageAction extends AbstractPage {

	WebDriver driver;

	public RegisterPageAction(WebDriver driver_) {
		this.driver = driver_;
	}

	public void openLoginPage(String url) {
		openUrl(driver, url);
	}

	public String getUserIDValue() {
		return getTextElement(driver, RegisterPageUI.USERID_VALUE);
	}

	public String getPasswordValue() {
		return getTextElement(driver, RegisterPageUI.PASSWORD_VALUE);
	}

	public void enterEmail(String email) {
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
	}

	public void clickSubmitButton() {
		clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
	}
}
