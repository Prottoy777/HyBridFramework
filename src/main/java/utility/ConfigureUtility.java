package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.base.TestBase;

public class ConfigureUtility extends TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public ConfigureUtility () { 
		try{
			prop=new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") +"/src/main/resources/cofig.properties");	
					prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace(); //
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
      
	
	public static  String getApplicationURL() {
		
		String url=prop.getProperty("url");
		System.out.println(url);
		return url;
	
	}
	
	public static String getChromeBrowserPath() {

		String url = prop.getProperty("chrome_driver_path");
		System.out.println(url);
		return url;
	}
	public String getDBUrlPath() {
		String dbpath=prop.getProperty("databese_connection_path");
		return dbpath;
	}
	
	}

	

