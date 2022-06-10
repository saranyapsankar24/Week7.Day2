package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods{
	
	@FindBy(how=How.LINK_TEXT, using="Create Lead") private WebElement elementCreateLeadButton;
	
	public MyLeads(RemoteWebDriver inWardDriver) {
		this.driver=inWardDriver;
		PageFactory.initElements(driver, this);
	}
public CreateLead clickOnCreateLeadLink() {
	elementCreateLeadButton.click();
	return new CreateLead(driver);
}
}
