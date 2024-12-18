package com.executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.LoginPage;
import com.elementRepository.MobileSlider;

public class ExecuteMobileSlider extends BaseClass {
	LoginPage lp;
	MobileSlider slider;

	@Test(enabled = false)
	public void testcase01VerifyImageIsPresent() {
		lp = new LoginPage(driver);
		slider = new MobileSlider(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		slider.mobileSliderClick();
		Boolean actualImageValue = slider.isImagePresent();
		Assert.assertTrue(actualImageValue, "Image not displayed");
	}

	@Test
	public void testcase02VerifyInactiveButtonBGColor() {
		lp = new LoginPage(driver);
		slider = new MobileSlider(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		slider.mobileSliderClick();
		String actualstatusBG = slider.inactiveButtonBGcolor();
		String expectedstatusBG="rgba(31, 45, 61, 1)";
		Assert.assertEquals(actualstatusBG,expectedstatusBG ,"Incorrect BGColor");
	}
}
