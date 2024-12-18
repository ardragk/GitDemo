package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generalUtilities.GeneralUtility;

public class VerifyUsers {
	GeneralUtility utility = new GeneralUtility();
	WebDriver driver;

	public VerifyUsers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[@href='http://groceryapp.uniqassosiates.com/admin/verify-users']//i[@class='nav-icon fas fa-user-check']")
	WebElement verifyUserElement;
	
	@FindBy(xpath="//a[@class='green bigger-140 show-details-btn'][1]")
	WebElement passwordIcon;
	
	@FindBy(xpath="//tr[@class='detail-row open']")
	WebElement passwordText;
	
	public void verifyUserClick() {
		verifyUserElement.click();
	}
	
	public void passwordButtonClick() {
		passwordIcon.click();
		
	}
	public String passwordIconText() {
		return passwordIcon.getText();
		
	}
	
	public String passwordText() {
		return passwordText.getText();
		
	}
	
	
}
