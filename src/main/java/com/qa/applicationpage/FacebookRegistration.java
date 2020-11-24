package com.qa.applicationpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;

import Commmonmethods.HelperMethods;

public class FacebookRegistration extends TestBase {

	@FindBy(xpath = "//*[@id='content']/div/div/div/div[1]/h2")
	WebElement captureLandingmesg;

	@FindBy(linkText = "Create New Account")
	WebElement clickOnAccount;

	@FindBy(name = "firstname")
	WebElement fname;
	@FindBy(name = "lastname")
	WebElement lname;
	@FindBy(name = "reg_email__")
	WebElement Mobilenumber;
	@FindBy(id = "password_step_input") // -- xpath="//['xpat']"
	WebElement passwordField;
	@FindBy(name="birthday_month")
	WebElement month;
	
	@FindBy(name="birthday_day")
	WebElement day;
	@FindBy(id="year")
	WebElement year;
	

	HelperMethods hpm;

	
	public FacebookRegistration() {
		PageFactory.initElements(driver, this);
		hpm = new HelperMethods();

	}

	public void verifyTitle2() {
		String title = hpm.verifyTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
	}

	public String captureLandingMessg() {
		String text=hpm.captureMessage(captureLandingmesg);
		System.out.println(text);
		return text;
	}

	public void clickOnCreateAccount() {
		hpm.clickOnLink(clickOnAccount).click();
	}

	public void setUserFName() {
		hpm.enterInputField(fname, "Zaman");

	}

	public void setUselName() {
		hpm.enterInputField(lname, "Mohammed");
	}

	public void setUseMobileN() {
		hpm.enterInputField(Mobilenumber, "6784569089");
	}

	public void setUserPassword(String data) {
		hpm.enterInputField(passwordField, data);
	}
	
	public void setBirthMonth() {
		hpm.enterInputField(month, "Feb");
	}
	public void setBirthDay( ) {
		hpm.enterInputField(day, "25");
	}
	
	//public void setUserDay(String data) {
		//hpm.enterInputField(day, data);	
	//}
	public void setUserYear() {
		hpm.enterInputField(year,"2000");
	}
	//public void setGender() {
		//hpm.enterInputField(Gender,"Male");
	//}
		
	
}
