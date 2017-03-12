package com.automation.demo.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.demo.common.BaseTestCase;
import com.automation.demo.pages.WebFlipkartHomePageImpl;

public class FlikpartHomePageTest extends BaseTestCase {

	@Test()
	public void TC1() {

		WebFlipkartHomePageImpl flipkartHomePage = new WebFlipkartHomePageImpl(driver);
		flipkartHomePage.launchPage();
		Assert.assertTrue(flipkartHomePage.getFlipkartLogoImage().isDisplayed());
		flipkartHomePage.getTopSearchBox().sendKeys("Microsoft Lumia 535");
		//flipkartHomePage.getSubmitButton().click();
	}
}
