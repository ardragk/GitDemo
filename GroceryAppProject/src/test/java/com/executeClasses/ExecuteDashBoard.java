package com.executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.DashBoard;
import com.elementRepository.LoginPage;

public class ExecuteDashBoard extends BaseClass {
	LoginPage lp;
	DashBoard board;
	
  @Test
  public void testcase01VerifyManagePageMoreInfoPageTitle() throws InterruptedException {
	  lp=new LoginPage(driver);
	  board=new DashBoard(driver);
	  
	  lp.enterUserName("admin");
	  lp.enterpassword("admin");
	  lp.clickLoginButton();
	  Thread.sleep(4000);
	  board.moreInfoClick();
	String actualTitle= board.managePageMoreInfoPageTitle();
	String expectedTitle="List Pages | 7rmart supermarket";
	
	Assert.assertEquals(actualTitle, expectedTitle,"Incorrect Page Selection");
	
	  
  }
  
  @Test
  public void testcase02VerifyADminUserText() {
	  lp=new LoginPage(driver);
	  board=new DashBoard(driver);
	  
	  lp.enterUserName("admin");
	  lp.enterpassword("admin");
	  lp.clickLoginButton();
	
	String actualTextAdminUser=  board.getTextAdminUsers();
	String expectedTextAdminUser="Admin Users";
	
	Assert.assertEquals(actualTextAdminUser, expectedTextAdminUser,"Incorrect Page Selection");
	
}}
