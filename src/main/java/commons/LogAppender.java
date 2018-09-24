package commons;

import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.AppenderSkeleton;
import org.testng.Reporter;

/**
 * @author daoletung
 * TestNG requires a call to Reporter.log to insert logging statements into the report
 */
public class LogAppender extends AppenderSkeleton{
	
	@Override
	protected void append(LoggingEvent event) {
		Reporter.log(getLayout().format(event));
	}
	
	public void close() {
		Reporter.log("Logging appender is closed");
	}

	public boolean requiresLayout() {
		return true;
	}
	
	/**
	 * Insert log message into reportNG
	 * @param logMessage
	 */
	public void info(String logMessage) {
		Reporter.log(logMessage);
	}
}
