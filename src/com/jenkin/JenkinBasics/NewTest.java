package com.jenkin.JenkinBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {

  @Test
  public void TestJenkin() {
		System.out.println("testing jenkins");
		/*System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("opening");
		driver.get("http://google.in"); 
		driver.close();*/
  }
  @BeforeMethod
  public void beforeMethod() {
  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

}
