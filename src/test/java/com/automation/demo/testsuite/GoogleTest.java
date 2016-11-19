package com.automation.demo.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void TC1() {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	}

}
