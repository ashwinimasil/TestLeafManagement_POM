package pages;

import org.openqa.selenium.By;

import baseclass.ParentClass;

public class MyLeadsPage extends ParentClass {
	public MyLeadsPage clickLeads() {
		driver.findElement(By.xpath(prop.getProperty("myleads_linkText"))).click();
		return this;
}
	public MyLeadsPage myLeads() {
		driver.findElement(By.xpath(prop.getProperty("createlead"))).click();
		return this;
}
	
}
