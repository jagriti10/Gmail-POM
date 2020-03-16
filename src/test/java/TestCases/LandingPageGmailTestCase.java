package TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import configManager.testBase;
import gmail.PageFunction.LandingPageGmail;
import gmail.PageFunction.PasswordGmail;
import gmail.PageFunction.SigninGmail;

public class LandingPageGmailTestCase extends testBase{
	LandingPageGmail LandingPageGmail;
	SigninGmail signin;
	public LandingPageGmailTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		LandingPageGmail = new LandingPageGmail();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() throws InterruptedException{
		String title = LandingPageGmail.validateLoginPageTitle();
		Assert.assertEquals(title, "Gmail - Email from Google");
	}
	@Test(priority=2)
	public SigninGmail verifyClickOnNextLink() {
		signin=LandingPageGmail.clickOnNext();
		return signin;
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}

