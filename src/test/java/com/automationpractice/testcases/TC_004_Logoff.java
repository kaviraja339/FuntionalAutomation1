package com.automationpractice.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automationparctice.pages.HomePage;
import com.automationparctice.pages.LoginPage;

public class TC_004_Logoff extends BaseTest{
	
	@Test
	public void Validate_TC_004_Logoff() throws InterruptedException, IOException {
		
		HomePage home = new HomePage();
		LoginPage login = new LoginPage();
		
		home
		.click_Singin_Button();
		login
		.enter_USername_Email()
		.enter_password()
		.click_login()
		.verify_loggedin_screen()
		.Click_SignoutButton()
		.Verify_Signout_Screen();
	}

}
