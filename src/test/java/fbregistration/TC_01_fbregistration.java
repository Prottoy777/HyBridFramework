package fbregistration;

import com.qa.applicationpage.FacebookRegistration;
import com.qa.base.TestBase;
import org.testng.annotations.Test;

public class TC_01_fbregistration extends TestBase {
	FacebookRegistration fb;

	
	
	@Test
	public void captureMessage() {
		fb=new FacebookRegistration();
		fb.captureLandingMessg();
	}
	
	@Test 
	public void clickOnACCT() {
		fb=new FacebookRegistration();
		fb.clickOnCreateAccount();
	}

	@Test 
	public void verifyTitle2() {
		fb.verifyTitle2();
	}

	
	@Test
	public void setUserFName() {
		fb.setUserFName();
	}
	
	@Test
	public void setUserLastName() {
		fb.setUselName();
	}
	
	@Test
	public void setMobileN() {
		fb.setUseMobileN();
	}
	
	@Test
	public void setUserPassword() {
		fb.setUserPassword ("data");
	}
	@Test
	public void setBirthMonth() {
		fb.setBirthMonth();
	}
	@Test
	public void setBirthDay() {
		fb.setBirthDay();
	}
	@Test
	public void setUserYear() {
		fb.setUserYear();
	}
	//@Test
	//public void setGender() {
		//fb.setGender();
	//}
	}
