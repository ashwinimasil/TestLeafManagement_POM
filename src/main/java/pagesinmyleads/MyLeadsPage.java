package pagesinmyleads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PageSpecificMethods;

public class MyLeadsPage extends PageSpecificMethods {
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public ViewLeadsPage clickLeadToEdit() {
		System.out.println("Element ready to click");
		WebElement SecondLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/following::a)[1]"));
		driver.executeScript("arguments[0].click();", SecondLead);
		System.out.println("Element clicked");
		return new ViewLeadsPage(driver);
	}
	public CreateLeadPage createLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		return new CreateLeadPage(driver);
	}
	public MergeLeadsPage clickMergeLeads() {
		driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
		return new MergeLeadsPage(driver);
	}

}