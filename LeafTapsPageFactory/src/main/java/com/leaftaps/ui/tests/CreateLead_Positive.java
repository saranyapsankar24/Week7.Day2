package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class CreateLead_Positive extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName="CreateLeadData";
		
	}
	
	@Test(dataProvider="getData")
	public void createLead(String username, String password, String cName, String fName, String lName) {
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassword(password)
		.clickOnLoginButton()
		.clickOnCRMSFALink()
		.clickOnLeadsTab()
		.clickOnCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.ClickOnCreateLeadButton()
		.verifyLeadID();	
	}

}
