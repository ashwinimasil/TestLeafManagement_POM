package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ParentClass extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	public static Properties prop;
	/*
	 * public static String uservalue; public static String passvalue;
	 */

	@BeforeMethod
	public void preCondition() throws IOException {
		FileInputStream fis = new FileInputStream("src/test/resources/config_en.properties");
		prop = new Properties();
		prop.load(fis);
		/*
		 * String uservalue = prop.getProperty("username");
		 * System.out.println(uservalue); String passvalue =
		 * prop.getProperty("password"); System.out.println(passvalue);
		 */
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		}

		
		/*
		 * @AfterMethod public void close() { driver.close(); }
		 */
		 

}
