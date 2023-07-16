package tests;

import org.testng.annotations.Test;

import base.PageSpecificMethods;
import pagesinmyleads.LoginPage;

@Test
public class RunDeleteLead extends PageSpecificMethods{
public void runDeleteLead() throws InterruptedException {
LoginPage lp = new LoginPage (driver);
lp.enterUserName().password().clickSubmit().clickCRMSFALink()
.clickLeads().clickLeadToEdit().deleteButtonClick();
System.out.println("DeletePage success");
}
}