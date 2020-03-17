package gmail.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configManager.testBase;

public class PasswordGmailOR extends testBase {
	public PasswordGmailOR() {	
		  PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//title")
	protected WebElement title;
	
	public WebElement getTitle() {
		return title;
	}

	public void setTitle(WebElement title) {
		this.title = title;
	}
	@FindBy(name="password")
	protected WebElement typePass;
	
	@FindBy(id="passwordNext")
	protected WebElement passNext;

}
