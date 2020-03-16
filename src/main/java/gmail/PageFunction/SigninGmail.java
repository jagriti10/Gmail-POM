package gmail.PageFunction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import gmail.ObjectRepository.SigninGmailOR;


public class SigninGmail extends SigninGmailOR {
	
	public SigninGmail() {
		PageFactory.initElements(driver, this);
	}

	public void siginInput(String em){
		typeEmail.sendKeys(em);
		//emailnext.click();
							}
	
	public PasswordGmail clickOnNext() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", emailNext);
	return new PasswordGmail();
	}
	
	public boolean verifyCorrectEmail() {
		return typeEmail.isDisplayed();
			}
}