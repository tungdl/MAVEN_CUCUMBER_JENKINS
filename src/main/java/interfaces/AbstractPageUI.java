package interfaces;

public class AbstractPageUI {

	public static final String NEW_CUSTOMER_LINK = "//a[text()='New Customer']";
	public static final String EDIT_CUSTOMER_LINK = "//a[text()='Edit Customer']";
	public static final String NEW_ACCOUNT_LINK = "//a[text()='New Account']";
	public static final String HOME_PAGE_LINK = "//a[text()='Manager']";
	public static final String DEPOSIT_PAGE_LINK = "//a[text()='Deposit']";
	public static final String WITHDRAWAL_PAGE_LINK = "//a[text()='Withdrawal']";
	public static final String FUND_TRANSFER_PAGE_LINK = "//a[text()='Fund Transfer']";
	public static final String BALANCE_ENQUIRY_PAGE_LINK = "//a[text()='Balance Enquiry']";
	public static final String DELETE_ACCOUNT_PAGE_LINK = "//a[text()='Delete Account']";
	public static final String DELETE_CUSTOMER_PAGE_LINK = "//a[text()='Delete Customer']";
	
	public static final String DYNAMIC_TEXTBOX = "//input[@name='%s']";
	public static final String DYNAMIC_TEXTAREA = "//textarea[@name='%s']";
	public static final String DYNAMIC_BUTTON = "//input[@name='%s']";
	public static final String DYNAMIC_RADIOBUTTON = "//input[@value='%s']";
	public static final String DYNAMIC_LABEL_TABLE = "//td[text()='%s']/following-sibling::td";
	public static final String DYNAMIC_DROPDOWNLIST = "//select[@name='%s']";
	public static final String DYNAMIC_SUCCESSFUL_MESSAGE = "//p[@class='heading3']";

}
