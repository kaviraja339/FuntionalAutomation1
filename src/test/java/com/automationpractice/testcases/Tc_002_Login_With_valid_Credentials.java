package com.automationpractice.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automationparctice.pages.HomePage;
import com.automationparctice.pages.LoginPage;

public class Tc_002_Login_With_valid_Credentials extends BaseTest{
	
	@Test
	public void  Verify_Login_With_Valid_Credentials() throws InterruptedException, IOException
	{
		HomePage home = new HomePage();
		LoginPage login = new LoginPage();
		
		home
		.click_Singin_Button();
		login
		.enter_USername_Email()
		.enter_password()
		.click_login()
		.verify_loggedin_screen();
		
		Thread.sleep(10000);
	}
}
