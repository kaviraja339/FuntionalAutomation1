package com.automatinpractice.extendReportlistiener;

import com.aventstack.extentreports.ExtentTest;

public class ExtendManager {
	
	private ExtendManager() {}
	
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	public static ExtentTest getExtentTest() {
		return test.get();
	}
	
	public static void setExtendTest(ExtentTest extendtest) {
		test.set(extendtest);
	}
	
	public static void unloadExtentReport() {
		test.remove();
	}

}
