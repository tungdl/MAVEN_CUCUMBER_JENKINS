package interfaces;

public class NewCustomerPageUI {

	public static final String TXB_CUSTOMER_NAME = "//input[@name='name']";
	public static final String MSG_CUSTOMER_NAME_ERROR = "//input[@name='name']//following-sibling::label[@id='message']";
	public static final String RDB_MALE = "//input[@value='m']";
	public static final String RDB_FEMALE = "//input[@value='f']";
	public static final String TXB_BIRTHDAY = "//input[@id='dob']";
	public static final String MSG_BIRTHDAY_ERROR = "//input[@id='dob']//following-sibling::label[@id='message2']";
	public static final String TXB_ADDRESS = "//textarea[@name='addr']";
	public static final String MSG_ADDRESS_ERROR = "//textarea[@name='addr']//following-sibling::label[@id='message3']";
	public static final String TXB_CITY = "//input[@name='city']";
	public static final String MSG_CITY_ERROR = "//input[@name='city']//following-sibling::label[@id='message4']";
	public static final String TXB_STATE = "//input[@name='state']";
	public static final String MSG_STATE_ERROR = "//input[@name='state']//following-sibling::label[@id='message5']";
	public static final String TXB_PIN = "//input[@name='pinno']";
	public static final String MSG_PIN_ERROR = "//input[@name='pinno']//following-sibling::label[@id='message6']";
	public static final String TXB_TELEPHONE = "//input[@name='telephoneno']";
	public static final String MSG_TELEPHONE_ERROR = "//input[@name='telephoneno']//following-sibling::label[@id='message7']";
	public static final String TXB_EMAIL = "//input[@name='emailid']";
	public static final String MSG_EMAIL_ERROR = "//input[@name='emailid']//following-sibling::label[@id='message7']";
	public static final String TXB_PASSWORD = "//input[@name='password']";
	public static final String MSG_PASSWORD_ERROR = "//input[@name='password']//following-sibling::label[@id='message8']";
	public static final String BTN_SUBMIT = "//input[@name='sub']";
	public static final String BTN_RESET = "//input[@name='res']";
	public static final String MSG_SUCCESSFUL = "//table[@id='customer']//p[@class='heading3']";
	public static final String TXT_CUSTOMER_ID = "//td[text()='Customer ID']//following-sibling::td";
	
}
