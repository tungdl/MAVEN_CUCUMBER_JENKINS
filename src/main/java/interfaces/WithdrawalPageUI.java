package interfaces;

public class WithdrawalPageUI {
	
	public static final String TXB_ACCOUNT_NO = "//input[@name='accountno']";
	public static final String TXB_AMOUNT = "//input[@name='ammount']";
	public static final String TXB_DESCRIPTION = "//input[@name='desc']";
	public static final String BTN_SUBMIT = "//input[@name='AccSubmit']";
	public static final String TXT_CURRENT_BALANCE = "//td[text()='Current Balance']/following-sibling::td";
	public static final String MSG_TRANSACTION_DETAILS_OF_WITHDRAW = "//table[@id='withdraw']//p[@class='heading3']";

}
