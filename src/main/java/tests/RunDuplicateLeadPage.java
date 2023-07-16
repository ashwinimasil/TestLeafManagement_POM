package tests;

import org.testng.annotations.Test;

import base.PageSpecificMethods;
import pagesinmyleads.ViewLeadsPage;

@Test
public class RunDuplicateLeadPage extends PageSpecificMethods{
	public void runDuplicateLogin() {
	ViewLeadsPage vp = new ViewLeadsPage(driver);
	vp.clickDuplicateButton().companyName().firstName().lastName().clickDuplicateLeadButton();	
	System.out.println("DuplicateLeadPage success");
	}

}
