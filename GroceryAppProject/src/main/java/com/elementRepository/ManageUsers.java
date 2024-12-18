package com.elementRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.generalUtilities.GeneralUtility;

public class ManageUsers {
	GeneralUtility utility = new GeneralUtility();
	WebDriver driver;

	public ManageUsers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='http://groceryapp.uniqassosiates.com/admin/list-user']//i[@class='nav-icon fas fa-user']")
	WebElement manageUsersElement;

	@FindBy(xpath = "//a[@aria-label='Next']")
	WebElement nextElement;

	public void ManageUsersClick() {
		manageUsersElement.click();
	}

	public void nextElementClick() {
		utility.verticalPageScroll(driver);
		nextElement.click();
		//utility.clickWithJavaScript(nextElement, driver);
	}

	public String nextButtonText() {
		return nextElement.getText();

	}
}
