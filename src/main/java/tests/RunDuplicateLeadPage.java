package tests;

import org.testng.annotations.Test;

import base.PageSpecificMethods;
import pagesinmyleads.LoginPage;
import pagesinmyleads.ViewLeadsPage;

@Test
public class RunDuplicateLeadPage extends PageSpecificMethods{
	public void runDuplicateLogin() {
	LoginPage lp = new LoginPage(driver);
	lp.enterUserName()
	.password()
	.clickSubmit()
	.clickCRMSFALink()
	.clickLeads()
	.clickLeadToEdit()
	.clickDuplicateButton()
	.clickCreateLeadButton();	
	System.out.println("DuplicateLeadPage success");
	}

}
