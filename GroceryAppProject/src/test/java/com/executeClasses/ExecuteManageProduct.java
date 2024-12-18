package com.executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.LoginPage;
import com.elementRepository.ManageOrders;
import com.elementRepository.ManageProduct;

public class ExecuteManageProduct extends BaseClass {

	LoginPage lp;
	ManageProduct product;

	@Test(enabled = false)
	public void testcase01VerifyManageProductActiveButtonFontFamily() {

		lp = new LoginPage(driver);
		product = new ManageProduct(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		product.clickManageproduct();

		String actualFontFamilyActiveValue = product.getFontFamilyStatusButton();
		String expectedFontFamily = "\"Source Sans Pro\", -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\"";
		Assert.assertEquals(actualFontFamilyActiveValue, expectedFontFamily, "Incorrect FontFamily for Active BUtton");

	}

	@Test(enabled = false)
	public void testcase02VerifyFeatureSelectionMessage() {

		lp = new LoginPage(driver);
		product = new ManageProduct(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		product.clickManageproduct();
		product.clickFeature();

		String actualFeatureClickMessage = product.getFeatureClickMessage();
	    String expectedFeatureClickMessage=("×\n"+ "Alert!\n"+ "Product Status Changed Successfully");
	    Assert.assertEquals(actualFeatureClickMessage, expectedFeatureClickMessage,"Incorrect FeatureClick message");

	}

	@Test(enabled = false)
	public void testcase03VerifyEditOptionProductTypeRadioButton() {

		lp = new LoginPage(driver);
		product = new ManageProduct(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		product.clickManageproduct();
	    product.clickEditButton();
	    product.clickProductTypeRadioButton();
	    Boolean actualProductTypeValue = product.isProductTypeSelected();
		Assert.assertTrue(actualProductTypeValue, "Incorrect Checkbox Selection");
}
	@Test(enabled = false)
	public void testcase04VerifyNewButtonAttributeValue() {

		lp = new LoginPage(driver);
		product = new ManageProduct(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		product.clickManageproduct();


		String actualNewAttributeValue = product.newButtonAttributeValue();
		String expectedNewAttributeValue="btn btn-rounded btn-danger";
		Assert.assertEquals(actualNewAttributeValue, expectedNewAttributeValue, "Incorrect Class ATtribute Value for New BUtton");

	}
	@Test(enabled = false)
	public void testcase05VerifyDeleteFunctionality() {

		lp = new LoginPage(driver);
		product = new ManageProduct(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		product.clickManageproduct();
		product.clickDeleteButton();
		
		String actualDeleteAlertMessage=product.deleteAlertMessage();
		String expectedDeleteAlertMessage=("×\n"+ "Alert!\n"+ "Product Deleted Successfully");
		Assert.assertEquals(actualDeleteAlertMessage, expectedDeleteAlertMessage,"Incorrect delete alert");
		
		
}
	@Test
	public void testcase06VerifyProductCodeClick() {

		lp = new LoginPage(driver);
		product = new ManageProduct(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		product.clickManageproduct();
		product.elementCodeClick();
		
		String actualElementLinkText=product.getElementCodeText();
		String expectedElementLinkText=("P702");
		Assert.assertEquals(actualElementLinkText, expectedElementLinkText,"Incorrect Element Click");
		
		
	}

}

