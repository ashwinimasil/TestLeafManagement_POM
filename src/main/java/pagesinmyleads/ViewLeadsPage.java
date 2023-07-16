package pagesinmyleads;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PageSpecificMethods;

public class ViewLeadsPage extends PageSpecificMethods {
	public ViewLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public ViewLeadsPage verifyLeadCreated() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
		return new ViewLeadsPage(driver);
	}
	public DuplicateLeadPage clickDuplicateButton() {
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		return new DuplicateLeadPage(driver);
	}
	public EditLeadPage editButtonClick() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		return new EditLeadPage(driver);
	}
	public MyLeadsPage deleteButtonClick() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		return new MyLeadsPage(driver);
	}
}