package pagesinmyleads;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PageSpecificMethods;

public class WelcomePage extends PageSpecificMethods{
	
	public WelcomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public HomePage clickCRMSFALink() 
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}
	
	
}

