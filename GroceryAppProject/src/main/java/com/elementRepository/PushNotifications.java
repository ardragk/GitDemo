package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generalUtilities.GeneralUtility;

public class PushNotifications {
	GeneralUtility utility = new GeneralUtility();
	WebDriver driver;

	public PushNotifications(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//a[@href='http://groceryapp.uniqassosiates.com/admin/list-notifications']//i[@class='nav-icon fas fa-fas fa-bell']")
	WebElement pushNotificationsElement;
	
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")
	WebElement sendElement;
	
	@FindBy(xpath="//input[@id='title']")
	WebElement titleElement;
	
	@FindBy(xpath="//input[@id='description']")
	WebElement descriptionElement;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;
	
	public void pushNotificationsClick() {
		pushNotificationsElement.click();
	}
	
	public String sendButtonBGColor(){
	return utility.getBgColor(sendElement);
}
	public void enterTitleValue() {
	 utility.enterText(titleElement,"Shopping");
	}
	 
	public void enterDescriptionValue() {
		utility.enterText(descriptionElement, "Grocery");
	}
	
	public void sendButtonClick() {
		sendElement.click();
	}
	
public String alertMsgBackgroundColor() {
	return utility.getBgColor(alertmsg);
}
}
