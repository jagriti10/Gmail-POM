package gmail.PageFunction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import gmail.ObjectRepository.LandingPageGmailOR;

public class LandingPageGmail extends LandingPageGmailOR {
	WebDriver driver = null;
	
	public LandingPageGmail() {
		PageFactory.initElements(driver, this);
		}
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();	
		}
	
	public SigninGmail clickOnNext() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", lsignin);
		return new SigninGmail();
	    }
	
}
