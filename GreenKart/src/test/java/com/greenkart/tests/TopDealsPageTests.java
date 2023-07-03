package com.greenkart.tests;

import org.junit.BeforeClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.greenkart.Pages.GreenKartTopDealsPage;
import com.greenkart.driverscript.TestBase;

public class TopDealsPageTests extends TestBase {
	
	@BeforeClass
	public void validateTopDealsPageNavigation() {
		GreenKartTopDealsPage topDeals = PageFactory.initElements(driver, GreenKartTopDealsPage.class);
		topDeals.validateTopDealsPage();
	}
	
	@Test(priority = 1)
	public void switchingToTopDealsPage() {
		GreenKartTopDealsPage topDeals = PageFactory.initElements(driver, GreenKartTopDealsPage.class);
		topDeals.switchingToTopDealsPage();
	}
	
	@Test(priority = 2)
	public void validatingURL() {
		GreenKartTopDealsPage topDeals = PageFactory.initElements(driver, GreenKartTopDealsPage.class);
		topDeals.validateURL("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	}
	
	@Test(priority = 3)
	public void validatingTopDealsPageTitle() {
		GreenKartTopDealsPage topDeals = PageFactory.initElements(driver, GreenKartTopDealsPage.class);
		topDeals.validateTopDealsPageTitle("GreenKart - veg and fruits kart");
	}
	
	@Test(priority = 4)
	public void validatingTopDealsDropdown() {
		GreenKartTopDealsPage topDeals = PageFactory.initElements(driver, GreenKartTopDealsPage.class);
		topDeals.validateTopDealsDropdown();
	}
	
}
