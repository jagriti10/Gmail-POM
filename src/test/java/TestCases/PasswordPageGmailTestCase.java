package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configManager.testBase;
import gmail.PageFunction.PasswordGmail;
import gmail.PageFunction.SigninGmail;

public class PasswordPageGmailTestCase extends testBase {
	
	PasswordGmail pswdTest;
	SigninGmail signin;
	public PasswordPageGmailTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		signin.siginInput(prop.getProperty("username")); 
	}
	@Test(priority=2)
	public void verifyEmailTyped(){
		 pswdTest.inputPass(prop.getProperty("password"));
	}
	@Test(priority=1)
	public void verifyTitle() {
		String PasswordPageTitle=  pswdTest.verifyPasswordPageTitle();
		Assert.assertEquals(PasswordPageTitle,"Gmail","Password page title not matched");
				
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}	
	
}
