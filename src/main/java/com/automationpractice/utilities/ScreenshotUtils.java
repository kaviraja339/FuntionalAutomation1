package com.automationpractice.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.automationpractice.driver.DriverManager;

public class ScreenshotUtils {
	
	public ScreenshotUtils() {}
	
	public static String getBase64Image() {
		String screenshotAs = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
		return screenshotAs;
	}

}
