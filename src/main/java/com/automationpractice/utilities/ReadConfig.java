package com.automationpractice.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro; 
	
	public ReadConfig() 
	{
		File src = new File("./config/config.properties");
		try
		{
			FileInputStream reader = new FileInputStream(src);
			pro = new Properties();
			pro.load(reader);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Something went wrong while reading the config properties");
		}
	}
	
	public String getBrowserType() {
		String BrowserType = pro.getProperty("BrowserType");
		return BrowserType;
		
	}
	
	public String getApplicationURL()
	{
		String applicationurl = pro.getProperty("ApplicationURL");
		return applicationurl;
	}
	
	public String getEmail()
	{
		String email = pro.getProperty("Email");
		return email;	
	}
	
	public String getpassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getfirstName() {
		String firstName = pro.getProperty("firstName");
		return firstName;
	}
	
	public String getlastName() {
		String lastName = pro.getProperty("lastName");
		return lastName;
	}
	
	public String getaddress() {
		String address = pro.getProperty("address");
		return address;
	}
	
	public String getcity() {
		String city = pro.getProperty("city");
		return city;
	}
	
	public String getstate() {
		String state = pro.getProperty("state");
		return state;
	}
	
	public String getcountry() {
		String country = pro.getProperty("country");
		return country;
	}
	
	public String getpostcode() {
		String postcode = pro.getProperty("postcode");
		return postcode;
	}
	public String getmobile() {
		String mobile = pro.getProperty("mobile");
		return mobile;
	}

}
