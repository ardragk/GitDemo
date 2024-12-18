package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generalUtilities.ExplicitWait;
import com.generalUtilities.GeneralUtility;

public class ManageProduct {

	GeneralUtility utility = new GeneralUtility();
	ExplicitWait ewait=new ExplicitWait();
	
	WebDriver driver;

	public ManageProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[@href='http://groceryapp.uniqassosiates.com/admin/list-product']//i[@class='nav-icon fas fa-tasks']")
	WebElement manageProductElement;
	
	@FindBy(xpath="//a[@href='http://groceryapp.uniqassosiates.com/admin/Product/status?id=684&st=inactive&page_ad=1']")
	WebElement activeElement;
	
	@FindBy(xpath="(//a[contains(@href,'http://groceryapp.uniqassosiates.com/admin/Product/featured?id')])[1]")
	WebElement featureElement;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement featureClickAlert;
	
	@FindBy(xpath="//a[@href='http://groceryapp.uniqassosiates.com/admin/Product/edit?edit=684&page_ad=1&un=&ct=&sb=&Search=sr']")
	WebElement editButton;
	
	@FindBy(xpath="//input[@value='Others']")
	WebElement othersRadioButton;
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement newElement;
	
	@FindBy(xpath = "//a[contains(@href,'http://groceryapp.uniqassosiates.com/admin/Product/delete?')][1]")
	WebElement deleteButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement deleteAlertMessage;
	
	@FindBy(xpath="//button[text()='P702']")
	WebElement productCodeElement;
	
	public void clickManageproduct() {
	manageProductElement.click();
	}
	
	
	public void clickFeature() {
		featureElement.click();
	}
	
	public void clickEditButton() {
		editButton.click();
	}
	public void clickProductTypeRadioButton() {
		othersRadioButton.click();
	}
	 
	public void elementCodeClick() {
	ewait.waitElementClickable(driver,productCodeElement);
	productCodeElement.click();
	}
	
	public void clickDeleteButton() {
		deleteButton.click();
		utility.alertAccept(driver);
		
	}
	
	public String getFontFamilyStatusButton() {
		return utility.getfontFamily(activeElement);
	}
	
	public String getFeatureClickMessage() {
		return utility.getElementText(featureClickAlert);
	}
	
	public boolean isProductTypeSelected() {
		return utility.isButtonSelected(othersRadioButton);
	}
	
	public String newButtonAttributeValue() {
		return utility.getAttributeValue(newElement);
	}
	
	public String deleteAlertMessage() {
		return utility.getElementText(deleteAlertMessage);
	}
	
	public String getElementCodeText() {
		return utility.getElementText(productCodeElement);
	}
	
  }

