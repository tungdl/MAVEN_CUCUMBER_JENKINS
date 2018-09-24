package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.DeleteAccountPageUI;
import commons.AbstractPage;

public class DeleteAccountPageAction extends AbstractPage {

	WebDriver driver;

	public DeleteAccountPageAction(WebDriver driver_) {
		this.driver = driver_;
	}
	
	public void enterAccountID(String value) {
		sendkeyToElement(driver, DeleteAccountPageUI.TXB_ACCOUNT_ID, value);
	}
	
	public void clickSubmitButton() {
		clickToElement(driver, DeleteAccountPageUI.BTN_SUBMIT);
	}
	
	public void acceptAlert() {
		waitForAlertPresence(driver);
		acceptAlert(driver);
	}

	public void verifyDeletedAccountSuccessfulMessageIsDisplayed(String expected) {
		waitForAlertPresence(driver);
		String actual = getTextAlert(driver);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed correctly",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}
}
