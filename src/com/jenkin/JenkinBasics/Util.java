package com.jenkin.JenkinBasics;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util {
	
	public static String captureScreenshot(WebDriver driver,String username)
	{
		String date = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
		// Take screenshot and store as a file format
		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 
		// now copy the  screenshot to desired location using copyFile //method
		String dest="./Screen/"+username+"_"+date+".png";
		File DestFile = new File(dest);
		try {
			FileUtils.copyFile(SrcFile, DestFile);	
		} catch (Exception e) {
		  e.getStackTrace();	
		}
		return dest;

	}
}
