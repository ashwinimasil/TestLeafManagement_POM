package tests;

import org.testng.annotations.Test;

import base.PageSpecificMethods;
import pagesinmyleads.LoginPage;

@Test
public class RunMergeLeadPage extends PageSpecificMethods{
	public void runMergeLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName().password().clickSubmit().clickCRMSFALink()
		.clickLeads().clickMergeLeads().fromLeadWidget().toLeadWidget().clickMergeButton().alertHandle();
		System.out.println("MergeLead success");

}
}