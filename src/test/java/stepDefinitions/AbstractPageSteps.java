package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberConfigs.Hooks;
import pageObjects.AbstractPageObject;
import pageObjects.BankGuruFactoryPage;
import pageObjects.DepositPageAction;
import pageObjects.EditCustomerPageAction;
import pageObjects.HomePageAction;
import pageObjects.NewAccountPageAction;
import pageObjects.NewCustomerPageAction;

public class AbstractPageSteps {

	WebDriver driver;
	private AbstractPageObject abstractPage;
	private AbstractTest abstractTest;
	private NewCustomerPageAction newCustomerPage;
	private EditCustomerPageAction editCustomerPage;
	private NewAccountPageAction newAccountPage;
	private HomePageAction homePage;
	private DepositPageAction depositPage;
	private String customerID;

	public AbstractPageSteps() {
		driver = Hooks.openBrowser();
		abstractPage = BankGuruFactoryPage.getAbstractPageObject(driver);
		abstractTest = new AbstractTest();
	}

	@When("^I input to \"(.*?)\" textbox with random data \"(.*?)\"$")
	public void iInputToTextboxWithRandomData(String textboxName, String random) {
		random = abstractPage.randomNumber() + random;
		abstractPage.inputToDynamicTextbox(textboxName, random);
	}

	@When("^I click to \"(.*?)\" button$")
	public void clickToDynamicButton(String buttonName) {
		abstractPage.clickToDynamicButton(buttonName);
	}

	@When("^I open \"(.*?)\" page$")
	public void iOpenDynamicPage(String dynamicPage) {
		switch (dynamicPage) {
		case "New Customer":
			newCustomerPage = abstractPage.openNewCustomerPage(driver);
			break;
		case "Edit Customer":
			editCustomerPage = abstractPage.openEditCustomerPage(driver);
			break;
		case "New Account":
			newAccountPage = abstractPage.openNewAccountPage(driver);
			break;
		case "Deposit":
			depositPage = abstractPage.openDepositPage(driver);
			break;
		default:
			homePage = BankGuruFactoryPage.getHomePageAction(driver);
			break;
		}
	}

	@When("^I input to \"(.*?)\" textbox with data \"(.*?)\"$")
	public void iInputToTextboxWithData(String textboxName, String dataTest) {
		abstractPage.inputToDynamicTextbox(textboxName, dataTest);
	}

	@When("^I click to \"(.*?)\" radio button$")
	public void iClickToRadioButton(String radioButtonName) {
		abstractPage.clickToDynamicRadioButton(radioButtonName);
	}

	@When("^I input to \"(.*?)\" text area with data \"(.*?)\"$")
	public void iInputToTextAreaWithData(String textAreaName, String value) {
		abstractPage.inputToDynamicTextArea(textAreaName, value);
	}

	@Then("^I verify expected data at \"(.*?)\" text in table with actual data \"(.*?)\"$")
	public void iVerifyExpectedDataAtTextInTableWithActualData(String labelValue, String dataTest) {
		abstractPage.verifyDynamicLabelTable(labelValue, dataTest);
	}

	@When("^I select value is \"(.*?)\" in dropdown list \"(.*?)\"$")
	public void iSelectValueIsInDropdownList(String dataTest, String dropdownlistName) {
		abstractPage.selectValueInDynamicDropdownlist(dropdownlistName, dataTest);
	}
	
	@Then("^Verify (?:created|edited) successfully with message \"(.*?)\"$")
	public void verifyCreatedOrEditedSuccessfullyWithMessage(String msgSuccess) {
		abstractPage.verifyDynamicSuccessfulMessage(msgSuccess);
	}
}
