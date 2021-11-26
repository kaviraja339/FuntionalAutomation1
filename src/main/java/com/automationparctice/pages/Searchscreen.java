package com.automationparctice.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automatinpractice.extendReportlistiener.ExtendLogger;
import com.automationpractice.driver.DriverManager;
import com.automationpractice.utilities.ExcelUtil;

public class Searchscreen {
	
	List<Map<String,String>> map = ExcelUtil.getTestDataInMap();
	
	private By cotton_Search_Result = By.xpath("//div[@class='product-container']");
	private By maufacturer_Dropdown = By.xpath("//select[@name='manufacturer_list']");	
	
	public Searchscreen Verify_Cotton_Search_Result() {
		
		int expected = 3;
		int actual = DriverManager.getDriver().findElements(cotton_Search_Result).size();
		if(expected == actual) {
			ExtendLogger.pass("Cotton search results verified successfully");
		}
		else
		{
			ExtendLogger.fail("Something went wrong unable to verify the cotton search result");
		}
		return this;	
	}
	
	public Searchscreen select_Manufacturer_Dropdown() {
//		DriverManager.getDriver().findElement(maufacturer_Dropdown).click();
		Select dropdown = new Select(DriverManager.getDriver().findElement(maufacturer_Dropdown));
		dropdown.selectByVisibleText(map.get(4).get("Manufacture"));
		return this;
		
	}
	
}
