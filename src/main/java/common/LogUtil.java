package common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
	
	public static void debug(String loggerName, String msg) {
		getLogger(loggerName).debug(msg);
	}

	public static void info(String loggerName, String msg) {
		getLogger(loggerName).info(msg);
	}

	private static Logger getLogger(String loggerName) {
		return LoggerFactory.getLogger(loggerName);
	}
}
