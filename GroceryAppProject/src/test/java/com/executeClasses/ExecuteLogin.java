package com.executeClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.LoginPage;

public class ExecuteLogin extends BaseClass {

	LoginPage lp;

	@Test
	public void testcase01VerifyLogin() throws IOException {

		lp = new LoginPage(driver);
		lp.enterUserNameFromExcel(0,0);
		lp.enterpasswordFromExcel(0,1);
		lp.clickLoginButton();

		String actualName = lp.userNameText();
		String expectedName = "Admin";

		Assert.assertEquals(actualName, expectedName, "Incorrect User");
	}

	@Test(enabled = false)
	public void testcase02VerifyLoginText() {

		lp = new LoginPage(driver);

		String actualLoginText = lp.loginButtonText();
		String expectedLoginText = "Sign In";

		Assert.assertEquals(actualLoginText, expectedLoginText, "Incorrect Login Text");
	}

	@Test(enabled = false)
	public void testcase03VerifyStartSession() {

		lp = new LoginPage(driver);

		String actualStartSession = lp.startSessionText();
		String expectedStartSession = "Sign in to start your session";

		Assert.assertEquals(actualStartSession, expectedStartSession, "Invalid Character for startSession");

	}

	@Test(enabled = false)
	public void testcase04VerifyLogoDisplay() {

		lp = new LoginPage(driver);
		Boolean actualLogo = lp.islogoDisplay();
		Assert.assertTrue(actualLogo, "Logo not displayed");

	}

	@Test(enabled = false)
	public void testcase05VerifyRememberMeCheckBox() throws InterruptedException {

		lp = new LoginPage(driver);
		lp.clickRememberCheckBox();
		Boolean actualCheckBoxValue = lp.isRememberMeCheckBoxSelected();
		Assert.assertTrue(actualCheckBoxValue, "Incorrect Checkbox Selection");

	}

}
