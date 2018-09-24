package interfaces;

public class FundTransferPageUI {
	
	public static final String TXB_PAYER_ACCOUNT_ID = "//input[@name='payersaccount']";
	public static final String TXB_PAYEE_ACCOUNT_ID = "//input[@name='payeeaccount']";
	public static final String TXB_AMOUNT = "//input[@name='ammount']";
	public static final String TXB_DESCRIPTION = "//input[@name='desc']";
	public static final String BTN_SUBMIT = "//input[@name='AccSubmit']";
	public static final String TXT_CURRENT_BALANCE = "//td[text()='Amount']/following-sibling::td";
	public static final String MSG_TRANSFER_DETAILS = "//table[@class='layout']//p[@class='heading3']";

}
