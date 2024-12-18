package com.executeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elementRepository.LoginPage;

import com.elementRepository.ManageUsers;

public class ExecuteManageUsers extends BaseClass {
	LoginPage lp;
	ManageUsers users;

@Test
public void testcase01VerifyNextButtonClickableAndVerifyNextButtonText() throws InterruptedException {
		lp = new LoginPage(driver);
		users=new ManageUsers(driver);
		lp.enterUserName("admin");
		lp.enterpassword("admin");
		lp.clickLoginButton();
		users.ManageUsersClick();
		
		users.nextElementClick();
	
	
		String actualNextButtonText=users.nextButtonText();
		System.out.println(actualNextButtonText);
		
		
	
}
}