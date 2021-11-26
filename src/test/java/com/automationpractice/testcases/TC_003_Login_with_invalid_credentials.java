package com.automationpractice.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automationparctice.pages.HomePage;
import com.automationparctice.pages.LoginPage;

public class TC_003_Login_with_invalid_credentials extends BaseTest{
	
	
	@Test
	public void Validate_TC_003_Login_with_invalid_credentials() throws InterruptedException, IOException {
		
		HomePage home = new HomePage();
		LoginPage login = new LoginPage();
		
		home
		.click_Singin_Button();
		login
		.enter_Invalid_USername_Email()
		.enter_Invalid_password()
		.click_login()
		.verify_loggedin_screen();
		
	}

}
