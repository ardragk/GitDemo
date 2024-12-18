package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.generalUtilities.GeneralUtility;

public class ManageOrders {
	GeneralUtility utility = new GeneralUtility();
	WebDriver driver;

	public ManageOrders(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@class='nav nav-pills nav-sidebar flex-column']//li[3]//a[@href='http://groceryapp.uniqassosiates.com/admin/list-order']")
	WebElement manageOrdersElement;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchElement;

	@FindBy(xpath = "//div[@class='col-sm-12']/a[2]")
	WebElement resetButton;

	@FindBy(xpath = "//select[@name='pt']")
	WebElement paymentModeDrpdwn;

	@FindBy(xpath = "//a[@href='http://groceryapp.uniqassosiates.com/admin/Order/details?details=514&page_ad=1']")
	WebElement view;

	@FindBy(xpath = "//h1[text()='Order Details']")
	WebElement orderDetails;

	@FindBy(xpath = "//input[@id='od']")
	WebElement orderId;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement submitAfterSearch;

	@FindBy(xpath = "//input[@id='sd']")
	WebElement startDate;

	public void clickManageOrders() {
		manageOrdersElement.click();
	}

	public void clickSearchButton() {
		searchElement.click();
	}

	public void clickView() {
		view.click();
	}

	public void enterOrderID(String orderIDValue) {
		orderId.sendKeys(orderIDValue);
	}

	public void clickSubmitAfterSearch() {
		submitAfterSearch.click();
	}

	public String getSearchButtonColor() {
		return utility.getCSSColor(searchElement);
	}

	public void enterStartDate(String startDateValue) {
		startDate.sendKeys(startDateValue);
	}

	public String getResetButtonBgColor() {
		return utility.getBgColor(resetButton);
	}

	public boolean isButtonSelected() {
		return utility.isButtonSelected(manageOrdersElement);
	}

	public String orderDetailsText() {
		return utility.getElementText(orderDetails);
	}

   public void dropDownSelected() {
	 utility.dropDownSelectionByIndex(paymentModeDrpdwn, 2);
	}

	public String getTextsearchAfterDataSubmit() {
		return utility.getElementText(submitAfterSearch);
	}
}
