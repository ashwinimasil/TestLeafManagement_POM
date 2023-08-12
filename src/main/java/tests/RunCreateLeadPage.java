package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.PageSpecificMethods;
import pagesinmyleads.LoginPage;

public class RunCreateLeadPage extends PageSpecificMethods {
	
	@BeforeTest
	public void setValues() 
	{
		excelFileName = "CreateLead";
	}
	@Test(dataProvider ="sendData")
	public void runVerifyLogin(String CName, String FName, String LName) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName()
		.password()
		.clickSubmit()
		.clickCRMSFALink()
		.clickLeads()
		.createLead()
		.companyName(CName)
		.firstName(FName)
		.lastName(LName)
		.phoneNumber()
		.submitButton();
		System.out.println("CreateLead success");
	}
}