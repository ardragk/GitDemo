package com.executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.LoginPage;
import com.elementRepository.ManageUsers;
import com.elementRepository.PushNotifications;

public class ExecutePushNotification extends BaseClass {
	LoginPage lp;
	PushNotifications notification;

	@Test(enabled = false)

	public void testcase01VerifySendButtonBackGroundColor() {
		lp = new LoginPage(driver);
		notification = new PushNotifications(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		notification.pushNotificationsClick();
		String actualSendButtonBGColor = notification.sendButtonBGColor();
		String expectedBGColor="rgba(23, 162, 184, 1)";
		Assert.assertEquals(actualSendButtonBGColor, expectedBGColor,"incorrect BG Color");
	}
	
	@Test
	public void testcase02SubmitPushNotification() {
		lp = new LoginPage(driver);
		notification = new PushNotifications(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		notification.pushNotificationsClick();
		notification.enterTitleValue();
		notification.enterDescriptionValue();
		notification.sendButtonClick();
		String actualAlertMsgBGcolor=notification.alertMsgBackgroundColor();
		System.out.println(actualAlertMsgBGcolor);
		String expectedBGcolor="rgba(40, 167, 69, 1)";
		Assert.assertEquals(actualAlertMsgBGcolor, expectedBGcolor,"Incorrect selection");
	}
}
