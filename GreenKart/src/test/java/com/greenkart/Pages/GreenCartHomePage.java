package com.greenkart.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.greenkart.driverscript.TestBase;
import com.greenkart.repository.ObjectRepository;

public class GreenCartHomePage extends TestBase{

	@FindBy(xpath = ObjectRepository.searchboxXpath)
	@CacheLookup
	WebElement searchBox;

	@FindBy(xpath = ObjectRepository.searchButtonXpath)
	@CacheLookup
	WebElement searchButton;

	@FindBy(xpath = ObjectRepository.productNameXpath)
	@CacheLookup
	List<WebElement> productName;
	
	@FindBy(xpath = ObjectRepository.addToCartXpath)
	@CacheLookup
	WebElement addToCart;
	
	@FindBy(xpath = ObjectRepository.cartButtonXpath)
	@CacheLookup
	WebElement cartButton;
	
	@FindBy(xpath = ObjectRepository.proceedToCheckOutButtonXpath)
	@CacheLookup
	WebElement proceedToCheckOutButton;

	public void validatingTitle(String expTitle) {
		String actTitle = driver.getTitle();

		if(actTitle.equals(expTitle)) {
			System.out.println("Both Actual and Expected titles are same");
			System.out.println("Title of Green Kart page is : " + actTitle);
			System.out.println();
		}
		else {
			System.out.println("Both Actual and Expected titles are not same");
			System.out.println("Expected Title of Green Kart page is : " + expTitle);
			System.out.println("Actual Title of Green Kart page is : " + actTitle);
			System.out.println();
		}
	}

	public void itemsOnHomePage() {
		for (WebElement productNames : productName) {
			String itemName = productNames.getText();
			System.out.print(itemName + " ; ");
		}
		System.out.println();
		System.out.println();
	}

	public void searchItem() {
		searchBox.sendKeys("Beans");
		searchButton.click();
		System.out.println("Search Results for Beans are displayed");
	}
	
	public void addSearchItemToCart() {
		addToCart.click();
		System.out.println("Beans added to cart");
		searchBox.clear();
		System.out.println("Search Cleared");
		System.out.println();
	}
	
	public void validateCart() {
		cartButton.click();
		proceedToCheckOutButton.click();
		System.out.println("Successfull Naviagted to CheckOut page");
	}

}
