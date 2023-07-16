package pagesinmyleads;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PageSpecificMethods;

public class HomePage extends PageSpecificMethods {
	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
}
	
}