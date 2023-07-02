package com.greenkart.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.greenkart.Pages.GreenCartHomePage;
import com.greenkart.driverscript.TestBase;

public class HomePageTests extends TestBase{
	@Test(priority = 1)
	public void validatingTitle() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.validatingTitle("GreenKart - veg and fruits kart");
	}
	
	@Test(priority = 2)
	public void validateItemsOnHomePage() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.itemsOnHomePage();
	}

	@Test(priority = 3)
	public void validatingSearchFunctionality() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.searchItem();
	}
	
	@Test(priority = 4)
	public void validatingAddToCartFunctionality() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.addSearchItemToCart();
	}
	
	@Test(priority = 5)
	public void validatingCart() {
		GreenCartHomePage home = PageFactory.initElements(driver, GreenCartHomePage.class);
		home.validateCart();
	}
}
