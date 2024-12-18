package com.executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.LoginPage;
import com.elementRepository.ManageExpense;
import com.elementRepository.ManageProduct;

public class ExecuteManageExpense extends BaseClass {
	LoginPage lp;
	ManageExpense expense;

	@Test(enabled = false)
	public void testcase01VerifyManageExpenseRadioButtonSelection() throws InterruptedException {

		lp = new LoginPage(driver);
		expense = new ManageExpense(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		expense.manageExpenseClick();
		expense.expenseCategory();

		String actualExpenseTag = expense.expenseCategoryTagName();
		String expectedExpenseTag = "a";

		Assert.assertEquals(actualExpenseTag, expectedExpenseTag, "Incorrect TagName");

	}
	@Test
	public void testcase05VerifyDeleteFunctionality() {

		lp = new LoginPage(driver);
		expense = new ManageExpense(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		expense.manageExpenseClick();
	expense.expenseCategory();
	expense.deleteButton();
		
		String actualDeleteAlertMessage=expense.deleteMessage();
		String expectedDeleteAlertMessage=("×\n"+ "Alert!\n"+ "Expense Record Deleted Successfully");
		Assert.assertEquals(actualDeleteAlertMessage, expectedDeleteAlertMessage,"Incorrect delete alert");
	}	
}
