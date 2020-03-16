package configManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {
	
		public static WebDriver driver;
		public static Properties prop;
		
		public testBase(){
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream("C:/Users/jagriti.sharma/eclipse-workspace/gmail.pom/test-output/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		public static void initialization(){
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:/Users/jagriti.sharma/selenium/"
						+ "chromedriver/chromedriver.exe");	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "C:/Users/jagriti.sharma/selenium/geckodriver");	
				driver = new FirefoxDriver(); 
			}
			
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
		}


		public static WebDriver getDriver() {
			return driver;
		}


		public static void setDriver(WebDriver driver) {
			testBase.driver = driver;
		}


			
		
		
		
		
		
		
		

	}


