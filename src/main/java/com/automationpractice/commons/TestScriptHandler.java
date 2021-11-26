package com.automationpractice.commons;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;

import com.automatinpractice.extendReportlistiener.ExtendLogger;
import com.automationparctice.pages.BasePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestScriptHandler extends BasePage{
	
	
	
	public void sendkeys_custom(WebElement element, String fieldName, String valueToBeSent){
	try {
		element.sendKeys(valueToBeSent);
		ExtendLogger.pass("Entered the "+valueToBeSent+" in "+fieldName+ " Successfully");
		
	} catch (Exception e) {

		ExtendLogger.fail("Something went wrong unable to entered the values in "+fieldName+" due to exception: "+e);;
	}	
	}
	
	public void click_custom(WebElement element, String fieldName) {
		try {
			element.click();
			ExtendLogger.pass("Clicked on "+fieldName+" successfully");
//			ExtendLogger.passla("Clicked on "+fieldName+" successfully");
			
//			logger.log(LogStatus.PASS, "Clicked on "+fieldName+" successfully");
		
		} catch (Exception e) {
			ExtendLogger.fail("Something went wrong unale to click on "+fieldName+" due to exception: "+e);
//			logger.log(LogStatus.FAIL, "Something went wrong unale to click on "+fieldName+" due to exception: "+e);
		}
		
	}
}
