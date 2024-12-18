package com.generalUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GeneralUtility {

	public String getElementText(WebElement element) {
		String elementText = element.getText();
		return elementText;
	}

	public Boolean isElementDisplayed(WebElement element) {
		Boolean elementDisplayed = element.isDisplayed();
		return elementDisplayed;

	}

	public boolean isCheckBoxSelected(WebElement element) {
		Boolean checkBoxResponse = element.isSelected();
		return checkBoxResponse;

	}

	public String getCSSColor(WebElement element) {
		String labelColor = element.getCssValue("color");
		return labelColor;

	}

	public String getPageTitle(WebDriver driver) {
		String pageTitle = driver.getTitle();
		return pageTitle;

	}

	public String getBgColor(WebElement element) {
		String bgColor = element.getCssValue("background-color");
		return bgColor;

	}

	public String getTagName(WebElement element) {
		String elementText = element.getTagName();
		return elementText;
	}

	public boolean isRadioButtonSelected(WebElement element) {
		Boolean radioButtonSelection = element.isSelected();
		return radioButtonSelection;

	}

	public boolean isButtonSelected(WebElement element) {
		Boolean ButtonSelection = element.isSelected();
		return ButtonSelection;

	}

	public String getAttributeValue(WebElement element) {
		String classValue = element.getAttribute("class");
		return classValue;

	}

	public String getfontFamily(WebElement element) {
		String fontFamily = element.getCssValue("font-family");
		return fontFamily;

	}

	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void verticalPageScroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

	}
    
	public void clickWithJavaScript(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("argument[0].click();", element);

	}

	public void dropDownSelectionByIndex(WebElement element,int indexValue) {
		Select dropdownByIndex = new Select(element);
		dropdownByIndex.selectByIndex(indexValue);
		
	}
	public void enterText(WebElement element,String textValue) {
		element.sendKeys(textValue);
	}
}
