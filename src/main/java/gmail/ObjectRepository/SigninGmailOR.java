package gmail.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configManager.testBase;

public class SigninGmailOR extends testBase {
	
	public SigninGmailOR() {
		  PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="identifierId")
	protected WebElement typeEmail;
	
	@FindBy(id="identifierNext")
	protected WebElement emailNext;
}
