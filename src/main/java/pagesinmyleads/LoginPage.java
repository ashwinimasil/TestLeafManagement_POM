package pagesinmyleads;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PageSpecificMethods;

public class LoginPage extends PageSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public LoginPage enterUserName() 
	{
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
		
	}
	public LoginPage password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage clickSubmit() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
		
	}
	
