package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generalUtilities.GeneralUtility;

public class DashBoard {
	GeneralUtility utility = new GeneralUtility();
	WebDriver driver;

	public DashBoard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='small-box bg-info']//a[@href='http://groceryapp.uniqassosiates.com/admin/list-page']")
	WebElement managePageMoreInfo;

	@FindBy(xpath = "//div[@class='small-box bg-info']//p[text()='Admin Users']")
	WebElement AdminuserElement;

	public void moreInfoClick() {
		managePageMoreInfo.click();
	}

	public String managePageMoreInfoPageTitle() {
	 return utility.getPageTitle(driver);


	}
	
	public String getTextAdminUsers() {
		return utility.getElementText(AdminuserElement);
	}
}
