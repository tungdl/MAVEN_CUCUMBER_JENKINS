package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberConfigs.Hooks;
import interfaces.DepositPageUI;
import pageObjects.BankGuruFactoryPage;
import pageObjects.DepositPageAction;

public class DepositPageSteps extends ShareData {

	WebDriver driver;
	private DepositPageAction depositPage;
	private ShareData shareData;

	public DepositPageSteps(ShareData shareData) {
		this.shareData = shareData;
		driver = Hooks.openBrowser();
		depositPage = BankGuruFactoryPage.getDepositPageAction(driver);
	}

	@When("^I input to first account number$")
	public void iInputToFirstAccountNumber() {
		depositPage.sendkeyToElement(driver, DepositPageUI.TXB_ACCOUNT_NO, shareData.accountID);
	}
	
	@Then("^Verify transfer successfully with message \"(.*?)\"$")
	public void verifyTransactionSuccessMessage(String msgSuccess) {
		depositPage.verifyTransactionDetailsOfDepositMessageIsDisplayed(msgSuccess + " " + shareData.accountID);
	}

}
