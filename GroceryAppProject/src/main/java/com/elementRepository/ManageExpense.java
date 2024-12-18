package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generalUtilities.ExplicitWait;
import com.generalUtilities.GeneralUtility;

public class ManageExpense {

	GeneralUtility utility = new GeneralUtility();
	ExplicitWait ewait=new ExplicitWait();
	
	WebDriver driver;

	public ManageExpense(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-money-bill-alt']")
	WebElement manageExpense;
	
	@FindBy(xpath="//a[@href='http://groceryapp.uniqassosiates.com/admin/list-expense']")
	WebElement expenseCategory;
	
	@FindBy(xpath="//a[contains(@href,'http://groceryapp.uniqassosiates.com/admin/Expense/delete?')][1]")
	WebElement deleteElement;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement deleteAlert;
	
	public void manageExpenseClick() { 
		manageExpense.click();
	}
	
	public void deleteButton() {
		deleteElement.click();
		ewait.waituntilAlertpPresent(driver);
		utility.alertAccept(driver);
	}
	
	public void expenseCategory() { 
		expenseCategory.click();
	}
	public String expenseCategoryTagName() {
		return utility.getTagName(expenseCategory);
	}
	public String deleteMessage() {
		return utility.getElementText(deleteAlert);
	}

}
