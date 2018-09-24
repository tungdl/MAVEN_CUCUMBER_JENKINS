package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import cucumberConfigs.Hooks;
import interfaces.EditCustomerPageUI;
import pageObjects.BankGuruFactoryPage;
import pageObjects.EditCustomerPageAction;

public class EditCustomerSteps extends ShareData{
	
	WebDriver driver;
	private EditCustomerPageAction editCustomerPage;
	private ShareData shareData;
	
	public EditCustomerSteps(ShareData shareData) {
		driver = Hooks.openBrowser();
		this.shareData = shareData;
		editCustomerPage = BankGuruFactoryPage.getEditCustomerPageAction(driver);
	}

	@When("^I input to Customer ID$")
	public void iInputToCustomerID() {
		editCustomerPage.waitForControlVisible(driver, EditCustomerPageUI.TXB_CUSTOMER_ID);
		editCustomerPage.sendkeyToElement(driver, EditCustomerPageUI.TXB_CUSTOMER_ID, shareData.customerID);
	}

}
