package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.ReadExcel;

public class PageSpecificMethods {
	public RemoteWebDriver driver;
	public String excelFileName;
	public ChromeOptions options;

	@Parameters({ "BrowserName" })
	@BeforeMethod
	public void precondition(String BrowserName) throws InterruptedException {
		options = new ChromeOptions();
		if (BrowserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		} 
		else if (BrowserName.equals("Chrome")) {
			driver = new ChromeDriver(options);
		}
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcel(excelFileName);
	}
}