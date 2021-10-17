package com.automatinpractice.extendReportlistiener;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtendReport {
	
	public static ExtentReports extent;
	
	public static void startReport(){
	
		if(Objects.isNull(extent)) {
			extent = new ExtentReports();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
			Date date = new Date(System.currentTimeMillis());
			String ReportTime = formatter.format(date);
			ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user+dir") + "/ExtentReport/ExtentReport"+ReportTime+".html");
			spark.config().setTheme(Theme.DARK);
			spark.config().setReportName("Automation Parctice");
			spark.config().setDocumentTitle("Automation Testing");
			extent.attachReporter(spark);
		}
	}
	
	public static void endReport() {
		if(Objects.nonNull(extent)) {
		 extent.flush();
		 ExtendManager.unloadExtentReport();
		}
	}
	
	public static void createTest(String testcasename) {
		ExtendManager.setExtendTest(extent.createTest(testcasename));
	}
}
