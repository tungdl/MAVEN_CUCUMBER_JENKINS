package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberConfigs.Hooks;
import pageObjects.BankGuruFactoryPage;
import pageObjects.HomePageAction;

public class HomePageSteps {
	
	WebDriver driver;
	private HomePageAction homePage;
	
	public HomePageSteps() {
		driver = Hooks.openBrowser();
		homePage = BankGuruFactoryPage.getHomePageAction(driver);
	}

	@Then("^I verify Homepage displayed with message \"(.*?)\"$")
	public void iVerifyHomepageDisplayedWithMessage(String arg1) {
		homePage.verifyWelcomeMesssageIsDisplayed();
	}

}
