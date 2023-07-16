package pages;

import org.openqa.selenium.By;

import baseclass.ParentClass;

public class HomePage extends ParentClass {
	public MyLeadsPage clickLeads() {
		
		driver.findElement(By.linkText(prop.getProperty("MyHomePage_CreateLead_MyLeads"))).click();
		return new MyLeadsPage();
}
	
}