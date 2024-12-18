package com.generalUtilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShotCapture {
  
  public void failureScreenShotCapture(WebDriver driver,String methodName) throws IOException {
	  
	  TakesScreenshot screenshot=(TakesScreenshot)driver;
	  File fileName=screenshot.getScreenshotAs(OutputType.FILE);
	  
	  String scrFolder = System.getProperty("user.dir")+"//OutPutScreenShot";
	  File f1=new File(scrFolder);
	  if(!f1.exists())
	  {
		  f1.mkdir();
	  }
	  
	  String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

	  	String pathName=System.getProperty("user.dir")+"//OutPutScreenShot//"+methodName+timeStamp+".png";
	  	
	  	File finalDest = new File(pathName);
	  	FileHandler.copy(fileName, finalDest);
  }
}
