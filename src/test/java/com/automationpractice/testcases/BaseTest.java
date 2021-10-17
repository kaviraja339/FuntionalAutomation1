package com.automationpractice.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationpractice.driver.Driver;
import com.automationpractice.utilities.ReadConfig;

public class BaseTest {
	
	
	ReadConfig config = new ReadConfig();
	
	@BeforeMethod
	public void launchBrowser()
	{
		Driver.initBrowser();
	}
	
	@AfterMethod
	public void teardown()
	{
		Driver.tearDownBrowser();
	}
		
	

}
