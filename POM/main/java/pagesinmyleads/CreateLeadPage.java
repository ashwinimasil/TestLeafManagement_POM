package pagesinmyleads;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.PageSpecificMethods;

public class CreateLeadPage extends PageSpecificMethods{
	
	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public CreateLeadPage companyName(String CName ) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CName);
	return this;
	}
	public CreateLeadPage  firstName(String FName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FName);
	return this;
	}
	public CreateLeadPage lastName(String LName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LName);
	return this;
	}
	
	public CreateLeadPage phoneNumber() {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	return this;
	}
	
	public ViewLeadsPage submitButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadsPage(driver);
}

}
