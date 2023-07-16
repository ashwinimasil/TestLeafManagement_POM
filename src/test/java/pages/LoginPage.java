package pages;

import org.openqa.selenium.By;

import baseclass.ParentClass;

public class LoginPage extends ParentClass {

	public LoginPage enterUsername() throws InterruptedException {
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		return this;
		
	}

 public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return this;
	}

    
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}