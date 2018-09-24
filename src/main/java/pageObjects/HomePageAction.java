package pageObjects;

import org.openqa.selenium.WebDriver;

import interfaces.HomePageUI;
import commons.AbstractPage;

public class HomePageAction extends AbstractPage {

	WebDriver driver;

	public HomePageAction(WebDriver driver_) {
		this.driver = driver_;
	}

	public void verifyWelcomeMesssageIsDisplayed() {
		waitForControlVisible(driver, HomePageUI.WELLCOME_MESSAGE);
		verifyPassed(isControlDisplayed(driver, HomePageUI.WELLCOME_MESSAGE), "Welcome message is displayed",
				"Welcome message is NOT displayed");
	}

}
