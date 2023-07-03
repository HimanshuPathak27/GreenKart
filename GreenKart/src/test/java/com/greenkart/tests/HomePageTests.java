package com.greenkart.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.greenkart.Pages.GreenCartHomePage;
import com.greenkart.driverscript.TestBase;

public class HomePageTests extends TestBase{

	@Test(priority = 1)
	public void validatingURL() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.validateURL();
	}

	@Test(priority = 2)
	public void validatingTitle() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.validateTitle("GreenKart - veg and fruits kart");
	}

	@Test(priority = 3)
	public void validateItemsOnHomePage() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.validateitemsOnHomePage();
	}

	@Test(priority = 4)
	public void validatingSearchFunctionality() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.validateSearchBox("Beans");
		home.validateSearchButton();
	}

	@Test(priority = 5)
	public void validatingTopDealsLink() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.validateTopDealsLink();
	}

	@Test(priority = 6)
	public void validatingFlightBookingLink() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.validateFlightBookingLink();
	}

	@Test(priority = 7)
	public void validatingCart() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.validateCartButton();
	}
}
