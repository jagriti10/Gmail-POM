package gmail.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configManager.testBase;

public class LandingPageGmailOR extends testBase {
	protected WebDriver driver;
	

	public LandingPageGmailOR() {
	  PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(xpath ="//title")//Gmail - Email from Google
	  protected WebElement title;
	 
	 public WebElement getTitle() {
		return title;
	}

	public void setTitle(WebElement title) {
		this.title = title;
	}

	@FindBy(xpath="//a[contains(text(),'Sign in']")
	 protected WebElement lsignin;

}
