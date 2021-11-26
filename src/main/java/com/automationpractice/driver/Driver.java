package com.automationpractice.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automationpractice.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Driver {
	
	private Driver() {};
	
	public static void initBrowser(){
		ReadConfig config = new ReadConfig();
		String browser = config.getBrowserType().toLowerCase();
		if(Objects.isNull(DriverManager.getDriver())) {
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				DriverManager.setDriver(new ChromeDriver());
			}
			else if(browser.equalsIgnoreCase("edge")){
				WebDriverManager.edgedriver().setup();
				DriverManager.setDriver(new EdgeDriver());
			}
			else if(browser.equalsIgnoreCase("ie")){
				WebDriverManager.iedriver().setup();
				DriverManager.setDriver(new InternetExplorerDriver());
			}
			else
			{
				System.out.println("Can't able to initiate the browser");
			}
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().get(config.getApplicationURL());
		}
		
	}
	
	public static void tearDownBrowser() {
		DriverManager.getDriver().quit();
	}

}
