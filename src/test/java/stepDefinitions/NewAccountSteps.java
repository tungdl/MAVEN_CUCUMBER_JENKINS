package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberConfigs.Hooks;
import pageObjects.BankGuruFactoryPage;
import pageObjects.NewAccountPageAction;

public class NewAccountSteps extends ShareData {

	WebDriver driver;
	private ShareData shareData;
	private NewAccountPageAction newAccountPage;

	public NewAccountSteps(ShareData shareData) {
		driver = Hooks.openBrowser();
		this.shareData = shareData;
		newAccountPage = BankGuruFactoryPage.getNewAccountPageAction(driver);
	}

	@Then("^I get infor of (?:first|second) account$")
	public void iGetInforOfFirstAccount() {
		shareData.accountID = newAccountPage.getAccountID();
	}


}
