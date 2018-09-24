package commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class AbstractTest extends CommonAction{
	WebDriver driver;

	/**
	 * Open browser using DriverManager to handle driver version
	 * 
	 * @param browser
	 * @param url
	 * @param version
	 * @return driver
	 */
	protected synchronized WebDriver openMultibrowser(String browser, String url, String version) {

		driver = null;

		try {
			if (browser.equalsIgnoreCase("firefox")) {
				FirefoxDriverManager.getInstance().version(version).setup();
				driver = new FirefoxDriver();
				logInfo("Open Mozilla Firefox browser successful");
			} else if (browser.equalsIgnoreCase("chrome")) {
				ChromeDriverManager.getInstance().version(version).setup();
				driver = new ChromeDriver();
				logInfo("Open Google Chrome browser successful");
			} else if (browser.equalsIgnoreCase("ie")) {
				InternetExplorerDriverManager.getInstance().version(version).setup();
				DesiredCapabilities capability;
				capability = DesiredCapabilities.internetExplorer();
				capability.setCapability("ignoreProtectedModeSettings", true);
				capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capability.setCapability("ignoreZoomSetting", true);
				capability.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
				driver = new InternetExplorerDriver(capability);
				logInfo("Open Internet Explorer browser successful");
			} else if (browser.equalsIgnoreCase("edge")) {
				EdgeDriverManager.getInstance().version(version).setup();
				driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("chromeheadless")) {
				ChromeDriverManager.getInstance().version(version).setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			} else {
				logWarning("Can't init browser");
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			logError(e.getMessage());
		}
		return driver;
	}

	/**
	 * Encapsulation verify fails action
	 * 
	 * @param condition
	 * @param msgPass
	 * @param msgFail
	 * @return boolean value: PASS/FAIL
	 */
	private boolean checkFailed(boolean condition, String msgPass, String msgFail) {
		boolean pass = true;
		try {
			if (condition == false)
				logPass(msgPass);
			else
				logFail(msgFail);
			Assert.assertFalse(condition);
		} catch (Throwable e) {
			pass = false;
			Reporter.getCurrentTestResult().setThrowable(e);
			logError(e.getMessage());
		}
		return pass;
	}

	protected boolean verifyFailed(boolean condition, String msgPass, String msgFail) {
		return checkFailed(condition, msgPass, msgFail);
	}

	/**
	 * Encapsulation verify passes action
	 * 
	 * @param condition
	 * @param msgPass
	 * @param msgFail
	 * @return boolean value: PASS/FAIL
	 */
	private boolean checkPassed(boolean condition, String msgPass, String msgFail) {
		boolean pass = true;
		try {
			if (condition == true)
				logPass(msgPass);
			else
				logFail(msgFail);
			Assert.assertTrue(condition);
		} catch (Throwable e) {
			pass = false;
			Reporter.getCurrentTestResult().setThrowable(e);
			logError(e.getMessage());
		}
		return pass;
	}

	protected boolean verifyPassed(boolean condition, String msgPass, String msgFail) {
		return checkPassed(condition, msgPass, msgFail);
	}

	/**
	 * Encapsulation verify equals action
	 * 
	 * @param actual
	 * @param expected
	 * @param msgPass
	 * @param msgFail
	 * @return boolean value: PASS/FAIL
	 */
	private boolean checkEquals(Object actual, Object expected, String msgPass, String msgFail) {
		boolean pass = true;
		try {
			if (actual.equals(expected))
				logPass(msgPass);
			else
				logFail(msgFail);
			Assert.assertEquals(actual, expected);
		} catch (Throwable e) {
			pass = false;
			Reporter.getCurrentTestResult().setThrowable(e);
			logError(e.getMessage());
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected, String msgPass, String msgFail) {
		return checkEquals(actual, expected, msgPass, msgFail);
	}

	/**
	 * Close browser and kill driver
	 * 
	 * @param driver
	 */
	protected void closeBrowser(WebDriver driver) {
		try {
			driver.quit();
			if (driver.toString().toLowerCase().contains("chrome")) {
				String cmd = "taskkill /IM chromedriver.exe /F";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
			if (driver.toString().toLowerCase().contains("internetexplorer")) {
				String cmd = "taskkill /IM IEDriverServer.exe /F";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
		} catch (Exception e) {
			logWarning(e.getMessage());
		}
	}
}
