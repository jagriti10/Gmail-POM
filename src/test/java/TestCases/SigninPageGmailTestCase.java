package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configManager.testBase;
import gmail.PageFunction.PasswordGmail;
import gmail.PageFunction.SigninGmail;

public class SigninPageGmailTestCase extends testBase {
	SigninGmail signin;
	PasswordGmail pswd;
	public SigninPageGmailTestCase() {
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		signin= new SigninGmail();	
	}
	
	@Test(priority=1)
	public void verifyEmailTyped(){
		signin.siginInput(prop.getProperty("username"));
		Assert.assertTrue(signin.verifyCorrectEmail());
	}
	
	@Test(priority=2)
	public PasswordGmail verifyClickOnNextLink() {
		pswd=signin.clickOnNext();
		return pswd;
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}

