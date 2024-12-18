package com.executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.LoginPage;
import com.elementRepository.ManageOrders;

public class ExecuteManageOrders extends BaseClass {
	LoginPage lp;
	ManageOrders orders;

	@Test(enabled = false)
	public void testcase01VerifySearchButtonLabelColor() {
		lp = new LoginPage(driver);
		orders = new ManageOrders(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		orders.clickManageOrders();

		String actualSearchLabelColor = orders.getSearchButtonColor();
		String expectedSearchLabelColor = "rgba(255, 255, 255, 1)";

		Assert.assertEquals(actualSearchLabelColor, expectedSearchLabelColor, "Incorrect Search Label Color");

	}

	@Test(enabled = false)
	public void testcase02VerifyResetButtonBgColor() {
		lp = new LoginPage(driver);
		orders = new ManageOrders(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		orders.clickManageOrders();

		String actualResetBgColor = orders.getResetButtonBgColor();
		String expectedResetBgColor = "rgba(255, 193, 7, 1)";

		Assert.assertEquals(actualResetBgColor, expectedResetBgColor, "Incorrect Reset BackGround Color");

	}

	@Test
	public void testcase03VerifySearchButtonByPaymentOption() {
		lp = new LoginPage(driver);
		orders = new ManageOrders(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		orders.clickManageOrders();
		orders.clickSearchButton();
		orders.dropDownSelected();
		}

	@Test(enabled = false)
	public void testcase04VerifyViewButtonOption() throws InterruptedException {
		lp = new LoginPage(driver);
		orders = new ManageOrders(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		orders.clickManageOrders();
		orders.clickView();
		String actualOrderDetails = orders.orderDetailsText();
		String expectedOrderDetails = "Order Details";
		Assert.assertEquals(actualOrderDetails, expectedOrderDetails, "Invalid Order Details");

	}

	@Test
	public void testcase05VerifySearchButtonByOrderID() {
		lp = new LoginPage(driver);
		orders = new ManageOrders(driver);
		
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		orders.clickManageOrders();
		orders.clickSearchButton();
		orders.enterOrderID("123");
		orders.enterStartDate("11121993");
		orders.clickSubmitAfterSearch();
		
		String actualSubmitValue = orders.getTextsearchAfterDataSubmit();
		String expectedSubmitValue = "Search";
		Assert.assertEquals(actualSubmitValue, expectedSubmitValue, "Incorrect Selection for search");

	}
}
