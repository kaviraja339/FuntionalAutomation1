package com.automationparctice.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BasePage {
	static ExtentReports extent;
	public static ExtentTest logger;
//	public static ExtentTest startReport(String classname) {
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
//		Date date = new Date(System.currentTimeMillis());
//		String ReportTime = formatter.format(date);
//		extent = new ExtentReports(System.getProperty("user.dir")+"/src/test/resources/ExtentReport/ExtentReport"+ReportTime+".html");
//		return  logger = extent.startTest(classname);
//	}
//	
//	public static void endReport() {
//		extent.endTest(logger);
//		extent.flush();
//	}
//	

}
