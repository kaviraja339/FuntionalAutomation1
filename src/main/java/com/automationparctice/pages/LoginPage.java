package com.automationparctice.pages;


import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automatinpractice.extendReportlistiener.ExtendLogger;
import com.automationpractice.commons.TestScriptHandler;
import com.automationpractice.driver.DriverManager;
import com.automationpractice.utilities.CommonUtil;
import com.automationpractice.utilities.ExcelUtil;
import com.automationpractice.utilities.ReadConfig;

public class LoginPage extends TestScriptHandler{
	
	@FindBy(id = "email") WebElement email_Textbox;
	@FindBy(id = "passwd") WebElement password_Textbox;
	@FindBy(id = "SubmitLogin") WebElement Login_Button;
	@FindBy(xpath = "//a[@title='Log me out']") WebElement signOut_Button;
	
	
	ReadConfig config = new ReadConfig();
	List<Map<String,String>> map = ExcelUtil.getTestDataInMap();
	
	Map<String, String[]> newmap = CommonUtil.readdata();
	
	public LoginPage() throws IOException {
		PageFactory.initElements(DriverManager.getDriver(), this);	
	}
	
	
//	public LoginPage enter_USername_Email() {
//		sendkeys_custom(email_Textbox, "Email Textbox", config.getusername());
//		return this;
//	}
	public LoginPage enter_USername_Email() {
		sendkeys_custom(email_Textbox, "Email Textbox", map.get(0).get("Username"));
		return this;
	}
	
	public LoginPage enter_password() {
		sendkeys_custom(password_Textbox, "Password Textbox", map.get(0).get("Password"));
		return this;
	}
	public LoginPage enter_Invalid_USername_Email() {
		sendkeys_custom(email_Textbox, "Email Textbox", config.getInvalidusername());
		return this;
	}
	
	public LoginPage enter_Invalid_password() {
		sendkeys_custom(password_Textbox, "Password Textbox", config.getInvalidPassword());
		return this;
	}
	
	public LoginPage click_login() {
		click_custom(Login_Button, "Login Button");
		return this;
	}
	
	public LoginPage verify_loggedin_screen() {
		
		DriverManager.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = DriverManager.getDriver().getTitle();
		String expected = "My account - My Store";
		if(title.equals(expected)){
			ExtendLogger.pass("Logged in successfully");
		}
		else {
			ExtendLogger.fail("Can't able to logged in.Please try again");
		}
		return this;
	}
	
	public LoginPage Click_SignoutButton() {
		click_custom(signOut_Button, "Signout Button");
		return this;
		
	}
	
	public LoginPage Verify_Signout_Screen() {
		
		String expected = "Login - My Store";
		String actual = DriverManager.getDriver().getTitle();
		if(actual.equals(expected)){
			ExtendLogger.pass("sign out successfully");
		}
		else {
			ExtendLogger.fail("Can't able to sign out.Please try again");
		}
		return this;
		
	}
}
