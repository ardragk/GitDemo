package com.executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.LoginPage;
import com.elementRepository.ManageOrders;
import com.elementRepository.VerifyUsers;

public class ExecuteVerifyUsers extends BaseClass {
	LoginPage lp;
	VerifyUsers users;

	@Test(enabled = false)
	public void testcase01VerifyPasswordButtonText() {
		lp = new LoginPage(driver);
		users = new VerifyUsers(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		users.verifyUserClick();

		String actualPasswordButtonText = users.passwordIconText();
		String expectedPasswordButtonText = "Details";

		Assert.assertEquals(actualPasswordButtonText, expectedPasswordButtonText, "Incorrect Password Button Text");

	}

	@Test
	public void testcase02VerifyPasswordText() {
		lp = new LoginPage(driver);
		users = new VerifyUsers(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		users.verifyUserClick();
		users.passwordButtonClick();

		String actualPasswordText = users.passwordText();
		String expectedPasswordText = "Password : ammu@123";

		Assert.assertEquals(actualPasswordText, expectedPasswordText, "Incorrect Password  Text");

	}
}
