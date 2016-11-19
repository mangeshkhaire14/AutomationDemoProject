
package com.automation.demo.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public abstract class BaseTestCase {

	static protected WebDriver driver;

	@BeforeTest
	public void setUp() {
		// System.setProperty("webdriver.chrome.driver",
		// "server\\chromedriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
