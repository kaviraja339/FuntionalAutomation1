package com.automationparctice.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automatinpractice.extendReportlistiener.ExtendLogger;
import com.automationpractice.commons.TestScriptHandler;
import com.automationpractice.driver.Driver;
import com.automationpractice.driver.DriverManager;
import com.automationpractice.utilities.ReadConfig;

public class HomePage extends TestScriptHandler{
	
	ReadConfig config = new ReadConfig();
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signinButton;
	
	@FindBy(xpath ="//input[@name='email_create']") WebElement email_Textbox;
	@FindBy(id = "SubmitCreate") WebElement createanAccountButton;
	@FindBy(id = "id_gender1") WebElement genderRadioButton;
	@FindBy(id = "customer_firstname") WebElement firstNameTextBox;
	@FindBy(id = "customer_lastname") WebElement lastNameTextBox;
	@FindBy(id = "passwd") WebElement passwordTextbox;
	@FindBy(id = "firstname") WebElement address_firstName;
	@FindBy(id = "lastname") WebElement adress_lastName;
	@FindBy(id = "address1") WebElement address_Textbox;
	@FindBy(id = "city") WebElement city_Textbox;
//	@FindBy(id = "id_state") Select state_Dropdown;
//	@FindBy(id = "id_state") WebElement state_Dropdown1;
	private By state_Dropdown = By.id("id_state");
	@FindBy(id = "postcode") WebElement postcode_Textbox;
//	@FindBy(id = "id_country") Select country_Dropdown;
	private By country_Dropdown = By.id("id_country");
	@FindBy(id = "phone_mobile") WebElement mobile_textbox;
	@FindBy(id = "submitAccount") WebElement register_button;
	
	
	
	
	public HomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	
	public HomePage click_Singin_Button() throws InterruptedException {
		click_custom(signinButton, " Sign In Button");
		return this;
	}
	
	public HomePage enter_Email() {
		sendkeys_custom(email_Textbox, "Email Textbox", config.getEmail());
		return this;
		
	}
	
	public HomePage click_Create_an_Account() throws InterruptedException {
		try {
		createanAccountButton.click();
		Thread.sleep(6000);
		ExtendLogger.pass("Click on [Create an Account] Button successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wron can't able to click on [Create an Account] button");
		}
		return this;
	}
	
	public HomePage click_Gender_Radiobutton() {
		try {
		Thread.sleep(5000);
		genderRadioButton.click();
		ExtendLogger.pass("Click on [Gender] RadioButton successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to select the [Gender] RadioButton");
		}
		return this;	
	}
	
	public HomePage enter_firstname() {
		try {
		firstNameTextBox.sendKeys(config.getfirstName());
		ExtendLogger.pass("Entered the values in [First Name] textbox successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went to wrong unable to entered the values in [First Name] Textbox");
		}
		return this;
	}
	
	public HomePage enter_lastName() {
		try {
			lastNameTextBox.sendKeys(config.getlastName());
			ExtendLogger.pass("Entered the values in [Last Name] Textbox successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to entered the values in [LastName] Textbox");
		}
		return this;
	}
	
	public HomePage enter_Password() {
		try {
			passwordTextbox.sendKeys(config.getlastName());
			ExtendLogger.pass("Entered the values in [Password] Textbox successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unabble to entered the values in [Password] Textbox");
		}
		return this;
	}
	
	public HomePage enter_address_FirstName() {
		try {
			address_firstName.sendKeys(config.getfirstName());
			ExtendLogger.pass("Entered the values in Address[FirstName] Textbox successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to entered the values in Address[FristName] Textbox");
		}
		return this;
	}
	
	public HomePage enter_addree_lastName() {
		try {
			adress_lastName.sendKeys(config.getlastName());
			ExtendLogger.pass("Entered the values in Address[LastName] Textbox successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to entered the values in Address[LastName] Textbox");
		}
		return this;
	}
	
	
	public HomePage enter_Address() {
		try {
		address_Textbox.sendKeys(config.getaddress());
		ExtendLogger.pass("Entered the values in Address[Address] Textbox successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to entered the values in Address[Address] Textbox");
		}
		return this;
	}
	
	public HomePage enter_City() {
		try {
		city_Textbox.sendKeys(config.getcity());
		ExtendLogger.pass("Entered the values in Address[City] Textbox successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to entered the values in Address[City] Textbox");
		}
		return this;	
	}
	
	public HomePage select_State() {
		try {
//		state_Dropdown1.click();
		String state = config.getstate();
		System.out.println(state);
//		state_Dropdown.selectByVisibleText(state);	
		DriverManager.getDriver().findElement(state_Dropdown).click();
		Select dropdown = new Select(DriverManager.getDriver().findElement(state_Dropdown));
		dropdown.selectByVisibleText(state);
		ExtendLogger.pass("Selected the values in Address[State] Dropdown successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to selct the values in Address[State] Drodpown");
		}
		return this;
	}
	
	public HomePage enter_Postcode() {
		try {
		postcode_Textbox.sendKeys(config.getpostcode());
		ExtendLogger.pass("Entered the values in Address[PostCode] Textbox successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to entered the values in Address[PostCode] Textbox");
		}
		return this;
	}
	
	public HomePage select_Country() {
		try {
		String country = config.getcountry();
		System.out.println(country);
		DriverManager.getDriver().findElement(country_Dropdown).click();
		Select dropdown = new Select(DriverManager.getDriver().findElement(country_Dropdown));
		dropdown.selectByVisibleText(country);
		ExtendLogger.pass("Selected the values in Address[Country] Dropdown successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to select the values in Address[Country] Drodpown");
		}
		return this;
	}
	
	public HomePage select_Country_zero() {
		String country = config.getcountry();
		System.out.println(country);
		DriverManager.getDriver().findElement(country_Dropdown).click();
		Select dropdown = new Select(DriverManager.getDriver().findElement(country_Dropdown));
		dropdown.selectByIndex(0);
		return this;
	}
	
	public HomePage enter_mobile() {
		try {
		mobile_textbox.sendKeys(config.getmobile());
		ExtendLogger.pass("Entered the values in [Mobile Number] Textbox successfully");
		} catch (Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Something went wrong unable to entered the values in [Mobile Number] Textbox");
		}
		return this;
	}
	
	public HomePage click_Register_Button() {
		
		if(register_button.isDisplayed() && register_button.isEnabled()) {
		try {
		register_button.click();
		ExtendLogger.pass("Click on [Register] Button successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			ExtendLogger.fail("Soemthing went wrong unale to click on [Register] Button");
		}
		}
		else
		{
			ExtendLogger.fail("Register buttuon is not displayed and enabled");
		}
		return this;
	}
}
