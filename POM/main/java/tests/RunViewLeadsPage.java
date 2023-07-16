package tests;

import org.testng.annotations.Test;

import base.PageSpecificMethods;
import pagesinmyleads.LoginPage;

@Test
public class RunViewLeadsPage extends PageSpecificMethods{
	public void runVerifyLogin(String CName, String FName, String LName) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName()
		.password()
		.clickSubmit()
		.clickCRMSFALink()
		.clickLeads()
		.createLead().companyName(CName).firstName(FName).lastName(LName).phoneNumber().submitButton().verifyLeadCreated();
		System.out.println("ViewLeadsPage success");
	}
		
}
