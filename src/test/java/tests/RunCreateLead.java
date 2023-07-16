package tests;

import org.testng.annotations.Test;

import baseclass.ParentClass;
import pages.LoginPage;
public class RunCreateLead extends ParentClass{
	
	
	@Test
	public void createRun() throws InterruptedException {
         LoginPage lp = new LoginPage();
         lp.enterUsername()
         .enterPassword()
         .clickLoginButton()
         .clickCRMSFALink()
       .clickLeads().myLeads();
	}
	}
