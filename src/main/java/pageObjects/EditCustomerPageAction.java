package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.EditCustomerPageUI;
import commons.AbstractPage;

public class EditCustomerPageAction extends AbstractPage {

	WebDriver driver;

	public EditCustomerPageAction(WebDriver driver_) {
		this.driver = driver_;
	}

	public void enterCustomerID(String value) {
		sendkeyToElement(driver, EditCustomerPageUI.TXB_CUSTOMER_ID, value);
	}

	public void enterAddress(String value) {
		sendkeyToElement(driver, EditCustomerPageUI.TXB_ADDRESS, value);
	}

	public void enterCity(String value) {
		sendkeyToElement(driver, EditCustomerPageUI.TXB_CITY, value);
	}

	public void enterPIN(String value) {
		sendkeyToElement(driver, EditCustomerPageUI.TXB_PIN, value);
	}

	public void enterEmail(String value) {
		sendkeyToElement(driver, EditCustomerPageUI.TXB_EMAIL, value);
	}

	public void enterState(String value) {
		sendkeyToElement(driver, EditCustomerPageUI.TXB_STATE, value);
	}

	public void enterTelephone(String value) {
		sendkeyToElement(driver, EditCustomerPageUI.TXB_TELEPHONE, value);
	}
	
	public void clickSubmitEditButton() {
		clickToElement(driver, EditCustomerPageUI.BTN_SUBMIT_EDIT);
	}

	public void clickSubmitButton() {
		clickToElement(driver, EditCustomerPageUI.BTN_SUBMIT);
	}

	public void verifyEditedSuccessfulMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, EditCustomerPageUI.MSG_EDITED_SUCCESSFUL);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}
}
