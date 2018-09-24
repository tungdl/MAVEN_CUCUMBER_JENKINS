package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.WithdrawalPageUI;
import commons.AbstractPage;

public class WithdrawalPageAction extends AbstractPage {

	WebDriver driver;

	public WithdrawalPageAction(WebDriver driver_) {
		this.driver = driver_;
	}

	public void enterAccountID(String value) {
		sendkeyToElement(driver, WithdrawalPageUI.TXB_ACCOUNT_NO, value);
	}

	public void enterAmount(String value) {
		sendkeyToElement(driver, WithdrawalPageUI.TXB_AMOUNT, value);
	}

	public void enterDescription(String value) {
		sendkeyToElement(driver, WithdrawalPageUI.TXB_DESCRIPTION, value);
	}

	public void clickSubmitButton() {
		clickToElement(driver, WithdrawalPageUI.BTN_SUBMIT);
	}

	public void verifyCurrentAmountIsCorrect(String expected) {
		String actual = getTextElement(driver, WithdrawalPageUI.TXT_CURRENT_BALANCE);
		verifyEquals(actual, expected, "Current Amount: " + expected + "is correctly",
				"Current Amount: " + actual + " is displayed instead of " + expected);
	}
	
	public void verifyTransactionDetailsOfWithdrawMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, WithdrawalPageUI.MSG_TRANSACTION_DETAILS_OF_WITHDRAW);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed correctly",
				"Message '" + actual + " is displayed instead of '" + expected + "'");
	}
}
