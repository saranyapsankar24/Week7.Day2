package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp") private WebElement elementViewLeadID;
	public ViewLeadPage(RemoteWebDriver inWardDriver) {
		this.driver=inWardDriver;
		PageFactory.initElements(driver, this);
	}
public void verifyLeadID() {
	String LeadID = elementViewLeadID.getText().replaceAll("[^0-9]", "");
	System.out.println(LeadID);
	
}
}
