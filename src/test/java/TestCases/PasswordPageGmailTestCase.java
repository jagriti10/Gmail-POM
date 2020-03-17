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
		pswdTest=new PasswordGmail();
		signin= new SigninGmail();
		signin.siginInput(prop.getProperty("username"));
		signin.clickOnNext();
		 
	}
	
	@Test(priority=1)
	public void verifyTitle() {
		String PasswordPageTitle=  pswdTest.verifyPasswordPageTitle();
		Assert.assertEquals(PasswordPageTitle,"Sign in – Google accounts","Password page title not matched");
	}
	
	@Test(priority=2)
	public void verifyPassTyped(){
		 pswdTest.pswdInput(prop.getProperty("password"));
		 Assert.assertTrue(pswdTest.verifyCorrectPass());
	}
	
	@Test(priority=3)
	public void verifyClickOnNextLink() {
		pswdTest.clickOnNext();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}	
	
}
