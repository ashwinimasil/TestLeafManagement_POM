package pagesinmyleads;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PageSpecificMethods;

public class EditLeadPage extends PageSpecificMethods {

	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public EditLeadPage companyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf1");
		return this;
	}

	public EditLeadPage firstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja1");
		return this;
	}

	public EditLeadPage lastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi1");
		return this;
	}

	public ViewLeadsPage clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}
}
