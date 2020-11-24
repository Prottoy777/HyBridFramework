package com.qa.applicationpage;

import org.openqa.selenium.support.PageFactory;


import com.qa.base.TestBase;

import Commmonmethods.HelperMethods;

public class LoginPage extends TestBase {
	
	
	HelperMethods hpm;
	public LoginPage() {
		PageFactory.initElements(driver, this);
		hpm=new HelperMethods();
	
	}
	

}
