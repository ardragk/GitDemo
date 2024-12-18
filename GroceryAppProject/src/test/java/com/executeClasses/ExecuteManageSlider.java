package com.executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.LoginPage;
import com.elementRepository.ManageSlider;


public class ExecuteManageSlider extends BaseClass{
	LoginPage lp;
	ManageSlider mnSlider;

  @Test
  public void testcase01VerifyImageIsPresent() {
		lp = new LoginPage(driver);
		mnSlider = new ManageSlider(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		mnSlider.manageSliderClick();
		String actualLinkText=mnSlider.getLinkText();
		System.out.println(actualLinkText);
		String expectedLinkText="http://localhost/sumesh/springbazaar/";
		Assert.assertEquals(actualLinkText, expectedLinkText,"Incorrect Link Text");
}
  
  @Test(enabled = false)
  public void testcase02VerifyDeleteFunction() {
		lp = new LoginPage(driver);
		mnSlider = new ManageSlider(driver);
		
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		mnSlider.manageSliderClick();
		mnSlider.deleteButton();
		
		String actualDeleteMsgColor=mnSlider.getdeleteMsgTextColor();
		String expectedDeleteMsgColor="rgba(255, 255, 255, 1)";
	    Assert.assertEquals(actualDeleteMsgColor, expectedDeleteMsgColor,"Incorrect Delete function msg");
}
  
}
