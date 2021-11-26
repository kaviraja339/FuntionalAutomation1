package com.automationpractice.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.automationparctice.pages.BasePage;
import com.automationpractice.driver.Driver;
import com.automationpractice.utilities.ReadConfig;

public class BaseTest extends BasePage{
	
	
	ReadConfig config = new ReadConfig();
	
	
	@BeforeSuite
	public void  beforeSuite() {
//		DOMConfigurator.configure("log4j.xml");
	}
	
	@BeforeClass
	public void beforeTest() {
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		Driver.initBrowser();
	}
	
	@AfterMethod
	public void teardown()
	{
//		
	}
	
	@AfterClass
	public void afterClass() {
		
	}
	
	@AfterSuite
	public void aftersuite() {
		Driver.tearDownBrowser();
	}
		
	

}
