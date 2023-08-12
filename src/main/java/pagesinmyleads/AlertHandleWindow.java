package pagesinmyleads;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PageSpecificMethods;

public class AlertHandleWindow extends PageSpecificMethods {
	
	public AlertHandleWindow(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public ViewLeadsPage alertHandle() {
		driver.switchTo().alert();
		Alert ex = driver.switchTo().alert();
		System.out.println(ex.getText());
		ex.accept();
		return new ViewLeadsPage(driver);
}
}
