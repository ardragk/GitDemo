package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generalUtilities.GeneralUtility;

public class MobileSlider {
	GeneralUtility utility = new GeneralUtility();
	WebDriver driver;

	public MobileSlider(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[@href='http://groceryapp.uniqassosiates.com/admin/list-mobileslider']//i[@class='nav-icon fas fa-window-minimize']")
	WebElement mobileSliderElement;
	
	@FindBy(xpath="//img[@src='http://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")
	WebElement imageElement;
	
	@FindBy(xpath="//span[@class='badge bg-warning']")
	WebElement statusElement;
	
	public void mobileSliderClick() {
		mobileSliderElement.click();
	}
	
	public boolean isImagePresent() {
		return utility.isElementDisplayed(imageElement);
	}
	
	public String inactiveButtonBGcolor() {
		return utility.getCSSColor(statusElement);
	}
}
