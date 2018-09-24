package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import interfaces.AbstractPageUI;

public class AbstractPageObject extends AbstractPage{
	
	WebDriver driver;
	
	public AbstractPageObject(WebDriver driver_) {
		driver = driver_;
	}
	
	public void inputToDynamicTextbox(String textboxName, String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_TEXTBOX, textboxName);
		sendkeyToElement(driver, AbstractPageUI.DYNAMIC_TEXTBOX, value, textboxName);
	}
	
	public void inputToDynamicTextArea(String textAreaName, String value) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_TEXTAREA, textAreaName);
		sendkeyToElement(driver, AbstractPageUI.DYNAMIC_TEXTAREA, value, textAreaName);
	}
	
	public void clickToDynamicButton(String buttonName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_BUTTON, buttonName);
		clickToElement(driver, AbstractPageUI.DYNAMIC_BUTTON, buttonName);
	}
	
	public void clickToDynamicRadioButton(String radioButtonName) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_RADIOBUTTON, radioButtonName);
		clickToElement(driver, AbstractPageUI.DYNAMIC_RADIOBUTTON, radioButtonName);
	}
	
	public void selectValueInDynamicDropdownlist(String dropdownlistName, String dataTest) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_DROPDOWNLIST, dropdownlistName);
		selectItemInDropdownlistByText(driver, AbstractPageUI.DYNAMIC_DROPDOWNLIST, dataTest, dropdownlistName);
	}

	public void verifyDynamicLabelTable(String labelValue, String dataTest) {
		String actual = getTextElement(driver, AbstractPageUI.DYNAMIC_LABEL_TABLE, labelValue);
		verifyEquals(actual, dataTest, dataTest + " is displayed", dataTest + " is NOT displayed");
	}
	
	public void verifyDynamicSuccessfulMessage(String msgSuccess) {
		String actual = getTextElement(driver, AbstractPageUI.DYNAMIC_SUCCESSFUL_MESSAGE);
		verifyEquals(actual, msgSuccess, msgSuccess + " is displayed", msgSuccess + " is NOT displayed");
	}
}
