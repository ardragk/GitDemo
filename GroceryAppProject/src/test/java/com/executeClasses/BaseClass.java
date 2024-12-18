package com.executeClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.generalUtilities.ScreenShotCapture;

public class BaseClass {
	WebDriver driver;
	ScreenShotCapture capture;

@BeforeMethod

  public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ardra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

@AfterMethod
public void closeBrowser(ITestResult result) throws IOException {
	if(result.getStatus()==ITestResult.FAILURE) {
	capture=new ScreenShotCapture();
	capture.failureScreenShotCapture(driver,result.getName());
	}
	driver.quit();
}
}
