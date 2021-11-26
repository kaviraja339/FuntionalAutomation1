package com.automationpractice.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automationparctice.pages.HomePage;
import com.automationparctice.pages.LoginPage;
import com.automationparctice.pages.Searchscreen;
import com.automationparctice.pages.UserHomeScreen;

public class TC_005_Searach_keyword extends BaseTest{
	
	
	@Test
	public void validate_TC_005_Searach_keyword() throws InterruptedException, IOException {
		
		HomePage home = new HomePage();
		LoginPage login = new LoginPage();
		UserHomeScreen userhome = new UserHomeScreen();
		Searchscreen search = new Searchscreen();
		
		home
		.click_Singin_Button();
		login
		.enter_USername_Email()
		.enter_password()
		.click_login()
		.verify_loggedin_screen();
		userhome
		.enter_Keyword_in_Searchfield()
		.click_Search_Button();
		search
		.Verify_Cotton_Search_Result();
		//Selectmanufacturer
//		.select_Manufacturer_Dropdown();
		login
		.Click_SignoutButton();
	}

}
