package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.DeleteCustomerPageUI;
import commons.AbstractPage;

public class DeleteCustomerPageAction extends AbstractPage {

	WebDriver driver;

	public DeleteCustomerPageAction(WebDriver driver_) {
		this.driver = driver_;
	}
	
	public void enterCustomerID(String value) {
		sendkeyToElement(driver, DeleteCustomerPageUI.TXB_CUSTOMER_ID, value);
	}
	
	public void clickSubmitButton() {
		clickToElement(driver, DeleteCustomerPageUI.BTN_SUBMIT);
	}
	
	public void acceptAlert() {
		waitForAlertPresence(driver);
		acceptAlert(driver);
	}

	public void verifyDeletedCustomerSuccessfulMessageIsDisplayed(String expected) {
		waitForAlertPresence(driver);
		String actual = getTextAlert(driver);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed correctly",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}
}
