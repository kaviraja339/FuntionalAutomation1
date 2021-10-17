package com.automationpractice.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	private DriverManager() {}
	
	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	
	public static void setDriver(WebDriver webdrivr) {
		dr.set(webdrivr);
	}
	
	public static void unloaddriver() {
		dr.remove();
	}

}
