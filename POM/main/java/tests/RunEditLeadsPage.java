package tests;

import org.testng.annotations.Test;

import base.PageSpecificMethods;
import pagesinmyleads.LoginPage;

@Test
public class RunEditLeadsPage extends PageSpecificMethods{
		public void RunEditLeadsPage() {
			LoginPage lp = new LoginPage(driver);
			lp.enterUserName().password().clickSubmit().clickCRMSFALink().clickLeads().clickLeadToEdit()
			.editButtonClick().companyName().firstName().lastName().clickUpdate();
			System.out.println("EditLeadsPage success");
		}
}