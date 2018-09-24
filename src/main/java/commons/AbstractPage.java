package commons;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import interfaces.AbstractPageUI;
import pageObjects.BalanceEnquiryPageAction;
import pageObjects.BankGuruFactoryPage;
import pageObjects.DeleteAccountPageAction;
import pageObjects.DeleteCustomerPageAction;
import pageObjects.DepositPageAction;
import pageObjects.EditCustomerPageAction;
import pageObjects.FundTransferPageAction;
import pageObjects.HomePageAction;
import pageObjects.NewAccountPageAction;
import pageObjects.NewCustomerPageAction;
import pageObjects.WithdrawalPageAction;

public class AbstractPage extends AbstractTest{

	
	/*******************
	 * Web page actions*
	 *******************/
	public void openUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}

	public void back(WebDriver driver) {
		driver.navigate().back();
	}

	public void forward(WebDriver driver) {
		driver.navigate().forward();
	}

	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	/***********************
	 * Web element actions *
	 ***********************/
	public void clickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}
	
	public void clickToElement(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}
	
	public void sendkeyToElement(WebDriver driver, String locator, String dataTest) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(dataTest);
	}

	public void sendkeyToElement(WebDriver driver, String locator, String dataTest,  String... locatorName) {
		locator = String.format(locator, (Object[]) locatorName);
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(dataTest);
	}
	
	public void selectItemInDropdownlistByText(WebDriver driver, String locator, String dataTest) {
		WebElement element = driver.findElement(By.xpath(locator));
		Select select = new Select(element);
		select.selectByVisibleText(dataTest);
	}

	public void selectItemInDropdownlistByText(WebDriver driver, String locator, String dataTest, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		Select select = new Select(element);
		select.selectByVisibleText(dataTest);
	}

	public String getFirstItemSelected(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}

	public String getAttributeValue(WebDriver driver, String locator, String attribute) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attribute);
	}

	public String getTextElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}
	
	public String getTextElement(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	} 

	public int getSizeElement(WebDriver driver, String locator) {
		List<WebElement> element = driver.findElements(By.xpath(locator));
		return element.size();
	}

	public void checkTheCheckbox(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (!element.isSelected()) {
			element.click();
		}
	}

	public void uncheckTheCheckbox(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (element.isSelected()) {
			element.click();
		}
	}

	public boolean isControlDisplayed(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isControlSelected(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}

	public boolean isControlEnabled(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}

	public void acceptAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void cancelAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String getTextAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void sendkeyToAlert(WebDriver driver, String dataTest) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(dataTest);
	}

	public void switchToChildWindow(WebDriver driver, String parent) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindow : allWindows) {
			if (!runWindow.equals(parent)) {
				driver.switchTo().window(runWindow);
				break;
			}
		}
	}

	public boolean closeAllWithoutParentWindows(WebDriver driver, String parentWindow) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindows : allWindows) {
			if (!runWindows.equals(parentWindow)) {
				driver.switchTo().window(runWindows);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}

	public void switchToWindowByTitle(WebDriver driver, String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindows : allWindows) {
			driver.switchTo().window(runWindows);
			String currentWin = driver.getTitle();
			if (currentWin.equals(title)) {
				break;
			}
		}
	}

	public void doubleClickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.doubleClick(element);
	}

	public void hoverMouseToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.moveToElement(element);
	}

	public void rightClick(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.contextClick(element);
	}

	public void dragAndDrop(WebDriver driver, String sourceLocator, String targetLocator) {
		WebElement sourceElement = driver.findElement(By.xpath(sourceLocator));
		WebElement targetElement = driver.findElement(By.xpath(targetLocator));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement);
	}

	public void uploadBySendkey(WebDriver driver, String locator, String filePath) {
		String workingDirectory = System.getProperty("user.dir") + "\\upload";
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(workingDirectory + filePath);
	}

	public void uploadByAutoIT(WebDriver driver, String locator, String filePath) throws Exception {
		String workingDirectory = System.getProperty("user.dir") + "\\upload";
		driver.findElement(By.xpath(locator)).click();
		Runtime.getRuntime().exec(new String[] { ".\\autoIT\\ie.exe", workingDirectory + filePath });
	}

	public void uploadByRobot(WebDriver driver, String locator, String filePath) throws Exception {
		String workingDirectory = System.getProperty("user.dir") + "\\upload";
		StringSelection select = new StringSelection(workingDirectory + filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

		driver.findElement(By.xpath(locator)).click();

		Robot robot = new Robot();
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public Object executeJSForBrowserElement(WebDriver driver, String javaSript) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript(javaSript);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object clickByJSForWebElement(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object removeAttributeInDOM(WebDriver driver, String locator, String attribute) {
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].removeAttribute('" + attribute + "');", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object scrollByJSToBottomPage(WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object scrollByJSToElement(WebDriver driver, String locator) {
		try {
			WebElement element = driver.findElement(By.xpath(locator));
			return ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public void waitForControlPresence(WebDriver driver, String locator) {
		By by = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public void waitForControlVisible(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForControlVisible(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForControlClickable(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForControlClickable(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		WebElement element = driver.findElement(By.xpath(locator));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForControlInvisible(WebDriver driver, String locator) {
		By by = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public void waitForControlInvisible(WebDriver driver, String locator, String... value) {
		locator = String.format(locator, (Object[]) value);
		By by = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public void waitForAlertPresence(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public HomePageAction openHomePage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.HOME_PAGE_LINK);
		clickToElement(driver, AbstractPageUI.HOME_PAGE_LINK);
		return BankGuruFactoryPage.getHomePageAction(driver);
	}

	public NewCustomerPageAction openNewCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.NEW_CUSTOMER_LINK);
		clickToElement(driver, AbstractPageUI.NEW_CUSTOMER_LINK);
		return BankGuruFactoryPage.getNewCustomerPageAction(driver);
	}

	public EditCustomerPageAction openEditCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.EDIT_CUSTOMER_LINK);
		clickToElement(driver, AbstractPageUI.EDIT_CUSTOMER_LINK);
		return BankGuruFactoryPage.getEditCustomerPageAction(driver);
	}
	
	public NewAccountPageAction openNewAccountPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.NEW_ACCOUNT_LINK);
		clickToElement(driver, AbstractPageUI.NEW_ACCOUNT_LINK);
		return BankGuruFactoryPage.getNewAccountPageAction(driver);
	}
	
	public DepositPageAction openDepositPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DEPOSIT_PAGE_LINK);
		clickToElement(driver, AbstractPageUI.DEPOSIT_PAGE_LINK);
		return BankGuruFactoryPage.getDepositPageAction(driver);
	}
	
	public WithdrawalPageAction openWithdrawalPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.WITHDRAWAL_PAGE_LINK);
		clickToElement(driver, AbstractPageUI.WITHDRAWAL_PAGE_LINK);
		return BankGuruFactoryPage.getWithdrawalPageAction(driver);
	}
	
	public FundTransferPageAction openFundTransferPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.FUND_TRANSFER_PAGE_LINK);
		clickToElement(driver, AbstractPageUI.FUND_TRANSFER_PAGE_LINK);
		return BankGuruFactoryPage.getFundTransferPageAction(driver);
	}
	
	public BalanceEnquiryPageAction openBalanceEnquiryPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.BALANCE_ENQUIRY_PAGE_LINK);
		clickToElement(driver, AbstractPageUI.BALANCE_ENQUIRY_PAGE_LINK);
		return BankGuruFactoryPage.getBalanceEnquiryPageAction(driver);
	}
	
	public DeleteCustomerPageAction openDeleteCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DELETE_CUSTOMER_PAGE_LINK);
		clickToElement(driver, AbstractPageUI.DELETE_CUSTOMER_PAGE_LINK);
		return BankGuruFactoryPage.getDeleteCustomerPageAction(driver);
	}
	
	public DeleteAccountPageAction openDeleteAccountPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DELETE_ACCOUNT_PAGE_LINK);
		clickToElement(driver, AbstractPageUI.DELETE_ACCOUNT_PAGE_LINK);
		return BankGuruFactoryPage.getDeleteAccountPageAction(driver);
	}
	
}
