package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	
	@FindBy(how=How.ID, using="createLeadForm_companyName") private WebElement elementCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName") private WebElement elementFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName") private WebElement elementLastName;
	@FindBy(how=How.NAME, using="submitButton") private WebElement elementSubmitButton;
	public CreateLead(RemoteWebDriver inWardDriver) {
		this.driver=inWardDriver;
		PageFactory.initElements(driver, this);
	}
	public CreateLead enterCompanyName(String companyName) {
		elementCompanyName.sendKeys(companyName);
		return this;
		
	}
public CreateLead enterFirstName(String firstName) {
	elementFirstName.sendKeys(firstName);
	return this;
	}
public CreateLead enterLastName(String lastName) {
	elementLastName.sendKeys(lastName);
	return this;
}
public ViewLeadPage ClickOnCreateLeadButton() {
	elementSubmitButton.click();
	return new ViewLeadPage(driver);
}

}
