package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberConfigs.Hooks;
import interfaces.NewCustomerPageUI;
import pageObjects.BankGuruFactoryPage;
import pageObjects.NewCustomerPageAction;

public class NewCustomerSteps extends ShareData{
	
	WebDriver driver;
	private ShareData shareData;
	private NewCustomerPageAction newCustomerPage;
	
	public NewCustomerSteps(ShareData shareData) {
		driver = Hooks.openBrowser();
		this.shareData = shareData;
		newCustomerPage = BankGuruFactoryPage.getNewCustomerPageAction(driver);
	}
	
	@When("^I leave Customer Name blank$")
	public void iLeaveCustomerNameBlank(){
	    newCustomerPage.enterName("");
	}

	@When("^I move to next field$")
	public void iMoveToNextField(){
	    newCustomerPage.enterAddress("");
	}

	@Then("^The error message \"(.*?)\" must be shown$")
	public void theErrorMessageMustBeShown(String msgError){
	    newCustomerPage.verifyErrorNameMessageIsDisplayed(msgError);
	}
	
	@Given("^I enter Customer Name \"(.*?)\"$")
	public void iEnterCustomerName(String name) {
	    newCustomerPage.enterName(name);
	}

	@When("^I get infor of Customer ID$")
	public void iGetInforOfCustomerID() {
		shareData.customerID = newCustomerPage.getCustomerID();
	}

	@When("^I input to birthday with data \"(.*?)\"$")
	public void iInputDobBirthday(String value) {
		newCustomerPage.enterBirthday(value);
	}
}
