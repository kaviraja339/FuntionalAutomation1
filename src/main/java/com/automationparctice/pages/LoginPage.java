package com.automationparctice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "email") WebElement email_Textbox;
	@FindBy(id = "passwd") WebElement paasword_Textbox;
	@FindBy(id = "SubmitLogin") WebElement Login_Button;

}
