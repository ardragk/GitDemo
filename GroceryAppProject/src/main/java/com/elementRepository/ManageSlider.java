package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generalUtilities.GeneralUtility;

public class ManageSlider {
	GeneralUtility utility = new GeneralUtility();
	WebDriver driver;

	public ManageSlider(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='http://groceryapp.uniqassosiates.com/admin/list-slider']//i[@class='nav-icon fas fa-window-restore']")
	WebElement manageSliderElement;

	@FindBy(xpath="//td[text()='http://localhost/sumesh/springbazaar/']")
	WebElement linkTextElement;
	
	@FindBy(xpath="//a[contains(@href,'http://groceryapp.uniqassosiates.com/admin/slider/delete?')]")
	WebElement deleteElement;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement deleteMsgElement;
	
	public void manageSliderClick() {
		manageSliderElement.click();
	}
	public String getLinkText() {
		return linkTextElement.getText();
	}

	public void deleteButton() {
		deleteElement.click();
		utility.alertAccept(driver);
	}
	
	public String getdeleteMsgTextColor() {
		return utility.getCSSColor(deleteMsgElement);
	}
}
