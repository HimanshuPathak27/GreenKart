package com.greenkart.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.greenkart.driverscript.TestBase;
import com.greenkart.repository.ObjectRepository;

public class GreenCartHomePage extends TestBase{

	@FindBy(xpath = ObjectRepository.productNameXpath)
	@CacheLookup
	List<WebElement> productName;

	@FindBy(xpath = ObjectRepository.searchboxXpath)
	@CacheLookup
	WebElement searchBox;

	@FindBy(xpath = ObjectRepository.searchButtonXpath)
	@CacheLookup
	WebElement searchButton;

	@FindBy(linkText = ObjectRepository.topDealsLink)
	@CacheLookup
	WebElement topDeals;

	@FindBy(linkText = ObjectRepository.flightBookingLink)
	@CacheLookup
	WebElement flightBooking;

	@FindBy(xpath = ObjectRepository.cartButtonXpath)
	@CacheLookup
	WebElement cartButton;
	
	
	public void validateURL() {
		String actURL = driver.getCurrentUrl();

		if(actURL.equals(config.getProperty("url"))) {
			System.out.println("Both Actual and Expected URL's are same");
			System.out.println("URL of Green Kart page is : " + actURL);
			System.out.println();
		}
		else {
			System.out.println("Both Actual and Expected URL's are not same");
			System.out.println("Expected URL of Green Kart page is : " + config.getProperty("url"));
			System.out.println("Actual URL of Green Kart page is : " + actURL);
			System.out.println();
		}
	}

	public void validateTitle(String expTitle) {
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

	public void validateitemsOnHomePage() {
		System.out.println("Items on Home Page are as follows:");
		for (WebElement productNames : productName) {
			String itemName = productNames.getText();
			System.out.print(itemName + " ; ");
		}
		System.out.println();
		System.out.println();
	}

	public void validateSearchBox(String enterItemName) {
		if(searchBox.isDisplayed()) {
			System.out.println("Search Box is present on Green Cart Home Page");
			searchBox.sendKeys(enterItemName);
			System.out.println(enterItemName + " is added in search box");
		}
		else {
			System.out.println("Search Box is not present on Green Cart Home Page");
		}
	}

	public void validateSearchButton() {
		if(searchButton.isDisplayed()) {
			System.out.println("Search Button is present on Green Cart Home Page");
			searchButton.click();
			System.out.println("Search Button is clicked and Results are displayed");
			System.out.println();
		}
		else {
			System.out.println("Search Button is not present on Green Cart Home Page");
			System.out.println();
		}
	}

	public void validateTopDealsLink() {
		if(topDeals.isDisplayed()) {
			System.out.println("Top Deals Link is present on Green Cart Home Page");
			topDeals.click();
			System.out.println("Successfully Navigated to Top Deals page");
			System.out.println();
		}
		else {
			System.out.println("Top Deals Link is not present on Green Cart Home Page");
			System.out.println();
		}
	}

	public void validateFlightBookingLink() {
		if(flightBooking.isDisplayed()) {
			System.out.println("Flight Booking Link is present on Green Cart Home Page");
			searchButton.click();
			System.out.println("Successfully Navigated to Flight Booking page");
			System.out.println();
		}
		else {
			System.out.println("Flight Booking Link is not present on Green Cart Home Page");
			System.out.println();
		}
	}

	public void validateCartButton() {
		if(cartButton.isDisplayed()) {
			cartButton.click();
			System.out.println("Cart Button is present on Green Cart Home Page");
			System.out.println();
		}
		else {
			System.out.println("Cart Button is not present on Green Cart Home Page");
			System.out.println();
		}
	}

}
