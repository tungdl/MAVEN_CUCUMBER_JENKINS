package pageObjects;

import org.openqa.selenium.WebDriver;

public class BankGuruFactoryPage {
	
	public static HomePageAction getHomePageAction(WebDriver driver) {
		return new HomePageAction(driver);
	}
	
	public static LoginPageAction getLoginPageAction(WebDriver driver) {
		return new LoginPageAction(driver);
	}

	public static RegisterPageAction getRegisterPageAction(WebDriver driver) {
		return new RegisterPageAction(driver);
	}

	public static NewCustomerPageAction getNewCustomerPageAction(WebDriver driver) {
		return new NewCustomerPageAction(driver);
	}

	public static EditCustomerPageAction getEditCustomerPageAction(WebDriver driver) {
		return new EditCustomerPageAction(driver);
	}

	public static NewAccountPageAction getNewAccountPageAction(WebDriver driver) {
		return new NewAccountPageAction(driver);
	}
	
	public static DepositPageAction getDepositPageAction(WebDriver driver) {
		return new DepositPageAction(driver);
	}
	
	public static WithdrawalPageAction getWithdrawalPageAction(WebDriver driver) {
		return new WithdrawalPageAction(driver);
	}
	
	public static FundTransferPageAction getFundTransferPageAction(WebDriver driver) {
		return new FundTransferPageAction(driver);
	}
	
	public static BalanceEnquiryPageAction getBalanceEnquiryPageAction(WebDriver driver) {
		return new BalanceEnquiryPageAction(driver);
	}
	
	public static DeleteAccountPageAction getDeleteAccountPageAction(WebDriver driver) {
		return new DeleteAccountPageAction(driver);
	}
	
	public static DeleteCustomerPageAction getDeleteCustomerPageAction(WebDriver driver) {
		return new DeleteCustomerPageAction(driver);
	}
	
	public static AbstractPageObject getAbstractPageObject(WebDriver driver) {
		return new AbstractPageObject(driver);
	}
}
