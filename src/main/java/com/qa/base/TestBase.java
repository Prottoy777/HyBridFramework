package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.ConfigureUtility;

public class TestBase {

	public static WebDriver driver;	
	static String mainDir= System.getProperty("user.dir");
	static String driverPath=mainDir+"/driver/chromedriver.exe";
	public static ConfigureUtility config=new ConfigureUtility();
	
	
	@BeforeClass
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		ConfigureUtility.getApplicationURL();
	}
	
	public static WebDriver getDriver() {

		return driver;	
	}
	
	
	@AfterClass
	
	public void tearDown() {
		//driver.close();
	}
	

	
}
