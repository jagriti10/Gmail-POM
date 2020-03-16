package gmail.PageFunction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import gmail.ObjectRepository.PasswordGmailOR;

public class PasswordGmail extends PasswordGmailOR {
	public PasswordGmail() {
		PageFactory.initElements(driver, this);
	}
   public String verifyPasswordPageTitle() {
	return driver.getTitle();
}
	public void inputPass(String em){
	typePass.sendKeys(em);
	//next.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",passNext);
	}
	
}
