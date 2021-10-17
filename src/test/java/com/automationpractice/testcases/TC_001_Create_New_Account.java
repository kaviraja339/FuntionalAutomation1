package com.automationpractice.testcases;

import org.testng.annotations.Test;

import com.automatinpractice.extendReportlistiener.ExtendLogger;
import com.automationparctice.pages.HomePage;

public class TC_001_Create_New_Account extends BaseTest{
	
	@Test(description = "Verify Create new Account")
	public void Create_New_Account() throws InterruptedException
	{
		ExtendLogger.info("Verify Create a New Account in Automation practice.com");
		HomePage home = new HomePage();
		
		home
		.click_Singin_Button()
		.enter_Email()
		.click_Create_an_Account()
		.click_Gender_Radiobutton()
		.enter_firstname()
		.enter_lastName()
		.enter_Password()
		.enter_address_FirstName()
		.enter_addree_lastName()
		.enter_Address()
		.enter_City()
		.select_State()
		.enter_Postcode()
		.select_Country()
		.enter_mobile()
		.click_Register_Button();
		
		Thread.sleep(5000);
	}
	

}
