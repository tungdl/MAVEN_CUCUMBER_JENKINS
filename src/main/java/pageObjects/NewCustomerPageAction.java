package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.NewCustomerPageUI;
import commons.AbstractPage;

public class NewCustomerPageAction extends AbstractPage {

	WebDriver driver;

	public NewCustomerPageAction(WebDriver driver_) {
		this.driver = driver_;
	}

	public void enterName(String value) {
		sendkeyToElement(driver, NewCustomerPageUI.TXB_CUSTOMER_NAME, value);
	}

	public void selectGender(String gender) {
		if (gender.toLowerCase().equals("male"))
			clickToElement(driver, NewCustomerPageUI.RDB_MALE);
		else if (gender.toLowerCase().equals("female"))
			clickToElement(driver, NewCustomerPageUI.RDB_FEMALE);
	}

	public void enterBirthday(String value) {
		if (driver.toString().toLowerCase().contains("chrome"))
			removeAttributeInDOM(driver, NewCustomerPageUI.TXB_BIRTHDAY, "type");
		sendkeyToElement(driver, NewCustomerPageUI.TXB_BIRTHDAY, value);
	}

	public void enterAddress(String value) {
		sendkeyToElement(driver, NewCustomerPageUI.TXB_ADDRESS, value);
	}

	public void enterCity(String value) {
		sendkeyToElement(driver, NewCustomerPageUI.TXB_CITY, value);
	}

	public void enterState(String value) {
		sendkeyToElement(driver, NewCustomerPageUI.TXB_STATE, value);
	}

	public void enterPIN(String value) {
		sendkeyToElement(driver, NewCustomerPageUI.TXB_PIN, value);
	}

	public void enterEmail(String value) {
		sendkeyToElement(driver, NewCustomerPageUI.TXB_EMAIL, value);
	}

	public void enterTelephone(String value) {
		sendkeyToElement(driver, NewCustomerPageUI.TXB_TELEPHONE, value);
	}

	public void enterPassword(String value) {
		sendkeyToElement(driver, NewCustomerPageUI.TXB_PASSWORD, value);
	}

	public void clickSubmitButton() {
		clickToElement(driver, NewCustomerPageUI.BTN_SUBMIT);
	}
	
	public String getCustomerID() {
		return getTextElement(driver, NewCustomerPageUI.TXT_CUSTOMER_ID);
	}

	public void verifyErrorNameMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, NewCustomerPageUI.MSG_CUSTOMER_NAME_ERROR);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}

	public void verifyErrorAddressMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, NewCustomerPageUI.MSG_ADDRESS_ERROR);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}

	public void verifyErrorCityMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, NewCustomerPageUI.MSG_CITY_ERROR);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}

	public void verifyErrorStateMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, NewCustomerPageUI.MSG_STATE_ERROR);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}

	public void verifyErrorPINMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, NewCustomerPageUI.MSG_PIN_ERROR);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}

	public void verifyErrorTelephoneMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, NewCustomerPageUI.MSG_TELEPHONE_ERROR);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}

	public void verifyErrorEmailMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, NewCustomerPageUI.MSG_EMAIL_ERROR);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}

	public void verifySuccessfulMessageIsDispalyed(String expected) {
		String actual = getTextElement(driver, NewCustomerPageUI.MSG_SUCCESSFUL);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}
}
