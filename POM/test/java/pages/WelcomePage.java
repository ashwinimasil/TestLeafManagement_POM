package pages;

import org.openqa.selenium.By;

import baseclass.ParentClass;

public class WelcomePage extends ParentClass{
	
	public HomePage clickCRMSFALink() 
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}
	
	
}

