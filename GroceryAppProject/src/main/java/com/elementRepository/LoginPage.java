package com.elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generalUtilities.ExcelRead;
import com.generalUtilities.GeneralUtility;

public class LoginPage {

	GeneralUtility utility = new GeneralUtility();
	ExcelRead excel=new ExcelRead();
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement adminText;

	@FindBy(xpath = "//p[@class='login-box-msg']")
	WebElement startSession;

	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	WebElement Logo;

	@FindBy(xpath = "//input[@id='remember']")
	WebElement rememberMeCheckBox;

	@FindBy(xpath = "//label[@for='remember']")
	WebElement rememberMeCheckBoxLabel;

	public void enterUserName(String userNameValue) {
		userName.sendKeys(userNameValue);
	}

	public void enterpassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}

	
	public void enterUserNameFromExcel(int a,int b) throws IOException {
		String userNameValue=excel.ReadStringData(a, b);
		userName.sendKeys(userNameValue);
	}

	public void enterpasswordFromExcel(int a,int b) throws IOException {
		String passwordValue=excel.ReadStringData(a, b);
		password.sendKeys(passwordValue);
	}
	public void clickLoginButton() {
		loginButton.click();
	}

	public void clickRememberCheckBox() {
		rememberMeCheckBoxLabel.click();
	}

	public String userNameText() {
		return utility.getElementText(adminText);
	}

	public String loginButtonText() {
		return utility.getElementText(loginButton);
	}

	public String startSessionText() {
		return utility.getElementText(startSession);
	}

	public boolean islogoDisplay() {
		return utility.isElementDisplayed(Logo);

	}

	public boolean isRememberMeCheckBoxSelected() {
		return utility.isCheckBoxSelected(rememberMeCheckBox);
	}

}
