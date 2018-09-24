package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.DepositPageUI;
import commons.AbstractPage;

public class DepositPageAction extends AbstractPage {

	WebDriver driver;

	public DepositPageAction(WebDriver driver_) {
		this.driver = driver_;
	}

	public void enterAccountID(String value) {
		sendkeyToElement(driver, DepositPageUI.TXB_ACCOUNT_NO, value);
	}

	public void enterAmount(String value) {
		sendkeyToElement(driver, DepositPageUI.TXB_AMOUNT, value);
	}

	public void enterDescription(String value) {
		sendkeyToElement(driver, DepositPageUI.TXB_DESCRIPTION, value);
	}

	public void clickSubmitButton() {
		clickToElement(driver, DepositPageUI.BTN_SUBMIT);
	}

	public void verifyCurrentBalanceIsCorrect(String expected) {
		String actual = getTextElement(driver, DepositPageUI.TXT_CURRENT_BALANCE);
		verifyEquals(actual, expected, "Current Amount: " + expected + "is correctly",
				"Current Amount: " + actual + " is displayed instead of " + expected);
	}
	
	public void verifyTransactionDetailsOfDepositMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, DepositPageUI.MSG_TRANSACTION_DETAILS_OF_DEPOSIT);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed correctly",
				"Message '" + actual + " is displayed instead of '" + expected + "'");
	}
}
