package com.automationparctice.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.commons.TestScriptHandler;
import com.automationpractice.driver.DriverManager;
import com.automationpractice.utilities.ExcelUtil;

public class UserHomeScreen extends TestScriptHandler{
	List<Map<String, String>> map = ExcelUtil.getTestDataInMap();
	@FindBy(id = "search_query_top") WebElement Search_txtbox;
	@FindBy(name = "submit_search") WebElement search_Button;
	
	public UserHomeScreen() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	public UserHomeScreen enter_Keyword_in_Searchfield() {
		sendkeys_custom(Search_txtbox, "Search TextBox", map.get(4).get("Search_Keyword"));
		return this;
	}
	
	public UserHomeScreen click_Search_Button() {
		click_custom(search_Button, "Search Button");
		return this;
	}
	
	

}
