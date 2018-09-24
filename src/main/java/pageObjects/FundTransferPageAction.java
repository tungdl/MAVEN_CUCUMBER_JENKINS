package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.FundTransferPageUI;
import commons.AbstractPage;

public class FundTransferPageAction extends AbstractPage {

	WebDriver driver;

	public FundTransferPageAction(WebDriver driver_) {
		this.driver = driver_;
	}
	
	public void enterPayerAccountID(String value) {
		sendkeyToElement(driver, FundTransferPageUI.TXB_PAYER_ACCOUNT_ID, value);
	}

	public void enterPayeeAccountID(String value) {
		sendkeyToElement(driver, FundTransferPageUI.TXB_PAYEE_ACCOUNT_ID, value);
	}

	public void enterAmount(String value) {
		sendkeyToElement(driver, FundTransferPageUI.TXB_AMOUNT, value);
	}

	public void enterDescription(String value) {
		sendkeyToElement(driver, FundTransferPageUI.TXB_DESCRIPTION, value);
	}

	public void clickSubmitButton() {
		clickToElement(driver, FundTransferPageUI.BTN_SUBMIT);
	}

	public void verifyAmountIsCorrect(String expected) {
		String actual = getTextElement(driver, FundTransferPageUI.TXT_CURRENT_BALANCE);
		verifyEquals(actual, expected, "Current Amount: " + expected + "is correctly",
				"Current Amount: " + actual + " is displayed instead of " + expected);
	}
	
	public void verifyTransferDetailsMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, FundTransferPageUI.MSG_TRANSFER_DETAILS);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed correctly",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}
}
