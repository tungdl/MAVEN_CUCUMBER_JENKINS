package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.NewAccountPageUI;
import commons.AbstractPage;

public class NewAccountPageAction extends AbstractPage {

	WebDriver driver;

	public NewAccountPageAction(WebDriver driver_) {
		this.driver = driver_;
	}

	public void enterCustomerID(String value) {
		sendkeyToElement(driver, NewAccountPageUI.TXB_CUSTOMER_ID, value);
	}

	public void selectAccountType(String value) {
		selectItemInDropdownlistByText(driver, NewAccountPageUI.DDL_ACCOUNT_TYPE, value);
	}

	public void enterInitialDeposit(String value) {
		sendkeyToElement(driver, NewAccountPageUI.TXB_INITIAL_DEPOSIT, value);
	}

	public void clickSubmitButton() {
		clickToElement(driver, NewAccountPageUI.BTN_SUBMIT);
	}
	
	public String getAccountID() {
		return getTextElement(driver, NewAccountPageUI.TXT_ACCOUNT_ID);
	}

	public void verifyGenerateAccountSuccessfulMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, NewAccountPageUI.MSG_CREATED_ACCOUNT_SUCCESSFUL);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}

	public void verifyCurrentAmountAndInitialDepositAreEqual(String expected) {
		String actual = getTextElement(driver, NewAccountPageUI.TXT_CURRENT_AMOUNT);
		verifyEquals(actual, expected, "Current Amount: " + actual + "and Initial Deposit: " + expected + "are equal",
				"Current Amount: " + actual + " and Initial Deposit: " + expected + " are different");
	}
}
