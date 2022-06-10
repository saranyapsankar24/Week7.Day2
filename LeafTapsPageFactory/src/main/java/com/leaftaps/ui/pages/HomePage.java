package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	@FindBy(how=How.LINK_TEXT, using="Leads") private WebElement elementLeadButton;
	
	public HomePage(RemoteWebDriver inWardDriver) {
		this.driver=inWardDriver;
		PageFactory.initElements(driver, this);
	}
public MyLeads clickOnLeadsTab() {
	elementLeadButton.click();
	return new MyLeads(driver);
}
}
