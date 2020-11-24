package Commmonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class HelperMethods extends TestBase {
	
	
	
	public String verifyTitle() {
		return driver.getTitle();	
	}
	
	
	public String captureMessage(WebElement element ) {
		//driver.findElement(By.xpath("")).getText();
		String text=element.getText();
		return text;	
	}
		
	public WebElement clickOnLink(WebElement element) {
		return 	element;
	}
	
	public boolean enterInputField(WebElement element, String data) {
		element.sendKeys(data);
		return true;
		
	}
		
}

