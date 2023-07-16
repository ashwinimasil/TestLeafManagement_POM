package pagesinmyleads;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PageSpecificMethods;

public class DuplicateLeadPage extends PageSpecificMethods {
	public DuplicateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public DuplicateLeadPage companyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
	}

	public DuplicateLeadPage firstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		return this;
	}

	public DuplicateLeadPage lastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
		return this;
	}

	public CreateLeadPage clickDuplicateLeadButton() {
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		return new CreateLeadPage(driver);
	}
	
}
