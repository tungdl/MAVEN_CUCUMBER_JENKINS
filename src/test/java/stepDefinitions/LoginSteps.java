package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageAction;

public class LoginSteps {

	WebDriver driver;
	WebDriverWait wait;
	private LoginPageAction loginPage;

	@Given("^I open application$")
	public void iOpenApplication() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get("http://live.guru99.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Given("^I open My Account page$")
	public void iOpenMyAccountPage() {
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
	}

	@Then("^The My Account page should be show$")
	public void theMyAccountPageShouldBeShow() {
		Assert.assertTrue(driver.findElement(By.xpath("//form[@id='login-form']")).isDisplayed());
	}

	@When("^I input email \"(.*?)\" and password \"(.*?)\"$")
	public void iInputEmailAndPassword(String username, String password) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}

	@When("^I click to Login button$")
	public void iClickLOGINButton() {
		loginPage.clickLoginButton();
	}

	@When("^The error message \"(.*?)\" displayed at email field$")
	public void theErrorMessageDisplayedAtEmailField(String msgError) {
		String msgActual = driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).getText();
		Assert.assertEquals(msgActual, msgError);
	}

	@When("^The error message \"(.*?)\" displayed at password field$")
	public void theErrorMessageDisplayedAtPasswordField(String msgError) {
		String msgActual = driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).getText();
		Assert.assertEquals(msgActual, msgError);
	}

	@When("^I quit browser$")
	public void iQuitBrowser() {
		driver.quit();
	}
}
