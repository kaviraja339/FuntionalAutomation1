package com.automatinpractice.extendReportlistiener;

import com.automationpractice.utilities.ScreenshotUtils;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public final class ExtendLogger {
	
	private ExtendLogger() {}
	
	public static void pass(String message) {
		ExtendManager.getExtentTest()
		.pass(message,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
	}
	
	public static void passla(String message) {
		ExtendManager.getExtentTest().log(Status.PASS, message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
	}
	
	public static void fail(String message) {
		ExtendManager.getExtentTest()
		.fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
	}
	
	public static void skip(String message) {
		ExtendManager.getExtentTest().skip(message);
	}
	
	public static void info(String message) {
		ExtendManager.getExtentTest().info(message);
	}

}
