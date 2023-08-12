package pagesinmyleads;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PageSpecificMethods;

public class DuplicateLeadPage extends PageSpecificMethods {
	public DuplicateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public CreateLeadPage clickCreateLeadButton() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return new CreateLeadPage(driver);
	}
	
}
