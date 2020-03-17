package gmail.PageFunction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import gmail.ObjectRepository.SigninGmailOR;


public class SigninGmail extends SigninGmailOR {
	
	public SigninGmail() {
		PageFactory.initElements(driver,this);
	}

	public void siginInput(String em){
		typeEmail.sendKeys(em);
		//emailNext.click();
						}
	
	public PasswordGmail clickOnNext() {
	emailNext.click();
	return new PasswordGmail();
	}
	
	public boolean verifyCorrectEmail() {
	return typeEmail.isDisplayed();
			}
}