package com.automation.demo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.demo.locator.repository.WebLocators.FlipkartHomePageLocators;

public class WebFlipkartHomePageImpl implements FlipkartHomePageLocators {

	WebDriver driver;
	WebDriverWait wait;

	public WebFlipkartHomePageImpl(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void launchPage() {
		// TODO Auto-generated method stub
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		waitForPageToLoad();
	}

	public void waitForPageToLoad() {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 80);
		webDriverWait.until(ExpectedConditions.visibilityOf(getFlipkartLogoImage()));

	}

	@FindBy(css = FLIPKART_LOGO_IMG_LOC)
	WebElement flipkartLogoImage;

	@FindBy(css = FK_TOP_SEARCH_BOX_LOC)
	WebElement topSearchBox;
	@FindBy(css = SEARCH_SUBMIT_LOC)
	WebElement submitButton;

	@FindBy(css = MENU_LINKS_LOC)
	List<WebElement> menuLinks;
	
	public WebElement getFlipkartLogoImage() {
		return flipkartLogoImage;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public List<WebElement> getMenuLinks() {
		return menuLinks;
	}

	public WebElement getTopSearchBox() {
		return topSearchBox;
	}

}
