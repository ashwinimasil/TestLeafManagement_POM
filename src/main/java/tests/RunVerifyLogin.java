package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.PageSpecificMethods;
import pagesinmyleads.LoginPage;

public class RunVerifyLogin extends PageSpecificMethods{
	
	
	@BeforeTest
	public void setValues() 
	{
		excelFileName = "CreateLead";
		testName="Login";
		testDescription="Verfiy Name";
		testCategory="Regression";
		testAuthor="Ashwini";
	}
	
	@Test(dataProvider = "sendData")
	public void runLogin(String uName, String fName, String lName) {
	LoginPage lp = new LoginPage(driver);
	lp.enterUserName().password().clickSubmit().clickCRMSFALink().clickLeads();
	}
}
