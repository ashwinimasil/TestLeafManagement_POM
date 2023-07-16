package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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
	public ExtentReports extent;
	 public String testName;
	 public String testDescription;
      public String testCategory;
      public String testAuthor;
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		// to keep the report history
		reporter.setAppendExisting(true);
		// Step2: Create object for ExtentReports
		extent = new ExtentReports();
		// Step3: attach the data with physical file
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testCaseDetails(){
		ExtentTest test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);			
		
	}
	
	@Parameters({"Browser"})
	@BeforeMethod
	public void precondition(String BrowserName) throws InterruptedException {
		/*Method1:
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}
				
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--disable-notifications"); driver = new
		 * ChromeDriver(options);
		 */
		//Method 2
		switch(BrowserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		}
		switch (BrowserName) {
		case "Edge":
			driver = new EdgeDriver();
			break;
		}
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void close() 
	{
		driver.quit();
	}
	@DataProvider(indices=0)
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcel(excelFileName);
	}
	
}