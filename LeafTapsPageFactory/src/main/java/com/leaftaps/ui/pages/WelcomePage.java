package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{
	
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA") private WebElement elementCRMSFA;
	
	public WelcomePage(RemoteWebDriver inWaDriver) {
		this.driver=inWaDriver;
		PageFactory.initElements(driver, this);
	}
public HomePage clickOnCRMSFALink() {
	elementCRMSFA.click();
	return new HomePage(driver);
}
}
