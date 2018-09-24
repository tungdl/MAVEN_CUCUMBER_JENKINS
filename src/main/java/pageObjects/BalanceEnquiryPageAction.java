package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.BalanceEnquiryPageUI;
import commons.AbstractPage;

public class BalanceEnquiryPageAction extends AbstractPage {

	WebDriver driver;

	public BalanceEnquiryPageAction(WebDriver driver_) {
		this.driver = driver_;
	}
	
	public void enterAccountID(String value) {
		sendkeyToElement(driver, BalanceEnquiryPageUI.TXB_ACCOUNT_ID, value);
	}

	public void clickSubmitButton() {
		clickToElement(driver, BalanceEnquiryPageUI.BTN_SUBMIT);
	}

	public void verifyCurrentBalanceIsCorrect(String expected) {
		String actual = getTextElement(driver, BalanceEnquiryPageUI.TXT_CURRENT_BALANCE);
		verifyEquals(actual, expected, "Current Balance: " + expected + "is correctly",
				"Current Balance: " + actual + " is displayed instead of " + expected);
	}
	
	public void verifyBalanceMessageIsDisplayed(String expected) {
		String actual = getTextElement(driver, BalanceEnquiryPageUI.MSG_BALANCE_DETAILS);
		verifyEquals(actual, expected, "Message '" + expected + "' is displayed correctly",
				"Message '" + actual + "' is displayed instead of '" + expected + "'");
	}
}
