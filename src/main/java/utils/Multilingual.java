package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multilingual {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/week8/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String uservalue = prop.getProperty("username");
		System.out.println(uservalue);
		String passvalue = prop.getProperty("password");
		System.out.println(passvalue);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys(uservalue);
		driver.findElement(By.id("password")).sendKeys(passvalue);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
		

	}

}
