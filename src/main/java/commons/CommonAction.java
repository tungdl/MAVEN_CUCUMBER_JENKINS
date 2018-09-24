package commons;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class CommonAction {

	protected final Logger log;
	
	protected CommonAction() {
		log = Logger.getLogger(getClass());
	}
	
	/**
	 * Print log with type is info
	 * 
	 * @param message
	 */
	public void logInfo(String message) {
		log.info("[INFO] " + message);
	}

	/**
	 * Print log with type is warning
	 * 
	 * @param message
	 */
	public void logWarning(String message) {
		log.warn("[WARNING] " + message);
	}

	/**
	 * Print log with type is error
	 * 
	 * @param message
	 */
	public void logError(String message) {
		log.error("[ERROR] " + message);
	}

	/**
	 * Print log with type is fatal
	 * 
	 * @param message
	 */
	public void logFatal(String message) {
		log.fatal("[FATAL] " + message);
	}

	/**
	 * Print log with type is debug
	 * 
	 * @param message
	 */
	public void debug(String message) {
		log.debug("[DEBUG] " + message);
	}

	/**
	 * Print log with type is pass
	 * 
	 * @param message
	 */
	public void logPass(String message) {
		log.info("[PASSED] " + message);
	}

	/**
	 * Print log with type is fail
	 * 
	 * @param message
	 */
	public void logFail(String message) {
		log.info("[FAILED] " + message);
	}

	public int randomNumber() {
		Random random = new Random();
		int number = random.nextInt(999999);
		return number;
	}
	
	public void wait(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			logWarning(e.getMessage());
		}
	}

	public String getCurrentDateTime() {
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		return timeStamp;
	}

	public String generateUniqueValue() {
		String uniqueValue = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
		return uniqueValue;
	}
}
