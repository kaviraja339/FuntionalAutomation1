package com.automationpractice.practicepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationparctice.pages.BasePage;
import com.automationpractice.commons.TestScriptHandler;
import com.automationpractice.driver.DriverManager;



public class HomePages extends TestScriptHandler{
	
	@FindBy(xpath = "//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']") 
	WebElement three_sliders;
	
	private By three_sliderss = By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']");
	
	public HomePages() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public HomePages verify_three_sliders_in_homepage() {
		
		int i = DriverManager.getDriver().findElements(three_sliderss).size();
		System.out.println(i);
		return this;	
	}

}
