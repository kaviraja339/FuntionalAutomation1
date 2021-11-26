package com.automationpractice.utilities;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

public class LogUtil {
	
	public static Logger log = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName) {
		log.info("================================="+sTestCaseName+"TEST START+===========================");
	}
	
	public static void endTestCas(String sTestCaseName) {
		log.info("================================="+sTestCaseName+"TEST END+===========================");
	}
	
	public static void info(String messae) {
		log.info(messae);
	}
	
	public static void warn(String message) {
		log.warn(message);
	}
	
	public static void error(String message) {
		log.error(message);
	}
	
	public static void fatal(String message) {
		log.fatal(message);
	}
	
	

}
